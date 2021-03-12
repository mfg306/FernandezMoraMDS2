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
 * A Designer generated component for the vista-crear_oferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crearoferta")
@JsModule("./src/vista-crearoferta.js")
public class VistaCrear_oferta extends PolymerTemplate<VistaCrear_oferta.VistaCrear_ofertaModel> {

   
	@Id("h1_Crear_Oferta")
	private H1 h1;
	@Id("h2_Crear_Oferta")
	private H2 h2;
	@Id("vaadinHorizontalLayout_Crear_Oferta")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label_Crear_Oferta")
	private Label label;
	@Id("vaadinTextField_Crear_Oferta")
	private TextField vaadinTextField;
	@Id("vaadinHorizontalLayout1_Crear_Oferta")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinHorizontalLayout2_Crear_Oferta")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinHorizontalLayout3_Crear_Oferta")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("boton_Cancelar_Crear_Oferta")
	private Button boton_Cancelar_Crear_Categoria;
	@Id("boton_Guardar_Crear_Oferta")
	private Button boton_Guardar_Crear_Categoria;
	@Id("zonaProductos_Crear_Oferta")
	private VistaZona_productos zonaProductos_Crear_Oferta;
	@Id("verticalLayout_CrearOferta")
	private Element verticalLayout_CrearOferta;
	@Id("vistaZonaproductos")
	private VistaZona_productos vistaZonaproductos;

	/**
     * Creates a new VistaCrear_oferta.
     */
    public VistaCrear_oferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCrear_oferta and vista-crear_oferta
     */
    public interface VistaCrear_ofertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
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

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public TextField getVaadinTextField() {
		return vaadinTextField;
	}

	public void setVaadinTextField(TextField vaadinTextField) {
		this.vaadinTextField = vaadinTextField;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}

	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}

	public Button getBoton_Cancelar_Crear_Categoria() {
		return boton_Cancelar_Crear_Categoria;
	}

	public void setBoton_Cancelar_Crear_Categoria(Button boton_Cancelar_Crear_Categoria) {
		this.boton_Cancelar_Crear_Categoria = boton_Cancelar_Crear_Categoria;
	}

	public Button getBoton_Guardar_Crear_Categoria() {
		return boton_Guardar_Crear_Categoria;
	}

	public void setBoton_Guardar_Crear_Categoria(Button boton_Guardar_Crear_Categoria) {
		this.boton_Guardar_Crear_Categoria = boton_Guardar_Crear_Categoria;
	}

	public VistaZona_productos getZonaProductos_Crear_Oferta() {
		return zonaProductos_Crear_Oferta;
	}

	public void setZonaProductos_Crear_Oferta(VistaZona_productos zonaProductos_Crear_Oferta) {
		this.zonaProductos_Crear_Oferta = zonaProductos_Crear_Oferta;
	}

	public Element getVerticalLayout_CrearOferta() {
		return verticalLayout_CrearOferta;
	}

	public void setVerticalLayout_CrearOferta(Element verticalLayout_CrearOferta) {
		this.verticalLayout_CrearOferta = verticalLayout_CrearOferta;
	}
}
