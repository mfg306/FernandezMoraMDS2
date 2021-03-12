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
 * A Designer generated component for the vista-confirmacion_registro template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-confirmacionregistro")
@JsModule("./src/vista-confirmacionregistro.js")
public class VistaConfirmacion_registro extends PolymerTemplate<VistaConfirmacion_registro.VistaConfirmacion_registroModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("div")
	private Div div;
	@Id("panel_confirmacion_registro")
	private Element panel_confirmacion_registro;
	@Id("span")
	private Span span;
	@Id("boton_iniciar_sesion")
	private Button boton_iniciar_sesion;

	/**
     * Creates a new VistaConfirmacion_registro.
     */
    public VistaConfirmacion_registro() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaConfirmacion_registro and vista-confirmacion_registro
     */
    public interface VistaConfirmacion_registroModel extends TemplateModel {
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

	public Element getPanel_confirmacion_registro() {
		return panel_confirmacion_registro;
	}

	public void setPanel_confirmacion_registro(Element panel_confirmacion_registro) {
		this.panel_confirmacion_registro = panel_confirmacion_registro;
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
