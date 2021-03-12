package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-productos_listado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productos_listado")
@JsModule("./src/vista-productoslistado.js")
public class VistaProductos_listado extends PolymerTemplate<VistaProductos_listado.VistaProductos_listadoModel> {

    @Id("vaadinVerticalLayout_productos_listado")
	private Element vaadinVerticalLayout_productos_listado;

	/**
     * Creates a new VistaProductos_listado.
     */
    public VistaProductos_listado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductos_listado and vista-productos_listado
     */
    public interface VistaProductos_listadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout_productos_listado() {
		return vaadinVerticalLayout_productos_listado;
	}

	public void setVaadinVerticalLayout_productos_listado(Element vaadinVerticalLayout_productos_listado) {
		this.vaadinVerticalLayout_productos_listado = vaadinVerticalLayout_productos_listado;
	}
}
