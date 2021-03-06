package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaVercategorias;

public class Ver_categorias extends VistaVercategorias {
	public UR_UNR _uR_UNR;
	public Categorias _categorias;
	public VerticalLayout layout;
	
	public Ver_categorias(UR_UNR unr) {
		inicializar(unr);
		
	}
	
	public void inicializar(UR_UNR unr) {
		this._uR_UNR = unr;
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this._categorias = new Categorias(this);
		this.layout.remove(this._categorias);
		this.layout.add(this._categorias);
		
	    
	}
	
}