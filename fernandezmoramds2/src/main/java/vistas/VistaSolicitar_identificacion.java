package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Span;

/**
 * A Designer generated component for the vista-solicitar_identificacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-solicitaridentificacion")
@JsModule("./src/vista-solicitaridentificacion.js")
public class VistaSolicitar_identificacion extends PolymerTemplate<VistaSolicitar_identificacion.VistaSolicitar_identificacionModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vistaMenu_urunr")
	private Element vistaMenu_urunr;
	@Id("span")
	private Span span;

	/**
     * Creates a new VistaSolicitar_identificacion.
     */
    public VistaSolicitar_identificacion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaSolicitar_identificacion and vista-solicitar_identificacion
     */
    public interface VistaSolicitar_identificacionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getVistaMenu_urunr() {
		return vistaMenu_urunr;
	}

	public void setVistaMenu_urunr(Element vistaMenu_urunr) {
		this.vistaMenu_urunr = vistaMenu_urunr;
	}

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}
}
