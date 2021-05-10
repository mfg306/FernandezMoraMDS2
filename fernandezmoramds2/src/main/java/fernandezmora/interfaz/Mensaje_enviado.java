package fernandezmora.interfaz;

public class Mensaje_enviado extends Mensaje_recibido {
	public Mensajes_enviados _mensajes_enviados;
	
	public Mensaje_enviado(base_de_datos.Mensaje mensaje) {
		super(mensaje);
		this.getSpan1().setText(mensaje.getMensaje());
		this.getSpan().setText(mensaje.getCorreo_receptor());
	}
}