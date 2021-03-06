package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;

import interfaz.Producto_carrito;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Span;

/**
 * A Designer generated component for the vista-producto_carrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */ 
@Tag("vista-productocarrito")
@JsModule("./src/vista-productocarrito.js")
public class VistaProducto_carrito extends PolymerTemplate<VistaProducto_carrito.VistaProducto_carritoModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("img")
	private Image img;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("checkEliminar")
	private Checkbox checkEliminar;
	@Id("precioProducto")
	private Span precioProducto;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("nombreProducto")
	private Span nombreProducto;


	/**
     * Creates a new VistaProducto_carrito.
     */
    public VistaProducto_carrito() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProducto_carrito and vista-producto_carrito
     */
    public interface VistaProducto_carritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Checkbox getCheckEliminar() {
		return checkEliminar;
	}

	public void setCheckEliminar(Checkbox checkEliminar) {
		this.checkEliminar = checkEliminar;
	}

	public Span getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(Span precioProducto) {
		this.precioProducto = precioProducto;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Span getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(Span nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
}
