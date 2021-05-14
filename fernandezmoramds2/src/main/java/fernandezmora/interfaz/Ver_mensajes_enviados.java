package fernandezmora.interfaz;

import org.orm.PersistentException;

import basededatos.BDPrincipal;

public class Ver_mensajes_enviados extends Ver_bandeja_de_entrada {
	public Mensajes_recibidos _mensajes_recibidos;
	public Mensajes_enviados _mensajes_enviados;
	base_de_datos.Usuario_General general;

	public Ver_mensajes_enviados(base_de_datos.Usuario_General general) {
		super(general);
		this.general = general;
		this.inicializarMensajesEnviados();
	}

	public void inicializarMensajesEnviados() {
		this._mensajes_enviados = new Mensajes_enviados(this.general, this);
		verMensajesEnviados();
	}
	
	public void verMensajesEnviados() {
		base_de_datos.Mensaje mensajes[] = null;
		if(this.general instanceof base_de_datos.Administrador) {
			basededatos.iAdministrador iadmin = new BDPrincipal();
			try {
				mensajes = iadmin.cargarMensajesEnviados(this.general);		
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}
				
		if(this.general instanceof base_de_datos.UR) {
			basededatos.iUR ur = new BDPrincipal();
			try {
				mensajes = ur.cargarMensajesEnviados(this.general);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}
		
		for(base_de_datos.Mensaje m : mensajes) {
			this._mensajes_enviados.add_mensaje_enviado(m);
		}
	}

}
