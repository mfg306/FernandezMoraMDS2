package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaOfertas;

public class Ofertas extends VistaOfertas {

	public UR_UNR _uR_UNR;
	public Vector<Oferta> _list_Ofertas = new Vector<Oferta>();
	private static int contador = 0;

	public Ofertas(UR_UNR urunr) {
		inicializar(urunr);
	}

	public void inicializar(UR_UNR urunr) {
		this._uR_UNR = urunr;
		this._list_Ofertas = new Vector<Oferta>();
		
		Ver_anteriores();
		Ver_siguientes();


	}


	public void visualizarOferta(int index) {
		this.getListaOfertas().removeAll();
		this.getListaOfertas().add(this._list_Ofertas.get(index));
	}



	public void Ver_anteriores() {
		this.getBoton_anterior().addClickListener(event -> {
			if (contador == 0) {
				this.visualizarOferta(0);
			} else {
				contador--;
				this.visualizarOferta(contador);
			}
		});
	}

	public void Ver_siguientes() {
		this.getBoton_siguiente().addClickListener(event -> {
			if (contador == this._list_Ofertas.size() - 1) {
				this.visualizarOferta(contador);
			} else {
				contador++;
				this.visualizarOferta(contador);
			}
		});
	}
}