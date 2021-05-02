package fernandezmora.interfaz;

import java.util.Vector;

import vistas.VistaProductos_listado_administracion;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;


public class Productos_listado_administracion extends VistaProductos_listado_administracion{
	public Administrar_productos_anadidos _administrar_productos_anadidos;
	public Vector<Producto_listado_administracion> _list_Producto_listado_administracion = new Vector<Producto_listado_administracion>();
	public VerticalLayout layout;
	
	public Productos_listado_administracion(Administrar_productos_anadidos apa) {
		this._list_Producto_listado_administracion = new Vector<>();
		this._administrar_productos_anadidos = apa;
		layout = this.getVaadinVerticalLayout_productos_listado_administracion().as(VerticalLayout.class);
		inicializar();
	}
	
	public void inicializar() {
		mostrar_Productos();
	}
	
	public void add_productos_listado_administracion(Producto_listado_administracion pla) {
		if(!this._list_Producto_listado_administracion.contains(pla)) this._list_Producto_listado_administracion.add(pla);
		this.layout.add(pla);
		this.inicializar();
	}
	
	public void mostrar_Productos() {
		for(Producto_listado_administracion pla : this._list_Producto_listado_administracion) {
			this.layout.add(pla);
		}
	}
}