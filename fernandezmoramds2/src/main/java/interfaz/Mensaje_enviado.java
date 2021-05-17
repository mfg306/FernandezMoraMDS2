package interfaz;

public class Mensaje_enviado extends Mensaje_recibido {
	public Mensajes_enviados _mensajes_enviados;
	public Crear_mensaje _crear_mensaje;
	base_de_datos.Usuario_General general;
	
	public Mensaje_enviado(base_de_datos.Usuario_General general, base_de_datos.Mensaje mensaje, Mensajes_enviados mEnviados) {
		super(general,mensaje, mEnviados);
		this._mensajes_enviados = mEnviados;
		this.getSpan1().setText(mensaje.getMensaje());
		this.getSpan().setText(mensaje.getCorreo_emisor());
		this.getResponder().setVisible(false);
	}
}