package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H1;

/**
 * A Designer generated component for the vista-gestionar_empleados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-gestionarempleados")
@JsModule("./src/vista-gestionarempleados.js")
public class VistaGestionar_empleados extends PolymerTemplate<VistaGestionar_empleados.VistaGestionar_empleadosModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vistaCrearempleados")
	private Element vistaCrearempleados;

	/**
     * Creates a new VistaGestionar_empleados.
     */
    public VistaGestionar_empleados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaGestionar_empleados and vista-gestionar_empleados
     */
    public interface VistaGestionar_empleadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
	}

	public Element getVistaCrearempleados() {
		return vistaCrearempleados;
	}

	public void setVistaCrearempleados(Element vistaCrearempleados) {
		this.vistaCrearempleados = vistaCrearempleados;
	}
}
