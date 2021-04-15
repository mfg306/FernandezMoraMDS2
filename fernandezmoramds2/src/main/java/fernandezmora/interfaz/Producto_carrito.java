package fernandezmora.interfaz;

import vistas.VistaProducto_carrito;

public class Producto_carrito extends VistaProducto_carrito {
	public Productos_carrito _productos_carrito;
	public Producto _producto;

	public Producto_carrito(Producto p) {
		this._producto = p;
		inicializar();
	}
	

	public void inicializar() {
		Eliminar();
		this._producto = new Producto();
	}

	public void Editar_cantidad() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar() {
		this.getVaadinButton().addClickListener(event ->{
			this._productos_carrito.layout.remove(this);
			this._productos_carrito._list_Producto_carrito.remove(this);

		});

	}
}