package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;


public class Zona_productos extends Administrar_productos_anadidos {
	public Productos_listado _productos_listado;
	public VerticalLayout layoutIzquierda;
	
	public Zona_productos() {
		this._productos_listado = new Productos_listado();
		this.layoutIzquierda = this.getHuecoIzquierda().as(VerticalLayout.class);
	
		this.inicializar_zona();
	}
	
	public void inicializar_zona() {
		inicializar_administrar();
		this.layoutIzquierda.add(this._productos_listado);
		eliminar_productos_listado_administracion();		

	}
	
	public void eliminar_productos_listado_administracion() {
		for(Producto_listado_administracion p : this._productos_listado_administracion._list_Producto_listado_administracion) {
			p.getVaadinButton().addClickListener(event ->{
				this._productos_listado_administracion._list_Producto_listado_administracion.remove(p);
				this._productos_listado_administracion.layout.remove(p);
				this.incorporar_producto_eliminado_administracion(p);
				
				inicializar_administrar();
			});
			
		}
	}
	
	public void incorporar_producto_eliminado_administracion(Producto_listado_administracion p) {
		this._productos_listado.layout.add(p);
		
		this.inicializar_zona();
	}
}