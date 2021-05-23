package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;

/**
 * A Designer generated component for the vista-productos_categoria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productoscategoria")
@JsModule("./src/vista-productoscategoria.js")
public class VistaProductos_categoria extends PolymerTemplate<VistaProductos_categoria.VistaProductos_categoriaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("lista_productos_categoria")
	private HorizontalLayout lista_productos_categoria;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("boton_pagina_anterior")
	private Button boton_pagina_anterior;
	@Id("numero_pagina")
	private Span numero_pagina;
	@Id("boton_pagina_siguiente")
	private Button boton_pagina_siguiente;
	@Id("verProductoCategoria")
	private Element verProductoCategoria;
	@Id("ultimaPagina")
	private Span ultimaPagina;
	@Id("primeraPagina")
	private Span primeraPagina;
	@Id("span")
	private Span span;

	/**
     * Creates a new VistaProductos_categoria.
     */
    public VistaProductos_categoria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductos_categoria and vista-productos_categoria
     */
    public interface VistaProductos_categoriaModel extends TemplateModel {
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

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getBoton_pagina_anterior() {
		return boton_pagina_anterior;
	}

	public void setBoton_pagina_anterior(Button boton_pagina_anterior) {
		this.boton_pagina_anterior = boton_pagina_anterior;
	}

	public Span getNumero_pagina() {
		return numero_pagina;
	}

	public void setNumero_pagina(Span numero_pagina) {
		this.numero_pagina = numero_pagina;
	}

	public Button getBoton_pagina_siguiente() {
		return boton_pagina_siguiente;
	}

	public void setBoton_pagina_siguiente(Button boton_pagina_siguiente) {
		this.boton_pagina_siguiente = boton_pagina_siguiente;
	}

	public Element getVerProductoCategoria() {
		return verProductoCategoria;
	}

	public void setVerProductoCategoria(Element verProductoCategoria) {
		this.verProductoCategoria = verProductoCategoria;
	}

	public Span getUltimaPagina() {
		return ultimaPagina;
	}

	public void setUltimaPagina(Span ultimaPagina) {
		this.ultimaPagina = ultimaPagina;
	}

	public Span getPrimeraPagina() {
		return primeraPagina;
	}

	public void setPrimeraPagina(Span primeraPagina) {
		this.primeraPagina = primeraPagina;
	}

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}
}
