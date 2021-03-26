package fernandezmora.interfaz;

import vistas.VistaProducto_carrito;

public class Producto_carrito extends VistaProducto_carrito {
	public Productos_carrito _productos_carrito;
	public Producto _producto;

	public Producto_carrito(Productos_carrito pc) {
		inicializar(pc);
		Eliminar();
	}

	public void inicializar(Productos_carrito pc) {
		this._productos_carrito = pc;
		this._producto = new Producto();
	}

	public void Editar_cantidad() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar() {
		for (Producto_carrito pc : this._productos_carrito._list_Producto_carrito) {
			pc.getVaadinButton().addClickListener(event -> {
				this._productos_carrito.getVaadinHorizontalLayout1().remove(pc);
			});

		}
	}
}