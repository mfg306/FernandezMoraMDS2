package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVercategorias;

public class Ver_categorias extends VistaVercategorias {
	public UR_UNR _uR_UNR;
	public Categorias _categorias;
	VerticalLayout layout;

	public Ver_categorias(UR_UNR unr) {
		this._uR_UNR = unr;
		this._categorias = new Categorias(this);
		abrir_Categoria();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	}

	public void abrir_Categoria() {
		for (Categoria c : this._categorias._list_Categorias) {
			c.getCategoria1().addClickListener(event -> {
				this._categorias.getLista_categorias().setVisible(false);
				this._categorias.getHuecoProductos().as(VerticalLayout.class).add(c._productos_categoria);
			});
		}
	}
}