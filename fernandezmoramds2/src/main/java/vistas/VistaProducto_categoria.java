package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-producto_categoria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productocategoria")
@JsModule("./src/vista-productocategoria.js")
public class VistaProducto_categoria extends PolymerTemplate<VistaProducto_categoria.VistaProducto_categoriaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("imagen_producto")
	private Image imagen_producto;
	@Id("nombre_producto")
	private Span nombre_producto;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("precio_producto")
	private Span precio_producto;
	@Id("precio_rebajado")
	private Span precio_rebajado;

	/**
     * Creates a new VistaProducto_categoria.
     */
    public VistaProducto_categoria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProducto_categoria and vista-producto_categoria
     */
    public interface VistaProducto_categoriaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Image getImagen_producto() {
		return imagen_producto;
	}

	public void setImagen_producto(Image imagen_producto) {
		this.imagen_producto = imagen_producto;
	}

	public Span getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(Span nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Span getPrecio_producto() {
		return precio_producto;
	}

	public void setPrecio_producto(Span precio_producto) {
		this.precio_producto = precio_producto;
	}

	public Span getPrecio_rebajado() {
		return precio_rebajado;
	}

	public void setPrecio_rebajado(Span precio_rebajado) {
		this.precio_rebajado = precio_rebajado;
	}

}
