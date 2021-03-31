package fernandezmora.interfaz;

public class Mensaje_enviado extends Mensaje_recibido {
	public Mensajes_enviados _mensajes_enviados;
	
	public Mensaje_enviado() {
		this.getSpan1().setText("Mensaje enviado");
		this.getSpan().setText("MARTA");
	}
}