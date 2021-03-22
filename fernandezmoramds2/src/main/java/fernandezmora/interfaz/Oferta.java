package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaOferta;

public class Oferta extends VistaOferta{
	
	public Ofertas _ofertas;
	public Productos_oferta _productos_oferta;
	
	public Oferta(Ofertas listaOfertas) {
		this._ofertas = listaOfertas;
		this._productos_oferta = new Productos_oferta(this);
	}
	

}