package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iUR;

public class UR extends UR_UNR {
	//public iUR _iUR;
	public Menu_UR _menu_UR;
	public Ver_producto_UR _ver_producto_UR;
	public VerticalLayout layout;
	
	
	
	
	public UR() {
		_menu_UR = new Menu_UR();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout.add(_menu_UR);
		
			
	}
}