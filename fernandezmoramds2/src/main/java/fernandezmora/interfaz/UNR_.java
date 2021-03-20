package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iUNR_;

public class UNR_ extends UR_UNR {
	public Menu_UNR _menu_UNR;
	public Producto_UNR _producto_UNR;
	//public VerticalLayout layout;

	public UNR_() {
		_menu_UNR = new Menu_UNR(this);
		//layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.getHuecoMenu().as(VerticalLayout.class).add(_menu_UNR);
		
	
	}
	


}