package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import vistas.VistaCategoria;

public class Categoria extends VistaCategoria {
	public Categorias _categorias;
	public Productos_categoria _productos_categoria;
	public VerticalLayout layout;
	public base_de_datos.Producto[] productos;
	public base_de_datos.Categoria categoria;

	public Categoria(Categorias c, UR_UNR unrunr, base_de_datos.Categoria cat) {
		this.categoria = cat;
		this.getCategoria1().setText(cat.getNombre_categoria());
		inicializar(c, unrunr);
	}

	public void inicializar(Categorias c, UR_UNR unrunr) {
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this._categorias = c;
		abrir_Categoria(unrunr);
	}

	public void abrir_Categoria(UR_UNR unrunr) {
		this.getCategoria1().addClickListener(event -> {
			this._productos_categoria = new Productos_categoria(this, unrunr);

			this._categorias._ver_categorias.layout.removeAll();
			this._categorias._ver_categorias.layout.add(this._productos_categoria);

		});
	}
}
