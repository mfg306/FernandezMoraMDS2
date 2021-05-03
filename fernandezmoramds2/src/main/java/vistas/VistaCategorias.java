package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-categorias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-categorias")
@JsModule("./src/vista-categorias.js")
public class VistaCategorias extends PolymerTemplate<VistaCategorias.VistaCategoriasModel> {

    @Id("lista_categorias")
	private Element lista_categorias;
	@Id("huecoProductos")
	private Element huecoProductos;
	@Id("lista_Categorias")
	private Element lista_Categorias;
	@Id("partePaginacion")
	private Element partePaginacion;

	/**
     * Creates a new VistaCategorias.
     */
    public VistaCategorias() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCategorias and vista-categorias
     */
    public interface VistaCategoriasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getLista_categorias() {
		return lista_categorias;
	}

	public void setLista_categorias(Element lista_categorias) {
		this.lista_categorias = lista_categorias;
	}

	public Element getHuecoProductos() {
		return huecoProductos;
	}

	public void setHuecoProductos(Element huecoProductos) {
		this.huecoProductos = huecoProductos;
	}

	public Element getLista_Categorias() {
		return lista_Categorias;
	}

	public void setLista_Categorias(Element lista_Categorias) {
		this.lista_Categorias = lista_Categorias;
	}

	public Element getPartePaginacion() {
		return partePaginacion;
	}

	public void setPartePaginacion(Element partePaginacion) {
		this.partePaginacion = partePaginacion;
	}
}
