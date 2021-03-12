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
 * A Designer generated component for the vista-verificacion_cuenta_eliminada template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verificacioncuentaeliminada")
@JsModule("./src/vista-verificacioncuentaeliminada.js")
public class VistaVerificacion_cuenta_eliminada extends PolymerTemplate<VistaVerificacion_cuenta_eliminada.VistaVerificacion_cuenta_eliminadaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("div")
	private Div div;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("span")
	private Span span;
	@Id("boton_volver")
	private Button boton_volver;

	/**
     * Creates a new VistaVerificacion_cuenta_eliminada.
     */
    public VistaVerificacion_cuenta_eliminada() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerificacion_cuenta_eliminada and vista-verificacion_cuenta_eliminada
     */
    public interface VistaVerificacion_cuenta_eliminadaModel extends TemplateModel {
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

	public Button getBoton_volver() {
		return boton_volver;
	}

	public void setBoton_volver(Button boton_volver) {
		this.boton_volver = boton_volver;
	}
}
