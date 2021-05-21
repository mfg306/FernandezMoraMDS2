package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaProductos_carrito;

public class Productos_carrito extends VistaProductos_carrito {
	public Ver_carrito _ver_carrito;
	public Vector<Producto_carrito> _list_Producto_carrito;
	public Producto_carrito _producto_carrito;
	public VerticalLayout layout;
	public HorizontalLayout listadoProductos;

	public Productos_carrito(Vector<Producto_carrito> aux, Ver_carrito vc) {
		this._ver_carrito = vc;
		this._list_Producto_carrito = new Vector<Producto_carrito>(aux);
		inicializar();
	}

	public void inicializar() {
		listadoProductos = this.getVaadinHorizontalLayout1();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		mostrarProductos();
		Borrar();
	}
	
	public void mostrarProductos() {
		double precio = .0;
		for(Producto_carrito pc : this._list_Producto_carrito) {
			pc.actualizarListado(this);
			this.listadoProductos.add(pc);
			precio += pc.producto.getPrecio_producto();
		}
		
		this._ver_carrito.getSpan1().setText("" + precio + " €");
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