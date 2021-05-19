package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

//import basededatos.iUR;

@Route(value = "inicioRegistrado")
public class UR extends UR_UNR{
	//public iUR _iUR;
	public Menu_UR _menu_UR;
	public Ver_producto_UR _ver_producto_UR;
	public base_de_datos.UR UR;
	public Vector<Producto_carrito> listaAuxUR;

	
	public UR(base_de_datos.Usuario_General ur) {
		super();
		this.UR = (base_de_datos.UR)ur;
		listaAuxUR = new Vector<Producto_carrito>();
		inicializar();
	}
	
	public void inicializar() {
		_menu_UR = new Menu_UR(this, UR);
		this.getHuecoMenu().as(VerticalLayout.class).add(_menu_UR);	
	}
	
	public void miListadoProductos(Producto_carrito p) {
		System.out.println("Añadiendo producto");
		listaAuxUR.add(p);
	}
	
	public boolean estaElProducto(Producto_carrito pc) {
		for(Producto_carrito p : listaAuxUR) {
			if(p.producto.getId_Producto() == pc.producto.getId_Producto()) return true;
		}
		return false;
	}
	
	public int indiceProducto(Producto_carrito pc) {
		int contador = 0;
		for(Producto_carrito p: listaAuxUR) {
			if(p.producto.getId_Producto() == pc.producto.getId_Producto()) return contador;
			contador++;
		}
		
		return -1;
	}

}