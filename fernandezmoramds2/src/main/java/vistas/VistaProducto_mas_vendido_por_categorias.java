package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-producto_mas_vendido_por_categorias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productomasvendidoporcategorias")
@JsModule("./src/vista-productomasvendidoporcategorias.js")
public class VistaProducto_mas_vendido_por_categorias extends PolymerTemplate<VistaProducto_mas_vendido_por_categorias.VistaProducto_mas_vendido_por_categoriasModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("imagen_producto")
	private Image imagen_producto;

	/**
     * Creates a new VistaProducto_mas_vendido_por_categorias.
     */
    public VistaProducto_mas_vendido_por_categorias() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProducto_mas_vendido_por_categorias and vista-producto_mas_vendido_por_categorias
     */
    public interface VistaProducto_mas_vendido_por_categoriasModel extends TemplateModel {
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
}
