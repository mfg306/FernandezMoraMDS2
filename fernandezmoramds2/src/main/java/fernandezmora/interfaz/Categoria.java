package fernandezmora.interfaz;

import vistas.VistaCategoria;

public class Categoria extends VistaCategoria{
	public Categorias _categorias;
	public Productos_categoria _productos_categoria;
	
	public Categoria(Categorias c) {
		this._categorias = c;
		this._productos_categoria = new Productos_categoria(this);
		this._productos_categoria.add_Productos_Categoria();
		this._productos_categoria.add_Productos_Categoria();
	}
	
	
}