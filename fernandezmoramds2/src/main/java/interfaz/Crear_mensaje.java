package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iUR;
import vistas.VistaCrear_mensaje;

public class Crear_mensaje extends VistaCrear_mensaje {
	public Mensajes_recibidos _mensajes_recibidos;
	public Mensajes_enviados _mensajes_enviados;
	public Select<String> posiblesUsuarios = new Select<>();
	base_de_datos.Usuario_General general;
	base_de_datos.Mensaje mensaje;


	/** Constructor para cuando se accede a traves de los mensajes recibidos
	 * @param general
	 * @param mr
	 */
	public Crear_mensaje(base_de_datos.Usuario_General general, Mensajes_recibidos mr) {
		this.general = general;
		this._mensajes_recibidos = mr;
		crearMensaje();
		inicializar();
	}

	/**
	 * Este constructor es para cuando se quiere responder a un mensaje
	 * @param general usuario que envia el mensaje
	 * @param mensaje mensaje al que se va a responder
	 */
	public Crear_mensaje(base_de_datos.Usuario_General general, base_de_datos.Mensaje mensaje,  Mensajes_recibidos mr) {
		this.general = general;
		this.mensaje = mensaje;
		this._mensajes_recibidos = mr;
		this.getAsunto().setVisible(false);
		this.posiblesUsuarios.setVisible(false);
		responderMensaje();
		inicializar();
	}

	public void inicializar() {
		if (this.general instanceof base_de_datos.Administrador) {
			posiblesUsuarios.setWidth("100%");
			this.getHuecoSelect().add(posiblesUsuarios);
			cargarClientes();
			
		}
		
		retroceder();
	}
	
	public void limpiar_interfaz() {
		if(this._mensajes_recibidos != null) {
			this._mensajes_recibidos._ver_bandeja_de_entrada.layout.remove(this);
			this._mensajes_recibidos._ver_bandeja_de_entrada.inicializar();
		}
	}
	
	public void retroceder() {
		this.getBoton_atras().addClickListener(event ->{
			/*Redirigimos a mensajes recibidos*/
			limpiar_interfaz();
		});

	}
	
	public void cargarClientes() {
		iAdministrador admin = new BDPrincipal();
		ArrayList<String> listaCorreos;

		try {
			base_de_datos.UR[] usuarios = admin.cargarClientes();
			listaCorreos = new ArrayList<>();

			for (base_de_datos.UR u : usuarios) {
				listaCorreos.add(u.getCorreo_electronico());
			}
			posiblesUsuarios.setItems(listaCorreos);

		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void crearMensaje() {
		this.getBoton_enviar().addClickListener(event -> {
			if (this.general instanceof base_de_datos.Administrador) {
				iAdministrador iadmin = new BDPrincipal();
				try {
					iadmin.enviarMensaje(posiblesUsuarios.getValue(), this.getMensaje().getValue(),
							this.getAsunto().getValue(), this.general);
					limpiar_interfaz();
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}

			if (this.general instanceof base_de_datos.UR) {
				iUR iur = new BDPrincipal();
				try {
					iur.enviarMensaje("admin@admin.es", this.getMensaje().getValue(), this.getAsunto().getValue(),
							this.general);
					retroceder();
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
			Notification.show("Mensaje enviado con exito");
		});
		
	}

	public void responderMensaje() {
		this.getBoton_enviar().addClickListener(event -> {
			if(this.general instanceof base_de_datos.UR) {
				iUR iur = new BDPrincipal();
				try {
					iur.responderMensaje(this.mensaje.getCorreo_emisor(), this.getMensaje().getValue(), this.general, mensaje);
					Notification.show("Su respuesta se ha mandado con éxito");
					limpiar_interfaz();
				} catch (PersistentException e) {
					e.printStackTrace();
					Notification.show("Se ha producido un error al enviar su mensaje. Vuelva a intentarlo");
				}
			}
			
			if(this.general instanceof base_de_datos.Administrador) {
				iAdministrador iadmin = new BDPrincipal();
				try {
					iadmin.responderMensaje(this.mensaje.getCorreo_emisor(), this.getMensaje().getValue(), this.general, mensaje);
					Notification.show("Su respuesta se ha mandado con éxito");
					retroceder();
				} catch (PersistentException e) {
					e.printStackTrace();
					Notification.show("Se ha producido un error al enviar su mensaje. Vuelva a intentarlo");

				}
			}
		});
	}
}