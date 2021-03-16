package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Menu_UNR extends Menu_UR_UNR {
	public UNR_ _uNR_;
	public Ver_carrito_UNR _ver_carrito_UNR;
	public Iniciar_sesion_UNR _iniciar_sesion_UNR;
	public VerticalLayout layout;

	public Menu_UNR(UNR_ unr) {
		_uNR_ = unr;
		_iniciar_sesion_UNR = new Iniciar_sesion_UNR(this);
		layout = this.getMenu().as(VerticalLayout.class);
		abrir_iniciar_sesion();
	}
	
	public void abrir_iniciar_sesion() {
		
		this.getBoton_iniciar_sesion().addClickListener(event -> {
		this.getVaadinHorizontalLayout().setVisible(false);
		this._uNR_.getBotonVerCategorias().setVisible(false);
			layout.add(this._iniciar_sesion_UNR);
			
		});
		
	}

}
