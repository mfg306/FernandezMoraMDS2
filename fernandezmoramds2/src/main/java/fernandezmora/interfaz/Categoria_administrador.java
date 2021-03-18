package fernandezmora.interfaz;

import vistas.VistaCategoria_administrador;

public class Categoria_administrador extends VistaCategoria_administrador {

	public Categorias_administrador _categorias_administrador;
	public Editar_categoria _editar_categoria;

	public Categoria_administrador(Categorias_administrador ca) {
		inicializar(ca);
	}
	
	public void inicializar(Categorias_administrador ca) {
		this._categorias_administrador = ca;
		this._editar_categoria = new Editar_categoria(this);
	}

	public void Eliminar_categoria() {
		throw new UnsupportedOperationException();
	}
	
	
}