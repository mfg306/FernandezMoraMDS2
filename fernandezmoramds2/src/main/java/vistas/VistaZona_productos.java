package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H2;

/**
 * A Designer generated component for the vista-zona_productos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-zonaproductos")
@JsModule("./src/vista-zonaproductos.js")
public class VistaZona_productos extends PolymerTemplate<VistaZona_productos.VistaZona_productosModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;


	/**
     * Creates a new VistaZona_productos.
     */
    public VistaZona_productos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaZona_productos and vista-zona_productos
     */
    public interface VistaZona_productosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


}
