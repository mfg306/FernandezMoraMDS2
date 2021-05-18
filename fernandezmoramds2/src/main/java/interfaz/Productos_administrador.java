package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaProductos_administrador;

public class Productos_administrador extends VistaProductos_administrador{
	public Gestionar_productos _gestionar_productos;
	public Vector<Producto_administrador> _list_Producto_administrador = new Vector<Producto_administrador>();
	public VerticalLayout layout;

	
	public Productos_administrador(Gestionar_productos gp) {
		this._gestionar_productos = gp;
		inicializar();
	}
	
	public void inicializar() {
		this._list_Producto_administrador = new Vector<Producto_administrador>();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);	
		
		/*Mientras no se haya anadido ninguno vamos a tener un producto_administrador auxiliar que 
		 * nos va a ayudar a retroceder*/
		this._list_Producto_administrador.add(new Producto_administrador(null, this));
	}
	
	public void add_Productos(base_de_datos.Producto p) {
		
		/*Borramos ese producto auxiliar que teniamos. Ya no nos hace falta*/
		this._list_Producto_administrador.remove(0);
		
		Producto_administrador pa = new Producto_administrador(p, this);
		this._list_Producto_administrador.add(pa);
		layout.add(pa);
	}
}