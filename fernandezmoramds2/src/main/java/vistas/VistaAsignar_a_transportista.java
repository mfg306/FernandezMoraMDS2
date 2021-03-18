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
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-asignar_a_transportista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-asignaratransportista")
@JsModule("./src/vista-asignaratransportista.js")
public class VistaAsignar_a_transportista extends PolymerTemplate<VistaAsignar_a_transportista.VistaAsignar_a_transportistaModel> {

    @Id("vertical-layout_asignar_a_transportista")
	private Element verticalLayout_asignar_a_transportista;
	@Id("h1-asignar_a_transportista")
	private H1 h1Asignar_a_transportista;
	@Id("vertical-layout_2_asignar_a_transportista")
	private Element verticalLayout_2_asignar_a_transportista;
	@Id("Seleccion-asignar_a_transportista")
	private Select seleccionAsignar_a_transportista;
	@Id("aceptar-asignar_a_transportista")
	private Button aceptarAsignar_a_transportista;

	/**
     * Creates a new VistaAsignar_a_transportista.
     */
    public VistaAsignar_a_transportista() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAsignar_a_transportista and vista-asignar_a_transportista
     */
    public interface VistaAsignar_a_transportistaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVerticalLayout_asignar_a_transportista() {
		return verticalLayout_asignar_a_transportista;
	}

	public void setVerticalLayout_asignar_a_transportista(Element verticalLayout_asignar_a_transportista) {
		this.verticalLayout_asignar_a_transportista = verticalLayout_asignar_a_transportista;
	}

	public H1 getH1Asignar_a_transportista() {
		return h1Asignar_a_transportista;
	}

	public void setH1Asignar_a_transportista(H1 h1Asignar_a_transportista) {
		this.h1Asignar_a_transportista = h1Asignar_a_transportista;
	}

	public Element getVerticalLayout_2_asignar_a_transportista() {
		return verticalLayout_2_asignar_a_transportista;
	}

	public void setVerticalLayout_2_asignar_a_transportista(Element verticalLayout_2_asignar_a_transportista) {
		this.verticalLayout_2_asignar_a_transportista = verticalLayout_2_asignar_a_transportista;
	}

	public Select getSeleccionAsignar_a_transportista() {
		return seleccionAsignar_a_transportista;
	}

	public void setSeleccionAsignar_a_transportista(Select seleccionAsignar_a_transportista) {
		this.seleccionAsignar_a_transportista = seleccionAsignar_a_transportista;
	}

	public Button getAceptarAsignar_a_transportista() {
		return aceptarAsignar_a_transportista;
	}

	public void setAceptarAsignar_a_transportista(Button aceptarAsignar_a_transportista) {
		this.aceptarAsignar_a_transportista = aceptarAsignar_a_transportista;
	}
}
