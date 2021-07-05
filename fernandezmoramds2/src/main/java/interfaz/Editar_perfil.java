package interfaz;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.http.fileupload.impl.FileSizeLimitExceededException;
import org.orm.PersistentException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.iUR;
import subirfotos.Uploader;
import vistas.VistaEditar_perfil;

public class Editar_perfil extends VistaEditar_perfil{
	public Menu_UR _menu_UR;
	public Verificacion_cuenta_eliminada _verificacion_cuenta_eliminada;
	public Cambiar_contraseña _cambiar_contraseña;
	Upload upload;
	MemoryBuffer buffer;
	Image foto;
	String rutaInicial = "";

	public Editar_perfil(Menu_UR _menu_UR) {
		rutaInicial = this.getImg().getSrc();
		inicializar(_menu_UR);
	}

	public void inicializar(Menu_UR _menu_UR) {
		this._menu_UR = _menu_UR;

		this.getHuecoImagen().as(VerticalLayout.class).removeAll();

		buffer = new MemoryBuffer();
		upload = new Upload(buffer);
		cambiar_Foto_Perfil();
		editarPerfil();
		eliminarCuenta();
		cambiar_contrasenia();
		this.getHuecoImagen().as(VerticalLayout.class).add(upload);
	}

	public void cambiar_contrasenia() {
		this.getBoton_cambiar_contrasenia().addClickListener(event -> {
			this._cambiar_contraseña = new Cambiar_contraseña(this);
			limpiar_interfaz();
			this._menu_UR.layout.add(this._cambiar_contraseña);
		});
	}

	public void limpiar_interfaz() {
		this._menu_UR.layout.remove(this);
	}

	public void editarPerfil() {

		iUR iur = new BDPrincipal();
		
		try {
		
			this._menu_UR._uR.UR = iur.buscarUsuarioPorCorreo(this._menu_UR._uR.UR.getCorreo_electronico());
			
			this.getNombre_usuario().setValue(this._menu_UR._uR.UR.getNombre_usuario().toString());
			this.getNombre().setValue(this._menu_UR._uR.UR.getNombre().toString());
			this.getCorreo_electronico().setValue(this._menu_UR._uR.UR.getCorreo_electronico().toString());
			this.getApellidos().setValue(this._menu_UR._uR.UR.getPrimer_apellido().toString());
			this.getSegundoApellido().setValue(this._menu_UR._uR.UR.getSegundo_apellido().toString());
			
			if(this._menu_UR._uR.UR.getImagen() != null){
				if(foto != null) {
					this.getHuecoImagen().as(VerticalLayout.class).remove(foto);
				}
				
				foto = new Image();
				foto.setSrc(this._menu_UR._uR.UR.getImagen().getRuta());
				foto.setWidth("20vw");
				foto.setHeight("20vw");
				this.getHuecoImagen().as(VerticalLayout.class).add(foto);
			}
			
			if (this._menu_UR._uR.UR.getDireccion_envio() == null) {
				this.getDireccion_envio().setValue("Ninguna dirección de envío añadida");
			} else {
				this.getDireccion_envio().setValue(this._menu_UR._uR.UR.getDireccion_envio().toString());
			}
			if (this._menu_UR._uR.UR.getMetodo_pago() == null) {
				this.getMetodo_pago().setValue("Ningún método de pago añadido");
			} else {
				this.getMetodo_pago().setValue(this._menu_UR._uR.UR.getMetodo_pago().toString());
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		} 
		
		this.getBoton_guardar().addClickListener(event ->{
			try {
				
				if(foto != null) {
					if(foto.getSrc().equals(rutaInicial)) {
						iur.cambiarDatosUsuario(this.getNombre_usuario().getValue(), this.getNombre().getValue(), this.getApellidos().getValue(),this.getSegundoApellido().getValue()
								, this.getCorreo_electronico().getValue(), this.getDireccion_envio().getValue(), 
								this.getMetodo_pago().getValue(), null);
					} else {
						iur.cambiarDatosUsuario(this.getNombre_usuario().getValue(), this.getNombre().getValue(), this.getApellidos().getValue(),this.getSegundoApellido().getValue()
								, this.getCorreo_electronico().getValue(), this.getDireccion_envio().getValue(), 
								this.getMetodo_pago().getValue(), foto.getSrc());
					}
					
				}else {
					iur.cambiarDatosUsuario(this.getNombre_usuario().getValue(), this.getNombre().getValue(), this.getApellidos().getValue(),this.getSegundoApellido().getValue()
							, this.getCorreo_electronico().getValue(), this.getDireccion_envio().getValue(), 
							this.getMetodo_pago().getValue(), null);
				}

				Notification.show("Configuración guardada con éxito");
				this.inicializar(this._menu_UR);
				
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			
		});
		
	}
	
	public void cambiar_Foto_Perfil() {

		upload.setAcceptedFileTypes("image/jpeg", "image/png");
		
		upload.addSucceededListener(e -> {
			File targetFile = new File("src/main/resources/targetFile.tmp");

			try {
				FileUtils.copyInputStreamToFile(buffer.getInputStream(), targetFile);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			
			String rutaImgur = Uploader.upload(targetFile);
			String rutaImagen = "https://i.imgur.com/" +  rutaImgur.subSequence(15, 22) + ".jpg";
			
			if(foto != null) {
				this.getHuecoImagen().as(VerticalLayout.class).remove(foto);
			}
			
			foto = new Image();
			foto.setSrc(rutaImagen);
			foto.setWidth("20vw");
			foto.setHeight("20vw");
			
			this.getHuecoImagen().as(VerticalLayout.class).add(foto);
			this.getHuecoImagen().as(VerticalLayout.class).remove(upload);
			this.getHuecoImagen().as(VerticalLayout.class).add(upload);

			
	
		});
	}
	
	public void eliminarCuenta() {
		iUR iur = new BDPrincipal();
		this.getBoton_eliminar_cuenta().addClickListener(event ->{
			try {
				iur.eliminarUsuario(this._menu_UR._uR.UR.getCorreo_electronico());
				Verificacion_cuenta_eliminada vce = new Verificacion_cuenta_eliminada(this._menu_UR);
				limpiar_interfaz();
				this._menu_UR.layout.add(vce);
			} catch (PersistentException e) {
			
				e.printStackTrace();
			}
		});
	}

}
