package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H2;

/**
 * A Designer generated component for the vista-productos_mas_vendidos_por_categorias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productosmasvendidosporcategorias")
@JsModule("./src/vista-productosmasvendidosporcategorias.js")
public class VistaProductos_mas_vendidos_por_categorias extends PolymerTemplate<VistaProductos_mas_vendidos_por_categorias.VistaProductos_mas_vendidos_por_categoriasModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("lista_productos_categoria")
	private HorizontalLayout lista_productos_categoria;
	@Id("getTituloMasVendidos")
	private H2 getTituloMasVendidos;
	@Id("listaCategoriasMasVendidos")
	private Element listaCategoriasMasVendidos;
	
	/**
     * Creates a new VistaProductos_mas_vendidos_por_categorias.
     */
    public VistaProductos_mas_vendidos_por_categorias() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductos_mas_vendidos_por_categorias and vista-productos_mas_vendidos_por_categorias
     */
    public interface VistaProductos_mas_vendidos_por_categoriasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	

	public HorizontalLayout getLista_productos_categoria() {
		return lista_productos_categoria;
	}

	public void setLista_productos_categoria(HorizontalLayout lista_productos_categoria) {
		this.lista_productos_categoria = lista_productos_categoria;
	}

	public H2 getGetTituloMasVendidos() {
		return getTituloMasVendidos;
	}

	public void setGetTituloMasVendidos(H2 getTituloMasVendidos) {
		this.getTituloMasVendidos = getTituloMasVendidos;
	}

	public Element getListaCategoriasMasVendidos() {
		return listaCategoriasMasVendidos;
	}

	public void setListaCategoriasMasVendidos(Element listaCategoriasMasVendidos) {
		this.listaCategoriasMasVendidos = listaCategoriasMasVendidos;
	}

	
}
