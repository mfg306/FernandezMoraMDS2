package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCategorias;

public class Categorias extends VistaCategorias {
	/*
	 * private event _ver_anteriores; private event _ver_siguientes; private Panel
	 * _panel; private Label _numero_paginaL;
	 */
	public Ver_categorias _ver_categorias;
	public Categoria _list_Categoria;
	public Vector<Categoria> _list_Categorias = new Vector<Categoria>();

	public Categorias(Ver_categorias vCategorias) {
		this._ver_categorias = vCategorias;
		this._list_Categorias = new Vector<Categoria>();
		abrir_Ver_Categorias();
		add_categoria();
		abrirProductosCategoria();
	}

	public void abrirProductosCategoria() {

		for (Categoria c : this._list_Categorias) {
			c.getCategoria1().addClickListener(event ->{
				
			});
			
		}
	}

	public void abrir_Ver_Categorias() {
		this._ver_categorias._uR_UNR.getBotonVerCategorias().addClickListener(event -> {
			this._ver_categorias._uR_UNR.getBotonVerCategorias().setVisible(false);
			this._ver_categorias._uR_UNR.layout.add(this._ver_categorias._categorias);

		});
	}

	public void add_categoria() {
		Categoria ca = new Categoria(this);
		this._list_Categorias.add(ca);
		this.getLista_categorias().as(VerticalLayout.class).add(ca);

	}

	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}
}