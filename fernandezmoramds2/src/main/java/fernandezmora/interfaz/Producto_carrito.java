package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaProducto_carrito;

public class Producto_carrito extends VistaProducto_carrito {
	public Productos_carrito _productos_carrito;
	public Producto _producto;
	
	
	public Producto_carrito(Productos_carrito pc) {
		this._productos_carrito = pc;
		this._producto = new Producto();		
	}

	public void Editar_cantidad() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar() {
		throw new UnsupportedOperationException();
	}
}