package fernandezmora.interfaz;

import vistas.VistaProducto_carrito;

public class Producto_carrito extends VistaProducto_carrito {
	public Productos_carrito _productos_carrito;
	public Producto _producto;
	
	public Producto_carrito(Productos_carrito pc) {
		this._productos_carrito = pc;
	}

	public void Editar_cantidad() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar() {
		throw new UnsupportedOperationException();
	}
}