package fernandezmora.interfaz;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.orm.PersistentException;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

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
	String[] imagenes = new String[5];
	int contador = 0;

	public Editar_producto(Producto_administrador pa) {
		this._producto_administrador = pa;
		this.getAñadeUnaNuevaDescripción().setValue(this._producto_administrador.p.getDescripcion());
		this.getNuevoNombreProducto().setValue(this._producto_administrador.p.getNombre());
		this.getNuevoPrecio().setValue("" + this._producto_administrador.p.getPrecio_producto());
		this.getNumUnidades().setValue(this._producto_administrador.p.getNum_Unidades_Restantes() + "");

		base_de_datos.Imagen imagenes[] = this._producto_administrador.p._Imagen.toArray();

		this.getImagen().setWidth("30vw");
		this.getImagen().setHeight("auto");
		
		
		if(imagenes.length != 0) this.getImagen().setSrc(imagenes[0].getRuta());
		if(imagenes.length > 1) this.getImagen1().setSrc(imagenes[1].getRuta());
		if(imagenes.length > 2) this.getImagen2().setSrc(imagenes[2].getRuta());
		if(imagenes.length > 3) this.getImagen3().setSrc(imagenes[3].getRuta());
		if(imagenes.length > 4) this.getImagen4().setSrc(imagenes[4].getRuta());

		inicializar();
	}

	public void inicializar() {
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		buffer = new MemoryBuffer();
		upload = new Upload(buffer);
		this.getHuecoUpload().add(upload);

		cambiar_Foto_Producto();
		cancelar_edicion();
		editarProducto();
	}
	
	public void retroceder() {
		Gestionar_productos gp = new Gestionar_productos(this._gestionar_productos._administrador);
		this.layout.removeAll();
		layout.add(gp);
	}

	public void cancelar_edicion() {
		this.getVaadinButton1().addClickListener(event -> {
			retroceder();
		});
	}

	public void editarProducto() {
		this.getVaadinButton().addClickListener(event -> {
			iAdministrador admin = new BDPrincipal();
			try {
				this._producto_administrador.p =  admin.actualizarProducto(this._producto_administrador.p.getId_Producto(),
						this.getNuevoNombreProducto().getValue(), Double.parseDouble(this.getNuevoPrecio().getValue()),
						this.getAñadeUnaNuevaDescripción().getValue(), this.imagenes,
						Integer.parseInt(this.getNumUnidades().getValue()));
				Notification.show("Producto editado con exito");
				retroceder();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});
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
			String rutaImagen = "https://i.imgur.com/" + rutaImgur.subSequence(15, 22) + ".jpg";
			this.imagenes[contador] = rutaImagen;
						
			if(contador == 0) {
				this.getImagen().setSrc(rutaImagen);
				this.getImagen().setWidth("20vw");
				this.getImagen().setHeight("auto");	
			}
			
			if(contador == 1) {
				this.getImagen1().setSrc(rutaImagen);
				this.getImagen1().setWidth("20vw");
				this.getImagen1().setHeight("auto");	
			}
			
			if(contador == 2) {
				this.getImagen2().setSrc(rutaImagen);
				this.getImagen2().setWidth("20vw");
				this.getImagen2().setHeight("auto");	
			}
			
			if(contador == 3) {
				this.getImagen3().setSrc(rutaImagen);
				this.getImagen3().setWidth("20vw");
				this.getImagen3().setHeight("auto");	
			}
			
			if(contador == 4) {
				this.getImagen4().setSrc(rutaImagen);
				this.getImagen4().setWidth("20vw");
				this.getImagen4().setHeight("auto");	
			}
			
			contador++;

		});
	}

}