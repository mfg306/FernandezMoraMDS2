package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-verificacion_contrasenia_cambiada template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verificacioncontraseniacambiada")
@JsModule("./src/vista-verificacioncontraseniacambiada.js")
public class VistaVerificacion_contrasenia_cambiada extends PolymerTemplate<VistaVerificacion_contrasenia_cambiada.VistaVerificacion_contrasenia_cambiadaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("span")
	private Span span;
	@Id("boton_aceptar")
	private Button boton_aceptar;

	/**
     * Creates a new VistaVerificacion_contrasenia_cambiada.
     */
    public VistaVerificacion_contrasenia_cambiada() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerificacion_contrasenia_cambiada and vista-verificacion_contrasenia_cambiada
     */
    public interface VistaVerificacion_contrasenia_cambiadaModel extends TemplateModel {
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

	public Button getBoton_aceptar() {
		return boton_aceptar;
	}

	public void setBoton_aceptar(Button boton_aceptar) {
		this.boton_aceptar = boton_aceptar;
	}
}
