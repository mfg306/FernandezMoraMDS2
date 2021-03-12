package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-categorias_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-categoriasadministrador")
@JsModule("./src/vista-categoriasadministrador.js")
public class VistaCategorias_administrador extends PolymerTemplate<VistaCategorias_administrador.VistaCategorias_administradorModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaCategorias_administrador.
     */
    public VistaCategorias_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCategorias_administrador and vista-categorias_administrador
     */
    public interface VistaCategorias_administradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
}
