package fernandezmora.interfaz;

import vistas.VistaProducto_busqueda;

public class Producto_busqueda extends VistaProducto_busqueda{
	public Producto _producto;
	public Productos_busqueda _productos_busqueda;
	
	public Producto_busqueda(Productos_busqueda productos_busqueda,base_de_datos.Producto p) {
		this.getNombre_producto().setText(p.getNombre());
		this.getPrecio_producto().setText(String.valueOf(p.getPrecio_producto()));
		this._productos_busqueda = productos_busqueda;
		
	}
}
