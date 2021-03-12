package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import vistas.VistaZona_productos;

/**
 * A Designer generated component for the vista-crear_categoria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crearcategoria")
@JsModule("./src/vista-crearcategoria.js")
public class VistaCrear_categoria extends PolymerTemplate<VistaCrear_categoria.VistaCrear_categoriaModel> {

    @Id("vaadinVerticalLayout_Crear_Categoria")
	private Element vaadinVerticalLayout;
	@Id("h2_Crear_Categoria")
	private H2 h2;
	@Id("vaadinHorizontalLayout_Crear_Categoria")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label_Crear_Categoria")
	private Label label;
	@Id("vaadinTextField_Crear_Categoria")
	private TextField vaadinTextField;
	@Id("vaadinHorizontalLayout1_Crear_Categoria")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinHorizontalLayout2_Crear_Categoria")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("boton_Cancelar_Crear_Categoria")
	private Button boton_Cancelar_Crear_Categoria;
	@Id("vaadinHorizontalLayout3_Crear_Categoria")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("zonaProductos_Crear_Categoría")
	private VistaZona_productos zonaProductos_Crear_Categoría;
	@Id("h1_Crear_Categoria")
	private H1 h1_Crear_Categoria;
	@Id("vistaZonaproductos")
	private VistaZona_productos vistaZonaproductos;

	/**
     * Creates a new VistaCrear_categoria.
     */
    public VistaCrear_categoria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCrear_categoria and vista-crear_categoria
     */
    public interface VistaCrear_categoriaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
