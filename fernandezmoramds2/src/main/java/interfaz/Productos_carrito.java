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
		Seleccionar_varios();
		Borrar();

	}

	public void mostrarProductos() {
		double precio = .0;
		for (int i = 0; i< this._list_Producto_carrito.size();i++) {
			this._list_Producto_carrito.get(i).getCheckEliminar().setVisible(false);
			this._list_Producto_carrito.get(i).actualizarListado(this);
			this.listadoProductos.add(this._list_Producto_carrito.get(i));
			precio += this._list_Producto_carrito.get(i).producto.getPrecio_producto();
		}

		this._ver_carrito.getSpan1().setText("" + precio + " €");
	}

	public void actualizarListaProductos(Vector<Producto_carrito> aux) {
		this._list_Producto_carrito = new Vector<Producto_carrito>(aux);
	}

	public void Seleccionar_varios() {
		this.getVaadinButton1().addClickListener(event -> {
			for (int i = 0; i < this._list_Producto_carrito.size(); i++) {
				this._list_Producto_carrito.get(i).getCheckEliminar().setVisible(true);
				this._list_Producto_carrito.get(i).getVaadinButton().setVisible(false);
				this._list_Producto_carrito.get(i).seleccionCantidad.setVisible(false);
			}
		});
	}

	public void Borrar() {
		this.getVaadinButton().addClickListener(event -> {
			System.out.println("Eliminando de la vista");
			for (int i = 0; i < this._list_Producto_carrito.size(); i++) {
				
				if (this._list_Producto_carrito.get(i).getCheckEliminar().getValue() == true) {
					System.out.println(this._list_Producto_carrito.get(i)._producto.producto.getNombre()+ " " + i);
					System.out.println(this._list_Producto_carrito.get(i).getCheckEliminar().getValue());
					this.listadoProductos.remove(this._list_Producto_carrito.get(i));
				}
				if (this._list_Producto_carrito.get(i).getCheckEliminar().getValue() == false) {
					System.out.println();
					this._list_Producto_carrito.get(i).getCheckEliminar().setVisible(false);
					this._list_Producto_carrito.get(i).getVaadinButton().setVisible(true);
					this._list_Producto_carrito.get(i).seleccionCantidad.setVisible(true);
				}
			}
			System.out.println("Eliminando de la lista del carrito");
			for (int j = 0; j < this._list_Producto_carrito.size(); j++) {
				if (this._list_Producto_carrito.get(j).getCheckEliminar().getValue() == true) {
					System.out.println(this._list_Producto_carrito.get(j)._producto.producto.getNombre() + " " + j);
					System.out.println(this._list_Producto_carrito.get(j).getCheckEliminar().getValue());
					System.out.println();
					this._list_Producto_carrito.remove(j);
					
				}

			}
        System.out.println(this._list_Producto_carrito.size());
        this.inicializar();
		});
	}

}