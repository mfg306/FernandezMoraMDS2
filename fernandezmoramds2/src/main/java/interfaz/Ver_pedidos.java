package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_pedidos;

public class Ver_pedidos extends VistaVer_pedidos {
	public Menu_UR _menu_UR;
	public Pedidos _pedidos;
	public VerticalLayout layout;
	
	public Ver_pedidos(Menu_UR mur) {
		inicializar(mur);
	}
	
	public void inicializar(Menu_UR menuur) {
		layout = this.getLista_pedidos().as(VerticalLayout.class);
		this._menu_UR = menuur;
		this._pedidos = new Pedidos(this);
		this.layout.add(this._pedidos);
		
	}
	
	
}