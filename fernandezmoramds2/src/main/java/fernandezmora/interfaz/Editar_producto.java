package fernandezmora.interfaz;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.orm.PersistentException;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.internal.MessageDigestUtil;
import com.vaadin.flow.server.StreamResource;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import subirfotos.Uploader;
import vistas.VistaEditar_producto;

public class Editar_producto extends VistaEditar_producto {
	public Producto_administrador _producto_administrador;
	public Gestionar_productos _gestionar_productos;
	public VerticalLayout layout;
	Upload upload;
	MemoryBuffer buffer;

	
	public Editar_producto(Producto_administrador pa) {
		this._producto_administrador = pa;
		this.getAñadeUnaNuevaDescripción().setValue(this._producto_administrador.p.getDescripcion());
		this.getNuevoNombreProducto().setValue(this._producto_administrador.p.getNombre());
		this.getNuevoPrecio().setValue("" + this._producto_administrador.p.getPrecio_producto());
		
		base_de_datos.Imagen imagenes[] = this._producto_administrador.p._Imagen.toArray();
		
		this.getImagen().setWidth("30vw");
		this.getImagen().setHeight("auto");
		
		for(base_de_datos.Imagen i : imagenes){
//			if(i.getPrincipal())
			this.getImagen().setSrc(i.getRuta());
		}
		
		inicializar();
	}
	
	public void inicializar() {
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		buffer = new MemoryBuffer();
		upload = new Upload(buffer);
		this.layout.add(upload);
		
		cambiar_Foto_Producto();
		cancelar_edicion();	
		editarProducto();
	}
	
	public void cancelar_edicion() {
		this.getVaadinButton1().addClickListener(event ->{
			Gestionar_productos gp = new Gestionar_productos();
			this.getH1().setVisible(false);
			this.getVaadinHorizontalLayout().setVisible(false);
			this.getVaadinHorizontalLayout1().setVisible(false);
			layout.add(gp);
		});
	}
	
	public void editarProducto() {
		this.getVaadinButton().addClickListener(event -> {
			iAdministrador admin = new BDPrincipal();
			try {
				admin.actualizarProducto(this._producto_administrador.p.getId_Producto(), this.getNuevoNombreProducto().getValue(), 
						Double.parseDouble(this.getNuevoPrecio().getValue()), this.getAñadeUnaNuevaDescripción().getValue(),
						this.getImagen().getSrc(), Integer.parseInt(this.getNumUnidades().getValue()));
				Notification.show("Producto editado con exito");
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});
	}
	
	public void cambiar_Foto_Producto() {
		
		upload.setAcceptedFileTypes("image/jpeg", "image/png");
		
		upload.addSucceededListener(e -> {
			Component component = createComponent(e.getMIMEType(), e.getFileName(), buffer.getInputStream());
			Image img = (Image)component;
			img.setWidth("30vw");
			img.setHeight("auto");
			this.getVaadinHorizontalLayout().add(img);
			File targetFile = new File("src/main/resources/targetFile.tmp");

			try {
				FileUtils.copyInputStreamToFile(buffer.getInputStream(), targetFile);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			
			String rutaImgur = Uploader.upload(targetFile);
			String rutaImagen = "https://i.imgur.com/" +  rutaImgur.subSequence(15, 22) + ".jpg";
			img.removeAll();
			this.getVaadinHorizontalLayout().remove(img);
			this.getImagen().setSrc(rutaImagen);
			this.getImagen().setWidth("30vw");
			this.getImagen().setHeight("auto");
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