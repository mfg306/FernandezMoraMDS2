package fernandezmora.interfaz;

import vistas.VistaOferta;

public class Oferta extends VistaOferta{
	
	public Ofertas _ofertas;
	public Productos_oferta _productos_oferta;
	
	public Oferta(Ofertas listaOfertas) {
		inicializar(listaOfertas);
	}

	public void inicializar(Ofertas listaOfertas) {
		this._ofertas = listaOfertas;
		this._productos_oferta = new Productos_oferta(this);
	}
	

}