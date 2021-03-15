package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import vistas.VistaZona_productos;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-editar_oferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editaroferta")
@JsModule("./src/vista-editaroferta.js")
public class VistaEditar_oferta extends PolymerTemplate<VistaEditar_oferta.VistaEditar_ofertaModel> {

   
	
	  @Id("layoutEditarOferta")
		private Element vaadinVerticalLayout;
	/**
     * Creates a new VistaEditar_oferta.
     */
    public VistaEditar_oferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEditar_oferta and vista-editar_oferta
     */
    public interface VistaEditar_ofertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	
}
