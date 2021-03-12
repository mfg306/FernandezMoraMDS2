package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-ofertas_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ofertasadministrador")
@JsModule("./src/vista-ofertasadministrador.js")
public class VistaOfertas_administrador extends PolymerTemplate<VistaOfertas_administrador.VistaOfertas_administradorModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaOfertas_administrador.
     */
    public VistaOfertas_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaOfertas_administrador and vista-ofertas_administrador
     */
    public interface VistaOfertas_administradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
}
