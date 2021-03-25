package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_bandeja_de_entrada;

public class Ver_bandeja_de_entrada extends VistaVer_bandeja_de_entrada{
	public Menu_UR _menu_UR;
	public Mensajes_recibidos _mensajes_recibidos;
	public VerticalLayout layout;
	
	public Ver_bandeja_de_entrada() {
		//No hace falta llamar al metodo inicializar porque se llama en Menu_A cuando se hace click en el boton 
		//del correo del menu
	}
	
	public void inicializar() {
		layout = this.getHuecoMensajes().as(VerticalLayout.class);
		this._mensajes_recibidos = new Mensajes_recibidos();		
		
		layout.add(this._mensajes_recibidos);
		abrir_mensajes_enviados();
		abrir_mensajes_recibidos();
	}
	
	public void limpiar_interfaz() {
		this.layout.removeAll();
	}
	
	public void abrir_mensajes_enviados() {
		this.getBoton_enviados().addClickListener(event ->{
			limpiar_interfaz();
			
		});
	}
	
	public void abrir_mensajes_recibidos() {
		this.getBoton_recibidos().addClickListener(event ->{
			
		});
	}
}