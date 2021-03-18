package fernandezmora.interfaz;

import java.util.Vector;

import vistas.VistaProductos_categoria;

public class Productos_categoria extends VistaProductos_categoria {
	/*private event _ver_siguientes;
	private event _ver_anteriores;
	private Label _nombre_cateogoriaL;
	private Label _numero_paginaL;
	private Panel _panel;*/
	public Categoria _list_Categoria;
	public Vector<Producto_categoria> _list_Producto_categoria = new Vector<Producto_categoria>();
	
	public Productos_categoria(Categoria c) {
		this._list_Categoria = c;
		
	}
	

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}

	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}
}