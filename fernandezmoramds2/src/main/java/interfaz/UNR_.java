package interfaz;

import java.util.Vector;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

//import basededatos.iUNR_;

@Route(value = "inicioUNR")
public class UNR_ extends UR_UNR{
	public Menu_UNR _menu_UNR;
	public Producto_UNR _producto_UNR;
	public Vector<Producto_carrito> listaAuxUNR;

	public UNR_() {
		super();
		listaAuxUNR = new Vector<Producto_carrito>();
		inicializarUNR();
	}

	public void inicializarUNR() {
		_menu_UNR = new Menu_UNR(this);
		this.getHuecoMenu().as(VerticalLayout.class).add(_menu_UNR);
	}
	
	public void miListadoProductos(Producto_carrito p) {
		listaAuxUNR.add(p);
	}
	
	public boolean estaElProducto(Producto_carrito pc) {
		for(Producto_carrito p : listaAuxUNR) {
			if(p.producto.getId_Producto() == pc.producto.getId_Producto()) return true;
		}
		return false;
	}
	
	public int indiceProducto(Producto_carrito pc) {
		int contador = 0;
		for(Producto_carrito p: listaAuxUNR) {
			if(p.producto.getId_Producto() == pc.producto.getId_Producto()) return contador;
			contador++;
		}
		
		return -1;
	}

}