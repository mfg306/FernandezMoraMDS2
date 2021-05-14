package fernandezmora.interfaz;

import java.util.Iterator;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.orm.PersistentException;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.internal.MessageDigestUtil;
import com.vaadin.flow.server.StreamResource;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import subirfotos.Uploader;
import vistas.VistaCrear_producto;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class Crear_producto extends VistaCrear_producto {
	public Producto_administrador _producto_administrador;
	public Vector<Imagen> _imagen = new Vector<Imagen>();
	public VerticalLayout layout;
	Upload upload;
	MemoryBuffer buffer;

	public Crear_producto() {
		inicializar();
		crearProducto();
	}

	public void inicializar() {
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		buffer = new MemoryBuffer();
		upload = new Upload(buffer);
		this.layout.add(upload);
		
		upload.setAcceptedFileTypes("image/jpeg", "image/png");
		
		upload.addSucceededListener(e -> {
			Component component = createComponent(e.getMIMEType(), e.getFileName(), buffer.getInputStream());
			this.layout.add(component);
			File targetFile = new File("src/main/resources/targetFile.tmp");
			System.out.println(e.getFileName());

			try {
				FileUtils.copyInputStreamToFile(buffer.getInputStream(), targetFile);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			
			String rutaImgur = Uploader.upload(targetFile); //FALLO
			String rutaImagen = "https://i.imgur.com/" +  rutaImgur.subSequence(15, 22) + ".jpg";

			System.out.println("La ruta : " + targetFile);
			this.getImg().setSrc(rutaImagen);
			System.out.println("JEJE2");
		});
		
		
		cancelar_creacion();
	}

	public void cancelar_creacion() {
		this.getVaadinButton2().addClickListener(event -> {
			Gestionar_productos gp = new Gestionar_productos();
			this.getH1().setVisible(false);
			this.getVaadinHorizontalLayout().setVisible(false);
			this.getVaadinHorizontalLayout1().setVisible(false);
			layout.add(gp);
		});
	}

	public void crearProducto() {
		this.getVaadinButton1().addClickListener(event -> {
			iAdministrador admin = new BDPrincipal();
			
			try {				
				base_de_datos.Producto p = admin.insertarProducto(this.getNombreProducto().getValue(), 
						this.getAñadeUnaDescripciónAlProducto().getValue(), Double.parseDouble(this.getPrecio().getValue()),
						Integer.parseInt(this.getCantidadProducto().getValue()), this.getRutaPrincipal().getValue());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});
	}

	private Component createComponent(String mimeType, String fileName, InputStream stream) {
		if (mimeType.startsWith("text")) {
			return createTextComponent(stream);
		} else if (mimeType.startsWith("image")) {
			Image image = new Image();
			try {

				byte[] bytes = IOUtils.toByteArray(stream);
				image.getElement().setAttribute("src",
						new StreamResource(fileName, () -> new ByteArrayInputStream(bytes)));
				try (ImageInputStream in = ImageIO.createImageInputStream(new ByteArrayInputStream(bytes))) {
					final Iterator<ImageReader> readers = ImageIO.getImageReaders(in);
					if (readers.hasNext()) {
						ImageReader reader = readers.next();
						try {
							reader.setInput(in);
							image.setWidth(reader.getWidth(0) + "px");
							image.setHeight(reader.getHeight(0) + "px");
						} finally {
							reader.dispose();
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return image;
		}
		
        Div content = new Div();
        String text = String.format("Mime type: '%s'\nSHA-256 hash: '%s'",
                mimeType, MessageDigestUtil.sha256(stream.toString()));
        content.setText(text);
        return content;
	}

	private Component createTextComponent(InputStream stream) {
		String text;
		try {
			text = IOUtils.toString(stream, StandardCharsets.UTF_8);
		} catch (IOException e) {
			text = "exception reading stream";
		}
		return new Text(text);
	}


}
