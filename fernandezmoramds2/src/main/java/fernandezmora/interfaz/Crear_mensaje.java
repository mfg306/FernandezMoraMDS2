package fernandezmora.interfaz;

import org.orm.PersistentException;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iUR;
import vistas.VistaCrear_mensaje;

public class Crear_mensaje extends VistaCrear_mensaje{
	public Mensajes_recibidos _mensajes_recibidos;
	public Mensajes_enviados _mensajes_enviados;
	base_de_datos.Usuario_General general;
	
	public Crear_mensaje(base_de_datos.Usuario_General general) {
		this.general = general;
		crearMensaje();
	}
	
	public void crearMensaje() {
		this.getBoton_enviar().addClickListener(event ->{
			if(this.general instanceof base_de_datos.Administrador) {
				iAdministrador iadmin = new BDPrincipal();
				try {
					iadmin.enviarMensaje(this.getDestinatario().getValue(), 
							this.getMensaje().getValue(), this.getAsunto().getValue(), this.general);
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
			
			if(this.general instanceof base_de_datos.UR) {
				iUR iur = new BDPrincipal();
				try {
					iur.enviarMensaje(this.getDestinatario().getValue(), 
							this.getMensaje().getValue(), this.getAsunto().getValue(), this.general);
				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
		});
	}
}