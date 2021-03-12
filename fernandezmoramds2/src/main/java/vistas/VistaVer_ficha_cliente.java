package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ver_ficha_cliente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verfichacliente")
@JsModule("./src/vista-verfichacliente.js")
public class VistaVer_ficha_cliente extends PolymerTemplate<VistaVer_ficha_cliente.VistaVer_ficha_clienteModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("h3")
	private H3 h3;
	@Id("label")
	private Label label;
	@Id("label1")
	private Label label1;
	@Id("label2")
	private Label label2;
	@Id("label3")
	private Label label3;
	@Id("label4")
	private Label label4;
	@Id("vaadinButton")
	private Button vaadinButton;

	/**
     * Creates a new VistaVer_ficha_cliente.
     */
    public VistaVer_ficha_cliente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVer_ficha_cliente and vista-ver_ficha_cliente
     */
    public interface VistaVer_ficha_clienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public H3 getH3() {
		return h3;
	}

	public void setH3(H3 h3) {
		this.h3 = h3;
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

	public Label getLabel3() {
		return label3;
	}

	public void setLabel3(Label label3) {
		this.label3 = label3;
	}

	public Label getLabel4() {
		return label4;
	}

	public void setLabel4(Label label4) {
		this.label4 = label4;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}
}
