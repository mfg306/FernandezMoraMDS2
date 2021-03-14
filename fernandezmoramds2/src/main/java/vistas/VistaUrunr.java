package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-urunr template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-urunr")
@JsModule("./src/vista-urunr.js")
public class VistaUrunr extends PolymerTemplate<VistaUrunr.VistaUrunrModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("botonVerCategorias")
	private Button botonVerCategorias;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("listaOfertas")
	private Element listaOfertas;
	@Id("listaProductosmasvendidosporcategorias")
	private Element listaProductosmasvendidosporcategorias;
	@Id("huecoMenu")
	private Element huecoMenu;
	/**
     * Creates a new VistaUrunr.
     */
    public VistaUrunr() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaUrunr and vista-urunr
     */
    public interface VistaUrunrModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getBotonVerCategorias() {
		return botonVerCategorias;
	}

	public void setBotonVerCategorias(Button botonVerCategorias) {
		this.botonVerCategorias = botonVerCategorias;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public Element getListaOfertas() {
		return listaOfertas;
	}

	public void setListaOfertas(Element listaOfertas) {
		this.listaOfertas = listaOfertas;
	}

	public Element getListaProductosmasvendidosporcategorias() {
		return listaProductosmasvendidosporcategorias;
	}

	public void setListaProductosmasvendidosporcategorias(Element listaProductosmasvendidosporcategorias) {
		this.listaProductosmasvendidosporcategorias = listaProductosmasvendidosporcategorias;
	}

	public Element getHuecoMenu() {
		return huecoMenu;
	}

	public void setHuecoMenu(Element huecoMenu) {
		this.huecoMenu = huecoMenu;
	}
}
