package fernandezmora.interfaz;

import java.util.Vector;


import vistas.VistaProductos_categoria;

public class Productos_categoria extends VistaProductos_categoria {
	public Categoria _list_Categoria;
	public Vector<Producto_categoria> _list_Producto_categoria = new Vector<Producto_categoria>();
	
	public Productos_categoria(Categoria c) {
		this._list_Categoria = c;
		this._list_Producto_categoria = new Vector<>();
		
	}
	
	public void add_Productos_Categoria() {
		Producto_categoria p = new Producto_categoria();
		this._list_Producto_categoria.add(p);
		this.getVaadinHorizontalLayout().add(p);
	}
	

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}

	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}
}