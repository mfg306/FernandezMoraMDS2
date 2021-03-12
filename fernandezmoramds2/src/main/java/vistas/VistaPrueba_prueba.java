package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-prueba_prueba template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pruebaprueba")
@JsModule("./src/vista-pruebaprueba.js")
public class VistaPrueba_prueba extends PolymerTemplate<VistaPrueba_prueba.VistaPrueba_pruebaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;

	/**
     * Creates a new VistaPrueba_prueba.
     */
    public VistaPrueba_prueba() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPrueba_prueba and vista-prueba_prueba
     */
    public interface VistaPrueba_pruebaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}
}
