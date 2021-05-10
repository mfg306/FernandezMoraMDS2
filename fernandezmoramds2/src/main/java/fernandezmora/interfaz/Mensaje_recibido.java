package fernandezmora.interfaz;

import vistas.VistaMensaje_recibido;

public class Mensaje_recibido extends VistaMensaje_recibido {
	public Mensajes_recibidos _mensajes_recibidos;
	base_de_datos.Mensaje mensaje;
	
	public Mensaje_recibido(base_de_datos.Mensaje mensaje) {
		this.mensaje = mensaje;
		this.getSpan1().setText(this.mensaje.getMensaje());
	}
}