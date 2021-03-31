package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_bandeja_de_entrada;

public class Ver_bandeja_de_entrada extends VistaVer_bandeja_de_entrada{
	public Menu_UR _menu_UR;
	public Mensajes_recibidos _mensajes_recibidos;
	public VerticalLayout layout;
	
	public Ver_bandeja_de_entrada() {
		this._mensajes_recibidos = new Mensajes_recibidos();
		inicializar();
		abrir_mensajes_recibidos();
		abrir_mensajes_enviados();

	}
	
	public void inicializar() {
		this.layout = this.getVaadinVerticalLayoutGeneral().as(VerticalLayout.class);
		this.getHuecoMensajes().as(VerticalLayout.class).add(this._mensajes_recibidos);
		this.getMenuAdmin().setVisible(false);
	}
	
	public void limpiar_interfaz() {
		this.layout.removeAll();
	}
	
	public void abrir_mensajes_enviados() {
		this.getBoton_enviados().addClickListener(event ->{
			limpiar_mensajes();
			this._mensajes_recibidos._list_Ver_mensajes_enviados = new Ver_mensajes_enviados();
			this.getHuecoMensajes().as(VerticalLayout.class).add(this._mensajes_recibidos._list_Ver_mensajes_enviados._mensajes_enviados);
		});
		
	}
	
	public void limpiar_mensajes() {
		this.getHuecoMensajes().as(VerticalLayout.class).removeAll();
	}
	
	public void abrir_mensajes_recibidos() {
		this.getBoton_recibidos().addClickListener(event ->{
			limpiar_mensajes();
			this.inicializar();
		});

	}
}