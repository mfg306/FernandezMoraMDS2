package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCategoria;

public class Categoria extends VistaCategoria{
	public Categorias _categorias;
	public Productos_categoria _productos_categoria;
	public VerticalLayout layout;
	
	public Categoria(Categorias c) {
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this._categorias = c;
		this._productos_categoria = new Productos_categoria(this);
		
	}
	
	
	
}
	
	
