package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import vistas.VistaVer_bandeja_de_entrada;

public class Ver_bandeja_de_entrada extends VistaVer_bandeja_de_entrada{
	public Menu_UR _menu_UR;
	public Mensajes_recibidos _mensajes_recibidos;
	public VerticalLayout layout;
	base_de_datos.Usuario_General general;
	
	public Ver_bandeja_de_entrada(base_de_datos.Usuario_General general) {
		this.general = general;
		this.layout = this.getVaadinVerticalLayoutGeneral().as(VerticalLayout.class);
		inicializar();
	}
	
	public void inicializar() {
		this.getSpan().setVisible(true);
		this.getBoton_enviados().setVisible(true);
		this.getBoton_recibidos().setVisible(true);
		
		System.out.println("2");
		if(this._mensajes_recibidos != null) {
			this.getHuecoMensajes().as(VerticalLayout.class).remove(this._mensajes_recibidos);
		
			if(this._mensajes_recibidos._list_Ver_mensajes_enviados != null) {
				System.out.println("3");
				this.getHuecoMensajes().as(VerticalLayout.class).remove(this._mensajes_recibidos._list_Ver_mensajes_enviados._mensajes_enviados);
			}
		}
		
		this._mensajes_recibidos = new Mensajes_recibidos(this.general,this);
		this.getHuecoMensajes().as(VerticalLayout.class).add(this._mensajes_recibidos);

		this.getMenuAdmin().setVisible(false);
		
		abrir_mensajes_recibidos();
		abrir_mensajes_enviados();
	}
	
	public void limpiar_interfaz() {
		this.getSpan().setVisible(false);
		this.getBoton_enviados().setVisible(false);
		this.getBoton_recibidos().setVisible(false);
		this.getHuecoMensajes().as(VerticalLayout.class).remove(this._mensajes_recibidos);
	}
	
	public void abrir_mensajes_enviados() {
		this.getBoton_enviados().addClickListener(event ->{
			this.limpiar_mensajes();
			this._mensajes_recibidos._list_Ver_mensajes_enviados = new Ver_mensajes_enviados(this.general);
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