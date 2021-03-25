package fernandezmora.interfaz;

import java.util.Vector;

import vistas.VistaProductos_carrito;

public class Productos_carrito extends VistaProductos_carrito {
	public Ver_carrito _ver_carrito;
	public Vector<Producto_carrito> _list_Producto_carrito = new Vector<Producto_carrito>();
	public Producto_carrito _producto_carrito;
	
	
	public Productos_carrito(Ver_carrito vc) {
		inicializar(vc);
	}
	
	public void inicializar(Ver_carrito vc) {
		this._ver_carrito = vc;

		this._list_Producto_carrito = new Vector<Producto_carrito>();
		
		this.anadir_Producto_Carrito();
		this.anadir_Producto_Carrito();
		this.anadir_Producto_Carrito();
	}
	
	
     public void anadir_Producto_Carrito() {
		Producto_carrito p = new Producto_carrito(this);
		this._list_Producto_carrito.add(p);
		this.getVaadinHorizontalLayout1().add(p);
		
	}

	public void Seleccionar_varios() {
		throw new UnsupportedOperationException();
	}

	public void Borrar() {
		throw new UnsupportedOperationException();
	}
}