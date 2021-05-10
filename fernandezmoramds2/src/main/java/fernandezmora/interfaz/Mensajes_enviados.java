package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;


public class Mensajes_enviados extends Mensajes_recibidos {
	public Ver_mensajes_enviados _ver_mensajes_enviados;
	public Vector<Mensaje_enviado> _list_Mensaje_enviado = new Vector<Mensaje_enviado>();
	public Crear_mensaje _crear_mensaje;
	public VerticalLayout layoutEnviados;

	
	public Mensajes_enviados() {
		inicializarEnviados();
	}
	
	public void inicializarEnviados() {
		this._list_Mensaje_enviado = new Vector<Mensaje_enviado>();
		this.layoutEnviados = this.getHueco_mensajes_recibidos().as(VerticalLayout.class);
		this.layout.removeAll(); //Vaciamos los mensajes recibidos que hubiese
	}
	
	public void add_mensaje_enviado(base_de_datos.Mensaje mensaje) {
		Mensaje_enviado me = new Mensaje_enviado(mensaje);
		this._list_Mensaje_enviado.add(me);
		layoutEnviados.add(me);
		
	}

	public void Ver_mensajes_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_mensajes_siguientes() {
		throw new UnsupportedOperationException();
	}
}