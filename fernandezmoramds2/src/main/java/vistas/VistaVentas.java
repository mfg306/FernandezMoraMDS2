package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-ventas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ventas")
@JsModule("./src/vista-ventas.js")
public class VistaVentas extends PolymerTemplate<VistaVentas.VistaVentasModel> {

    @Id("vaadinVerticalLayout-ventas")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout-ventas")
	private HorizontalLayout vaadinHorizontalLayout;

	/**
     * Creates a new VistaVentas.
     */
    public VistaVentas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVentas and vista-ventas
     */
    public interface VistaVentasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
}
