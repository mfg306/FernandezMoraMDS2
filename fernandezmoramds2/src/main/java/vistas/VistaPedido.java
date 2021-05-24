package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-pedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pedido")
@JsModule("./src/vista-pedido.js")
public class VistaPedido extends PolymerTemplate<VistaPedido.VistaPedidoModel> {

	@Id("pedido")
	private Element pedido;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("estado_pedido")
	private Span estado_pedido;
	@Id("boton_cancelar_pedido")
	private Button boton_cancelar_pedido;
	@Id("codigo")
	private Span codigo;

	/**
     * Creates a new VistaPedido.
     */
    public VistaPedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPedido and vista-pedido
     */
    public interface VistaPedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getPedido() {
		return pedido;
	}

	public void setPedido(Element pedido) {
		this.pedido = pedido;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Span getEstado_pedido() {
		return estado_pedido;
	}

	public void setEstado_pedido(Span estado_pedido) {
		this.estado_pedido = estado_pedido;
	}

	public Button getBoton_cancelar_pedido() {
		return boton_cancelar_pedido;
	}

	public void setBoton_cancelar_pedido(Button boton_cancelar_pedido) {
		this.boton_cancelar_pedido = boton_cancelar_pedido;
	}
	
}
