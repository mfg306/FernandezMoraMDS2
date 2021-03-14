package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Menu_UNR extends Menu_UR_UNR {
	public UNR_ _uNR_;
	public Ver_carrito_UNR _ver_carrito_UNR;
	public Iniciar_sesion_UNR _iniciar_sesion_UNR;
	public VerticalLayout layout;
	
	public Menu_UNR() {
		
		this._iniciar_sesion_UNR = new Iniciar_sesion_UNR();
		layout = this.getMenu().as(VerticalLayout.class);
		
		
		/*this.getBoton_iniciar_sesion().addClickListener(event ->{
			layout.add(_iniciar_sesion_UNR);

		});*/

	}
	
	
}
			

				
