package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import basededatos.iUNR_;


@Route(value = "inicioUNR")
public class UNR_ extends UR_UNR{
	public iUNR_ _iUNR_;
	public Menu_UNR _menu_UNR;
	public Producto_UNR _producto_UNR;

	public UNR_() {
		super();
		inicializarUNR();
	}

	public void inicializarUNR() {
		_menu_UNR = new Menu_UNR(this);
		this.getHuecoMenu().as(VerticalLayout.class).add(_menu_UNR);
	}

	@Override
	public void actualizarNumeroItemsCarrito() {
		int suma = 0;
		
		for(Producto_carrito pc : this.listaAux) {
			suma += pc.cantidad;
		}
		
		this._menu_UNR.getNumeroElementos().setText("" + suma);
	}
	

	
}