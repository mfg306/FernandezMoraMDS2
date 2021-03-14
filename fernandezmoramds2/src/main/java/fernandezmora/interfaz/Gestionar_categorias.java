package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionarcategorias;

public class Gestionar_categorias extends VistaGestionarcategorias {

	public Administrador _administrador;
	public Categorias_administrador _categorias_administrador;
	public Crear_categoría _crear_categoría;
	public VerticalLayout layout;

	
	public Gestionar_categorias() {
		this._categorias_administrador = new Categorias_administrador(); //listado
		this._categorias_administrador.add_categorias();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		layout.add(this._categorias_administrador);
	}
	
	public void ocultar_Gestionar_Categorias() {
		layout.remove(this._categorias_administrador);
	}
	
	
	/**
	 * Cuando se pulse el boton de crear una nueva categoria
	 */
	public void crear_Categorias() {
		this.getBotonNuevaCategoria().addClickListener(event ->{
			this._crear_categoría = new Crear_categoría();
			ocultar_Gestionar_Categorias();
		});
	}
	
	
	
	
}