package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;

/**
 * A Designer generated component for the vista-administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrador")
@JsModule("./src/vista-administrador.js")
public class VistaAdministrador extends PolymerTemplate<VistaAdministrador.VistaAdministradorModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("hueco-menu")
	private Element huecoMenu;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("h2")
	private H2 h2;
	@Id("boton_gestionar_ofertas")
	private Button boton_gestionar_ofertas;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("h21")
	private H2 h21;
	@Id("boton_gestionar_categorias")
	private Button boton_gestionar_categorias;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("h22")
	private H2 h22;
	@Id("boton_gestionar_productos")
	private Button boton_gestionar_productos;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("h23")
	private H2 h23;
	@Id("boton_gestionar_empleados")
	private Button boton_gestionar_empleados;

	/**
     * Creates a new VistaAdministrador.
     */
    public VistaAdministrador() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrador and vista-administrador
     */
    public interface VistaAdministradorModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getHuecoMenu() {
		return huecoMenu;
	}

	public void setHuecoMenu(Element huecoMenu) {
		this.huecoMenu = huecoMenu;
	}

	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public H2 getH2() {
		return h2;
	}

	public void setH2(H2 h2) {
		this.h2 = h2;
	}

	public Button getBoton_gestionar_ofertas() {
		return boton_gestionar_ofertas;
	}

	public void setBoton_gestionar_ofertas(Button boton_gestionar_ofertas) {
		this.boton_gestionar_ofertas = boton_gestionar_ofertas;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public H2 getH21() {
		return h21;
	}

	public void setH21(H2 h21) {
		this.h21 = h21;
	}

	public Button getBoton_gestionar_categorias() {
		return boton_gestionar_categorias;
	}

	public void setBoton_gestionar_categorias(Button boton_gestionar_categorias) {
		this.boton_gestionar_categorias = boton_gestionar_categorias;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	public H2 getH22() {
		return h22;
	}

	public void setH22(H2 h22) {
		this.h22 = h22;
	}

	public Button getBoton_gestionar_productos() {
		return boton_gestionar_productos;
	}

	public void setBoton_gestionar_productos(Button boton_gestionar_productos) {
		this.boton_gestionar_productos = boton_gestionar_productos;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

	public H2 getH23() {
		return h23;
	}

	public void setH23(H2 h23) {
		this.h23 = h23;
	}

	public Button getBoton_gestionar_empleados() {
		return boton_gestionar_empleados;
	}

	public void setBoton_gestionar_empleados(Button boton_gestionar_empleados) {
		this.boton_gestionar_empleados = boton_gestionar_empleados;
	}


}
