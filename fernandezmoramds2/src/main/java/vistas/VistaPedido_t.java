package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-pedido_t template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedidot")
@JsModule("./src/vista-pedidot.js")
public class VistaPedido_t extends PolymerTemplate<VistaPedido_t.VistaPedido_tModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("label")
	private Label label;
	@Id("label1")
	private Label label1;
	@Id("label2")
	private Label label2;
	@Id("vaadinCheckbox")
	private Checkbox vaadinCheckbox;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("vaadinButton")
	private Button vaadinButton;

	/**
     * Creates a new VistaPedido_t.
     */
    public VistaPedido_t() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedido_t and vista-pedido_t
     */
    public interface VistaPedido_tModel extends TemplateModel {
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

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(Label label1) {
		this.label1 = label1;
	}

	public Label getLabel2() {
		return label2;
	}

	public void setLabel2(Label label2) {
		this.label2 = label2;
	}

	public Checkbox getVaadinCheckbox() {
		return vaadinCheckbox;
	}

	public void setVaadinCheckbox(Checkbox vaadinCheckbox) {
		this.vaadinCheckbox = vaadinCheckbox;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public Element getIronIcon() {
		return ironIcon;
	}

	public void setIronIcon(Element ironIcon) {
		this.ironIcon = ironIcon;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}
}
