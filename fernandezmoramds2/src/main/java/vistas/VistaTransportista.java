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
import vistas.VistaPedidos_t;
import com.vaadin.flow.component.html.H3;

/**
 * A Designer generated component for the vista-transportista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-transportista")
@JsModule("./src/vista-transportista.js")
public class VistaTransportista extends PolymerTemplate<VistaTransportista.VistaTransportistaModel> {

    @Id("vaadinVerticalLayout-transportista")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout-transportista")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton-transportista")
	private Button vaadinButton;
	@Id("h1-transportista")
	private H1 h1;
	@Id("h3-transportista")
	private H3 h3Transportista;

	/**
     * Creates a new VistaTransportista.
     */
    public VistaTransportista() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaTransportista and vista-transportista
     */
    public interface VistaTransportistaModel extends TemplateModel {
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


	public H3 getH3Transportista() {
		return h3Transportista;
	}

	public void setH3Transportista(H3 h3Transportista) {
		this.h3Transportista = h3Transportista;
	}
}
