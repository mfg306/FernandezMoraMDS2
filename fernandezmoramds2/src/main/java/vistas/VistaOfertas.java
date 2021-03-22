package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-ofertas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ofertas")
@JsModule("./src/vista-ofertas.js")
public class VistaOfertas extends PolymerTemplate<VistaOfertas.VistaOfertasModel> {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("boton_anterior")
	private Button boton_anterior;
	@Id("boton_siguiente")
	private Button boton_siguiente;
	@Id("listaOfertas")
	private HorizontalLayout listaOfertas;

	/**
     * Creates a new VistaOfertas.
     */
    public VistaOfertas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaOfertas and vista-ofertas
     */
    public interface VistaOfertasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getBoton_anterior() {
		return boton_anterior;
	}

	public void setBoton_anterior(Button boton_anterior) {
		this.boton_anterior = boton_anterior;
	}

	

	public Button getBoton_siguiente() {
		return boton_siguiente;
	}

	public void setBoton_siguiente(Button boton_siguiente) {
		this.boton_siguiente = boton_siguiente;
	}

	public HorizontalLayout getListaOfertas() {
		return listaOfertas;
	}

	public void setListaOfertas(HorizontalLayout listaOfertas) {
		this.listaOfertas = listaOfertas;
	}
}
