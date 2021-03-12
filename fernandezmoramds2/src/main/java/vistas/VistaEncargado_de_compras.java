package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;

/**
 * A Designer generated component for the vista-encargado_de_compras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-encargadodecompras")
@JsModule("./src/vista-encargadodecompras.js")
public class VistaEncargado_de_compras extends PolymerTemplate<VistaEncargado_de_compras.VistaEncargado_de_comprasModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("h1")
	private H1 h1;
	@Id("vistaPedidos_e")
	private Element vistaPedidos_e;
	@Id("vistaPedidose")
	private Element vistaPedidose;

	/**
     * Creates a new VistaEncargado_de_compras.
     */
    public VistaEncargado_de_compras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEncargado_de_compras and vista-encargado_de_compras
     */
    public interface VistaEncargado_de_comprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
	}

	public Element getVistaPedidos_e() {
		return vistaPedidos_e;
	}

	public void setVistaPedidos_e(Element vistaPedidos_e) {
		this.vistaPedidos_e = vistaPedidos_e;
	}
}
