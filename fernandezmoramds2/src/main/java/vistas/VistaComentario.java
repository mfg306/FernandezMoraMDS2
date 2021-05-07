package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

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
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("huecoNombreUsuarioComentario")
	private Element huecoNombreUsuarioComentario;
	@Id("nombreComentarioUsuario")
	private Span nombreComentarioUsuario;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("valoracionProducto")
	private Span valoracionProducto;
	@Id("huecoComentario")
	private Element huecoComentario;
	@Id("comentarioProducto")
	private Span comentarioProducto;


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

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getHuecoNombreUsuarioComentario() {
		return huecoNombreUsuarioComentario;
	}

	public void setHuecoNombreUsuarioComentario(Element huecoNombreUsuarioComentario) {
		this.huecoNombreUsuarioComentario = huecoNombreUsuarioComentario;
	}

	public Span getNombreComentarioUsuario() {
		return nombreComentarioUsuario;
	}

	public void setNombreComentarioUsuario(Span nombreComentarioUsuario) {
		this.nombreComentarioUsuario = nombreComentarioUsuario;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Span getValoracionProducto() {
		return valoracionProducto;
	}

	public void setValoracionProducto(Span valoracionProducto) {
		this.valoracionProducto = valoracionProducto;
	}

	public Element getHuecoComentario() {
		return huecoComentario;
	}

	public void setHuecoComentario(Element huecoComentario) {
		this.huecoComentario = huecoComentario;
	}

	public Span getComentarioProducto() {
		return comentarioProducto;
	}

	public void setComentarioProducto(Span comentarioProducto) {
		this.comentarioProducto = comentarioProducto;
	}


}
