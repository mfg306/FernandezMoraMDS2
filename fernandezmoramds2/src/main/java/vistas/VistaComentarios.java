package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Span;

/**
 * A Designer generated component for the vista-comentarios template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-comentarios")
@JsModule("./src/vista-comentarios.js")
public class VistaComentarios extends PolymerTemplate<VistaComentarios.VistaComentariosModel> {

    @Id("lista_comentarios")
	private Element lista_comentarios;
	@Id("span")
	private Span span;

	/**
     * Creates a new VistaComentarios.
     */
    public VistaComentarios() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaComentarios and vista-comentarios
     */
    public interface VistaComentariosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getLista_comentarios() {
		return lista_comentarios;
	}

	public void setLista_comentarios(Element lista_comentarios) {
		this.lista_comentarios = lista_comentarios;
	}

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}
}
