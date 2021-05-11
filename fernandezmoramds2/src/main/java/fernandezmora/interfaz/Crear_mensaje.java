package fernandezmora.interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iUR;
import vistas.VistaCrear_mensaje;

public class Crear_mensaje extends VistaCrear_mensaje{
	public Mensajes_recibidos _mensajes_recibidos;
	public Mensajes_enviados _mensajes_enviados;
	public Select<String> posiblesUsuarios = new Select<>();
	base_de_datos.Usuario_General general;

	
	public Crear_mensaje(base_de_datos.Usuario_General general) {
		this.general = general;
		
		crearMensaje();
		
		if(this.general instanceof base_de_datos.Administrador) {
			posiblesUsuarios.setWidth("100%");
			
			this.getHuecoSelect().add(posiblesUsuarios);
			cargarClientes();
		}
	}
	
	public void cargarClientes() {
		iAdministrador admin = new BDPrincipal();
		ArrayList<String> listaCorreos;
		
		try {
			base_de_datos.UR[] usuarios = admin.cargarClientes();
			listaCorreos = new ArrayList<>();
			
			for(base_de_datos.UR u : usuarios) {
				listaCorreos.add(u.getCorreo_electronico());
			}
			posiblesUsuarios.setItems(listaCorreos);

		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
	
	public void crearMensaje() {
		this.getBoton_enviar().addClickListener(event ->{
			if(this.general instanceof base_de_datos.Administrador) {
				iAdministrador iadmin = new BDPrincipal();
				try {
					System.out.println("Es un administrador");
					iadmin.enviarMensaje(posiblesUsuarios.getValue(), 
							this.getMensaje().getValue(), this.getAsunto().getValue(), this.general);
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
			
			if(this.general instanceof base_de_datos.UR) {
				iUR iur = new BDPrincipal();
				try {					
					System.out.println("Es un UR");
					iur.enviarMensaje("admin@admin.es", 
							this.getMensaje().getValue(), this.getAsunto().getValue(), this.general);
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
			Notification.show("Mensaje enviado con exito");
		});
	}
	
	public void responderMensaje() {
		this.getResponder().addClickListener(event ->{
			if(this._mensajes_recibidos.general instanceof base_de_datos.UR) {
				iUR iur = new BDPrincipal();
				
				iur.responderMensaje(this.mensaje.getCorreo_receptor(), null, null, mensaje)
			}
		});
	}
}