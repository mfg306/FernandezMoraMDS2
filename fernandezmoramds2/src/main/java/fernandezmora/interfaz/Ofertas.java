package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaOfertas;

public class Ofertas extends VistaOfertas {

	public UR_UNR _uR_UNR;
	public Vector<Oferta> _list_Ofertas = new Vector<Oferta>();
	public int indice;
	public base_de_datos.Oferta[] ofertas;

	public Ofertas(UR_UNR urunr) {
		this.indice = 0;
		this._uR_UNR = urunr;
		verOfertas();
		inicializar(this.indice);
	}

	public void inicializar(int indice) {
		this._list_Ofertas = new Vector<Oferta>();
		Ver_anteriores();
		Ver_siguientes();


	}


	public void Ver_anteriores() {
		this.getBoton_anterior().addClickListener(event -> {
			if(this.indice > 0) {
				this.indice--;
				this.getListaOfertas().removeAll();
				this.getListaOfertas().add(this._list_Ofertas.get(indice));
				this.inicializar(this.indice);
			}

		});
	}

	public void Ver_siguientes() {
		this.getBoton_siguiente().addClickListener(event -> {
			if((this.indice) <= this._list_Ofertas.size()) {
				this.indice++;
				this.getListaOfertas().removeAll();
				this.getListaOfertas().add(this._list_Ofertas.get(indice));
				this.inicializar(this.indice);	
			}
		});
	}
	
	public void verOfertas() {
		iUR_UNR ur_unr = new BDPrincipal();
		ofertas = ur_unr.cargarOfertas();
		for(base_de_datos.Oferta of : this.ofertas) {
			Oferta oferta = new Oferta(this,this._uR_UNR,of);
			this._list_Ofertas.add(oferta);
			this.getListaOfertas().add(this._list_Ofertas.get(this.indice));
		}
		Notification.show(String.valueOf(_list_Ofertas.size()));
		this._uR_UNR.layoutOfertas.add(this);
	}
}