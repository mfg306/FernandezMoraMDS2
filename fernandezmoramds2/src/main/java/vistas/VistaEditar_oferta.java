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
import vistas.VistaZona_productos;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-editar_oferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editaroferta")
@JsModule("./src/vista-editaroferta.js")
public class VistaEditar_oferta extends PolymerTemplate<VistaEditar_oferta.VistaEditar_ofertaModel> {

    @Id("verticalLayout_editar_Oferta")
	private Element verticalLayout_editar_Oferta;
	@Id("h1_editar_Oferta")
	private H1 h1_editar_Oferta;
	@Id("h2_editar_Oferta")
	private H2 h2_editar_Oferta;
	@Id("vaadinHorizontalLayout_editar_Oferta")
	private HorizontalLayout vaadinHorizontalLayout_editar_Oferta;
	@Id("label_editar_Oferta")
	private Label label_editar_Oferta;
	@Id("text-field_editar_Oferta")
	private TextField textField_editar_Oferta;
	@Id("zonaProductos__editar_Oferta")
	private VistaZona_productos zonaProductos__editar_Oferta;
	@Id("vaadinHorizontalLayout_editar_Oferta1")
	private HorizontalLayout vaadinHorizontalLayout_editar_Oferta1;
	@Id("vaadinButton_editar_Categoria")
	private Button vaadinButton_editar_Categoria;
	@Id("vistaZonaproductos")
	private VistaZona_productos vistaZonaproductos;

	/**
     * Creates a new VistaEditar_oferta.
     */
    public VistaEditar_oferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEditar_oferta and vista-editar_oferta
     */
    public interface VistaEditar_ofertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVerticalLayout_editar_Oferta() {
		return verticalLayout_editar_Oferta;
	}

	public void setVerticalLayout_editar_Oferta(Element verticalLayout_editar_Oferta) {
		this.verticalLayout_editar_Oferta = verticalLayout_editar_Oferta;
	}


	public H1 getH1_editar_Oferta() {
		return h1_editar_Oferta;
	}

	public void setH1_editar_Oferta(H1 h1_editar_Oferta) {
		this.h1_editar_Oferta = h1_editar_Oferta;
	}

	public H2 getH2_editar_Oferta() {
		return h2_editar_Oferta;
	}

	public void setH2_editar_Oferta(H2 h2_editar_Oferta) {
		this.h2_editar_Oferta = h2_editar_Oferta;
	}

	public HorizontalLayout getVaadinHorizontalLayout_editar_Oferta() {
		return vaadinHorizontalLayout_editar_Oferta;
	}

	public void setVaadinHorizontalLayout_editar_Oferta(HorizontalLayout vaadinHorizontalLayout_editar_Oferta) {
		this.vaadinHorizontalLayout_editar_Oferta = vaadinHorizontalLayout_editar_Oferta;
	}

	public Label getLabel_editar_Oferta() {
		return label_editar_Oferta;
	}

	public void setLabel_editar_Oferta(Label label_editar_Oferta) {
		this.label_editar_Oferta = label_editar_Oferta;
	}

	public TextField getTextField_editar_Oferta() {
		return textField_editar_Oferta;
	}

	public void setTextField_editar_Oferta(TextField textField_editar_Oferta) {
		this.textField_editar_Oferta = textField_editar_Oferta;
	}

	public VistaZona_productos getZonaProductos__editar_Oferta() {
		return zonaProductos__editar_Oferta;
	}

	public void setZonaProductos__editar_Oferta(VistaZona_productos zonaProductos__editar_Oferta) {
		this.zonaProductos__editar_Oferta = zonaProductos__editar_Oferta;
	}

	public HorizontalLayout getVaadinHorizontalLayout_editar_Oferta1() {
		return vaadinHorizontalLayout_editar_Oferta1;
	}

	public void setVaadinHorizontalLayout_editar_Oferta1(HorizontalLayout vaadinHorizontalLayout_editar_Oferta1) {
		this.vaadinHorizontalLayout_editar_Oferta1 = vaadinHorizontalLayout_editar_Oferta1;
	}

	public Button getVaadinButton_editar_Categoria() {
		return vaadinButton_editar_Categoria;
	}

	public void setVaadinButton_editar_Categoria(Button vaadinButton_editar_Categoria) {
		this.vaadinButton_editar_Categoria = vaadinButton_editar_Categoria;
	}
}
