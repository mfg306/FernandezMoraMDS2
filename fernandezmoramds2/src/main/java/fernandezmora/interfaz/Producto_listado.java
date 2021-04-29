package fernandezmora.interfaz;

import vistas.VistaProducto_listado;

public class Producto_listado extends VistaProducto_listado {
	public Productos_listado _productos_listado;

	public Producto_listado(base_de_datos.Producto p) {
		this.getLabel().setText(p.getNombre());
		this.getLabel1().setText("" + p.getPrecio_producto());
	}
	
	public void Añadir_a_lista() {
		throw new UnsupportedOperationException();
	}
}