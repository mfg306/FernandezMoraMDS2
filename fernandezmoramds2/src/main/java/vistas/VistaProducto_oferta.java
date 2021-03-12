package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Span;

/**
 * A Designer generated component for the vista-producto_oferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productooferta")
@JsModule("./src/vista-productooferta.js")
public class VistaProducto_oferta extends PolymerTemplate<VistaProducto_oferta.VistaProducto_ofertaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("imagen_producto")
	private Image imagen_producto;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("nombre_producto")
	private Span nombre_producto;
	@Id("precio_original")
	private Span precio_original;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("precio_rebajado")
	private Span precio_rebajado;

	/**
     * Creates a new VistaProducto_oferta.
     */
    public VistaProducto_oferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProducto_oferta and vista-producto_oferta
     */
    public interface VistaProducto_ofertaModel extends TemplateModel {
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

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Span getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(Span nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public Span getPrecio_original() {
		return precio_original;
	}

	public void setPrecio_original(Span precio_original) {
		this.precio_original = precio_original;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Span getPrecio_rebajado() {
		return precio_rebajado;
	}

	public void setPrecio_rebajado(Span precio_rebajado) {
		this.precio_rebajado = precio_rebajado;
	}
}
