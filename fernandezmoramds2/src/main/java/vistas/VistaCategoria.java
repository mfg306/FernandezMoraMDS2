package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-categoria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-categoria")
@JsModule("./src/vista-categoria.js")
public class VistaCategoria extends PolymerTemplate<VistaCategoria.VistaCategoriaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("categoria1")
	private Button categoria1;

	/**
     * Creates a new VistaCategoria.
     */
    public VistaCategoria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCategoria and vista-categoria
     */
    public interface VistaCategoriaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	public Button getCategoria1() {
		return categoria1;
	}

	public void setCategoria1(Button categoria1) {
		this.categoria1 = categoria1;
	}

	
}
