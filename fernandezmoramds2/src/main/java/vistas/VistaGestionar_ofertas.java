package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;

/**
 * A Designer generated component for the vista-gestionar_ofertas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-gestionarofertas")
@JsModule("./src/vista-gestionarofertas.js")
public class VistaGestionar_ofertas extends PolymerTemplate<VistaGestionar_ofertas.VistaGestionar_ofertasModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vistaOfertasadministrador")
	private Element vistaOfertasadministrador;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("retroceder")
	private Button retroceder;
	/**
     * Creates a new VistaGestionar_ofertas.
     */
    public VistaGestionar_ofertas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaGestionar_ofertas and vista-gestionar_ofertas
     */
    public interface VistaGestionar_ofertasModel extends TemplateModel {
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

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Element getVistaOfertasadministrador() {
		return vistaOfertasadministrador;
	}

	public void setVistaOfertasadministrador(Element vistaOfertasadministrador) {
		this.vistaOfertasadministrador = vistaOfertasadministrador;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Button getRetroceder() {
		return retroceder;
	}

	public void setRetroceder(Button retroceder) {
		this.retroceder = retroceder;
	}
}
