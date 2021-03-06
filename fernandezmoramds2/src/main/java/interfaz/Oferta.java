package interfaz;

import vistas.VistaOferta;

public class Oferta extends VistaOferta {

	public Ofertas _ofertas;
	public Productos_oferta _productos_oferta;
	public base_de_datos.Oferta oferta;

	
	public Oferta(Ofertas listaOfertas, UR_UNR unrunr, base_de_datos.Oferta of) {
		inicializar(listaOfertas, unrunr, of);
	}

	public void inicializar(Ofertas listaOfertas, UR_UNR unrunr, base_de_datos.Oferta of) {
		this._ofertas = listaOfertas;
		this._productos_oferta = new Productos_oferta(this, this._ofertas._uR_UNR);
		
		this.oferta = of;
		this.getBotonOferta().setText(of.getNombre_Oferta());
		abrir_Oferta();
		
	}

	public void abrir_Oferta() {
		this.getBotonOferta().addClickListener(event -> {
			this._ofertas._uR_UNR.layoutOfertas.remove(this._ofertas);
			this._ofertas._uR_UNR.getBotonVerCategorias().setVisible(false);
			this._ofertas._uR_UNR.layoutProductosMasVendidosPorCategorias.setVisible(false);
			this._ofertas._uR_UNR.layoutOfertas.add(this._productos_oferta);
		});
	}
	
	public void cerrar_Oferta() {
		this._ofertas._uR_UNR.layoutOfertas.remove(this._productos_oferta);

	}

}