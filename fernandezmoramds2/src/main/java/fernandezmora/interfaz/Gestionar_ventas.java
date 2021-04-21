package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaGestionar_ventas;

public class Gestionar_ventas extends VistaGestionar_ventas {
	public Administrador _administrador;
	public Ventas _ventas;
	VerticalLayout layout;
	//iAdministrador admin = new BDPrincipal();
	
	public Gestionar_ventas() {
		inicializar();
	}
	
	public void inicializar() {
		this._ventas = new Ventas();
		this._ventas.add_ventas();
		this._ventas.add_ventas();
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout.add(this._ventas);
	}
	
	public void ocultar_ventas() {
		this.getH1().setVisible(false);
	}
	
	public void abrirGestionarVentas() {
		
	}
}