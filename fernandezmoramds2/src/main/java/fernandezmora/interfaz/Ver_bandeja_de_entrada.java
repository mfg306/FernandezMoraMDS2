package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
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
		this._mensajes_recibidos = new Mensajes_recibidos(this.general,this);
		this.getHuecoMensajes().as(VerticalLayout.class).add(this._mensajes_recibidos);

		this.getMenuAdmin().setVisible(false);
		
		VerBandejaDeEntrada();
		abrir_mensajes_recibidos();
		abrir_mensajes_enviados();
	}
	
	public void limpiar_interfaz() {
		this.getSpan().setVisible(false);
		this.getBoton_enviados().setVisible(false);
		this.getBoton_recibidos().setVisible(false);
	}
	
	public void abrir_mensajes_enviados() {
		this.getBoton_enviados().addClickListener(event ->{
			limpiar_mensajes();
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
	
	public void VerBandejaDeEntrada() {
		base_de_datos.Mensaje mensajes[] = null;
		if(this.general instanceof base_de_datos.Administrador) {
			basededatos.iAdministrador iadmin = new BDPrincipal();
			try {
				mensajes = iadmin.cargarMensajesRecibidos(this.general);		
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}
				
		if(this.general instanceof base_de_datos.UR) {
			basededatos.iUR ur = new BDPrincipal();
			try {
				mensajes = ur.cargarMensajesRecibidos(this.general);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}
		
		for(base_de_datos.Mensaje m : mensajes) {
			this._mensajes_recibidos.add_mensaje_recibido(m);
		}
	}
}