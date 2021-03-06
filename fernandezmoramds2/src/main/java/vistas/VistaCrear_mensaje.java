package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-crear_mensaje template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crearmensaje")
@JsModule("./src/vista-crearmensaje.js")
public class VistaCrear_mensaje extends PolymerTemplate<VistaCrear_mensaje.VistaCrear_mensajeModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("span")
	private Span span;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("asunto")
	private TextField asunto;
	@Id("mensaje")
	private TextField mensaje;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("boton_atras")
	private Button boton_atras;
	@Id("boton_enviar")
	private Button boton_enviar;
	@Id("huecoSelect")
	private HorizontalLayout huecoSelect;

	/**
     * Creates a new VistaCrear_mensaje.
     */
    public VistaCrear_mensaje() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCrear_mensaje and vista-crear_mensaje
     */
    public interface VistaCrear_mensajeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public TextField getAsunto() {
		return asunto;
	}

	public void setAsunto(TextField asunto) {
		this.asunto = asunto;
	}

	public TextField getMensaje() {
		return mensaje;
	}

	public void setMensaje(TextField mensaje) {
		this.mensaje = mensaje;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Button getBoton_atras() {
		return boton_atras;
	}

	public void setBoton_atras(Button boton_atras) {
		this.boton_atras = boton_atras;
	}

	public Button getBoton_enviar() {
		return boton_enviar;
	}

	public void setBoton_enviar(Button boton_enviar) {
		this.boton_enviar = boton_enviar;
	}

	public HorizontalLayout getHuecoSelect() {
		return huecoSelect;
	}

	public void setHuecoSelect(HorizontalLayout huecoSelect) {
		this.huecoSelect = huecoSelect;
	}
}
