package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import vistas.VistaProducto_carrito;

public class Producto_carrito extends VistaProducto_carrito {
	public Productos_carrito _productos_carrito;
	public Producto _producto;
	public Select<String> seleccionCantidad = new Select<>();
	public int cantidad = 0;
	public VerticalLayout layout;

	public Producto_carrito(Producto p) {
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		seleccionCantidad.setItems("0", "1", "2", "3", "4");
		this.layout.add(seleccionCantidad);
		this._producto = p;
		inicializar();
	}

	public void incrementarCantidad() {
		this.cantidad++;
		seleccionCantidad.setValue("" + this.cantidad);

	}
	
	/**
	 * @param pc listado al que queremos que pertenezca ahora
	 */
	public void actualizarListado(Productos_carrito pc) {
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
		this.getVaadinButton().addClickListener(event -> {
			this._productos_carrito.layout.remove(this);
			this._productos_carrito._list_Producto_carrito.remove(this);

		});

	}
	
	public boolean equals(Producto_carrito pc) {
		/* Necesitamos el objeto de la base de datos para comparar el funcion del nomnre o id*/
		return true;

	}
	
	
}