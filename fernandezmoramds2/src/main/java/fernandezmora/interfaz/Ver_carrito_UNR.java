package fernandezmora.interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_carrito_UNR extends Ver_carrito {
	
	public Menu_UNR _menu_UNR;
	public Solicitar_identificación _solicitar_identificación;
	public Productos_carrito _productos_carrito;
	public VerticalLayout layout;
	
	public Ver_carrito_UNR(Menu_UR_UNR urunr) {
		super(urunr);
		this._menu_UNR = (Menu_UNR) urunr;
		this._productos_carrito = new Productos_carrito(this);
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		solicitar_Identificacion();
		this._productos_carrito.anadir_Producto_Carrito();
		this._productos_carrito.anadir_Producto_Carrito();
	}
	
	public void solicitar_Identificacion() {
		this.getVaadinButton().addClickListener(event->{
		this._solicitar_identificación = new Solicitar_identificación(this);
		this.getVaadinHorizontalLayout().setVisible(false);
		this._productos_carrito._ver_carrito.getProductosCarrito().setVisible(false);
		this._productos_carrito._ver_carrito.getProductoURUNR().setVisible(false);
		this._menu_UNR.layout.add(this._solicitar_identificación);
		});
		
	}
	
	
}