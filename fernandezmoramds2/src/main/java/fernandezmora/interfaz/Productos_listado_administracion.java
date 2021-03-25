package fernandezmora.interfaz;

import java.util.Vector;

import vistas.VistaProductos_listado_administracion;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;


public class Productos_listado_administracion extends VistaProductos_listado_administracion{
	public Administrar_productos_anadidos _administrar_productos_anadidos;
	public Vector<Producto_listado_administracion> _list_Producto_listado_administracion = new Vector<Producto_listado_administracion>();
	public VerticalLayout layout;
	
	public Productos_listado_administracion() {
		inicializar();
	}
	
	public void inicializar() {
		this._list_Producto_listado_administracion = new Vector<>();
		layout = this.getVaadinVerticalLayout_productos_listado_administracion().as(VerticalLayout.class);
		
		this.add_productos_listado_administracion();
		this.add_productos_listado_administracion();
		this.add_productos_listado_administracion();
	}
	
	public void add_productos_listado_administracion() {
		Producto_listado_administracion p = new Producto_listado_administracion();
		this._list_Producto_listado_administracion.add(p);
		layout.add(p);
		
	}
}