package fernandezmora.interfaz;

import java.util.Vector;

import vistas.VistaProductos_carrito;

public class Productos_carrito extends VistaProductos_carrito {
	public Ver_carrito _ver_carrito;
	public Vector<Producto_carrito> _list_Producto_carrito = new Vector<Producto_carrito>();
	
	public Productos_carrito(Ver_carrito vc) {
		this._ver_carrito = vc;
		this._list_Producto_carrito = new Vector<>();
				
	}

	public void Seleccionar_varios() {
		throw new UnsupportedOperationException();
	}

	public void Borrar() {
		throw new UnsupportedOperationException();
	}
}