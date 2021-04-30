package fernandezmora.interfaz;

import vistas.VistaCategoria_administrador;

public class Categoria_administrador extends VistaCategoria_administrador {

	public Categorias_administrador _categorias_administrador;
	public Editar_categoria _editar_categoria;
	public base_de_datos.Categoria categoria;

	public Categoria_administrador(Categorias_administrador ca, base_de_datos.Categoria c) {
		this.categoria = c;
		inicializar(ca, c);
	}
	
	public void inicializar(Categorias_administrador ca, base_de_datos.Categoria c) {
		this._categorias_administrador = ca;
		this.categoria = c;
		abrir_editar_categoria();
		this.getH1().setText(c.getNombre_categoria());
	}
	
	public void abrir_editar_categoria() {
		this.getVaadinButton().addClickListener(event -> {
			this._editar_categoria = new Editar_categoria(this);
			this._categorias_administrador._gestionar_categorias.ocultar_Gestionar_Categorias();
			this._categorias_administrador._gestionar_categorias.layout.add(this._editar_categoria);
		});

	}

	public void Eliminar_categoria() {
		throw new UnsupportedOperationException();
	}
	


	
	
}