package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionar_ventas;

public class Gestionar_ventas extends VistaGestionar_ventas {
	public Administrador _administrador;
	public Ventas _ventas;
	VerticalLayout layout;
	
	public Gestionar_ventas() {
		
		this._ventas = new Ventas();
		this._ventas.add_ventas();
		this._ventas.add_ventas();
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout.add(this._ventas);
	
	}
	
	public void ocultar_ventas() {
		this.getH1().setVisible(false);
	}
}