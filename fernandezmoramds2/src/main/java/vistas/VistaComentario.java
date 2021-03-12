package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Span;

/**
 * A Designer generated component for the vista-comentario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-comentario")
@JsModule("./src/vista-comentario.js")
public class VistaComentario extends PolymerTemplate<VistaComentario.VistaComentarioModel> {

    @Id("comentario")
	private Element comentario;
	@Id("span")
	private Span span;
	@Id("span1")
	private Span span1;
	@Id("span2")
	private Span span2;

	/**
     * Creates a new VistaComentario.
     */
    public VistaComentario() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaComentario and vista-comentario
     */
    public interface VistaComentarioModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getComentario() {
		return comentario;
	}

	public void setComentario(Element comentario) {
		this.comentario = comentario;
	}

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}

	public Span getSpan1() {
		return span1;
	}

	public void setSpan1(Span span1) {
		this.span1 = span1;
	}

	public Span getSpan2() {
		return span2;
	}

	public void setSpan2(Span span2) {
		this.span2 = span2;
	}
}
