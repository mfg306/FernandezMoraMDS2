package fernandezmora.interfaz;

import vistas.VistaMensaje_recibido;

public class Mensaje_recibido extends VistaMensaje_recibido {
	public Mensajes_recibidos _mensajes_recibidos;
	
	public Mensaje_recibido() {
		this.getSpan1().setText("Mensaje recibido");
	}
}