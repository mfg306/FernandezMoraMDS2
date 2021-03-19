package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaProductos_carrito;

public class Productos_carrito extends VistaProductos_carrito {
	public Ver_carrito _ver_carrito;
	public Vector<Producto_carrito> _list_Producto_carrito = new Vector<Producto_carrito>();
	
	
	public Productos_carrito(Ver_carrito vc) {
		this._ver_carrito = vc;
		this._list_Producto_carrito = new Vector<>();
		this.anadir_Producto_Carrito();
		this.anadir_Producto_Carrito();
				
	}
	
     public void anadir_Producto_Carrito() {
		Producto_carrito p = new Producto_carrito(this);
		this._list_Producto_carrito.add(p);
		this._ver_carrito.getProductosCarrito().add(p);
	}

	public void Seleccionar_varios() {
		throw new UnsupportedOperationException();
	}

	public void Borrar() {
		throw new UnsupportedOperationException();
	}
}