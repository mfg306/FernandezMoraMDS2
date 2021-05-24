package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaProductos_listado;

public class Productos_listado extends VistaProductos_listado {
	public Zona_productos _zona_productos;
	public Vector<Producto_listado> _list_Producto_listado = new Vector<Producto_listado>();
	public VerticalLayout layout;
	public boolean esOfertas, esCategorias;
	
	public Productos_listado(Zona_productos zp, Gestionar_categorias gc, Gestionar_ofertas gf) {
		this._zona_productos = zp;
		inicializar(gc, gf);
		
		esOfertas = false;
		esCategorias = false;
		
		
		if(gc != null) {
			esCategorias = true;
		}
		
		if(gf != null) {
			esOfertas = true;
		}
	}
	
	public void inicializar(Gestionar_categorias gc, Gestionar_ofertas gf) {
		this._list_Producto_listado = new Vector<>();
		layout = this.getVaadinVerticalLayout_productos_listado().as(VerticalLayout.class);
	}
	
	
	public void add_productos_listado(Producto_listado pl) {
		if(!this._list_Producto_listado.contains(pl)) {
			this._list_Producto_listado.add(pl);
			this.layout.add(pl);
		}
	}
	
	public void aceptar_Producto_listado_administracion(base_de_datos.Producto p) {
		Producto_listado pl = new Producto_listado(p, this);
		this.add_productos_listado(pl);
	}
	
}