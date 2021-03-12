package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;

/**
 * A Designer generated component for the vista-ver_pedidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verpedidos")
@JsModule("./src/vista-verpedidos.js")
public class VistaVer_pedidos extends PolymerTemplate<VistaVer_pedidos.VistaVer_pedidosModel> {

    @Id("menu")
	private Element menu;
	@Id("vistaMenu_urunr")
	private Element vistaMenu_urunr;
	@Id("div")
	private Div div;
	@Id("span")
	private Span span;
	@Id("lista_pedidos")
	private Element lista_pedidos;

	/**
     * Creates a new VistaVer_pedidos.
     */
    public VistaVer_pedidos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVer_pedidos and vista-ver_pedidos
     */
    public interface VistaVer_pedidosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getMenu() {
		return menu;
	}

	public void setMenu(Element menu) {
		this.menu = menu;
	}

	public Element getVistaMenu_urunr() {
		return vistaMenu_urunr;
	}

	public void setVistaMenu_urunr(Element vistaMenu_urunr) {
		this.vistaMenu_urunr = vistaMenu_urunr;
	}

	public Div getDiv() {
		return div;
	}

	public void setDiv(Div div) {
		this.div = div;
	}

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}

	public Element getLista_pedidos() {
		return lista_pedidos;
	}

	public void setLista_pedidos(Element lista_pedidos) {
		this.lista_pedidos = lista_pedidos;
	}
}
