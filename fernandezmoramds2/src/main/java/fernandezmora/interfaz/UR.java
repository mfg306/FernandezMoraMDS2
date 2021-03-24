package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iUR;

public class UR extends UR_UNR {
	//public iUR _iUR;
	public Menu_UR _menu_UR;
	public Ver_producto_UR _ver_producto_UR;
	
	
	public UR() {
		_menu_UR = new Menu_UR(this);
		this.getHuecoMenu().as(VerticalLayout.class).add(_menu_UR);
				
	}
}