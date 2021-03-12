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
 * A Designer generated component for the vista-recuperar_contrasenia template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-recuperarcontrasenia")
@JsModule("./src/vista-recuperarcontrasenia.js")
public class VistaRecuperar_contrasenia extends PolymerTemplate<VistaRecuperar_contrasenia.VistaRecuperar_contraseniaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("div")
	private Div div;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("span")
	private Span span;
	@Id("correo")
	private TextField correo;
	@Id("boton_enviar_correo")
	private Button boton_enviar_correo;

	/**
     * Creates a new VistaRecuperar_contrasenia.
     */
    public VistaRecuperar_contrasenia() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRecuperar_contrasenia and vista-recuperar_contrasenia
     */
    public interface VistaRecuperar_contraseniaModel extends TemplateModel {
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

	public TextField getCorreo() {
		return correo;
	}

	public void setCorreo(TextField correo) {
		this.correo = correo;
	}

	public Button getBoton_enviar_correo() {
		return boton_enviar_correo;
	}

	public void setBoton_enviar_correo(Button boton_enviar_correo) {
		this.boton_enviar_correo = boton_enviar_correo;
	}
}
