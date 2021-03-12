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
 * A Designer generated component for the vista-productos_oferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productosoferta")
@JsModule("./src/vista-productosoferta.js")
public class VistaProductos_oferta extends PolymerTemplate<VistaProductos_oferta.VistaProductos_ofertaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("menu")
	private Element menu;
	@Id("lista_productos_oferta")
	private HorizontalLayout lista_productos_oferta;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("boton_pagina_anterior")
	private Button boton_pagina_anterior;
	@Id("numero_pagina")
	private Span numero_pagina;
	@Id("boton_pagina_siguiente")
	private Button boton_pagina_siguiente;

	/**
     * Creates a new VistaProductos_oferta.
     */
    public VistaProductos_oferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductos_oferta and vista-productos_oferta
     */
    public interface VistaProductos_ofertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getMenu() {
		return menu;
	}

	public void setMenu(Element menu) {
		this.menu = menu;
	}

	public HorizontalLayout getLista_productos_oferta() {
		return lista_productos_oferta;
	}

	public void setLista_productos_oferta(HorizontalLayout lista_productos_oferta) {
		this.lista_productos_oferta = lista_productos_oferta;
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
}
