package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaOfertas;

public class Ofertas extends VistaOfertas {

	public UR_UNR _uR_UNR;
	public Vector<Oferta> _list_Ofertas;
	public base_de_datos.Oferta[] ofertas;

	public Ofertas(UR_UNR urunr) {

		inicializar(urunr);
	}

	public void inicializar(UR_UNR urunr) {
		this._uR_UNR = urunr;
		verOfertas();
		Ver_anteriores();
		Ver_siguientes();

	}

	public void Ver_anteriores() {
		this.getBoton_anterior().addClickListener(event -> {
			if (this._uR_UNR.indiceOfertas > 0) {
				this._uR_UNR.indiceOfertas--;
				this.getListaOfertas().removeAll();
				this.getListaOfertas().add(this._list_Ofertas.get(this._uR_UNR.indiceOfertas));
				this._list_Ofertas.get(this._uR_UNR.indiceOfertas)._productos_oferta.inicializar(this._list_Ofertas.get(this._uR_UNR.indiceOfertas), _uR_UNR,this._list_Ofertas.get(this._uR_UNR.indiceOfertas)._productos_oferta.paginaActual);
			}

		});
	}

	public void Ver_siguientes() {
		this.getBoton_siguiente().addClickListener(event -> {
			if ((this._uR_UNR.indiceOfertas + 1) <= this._list_Ofertas.size() - 1) {
				this._uR_UNR.indiceOfertas++;
				this.getListaOfertas().removeAll();
				this.getListaOfertas().add(this._list_Ofertas.get(this._uR_UNR.indiceOfertas));
				this._list_Ofertas.get(this._uR_UNR.indiceOfertas)._productos_oferta.inicializar(this._list_Ofertas.get(this._uR_UNR.indiceOfertas), _uR_UNR,this._list_Ofertas.get(this._uR_UNR.indiceOfertas)._productos_oferta.paginaActual);

			}
		});
	}

	public void verOfertas() {
		iUR_UNR ur_unr = new BDPrincipal();
		this._list_Ofertas = new Vector<Oferta>();
		ofertas = ur_unr.cargarOfertas();
		if (this.ofertas.length == 0) {
			this.getListaOfertas().removeAll();
		} else {
			for (base_de_datos.Oferta of : this.ofertas) {
				if(of != null) {
					Oferta oferta = new Oferta(this, this._uR_UNR, of);
					this._list_Ofertas.add(oferta);
				}

			}
			this.getListaOfertas().removeAll();
			this.getListaOfertas().add(this._list_Ofertas.get(this._uR_UNR.indiceOfertas));
			this._uR_UNR.layoutOfertas.add(this);
		}
	}
}