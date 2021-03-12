package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Span;

/**
 * A Designer generated component for the vista-mensaje_recibido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mensajerecibido")
@JsModule("./src/vista-mensajerecibido.js")
public class VistaMensaje_recibido extends PolymerTemplate<VistaMensaje_recibido.VistaMensaje_recibidoModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("span")
	private Span span;
	@Id("span1")
	private Span span1;
	@Id("span2")
	private Span span2;

	/**
     * Creates a new VistaMensaje_recibido.
     */
    public VistaMensaje_recibido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMensaje_recibido and vista-mensaje_recibido
     */
    public interface VistaMensaje_recibidoModel extends TemplateModel {
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
