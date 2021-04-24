package fernandezmora.interfaz;

import vistas.VistaCategoria_administrador;

public class Categoria_administrador extends VistaCategoria_administrador {

	public Categorias_administrador _categorias_administrador;
	public Editar_categoria _editar_categoria;
	public base_de_datos.Categoria categoria;

	public Categoria_administrador(Categorias_administrador ca, base_de_datos.Categoria c) {
		inicializar(ca, c);
	}
	
	public void inicializar(Categorias_administrador ca, base_de_datos.Categoria c) {
		this._categorias_administrador = ca;
		this._editar_categoria = new Editar_categoria(this);
		this.categoria = c;
		//this.getH1().setText(c.getNombre_categoria());
	}

	public void Eliminar_categoria() {
		throw new UnsupportedOperationException();
	}
	


	
	
}