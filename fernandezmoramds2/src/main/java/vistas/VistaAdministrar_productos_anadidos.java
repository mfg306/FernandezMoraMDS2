package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-administrar_productos_anadidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrarproductosanadidos")
@JsModule("./src/vista-administrarproductosanadidos.js")
public class VistaAdministrar_productos_anadidos extends PolymerTemplate<VistaAdministrar_productos_anadidos.VistaAdministrar_productos_anadidosModel> {


	@Id("vertical-layout_administrar_productos_anadidios")
	private Element verticalLayout_administrar_productos_anadidios;
	@Id("vaadinHorizontalLayout_administrador_productos_anadidos")
	private HorizontalLayout vaadinHorizontalLayout_administrador_productos_anadidos;
	@Id("vaadinVerticalLayout_zonaProductos")
	private Element vaadinVerticalLayout_zonaProductos;
	@Id("h2")
	private H2 h2;
	@Id("vaadinHorizontalLayout1_zonaProductos")
	private HorizontalLayout vaadinHorizontalLayout1_zonaProductos;
	@Id("vistaProductos_listado_zonaProductos")
	private Element vistaProductos_listado_zonaProductos;
	@Id("vaadinVerticalLayout1_productos_anadidos")
	private Element vaadinVerticalLayout1_productos_anadidos;
	@Id("vaadinHorizontalLayout2_productos_anadidos")
	private HorizontalLayout vaadinHorizontalLayout2_productos_anadidos;
	@Id("h21")
	private H2 h21;
	@Id("vistaProductoslistadoadministracion")
	private Element vistaProductoslistadoadministracion;
	@Id("buscador")
	private TextField vaadinTextField;

	/**
     * Creates a new VistaAdministrar_productos_anadidos.
     */
    public VistaAdministrar_productos_anadidos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrar_productos_anadidos and vista-administrar_productos_anadidos
     */
    public interface VistaAdministrar_productos_anadidosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVerticalLayout_administrar_productos_anadidios() {
		return verticalLayout_administrar_productos_anadidios;
	}

	public void setVerticalLayout_administrar_productos_anadidios(Element verticalLayout_administrar_productos_anadidios) {
		this.verticalLayout_administrar_productos_anadidios = verticalLayout_administrar_productos_anadidios;
	}

	public HorizontalLayout getVaadinHorizontalLayout_administrador_productos_anadidos() {
		return vaadinHorizontalLayout_administrador_productos_anadidos;
	}

	public void setVaadinHorizontalLayout_administrador_productos_anadidos(
			HorizontalLayout vaadinHorizontalLayout_administrador_productos_anadidos) {
		this.vaadinHorizontalLayout_administrador_productos_anadidos = vaadinHorizontalLayout_administrador_productos_anadidos;
	}

	public Element getVaadinVerticalLayout_zonaProductos() {
		return vaadinVerticalLayout_zonaProductos;
	}

	public void setVaadinVerticalLayout_zonaProductos(Element vaadinVerticalLayout_zonaProductos) {
		this.vaadinVerticalLayout_zonaProductos = vaadinVerticalLayout_zonaProductos;
	}

	public H2 getH2() {
		return h2;
	}

	public void setH2(H2 h2) {
		this.h2 = h2;
	}

	public HorizontalLayout getVaadinHorizontalLayout1_zonaProductos() {
		return vaadinHorizontalLayout1_zonaProductos;
	}

	public void setVaadinHorizontalLayout1_zonaProductos(HorizontalLayout vaadinHorizontalLayout1_zonaProductos) {
		this.vaadinHorizontalLayout1_zonaProductos = vaadinHorizontalLayout1_zonaProductos;
	}

	public Element getVistaProductos_listado_zonaProductos() {
		return vistaProductos_listado_zonaProductos;
	}

	public void setVistaProductos_listado_zonaProductos(Element vistaProductos_listado_zonaProductos) {
		this.vistaProductos_listado_zonaProductos = vistaProductos_listado_zonaProductos;
	}

	public Element getVaadinVerticalLayout1_productos_anadidos() {
		return vaadinVerticalLayout1_productos_anadidos;
	}

	public void setVaadinVerticalLayout1_productos_anadidos(Element vaadinVerticalLayout1_productos_anadidos) {
		this.vaadinVerticalLayout1_productos_anadidos = vaadinVerticalLayout1_productos_anadidos;
	}

	public HorizontalLayout getVaadinHorizontalLayout2_productos_anadidos() {
		return vaadinHorizontalLayout2_productos_anadidos;
	}

	public void setVaadinHorizontalLayout2_productos_anadidos(HorizontalLayout vaadinHorizontalLayout2_productos_anadidos) {
		this.vaadinHorizontalLayout2_productos_anadidos = vaadinHorizontalLayout2_productos_anadidos;
	}

	public H2 getH21() {
		return h21;
	}

	public void setH21(H2 h21) {
		this.h21 = h21;
	}

	public Element getVistaProductoslistadoadministracion() {
		return vistaProductoslistadoadministracion;
	}

	public void setVistaProductoslistadoadministracion(Element vistaProductoslistadoadministracion) {
		this.vistaProductoslistadoadministracion = vistaProductoslistadoadministracion;
	}

	public TextField getVaadinTextField() {
		return vaadinTextField;
	}

	public void setVaadinTextField(TextField vaadinTextField) {
		this.vaadinTextField = vaadinTextField;
	}




}
