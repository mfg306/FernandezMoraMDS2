package fernandezmora.interfaz;

import vistas.VistaProducto_listado_administracion;

public class Producto_listado_administracion extends VistaProducto_listado_administracion {
	public Productos_listado_administracion _productos_listado_administracion;
	base_de_datos.Producto producto;

	public Producto_listado_administracion(base_de_datos.Producto p, Productos_listado_administracion pla, Zona_productos zp) {
		this.producto = p;
		this._productos_listado_administracion = pla;
		this.getLabel().setText(p.getNombre());
		Eliminar_de_listado(zp, p);
	}
	
	public void Eliminar_de_listado(Zona_productos zp, base_de_datos.Producto p) {
		this.getVaadinButton().addClickListener(event -> {
			this._productos_listado_administracion.layout.remove(this);
			this._productos_listado_administracion._list_Producto_listado_administracion.remove(this);
			/*Con esto le digo que producto es el que elimino de aqui y quiero ahora alli*/
			zp._productos_listado.aceptar_Producto_listado_administracion(p);
		});
	}
}