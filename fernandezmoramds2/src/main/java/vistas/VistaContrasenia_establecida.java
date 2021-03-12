package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-contrasenia_establecida template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-contraseniaestablecida")
@JsModule("./src/vista-contraseniaestablecida.js")
public class VistaContrasenia_establecida extends PolymerTemplate<VistaContrasenia_establecida.VistaContrasenia_establecidaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("div")
	private Div div;
	@Id("span")
	private Span span;
	@Id("boton_iniciar_sesion")
	private Button boton_iniciar_sesion;

	/**
     * Creates a new VistaContrasenia_establecida.
     */
    public VistaContrasenia_establecida() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaContrasenia_establecida and vista-contrasenia_establecida
     */
    public interface VistaContrasenia_establecidaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Div getDiv() {
		return div;
	}

	public void setDiv(Div div) {
		this.div = div;
	}

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}

	public Button getBoton_iniciar_sesion() {
		return boton_iniciar_sesion;
	}

	public void setBoton_iniciar_sesion(Button boton_iniciar_sesion) {
		this.boton_iniciar_sesion = boton_iniciar_sesion;
	}
}
