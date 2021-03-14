package fernandezmora.interfaz;

import vistas.VistaCategoria_administrador;

public class Categoria_administrador extends VistaCategoria_administrador {

	public Categorias_administrador _categorias_administrador;
	public Editar_categoria _editar_categoria;
	
	
	public Categoria_administrador() {
		this.getH1().setText("Categoria de prueba");
	}

	public void Eliminar_categoria() {
		throw new UnsupportedOperationException();
	}
	
	
}