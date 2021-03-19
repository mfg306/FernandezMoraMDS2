package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAdministrar_productos_anadidos;

public class Administrar_productos_anadidos extends VistaAdministrar_productos_anadidos{
	public Productos_listado_administracion _productos_listado_administracion;
	public VerticalLayout layoutIzquierda;
	
	public  Administrar_productos_anadidos() {
		this._productos_listado_administracion = new Productos_listado_administracion();
		
		this.layoutIzquierda = this.getHuecoIzquierda().as(VerticalLayout.class);
		this._productos_listado_administracion.add_productos_listado_administracion();
		this._productos_listado_administracion.add_productos_listado_administracion();
		this._productos_listado_administracion.add_productos_listado_administracion();
		
		layoutIzquierda.add(this._productos_listado_administracion);
	}
	
	
	
}