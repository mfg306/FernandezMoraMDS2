package fernandezmora.interfaz;

import vistas.VistaProducto_listado;

public class Producto_listado extends VistaProducto_listado {
	public Productos_listado _productos_listado;

	public Producto_listado(base_de_datos.Producto p, Productos_listado listado) {
		this._productos_listado = listado;
		this.getLabel().setText(p.getNombre());
		this.getLabel1().setText("" + p.getPrecio_producto());
		Añadir_a_lista(p);
	}
	
	public void Añadir_a_lista(base_de_datos.Producto p) {
		this.getVaadinButton().addClickListener(event ->{
			this._productos_listado._list_Producto_listado.remove(this);
			this._productos_listado.layout.remove(this);	
			this._productos_listado._zona_productos.incorporarProductoListado(p, this._productos_listado._zona_productos);
		});
	}
	
}
