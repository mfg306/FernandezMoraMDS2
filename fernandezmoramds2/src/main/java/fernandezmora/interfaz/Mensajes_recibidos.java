package fernandezmora.interfaz;

import java.util.Vector;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import vistas.VistaMensajes_recibidos;


public class Mensajes_recibidos extends VistaMensajes_recibidos {

	public Ver_bandeja_de_entrada _ver_bandeja_de_entrada;
	public Ver_mensajes_enviados _list_Ver_mensajes_enviados;
	public Vector<Mensaje_recibido> _list_Mensaje_recibido = new Vector<Mensaje_recibido>();
	public Crear_mensaje _crear_mensaje;
	public VerticalLayout layout;
	base_de_datos.Usuario_General general;
	
	public Mensajes_recibidos(base_de_datos.Usuario_General general, Ver_bandeja_de_entrada vb) {
		this.general = general;
		this._ver_bandeja_de_entrada = vb;
		inicializar();
	}
	
	public void inicializar() {
		this.layout = this.getHueco_mensajes_recibidos().as(VerticalLayout.class);
		abrir_Crear_Mensaje();
	}
	
	public void add_mensaje_recibido(base_de_datos.Mensaje mensaje) {
		Mensaje_recibido mr = new Mensaje_recibido(general,mensaje,this);
		this._list_Mensaje_recibido.add(mr);
		this.layout.add(mr);
	}
	
	public void limpiar_interfaz() {
		this._crear_mensaje = new Crear_mensaje(this.general);
		this.getBoton_crear_mensaje().setVisible(false);
		this.getBoton_pagina_anterior().setVisible(false);
		this.getBoton_pagina_siguiente().setVisible(false);
		this.getNumero_de_pagina().setVisible(false);
	}
	
	public void abrir_Crear_Mensaje() {
		this.getBoton_crear_mensaje().addClickListener(event ->{
			limpiar_interfaz();
			this._ver_bandeja_de_entrada.limpiar_interfaz();
			this._ver_bandeja_de_entrada.layout.add(this._crear_mensaje);
		});
	}
	
	public void Ver_mensajes_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_mensajes_siguientes() {
		throw new UnsupportedOperationException();
	}
}