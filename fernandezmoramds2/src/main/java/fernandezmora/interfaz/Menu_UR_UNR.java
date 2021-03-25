package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMenu_urunr;

public abstract class Menu_UR_UNR extends VistaMenu_urunr {
	public UR_UNR _uR_UNR;
	public Ver_carrito _ver_carrito;
	public Buscador _buscador;
	public VerticalLayout layout;
	
	public Menu_UR_UNR() {
		inicializar();
	}
	
	
	public void inicializar() {
		layout = this.getMenu().as(VerticalLayout.class);
	}
	
	public abstract void abrir_carrito();

	
	
}