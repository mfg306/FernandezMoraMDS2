package interfaz;

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
	String[] imagenes = new String[5];
	int contador = 0;

	public Crear_producto(Producto_administrador pa) {
		this._producto_administrador = pa;
		inicializar();
	}

	public void inicializar() {
		layout = this.getHuecoUpload().as(VerticalLayout.class);
		buffer = new MemoryBuffer();
		upload = new Upload(buffer);
		
		this.layout.add(upload);
		
		cambiar_Foto_Producto();
		cancelar_creacion();
		crearProducto();
	}
	
	public void cambiar_Foto_Producto() {
		upload.setAcceptedFileTypes("image/jpeg", "image/png");
		upload.setMaxFiles(5);
		
		upload.addSucceededListener(e -> {
			File targetFile = new File("src/main/resources/targetFile.tmp");

			try {
				FileUtils.copyInputStreamToFile(buffer.getInputStream(), targetFile);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			
			String rutaImgur = Uploader.upload(targetFile);
			String rutaImagen = "https://i.imgur.com/" +  rutaImgur.subSequence(15, 22) + ".jpg";
			this.imagenes[contador] = rutaImagen;
			
			if(contador == 0) {
				this.getFotoProducto().setSrc(rutaImagen);
				this.getFotoProducto().setWidth("10vw");
				this.getFotoProducto().setHeight("auto");	
			} else {
				Image i = new Image();
				i.setSrc(rutaImagen);
				i.setWidth("5vw");
				i.setHeight("auto");
				this.getVaadinHorizontalLayout4().add(i);
			}
			contador++;
		});
	}
	
	public void retroceder() {
		Gestionar_productos gp = new Gestionar_productos(this._producto_administrador._productos_administrador._gestionar_productos._administrador);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(gp);
	}

	public void cancelar_creacion() {
		this.getVaadinButton2().addClickListener(event -> {
			retroceder();
		});
	}

	public void crearProducto() {
		this.getVaadinButton1().addClickListener(event -> {
			iAdministrador admin = new BDPrincipal();
			
			try {				
				admin.insertarProducto(this.getNombreProducto().getValue(), this.getAñadeUnaDescripciónAlProducto().getValue(), 
						Double.parseDouble(this.getPrecio().getValue()), Integer.parseInt(this.getCantidadProducto().getValue()), 
						this.imagenes);
				retroceder();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});
	}
}
