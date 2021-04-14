package fernandezmora.interfaz;

import java.util.ArrayList;
import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iUNR_;

public class UNR_ extends UR_UNR {
	public Menu_UNR _menu_UNR;
	public Producto_UNR _producto_UNR;
	public Vector<Producto_carrito> listaAux;

	public UNR_() {
		super();
		listaAux = new Vector<Producto_carrito>();
		inicializarUNR();
	}
	
	public void miListadoProductos(Producto_carrito p) {
		listaAux.add(p);
	}
	
	public void inicializarUNR() {

		_menu_UNR = new Menu_UNR(this);
		this.getHuecoMenu().as(VerticalLayout.class).add(_menu_UNR);
	}
	


}