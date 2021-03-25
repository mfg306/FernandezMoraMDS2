	package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCategorias;

public class Categorias extends VistaCategorias {

	public Ver_categorias _ver_categorias;
	public Vector<Categoria> _list_Categorias = new Vector<Categoria>();

	public Categorias(Ver_categorias vCategorias) {
		inicializar(vCategorias);
	}
	
	public void inicializar(Ver_categorias vCategorias) {
		this._ver_categorias = vCategorias;
		this._list_Categorias = new Vector<Categoria>();
		add_categoria();
		add_categoria();
		abrir_Categoria();
	}

	public void add_categoria() {
		Categoria c = new Categoria(this);
		this._list_Categorias.add(c);
		this.getLista_categorias().as(VerticalLayout.class).add(c);

	}
	
	public void abrir_Categoria() {
		for(Categoria c : this._list_Categorias) {
			c.getCategoria1().addClickListener(event->{
				this.getLista_categorias().as(VerticalLayout.class).removeAll();
				this.getLista_categorias().as(VerticalLayout.class).add(c._productos_categoria);
				
				
			});
		}
	}

	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}
}