package fernandezmora.interfaz;

import java.util.Vector;

import vistas.VistaProductos_carrito;

public class Productos_carrito extends VistaProductos_carrito {
	/*private event _seleccionar_varios;
	private event _borrar;
	private Panel _panel_productos;*/
	public Ver_carrito _ver_carrito;
	public Vector<Producto_carrito> _list_Producto_carrito = new Vector<Producto_carrito>();

	public void Seleccionar_varios() {
		throw new UnsupportedOperationException();
	}

	public void Borrar() {
		throw new UnsupportedOperationException();
	}
}