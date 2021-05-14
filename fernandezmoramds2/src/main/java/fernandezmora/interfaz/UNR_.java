package fernandezmora.interfaz;

import java.util.Vector;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

//import basededatos.iUNR_;

@Route(value = "inicioUNR")
public class UNR_ extends UR_UNR{
	public Menu_UNR _menu_UNR;
	public Producto_UNR _producto_UNR;


	public UNR_() {
		super();
		listaAux = new Vector<Producto_carrito>();
		inicializarUNR();
	}

	public void inicializarUNR() {
		_menu_UNR = new Menu_UNR(this);
		this.getHuecoMenu().as(VerticalLayout.class).add(_menu_UNR);
	}

}