package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-gestionar_productos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-gestionarproductos")
@JsModule("./src/vista-gestionarproductos.js")
public class VistaGestionar_productos extends PolymerTemplate<VistaGestionar_productos.VistaGestionar_productosModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vistaProductos_administrador")
	private Element vistaProductos_administrador;
	@Id("vistaProductosadministrador")
	private Element vistaProductosadministrador;

	/**
     * Creates a new VistaGestionar_productos.
     */
    public VistaGestionar_productos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaGestionar_productos and vista-gestionar_productos
     */
    public interface VistaGestionar_productosModel extends TemplateModel {
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

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Element getVistaProductos_administrador() {
		return vistaProductos_administrador;
	}

	public void setVistaProductos_administrador(Element vistaProductos_administrador) {
		this.vistaProductos_administrador = vistaProductos_administrador;
	}
}
