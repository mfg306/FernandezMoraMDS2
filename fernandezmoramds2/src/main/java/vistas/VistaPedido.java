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
	@Id("imagen_pedido")
	private Image imagen_pedido;
	@Id("caracteristicas_pedido")
	private Element caracteristicas_pedido;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("vaadinItem1")
	private Element vaadinItem1;
	@Id("hr")
	private Hr hr;
	@Id("vaadinItem2")
	private Element vaadinItem2;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinItem3")
	private Element vaadinItem3;
	@Id("estado_pedido")
	private Span estado_pedido;
	@Id("boton_cancelar_pedido")
	private Button boton_cancelar_pedido;
	@Id("span")
	private Span span;
	@Id("valoracion_pedido")
	private Select valoracion_pedido;
	@Id("vaadinItem4")
	private Element vaadinItem4;
	@Id("vaadinItem5")
	private Element vaadinItem5;
	@Id("vaadinItem6")
	private Element vaadinItem6;
	@Id("vaadinItem7")
	private Element vaadinItem7;
	@Id("vaadinItem8")
	private Element vaadinItem8;
	@Id("vaadinItem9")
	private Element vaadinItem9;

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

	public Image getImagen_pedido() {
		return imagen_pedido;
	}

	public void setImagen_pedido(Image imagen_pedido) {
		this.imagen_pedido = imagen_pedido;
	}

	public Element getCaracteristicas_pedido() {
		return caracteristicas_pedido;
	}

	public void setCaracteristicas_pedido(Element caracteristicas_pedido) {
		this.caracteristicas_pedido = caracteristicas_pedido;
	}

	public Element getVaadinItem() {
		return vaadinItem;
	}

	public void setVaadinItem(Element vaadinItem) {
		this.vaadinItem = vaadinItem;
	}

	public Element getVaadinItem1() {
		return vaadinItem1;
	}

	public void setVaadinItem1(Element vaadinItem1) {
		this.vaadinItem1 = vaadinItem1;
	}

	public Hr getHr() {
		return hr;
	}

	public void setHr(Hr hr) {
		this.hr = hr;
	}

	public Element getVaadinItem2() {
		return vaadinItem2;
	}

	public void setVaadinItem2(Element vaadinItem2) {
		this.vaadinItem2 = vaadinItem2;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getVaadinItem3() {
		return vaadinItem3;
	}

	public void setVaadinItem3(Element vaadinItem3) {
		this.vaadinItem3 = vaadinItem3;
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

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}

	public Select getValoracion_pedido() {
		return valoracion_pedido;
	}

	public void setValoracion_pedido(Select valoracion_pedido) {
		this.valoracion_pedido = valoracion_pedido;
	}

	public Element getVaadinItem4() {
		return vaadinItem4;
	}

	public void setVaadinItem4(Element vaadinItem4) {
		this.vaadinItem4 = vaadinItem4;
	}

	public Element getVaadinItem5() {
		return vaadinItem5;
	}

	public void setVaadinItem5(Element vaadinItem5) {
		this.vaadinItem5 = vaadinItem5;
	}

	public Element getVaadinItem6() {
		return vaadinItem6;
	}

	public void setVaadinItem6(Element vaadinItem6) {
		this.vaadinItem6 = vaadinItem6;
	}

	public Element getVaadinItem7() {
		return vaadinItem7;
	}

	public void setVaadinItem7(Element vaadinItem7) {
		this.vaadinItem7 = vaadinItem7;
	}

	public Element getVaadinItem8() {
		return vaadinItem8;
	}

	public void setVaadinItem8(Element vaadinItem8) {
		this.vaadinItem8 = vaadinItem8;
	}

	public Element getVaadinItem9() {
		return vaadinItem9;
	}

	public void setVaadinItem9(Element vaadinItem9) {
		this.vaadinItem9 = vaadinItem9;
	}
}
