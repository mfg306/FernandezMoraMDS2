package fernandezmora.interfaz;

import com.vaadin.flow.component.notification.Notification;

import vistas.VistaProducto_carrito;

public class Producto_carrito extends VistaProducto_carrito {
	public Productos_carrito _productos_carrito;
	public Producto _producto;

	public Producto_carrito(Productos_carrito pc, Producto p) {
		this._productos_carrito = pc;
		this._producto = p;
		inicializar();
	}
	
	/**
	 * @param pc nueva lista de productos a la que va a pertenecer porque seguramente la lista en la que se creo se pierda 
	 * para el momento en el que accedamos al carrito
	 */
	public void setProductosCarrito(Productos_carrito pc) {
		this._productos_carrito = pc;
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