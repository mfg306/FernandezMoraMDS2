package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-gestionar_ventas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-gestionarventas")
@JsModule("./src/vista-gestionarventas.js")
public class VistaGestionar_ventas extends PolymerTemplate<VistaGestionar_ventas.VistaGestionar_ventasModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("retroceder")
	private Button retroceder;


	/**
     * Creates a new VistaGestionar_ventas.
     */
    public VistaGestionar_ventas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaGestionar_ventas and vista-gestionar_ventas
     */
    public interface VistaGestionar_ventasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
	}

	public Button getRetroceder() {
		return retroceder;
	}

	public void setRetroceder(Button retroceder) {
		this.retroceder = retroceder;
	}

}
