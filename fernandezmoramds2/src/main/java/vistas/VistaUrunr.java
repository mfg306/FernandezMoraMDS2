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
}
