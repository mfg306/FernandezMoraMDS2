package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaOfertas;

public class Ofertas extends VistaOfertas {

	public UR_UNR _uR_UNR;
	public Vector<Oferta> _list_Ofertas = new Vector<Oferta>();
	
	public Ofertas(UR_UNR urunr) {
		this._uR_UNR = urunr;
	    add_oferta();
	    add_oferta();
	    abrir_Oferta();
	}
	
	public void add_oferta() {
		Oferta of = new Oferta(this);
		this._list_Ofertas.add(of);
		this.getListaOfertas().add(of);

	}
	
	public void abrir_Oferta() {
		for(Oferta of : this._list_Ofertas) {
		    of.getBotonOferta().addClickListener(event->{
		    	this._uR_UNR.layoutOfertas.remove(this._uR_UNR._ofertas);
		    	this._uR_UNR.layoutProductosMasVendidosPorCategorias.setVisible(false);
		    	this._uR_UNR.layoutOfertas.add(of._productos_oferta);
		    });
		}
	}


	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}
}