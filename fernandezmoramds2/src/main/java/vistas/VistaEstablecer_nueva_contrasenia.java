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
 * A Designer generated component for the vista-establecer_nueva_contrasenia template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-establecernuevacontrasenia")
@JsModule("./src/vista-establecernuevacontrasenia.js")
public class VistaEstablecer_nueva_contrasenia extends PolymerTemplate<VistaEstablecer_nueva_contrasenia.VistaEstablecer_nueva_contraseniaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("div")
	private Div div;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("span")
	private Span span;
	@Id("nueva_contrasenia")
	private TextField nueva_contrasenia;
	@Id("confirmacion_nueva_contrasenia")
	private TextField confirmacion_nueva_contrasenia;
	@Id("boton_continuar")
	private Button boton_continuar;

	/**
     * Creates a new VistaEstablecer_nueva_contrasenia.
     */
    public VistaEstablecer_nueva_contrasenia() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEstablecer_nueva_contrasenia and vista-establecer_nueva_contrasenia
     */
    public interface VistaEstablecer_nueva_contraseniaModel extends TemplateModel {
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

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
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

	public Button getBoton_continuar() {
		return boton_continuar;
	}

	public void setBoton_continuar(Button boton_continuar) {
		this.boton_continuar = boton_continuar;
	}
}
