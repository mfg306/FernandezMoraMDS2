package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-productos_listado_administracion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productoslistadoadministracion")
@JsModule("./src/vista-productoslistadoadministracion.js")
public class VistaProductos_listado_administracion extends PolymerTemplate<VistaProductos_listado_administracion.VistaProductos_listado_administracionModel> {

    @Id("vaadinVerticalLayout_productos_listado_administracion")
	private Element vaadinVerticalLayout_productos_listado_administracion;

	/**
     * Creates a new VistaProductos_listado_administracion.
     */
    public VistaProductos_listado_administracion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductos_listado_administracion and vista-productos_listado_administracion
     */
    public interface VistaProductos_listado_administracionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout_productos_listado_administracion() {
		return vaadinVerticalLayout_productos_listado_administracion;
	}

	public void setVaadinVerticalLayout_productos_listado_administracion(
			Element vaadinVerticalLayout_productos_listado_administracion) {
		this.vaadinVerticalLayout_productos_listado_administracion = vaadinVerticalLayout_productos_listado_administracion;
	}
}
