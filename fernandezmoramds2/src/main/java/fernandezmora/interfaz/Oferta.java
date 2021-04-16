package fernandezmora.interfaz;

import vistas.VistaOferta;

public class Oferta extends VistaOferta{
	
	public Ofertas _ofertas;
	public Productos_oferta _productos_oferta;
	
	public Oferta(Ofertas listaOfertas, UR_UNR unrunr) {
		inicializar(listaOfertas, unrunr);
	}

	public void inicializar(Ofertas listaOfertas, UR_UNR unrunr) {
		this._ofertas = listaOfertas;
		this._productos_oferta = new Productos_oferta(this, this._ofertas._uR_UNR);
	}
	

}