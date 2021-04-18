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
		
		/*Ofertas de prueba para ver que cambian*/
		Oferta of1 = new Oferta(this, this._uR_UNR);
		of1.getBotonOferta().setText("Prueba1");
		this._list_Ofertas.add(of1);
		Oferta of2 = new Oferta(this, this._uR_UNR);
		of2.getBotonOferta().setText("Prueba2");
		this._list_Ofertas.add(of2);
		Oferta of3 = new Oferta(this, this._uR_UNR);
		of3.getBotonOferta().setText("Prueba3");
		this._list_Ofertas.add(of3);
		
		Ver_anteriores();
		Ver_siguientes();

		this.getListaOfertas().add(this._list_Ofertas.get(0)); //Por defecto añadimos la primera
		abrir_Oferta();
	}

	public void add_oferta() {
		Oferta of = new Oferta(this, this._uR_UNR);
		this._list_Ofertas.add(of);
	}

	public void visualizarOferta(int index) {
		this.getListaOfertas().removeAll();
		this.getListaOfertas().add(this._list_Ofertas.get(index));
	}

	public void abrir_Oferta() {
		for (Oferta of : this._list_Ofertas) {
			of.getBotonOferta().addClickListener(event -> {
				this._uR_UNR.layoutOfertas.remove(this._uR_UNR._ofertas);
				this._uR_UNR.getBotonVerCategorias().setVisible(false);
				this._uR_UNR.layoutProductosMasVendidosPorCategorias.setVisible(false);
				this._uR_UNR.layoutOfertas.add(of._productos_oferta);
			});
		}
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