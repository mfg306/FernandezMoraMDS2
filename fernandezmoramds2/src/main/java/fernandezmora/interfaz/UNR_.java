package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iUNR_;

public class UNR_ extends UR_UNR {
	//public iUNR_ _iUNR_;
	public Menu_UNR _menu_UNR;
	public Producto_UNR _producto_UNR;
	public VerticalLayout layout;



	public UNR_() {
		
		_menu_UNR = new Menu_UNR();
		_producto_UNR =  new Producto_UNR();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.getHuecoMenu().as(VerticalLayout.class).add(_menu_UNR);
				
	}
	
	public void ocultarInformacionUNR() {
		
		this.getVaadinVerticalLayout().setVisible(false);
	}
	
	public void abrirIniciarSesion() {
		
		this._menu_UNR.getBoton_iniciar_sesion().addClickListener(event -> {
				ocultarInformacionUNR();
				this._menu_UNR._iniciar_sesion_UNR = new Iniciar_sesion_UNR();
				this.layout.add(this._menu_UNR._iniciar_sesion_UNR);
			});
	}
	
}