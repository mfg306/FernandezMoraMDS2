package fernandezmora.interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_carrito_UNR extends Ver_carrito {
	
	public Menu_UNR _menu_UNR;
	public Solicitar_identificación _solicitar_identificación;
	public Productos_carrito _productos_carrito;
	public VerticalLayout layout;
	
	public Ver_carrito_UNR(Menu_UNR _menu_UNR) {
		super();
		this._menu_UNR = _menu_UNR;

		inicializar();
	}
	
	public void inicializar() {
		this._solicitar_identificación = new Solicitar_identificación(this);
		this._productos_carrito = new Productos_carrito(this);
		this._menu_UNR._uNR_.getBotonVerCategorias().setVisible(false);
		
		this.getProductosCarrito().add(this._productos_carrito);
		layout = this.getVaadinVerticalLayout1().as(VerticalLayout.class);

	}
	
	public void ocultar_informacion_al_realizar_compra() {
		this.getVaadinVerticalLayout().setVisible(false);
		this.getProductosCarrito().setVisible(false); // 

	}
	
	@Override
	public void realizar_compra() {
		this.getVaadinButton().addClickListener(event ->{
			ocultar_informacion_al_realizar_compra();
			if(this._solicitar_identificación.isVisible() == false) this._solicitar_identificación.setVisible(true);
			else layout.add(this._solicitar_identificación);
		});

		
	}
	
	

	
	
}