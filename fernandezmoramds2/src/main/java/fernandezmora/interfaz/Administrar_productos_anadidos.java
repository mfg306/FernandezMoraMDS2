package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import vistas.VistaAdministrar_productos_anadidos;

public class Administrar_productos_anadidos extends VistaAdministrar_productos_anadidos{
	public Productos_listado_administracion _productos_listado_administracion;
	public VerticalLayout layoutDerecha;
	
	public  Administrar_productos_anadidos() {
		this.layoutDerecha = this.getHuecoDerecha().as(VerticalLayout.class);
		/*No queremos inicializar una nueva lista cada vez que se refresque*/
		this._productos_listado_administracion = new Productos_listado_administracion(this);
		this.layoutDerecha.add(this._productos_listado_administracion);
	}
	
	public void incorporarProductoListado(base_de_datos.Producto p, Zona_productos zp) {
		Producto_listado_administracion pla = new Producto_listado_administracion(p, _productos_listado_administracion, zp);
		this._productos_listado_administracion.add_productos_listado_administracion(pla); 
	}
}