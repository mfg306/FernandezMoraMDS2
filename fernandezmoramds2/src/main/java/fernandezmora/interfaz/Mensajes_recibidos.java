package fernandezmora.interfaz;

import java.util.Vector;

import vistas.VistaMensajes_recibidos;


public class Mensajes_recibidos extends VistaMensajes_recibidos {

	public Ver_bandeja_de_entrada _ver_bandeja_de_entrada;
	public Vector<Ver_mensajes_enviados> _list_Ver_mensajes_enviados = new Vector<Ver_mensajes_enviados>();
	public Vector<Mensaje_recibido> _list_Mensaje_recibido = new Vector<Mensaje_recibido>();
	public Crear_mensaje _crear_mensaje;
	

	public void Ver_mensajes_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_mensajes_siguientes() {
		throw new UnsupportedOperationException();
	}
}