package fernandezmora.interfaz;

import vistas.VistaMensaje_recibido;

public class Mensaje_recibido extends VistaMensaje_recibido {
	public Mensajes_recibidos _mensajes_recibidos;
	public Crear_mensaje _crear_mensaje;
	base_de_datos.Mensaje mensaje;
	base_de_datos.Usuario_General general;

	
	public Mensaje_recibido(base_de_datos.Usuario_General general, base_de_datos.Mensaje mensaje, Mensajes_recibidos mensajesR) {
		this.mensaje = mensaje;
		this.general = general;
		this._mensajes_recibidos = mensajesR;
		this.getSpan1().setText(this.mensaje.getMensaje());
		this.getSpan().setText(this.mensaje.getCorreo_emisor());
		
		abrir_Crear_Mensaje_Responder();
	}	
	
	
	public void abrir_Crear_Mensaje_Responder() {
			this.getResponder().addClickListener(event ->{
				this._crear_mensaje = new Crear_mensaje(general, mensaje);
				this._mensajes_recibidos.limpiar_interfaz();
				this._mensajes_recibidos._ver_bandeja_de_entrada.limpiar_interfaz();
			});
		}
}