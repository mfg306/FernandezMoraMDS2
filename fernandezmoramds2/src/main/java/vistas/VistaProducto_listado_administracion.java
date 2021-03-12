package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-producto_listado_administracion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productolistadoadministracion")
@JsModule("./src/vista-productolistadoadministracion.js")
public class VistaProducto_listado_administracion extends PolymerTemplate<VistaProducto_listado_administracion.VistaProducto_listado_administracionModel> {

    @Id("verticalLayout_producto_listado_administracion")
	private Element verticalLayout_producto_listado_administracion;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("label")
	private Label label;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinButton")
	private Button vaadinButton;

	/**
     * Creates a new VistaProducto_listado_administracion.
     */
    public VistaProducto_listado_administracion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProducto_listado_administracion and vista-producto_listado_administracion
     */
    public interface VistaProducto_listado_administracionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVerticalLayout_producto_listado_administracion() {
		return verticalLayout_producto_listado_administracion;
	}

	public void setVerticalLayout_producto_listado_administracion(Element verticalLayout_producto_listado_administracion) {
		this.verticalLayout_producto_listado_administracion = verticalLayout_producto_listado_administracion;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}
}
