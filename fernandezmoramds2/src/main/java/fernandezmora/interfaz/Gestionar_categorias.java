package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionarcategorias;

public class Gestionar_categorias extends VistaGestionarcategorias {

	public Administrador _administrador;
	public Categorias_administrador _categorias_administrador;
	public Crear_categoría _crear_categoría;
	public VerticalLayout layout;

	
	public Gestionar_categorias() {
		this._categorias_administrador = new Categorias_administrador(this); //
		this._categorias_administrador.add_categorias();
		this._categorias_administrador.add_categorias();
		

		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		layout.add(this._categorias_administrador);
		
		crear_Categorias();
		editar_Categoria();
	}
	
	public void ocultar_Gestionar_Categorias() {
		layout.remove(this._categorias_administrador);
		this.getTitulo().setVisible(false);
		this.getBotonNuevaCategoria().setVisible(false);
	}
	
	
	/**
	 * Cuando se pulse el boton de crear una nueva categoria
	 */
	public void crear_Categorias() {
		this.getBotonNuevaCategoria().addClickListener(event ->{
			this._crear_categoría = new Crear_categoría();
			ocultar_Gestionar_Categorias();
			layout.add(this._crear_categoría);
		});
	}
	
	/**
	 * Cuando se pulse el boton de editar categoria de cada categoria
	 */
	public void editar_Categoria() {
		for(Categoria_administrador ca : this._categorias_administrador._list_Categoria_administrador) {
			ca.getVaadinButton().addClickListener(event ->{
				ca._editar_categoria = new Editar_categoria(ca);
				this.ocultar_Gestionar_Categorias();
				layout.add(ca._editar_categoria);
			});
		}
	}
	
	
	
	
}