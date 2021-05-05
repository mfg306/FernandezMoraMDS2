package fernandezmora.interfaz;

import vistas.VistaProducto_administrador;

public class Producto_administrador extends VistaProducto_administrador {
	public Productos_administrador _productos_administrador;
	public Editar_producto _editar_producto;
	public Crear_producto _crear_producto;
	
	
	public Producto_administrador(base_de_datos.Producto p ) {
		this.getLabel().setText(p.getNombre());
		this.getLabel1().setText("" + p.getId_Producto());
		this.getLabel2().setText("" + p.getPrecio_producto());
		this.getVaadinItem().setText(p.getDescripcion());
	}

	public void Eliminar_producto() {
		throw new UnsupportedOperationException();
	}
}