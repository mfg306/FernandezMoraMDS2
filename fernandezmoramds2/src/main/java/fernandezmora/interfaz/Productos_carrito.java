package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaProductos_carrito;

public class Productos_carrito extends VistaProductos_carrito {
	public Ver_carrito _ver_carrito;
	public Vector<Producto_carrito> _list_Producto_carrito;
	public Producto_carrito _producto_carrito;
	public VerticalLayout layout;

	public Productos_carrito(Vector<Producto_carrito> aux) {
		this._list_Producto_carrito = new Vector<Producto_carrito>(aux);
		inicializar();
	}

	public void inicializar() {
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		mostrarProductos();
		Borrar();
	}
	
	public void mostrarProductos() {
		for(Producto_carrito pc : this._list_Producto_carrito) {
			this.layout.add(pc);
		}
	}
	
	public void actualizarListaProductos(Vector<Producto_carrito> aux) {
		this._list_Producto_carrito = new Vector<Producto_carrito>(aux);

	}


	public void Seleccionar_varios() {
		throw new UnsupportedOperationException();
	}

	public void Borrar() {
		this.getVaadinButton().addClickListener(event -> {
			for (Producto_carrito pc : this._list_Producto_carrito) {
				this.layout.remove(pc);
			}
		});

	}
}