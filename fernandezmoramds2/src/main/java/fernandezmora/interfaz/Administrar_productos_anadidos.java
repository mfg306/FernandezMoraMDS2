package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAdministrar_productos_anadidos;

public class Administrar_productos_anadidos extends VistaAdministrar_productos_anadidos{
	public Productos_listado_administracion _productos_listado_administracion;
	public VerticalLayout layout;
	
	public  Administrar_productos_anadidos() {
		this._productos_listado_administracion = new Productos_listado_administracion();
		
		this.layout = this.getBotonesCG().as(VerticalLayout.class);
		this._productos_listado_administracion.add_productos_listado_administracion();
		this._productos_listado_administracion.add_productos_listado_administracion();
		this._productos_listado_administracion.add_productos_listado_administracion();
		
		layout.add(this._productos_listado_administracion);
	}
	
	
	
}