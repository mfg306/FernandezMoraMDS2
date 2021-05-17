package interfaz;

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
	}
	

}
