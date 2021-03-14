package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionar_ofertas;

public class Gestionar_ofertas extends VistaGestionar_ofertas {
	public Administrador _administrador;
	public Crear_oferta _crear_oferta;
	public Ofertas_administrador _ofertas_administrador;
	public VerticalLayout layout;

	
	public Gestionar_ofertas() {
		this._ofertas_administrador = new Ofertas_administrador();
	}
}