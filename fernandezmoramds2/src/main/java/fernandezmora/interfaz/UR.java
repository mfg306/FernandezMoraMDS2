package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

//import basededatos.iUR;


public class UR extends UR_UNR{
	//public iUR _iUR;
	public Menu_UR _menu_UR;
	public Ver_producto_UR _ver_producto_UR;
	public base_de_datos.UR UR;
	
	public UR(base_de_datos.UR ur) {
		super();
		this.UR = ur;
		listaAux = new Vector<Producto_carrito>();
		inicializar();
	}
	
	
	public void inicializar() {
		_menu_UR = new Menu_UR(this, UR);
		this.getHuecoMenu().as(VerticalLayout.class).add(_menu_UR);	
	}

}