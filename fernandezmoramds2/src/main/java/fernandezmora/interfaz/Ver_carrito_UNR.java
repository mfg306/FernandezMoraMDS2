package fernandezmora.interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_carrito_UNR extends Ver_carrito {
	
	public Menu_UNR _menu_UNR;
	public Solicitar_identificación _solicitar_identificación;
	public VerticalLayout layout;
	
	public Ver_carrito_UNR(Menu_UR_UNR urunr) {
		super(urunr);
		this._menu_UNR = (Menu_UNR) urunr;
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		solicitar_Identificacion();
	}
	
	public void solicitar_Identificacion() {
		this.getVaadinButton().addClickListener(event->{
		this._solicitar_identificación = new Solicitar_identificación(this);
		this.getVaadinHorizontalLayout().setVisible(false);
		this._menu_UNR.layout.add(this._solicitar_identificación);
		});
		
	}
}