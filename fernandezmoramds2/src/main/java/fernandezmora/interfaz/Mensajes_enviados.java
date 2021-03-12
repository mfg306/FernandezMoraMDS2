package fernandezmora.interfaz;

import java.util.Vector;


public class Mensajes_enviados extends Mensajes_recibidos {
	/*private event _ver_mensajes_anteriores;
	private event _ver_mensajes_siguientes;*/
	public Ver_mensajes_enviados _ver_mensajes_enviados;
	public Vector<Mensaje_enviado> _list_Mensaje_enviado = new Vector<Mensaje_enviado>();
	public Crear_mensaje _crear_mensaje;

	public void Ver_mensajes_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_mensajes_siguientes() {
		throw new UnsupportedOperationException();
	}
}