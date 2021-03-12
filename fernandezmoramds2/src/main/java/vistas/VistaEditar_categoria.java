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
import vistas.VistaZona_productos;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-editar_categoria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editarcategoria")
@JsModule("./src/vista-editarcategoria.js")
public class VistaEditar_categoria extends PolymerTemplate<VistaEditar_categoria.VistaEditar_categoriaModel> {

    @Id("vaadinVerticalLayout_editar_Categoria")
	private Element vaadinVerticalLayout;
	@Id("h1_editar_Categoria")
	private H1 h1;
	@Id("h2_editar_Categoria")
	private H2 h2;
	@Id("vaadinHorizontalLayout_Crear_Categoria")
	private HorizontalLayout vaadinHorizontalLayout_Crear_Categoria;
	@Id("vistaZona_productos_editar_Categoria")
	private VistaZona_productos vistaZona_productos;
	@Id("vaadinHorizontalLayout_editar_Categoria")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton_editar_Categoria")
	private Button vaadinButton;
	@Id("label_editar_Categoria")
	private Label label_editar_Categoria;
	@Id("vaadinTextField_editar_Categoria")
	private TextField vaadinTextField_editar_Categoria;
	@Id("vistaZonaproductos")
	private VistaZona_productos vistaZonaproductos;

	/**
     * Creates a new VistaEditar_categoria.
     */
    public VistaEditar_categoria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEditar_categoria and vista-editar_categoria
     */
    public interface VistaEditar_categoriaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
	}

	public H2 getH2() {
		return h2;
	}

	public void setH2(H2 h2) {
		this.h2 = h2;
	}

	public HorizontalLayout getVaadinHorizontalLayout_Crear_Categoria() {
		return vaadinHorizontalLayout_Crear_Categoria;
	}

	public void setVaadinHorizontalLayout_Crear_Categoria(HorizontalLayout vaadinHorizontalLayout_Crear_Categoria) {
		this.vaadinHorizontalLayout_Crear_Categoria = vaadinHorizontalLayout_Crear_Categoria;
	}

	public VistaZona_productos getVistaZona_productos() {
		return vistaZona_productos;
	}

	public void setVistaZona_productos(VistaZona_productos vistaZona_productos) {
		this.vistaZona_productos = vistaZona_productos;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Label getLabel_editar_Categoria() {
		return label_editar_Categoria;
	}

	public void setLabel_editar_Categoria(Label label_editar_Categoria) {
		this.label_editar_Categoria = label_editar_Categoria;
	}

	public TextField getVaadinTextField_editar_Categoria() {
		return vaadinTextField_editar_Categoria;
	}

	public void setVaadinTextField_editar_Categoria(TextField vaadinTextField_editar_Categoria) {
		this.vaadinTextField_editar_Categoria = vaadinTextField_editar_Categoria;
	}
}
