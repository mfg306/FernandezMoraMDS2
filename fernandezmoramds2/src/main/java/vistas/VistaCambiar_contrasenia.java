package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cambiar_contrasenia template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cambiarcontrasenia")
@JsModule("./src/vista-cambiarcontrasenia.js")
public class VistaCambiar_contrasenia extends PolymerTemplate<VistaCambiar_contrasenia.VistaCambiar_contraseniaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("div")
	private Div div;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("titulo_cambiar_contrasenia")
	private Span titulo_cambiar_contrasenia;
	@Id("contrasenia_actual")
	private TextField contrasenia_actual;
	@Id("nueva_contrasenia")
	private TextField nueva_contrasenia;
	@Id("confirmacion_nueva_contrasenia")
	private TextField confirmacion_nueva_contrasenia;
	@Id("boton_guardar")
	private Button boton_guardar;

	/**
     * Creates a new VistaCambiar_contrasenia.
     */
    public VistaCambiar_contrasenia() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCambiar_contrasenia and vista-cambiar_contrasenia
     */
    public interface VistaCambiar_contraseniaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Div getDiv() {
		return div;
	}

	public void setDiv(Div div) {
		this.div = div;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Span getTitulo_cambiar_contrasenia() {
		return titulo_cambiar_contrasenia;
	}

	public void setTitulo_cambiar_contrasenia(Span titulo_cambiar_contrasenia) {
		this.titulo_cambiar_contrasenia = titulo_cambiar_contrasenia;
	}

	public TextField getContrasenia_actual() {
		return contrasenia_actual;
	}

	public void setContrasenia_actual(TextField contrasenia_actual) {
		this.contrasenia_actual = contrasenia_actual;
	}

	public TextField getNueva_contrasenia() {
		return nueva_contrasenia;
	}

	public void setNueva_contrasenia(TextField nueva_contrasenia) {
		this.nueva_contrasenia = nueva_contrasenia;
	}

	public TextField getConfirmacion_nueva_contrasenia() {
		return confirmacion_nueva_contrasenia;
	}

	public void setConfirmacion_nueva_contrasenia(TextField confirmacion_nueva_contrasenia) {
		this.confirmacion_nueva_contrasenia = confirmacion_nueva_contrasenia;
	}

	public Button getBoton_guardar() {
		return boton_guardar;
	}

	public void setBoton_guardar(Button boton_guardar) {
		this.boton_guardar = boton_guardar;
	}
}
