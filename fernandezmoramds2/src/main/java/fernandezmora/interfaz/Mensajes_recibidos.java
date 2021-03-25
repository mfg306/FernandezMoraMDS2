package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMensajes_recibidos;


public class Mensajes_recibidos extends VistaMensajes_recibidos {

	public Ver_bandeja_de_entrada _ver_bandeja_de_entrada;
	public Vector<Ver_mensajes_enviados> _list_Ver_mensajes_enviados = new Vector<Ver_mensajes_enviados>();
	public Vector<Mensaje_recibido> _list_Mensaje_recibido = new Vector<Mensaje_recibido>();
	public Crear_mensaje _crear_mensaje;
	public VerticalLayout layout;
	
	public Mensajes_recibidos() {
		inicializar();
	}
	
	public void inicializar() {
		layout = this.getHueco_mensajes_recibidos().as(VerticalLayout.class);
		this._list_Mensaje_recibido = new Vector<>();
		this._list_Ver_mensajes_enviados = new Vector<>();

		obtener_mensajes_recibidos();
	}
	
	public void obtener_mensajes_recibidos() {
		Mensaje_recibido mr = new Mensaje_recibido();
		
		this._list_Mensaje_recibido.add(mr);
		this.layout.add(mr);
		
	}
	
	public void obtener_mensajes_enviados() {
		Mensaje_enviado me = new Mensaje_enviado();
		
		this._list_Ver_mensajes_enviados.add(me); //wtf por que tenemos un listado de Ver_mensajes_enviado si esa es la interfaz 
		this.layout.add(mr);
		
	}
	

	public void Ver_mensajes_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_mensajes_siguientes() {
		throw new UnsupportedOperationException();
	}
}