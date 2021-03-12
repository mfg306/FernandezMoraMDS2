package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

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
	@Id("h2-administrar_productos_anadidios")
	private H2 h2Administrar_productos_anadidios;
	@Id("lista-administrar_productos_anadidios")
	private Element listaAdministrar_productos_anadidios;
	@Id("vaadinHorizontalLayout_administrador_productos_anadidos")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout_zonaProductos")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout1_zonaProductos")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vistaProductos_listado_zonaProductos")
	private Element vistaProductos_listado;
	@Id("vaadinVerticalLayout1_productos_anadidos")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout2_productos_anadidos")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vistaProductos_listado_administracion__productos_anadidos")
	private Element vistaProductos_listado_administracion;
	@Id("h2")
	private H2 h2;
	@Id("h21")
	private H2 h21;
	@Id("vistaProductoslistadoadministracion")
	private Element vistaProductoslistadoadministracion;

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

	public H2 getH2Administrar_productos_anadidios() {
		return h2Administrar_productos_anadidios;
	}

	public void setH2Administrar_productos_anadidios(H2 h2Administrar_productos_anadidios) {
		this.h2Administrar_productos_anadidios = h2Administrar_productos_anadidios;
	}

	public Element getListaAdministrar_productos_anadidios() {
		return listaAdministrar_productos_anadidios;
	}

	public void setListaAdministrar_productos_anadidios(Element listaAdministrar_productos_anadidios) {
		this.listaAdministrar_productos_anadidios = listaAdministrar_productos_anadidios;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Element getVistaProductos_listado() {
		return vistaProductos_listado;
	}

	public void setVistaProductos_listado(Element vistaProductos_listado) {
		this.vistaProductos_listado = vistaProductos_listado;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public Element getVistaProductos_listado_administracion() {
		return vistaProductos_listado_administracion;
	}

	public void setVistaProductos_listado_administracion(Element vistaProductos_listado_administracion) {
		this.vistaProductos_listado_administracion = vistaProductos_listado_administracion;
	}

	public H2 getH2() {
		return h2;
	}

	public void setH2(H2 h2) {
		this.h2 = h2;
	}

	public H2 getH21() {
		return h21;
	}

	public void setH21(H2 h21) {
		this.h21 = h21;
	}
}
