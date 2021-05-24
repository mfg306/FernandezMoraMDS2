package interfaz;

import vistas.VistaProducto_listado;

public class Producto_listado extends VistaProducto_listado {
	public Productos_listado _productos_listado;

	public Producto_listado(base_de_datos.Producto p, Productos_listado listado) {
		this._productos_listado = listado;
		this.getLabel().setText(p.getNombre());
		Añadir_a_lista(p);

		if (listado.esCategorias == true) {
			this.getCambiarPrecio().setVisible(false);
			this.getLabel1().setText("" + p.getPrecio_producto());
		}

		if (listado.esOfertas == true) {
			this.getLabel1().setVisible(false);
			this.getCambiarPrecio().setPlaceholder("" + p.getPrecio_producto());
			this.getCambiarPrecio().setLabel("Introduzca un nuevo precio:");
		}

		this.getCambiarPrecio().setValue("" + p.getPrecio_producto());

	}

	public void Añadir_a_lista(base_de_datos.Producto p) {
		this.getVaadinButton().addClickListener(event -> {

			this._productos_listado._list_Producto_listado.remove(this);
			this._productos_listado.layout.remove(this);
			this._productos_listado._zona_productos.incorporarProductoListado(p,
					this._productos_listado._zona_productos, Double.parseDouble(this.getCambiarPrecio().getValue()));

		});
	}

}
