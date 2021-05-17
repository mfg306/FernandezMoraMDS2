package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-productos_busqueda template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productosbusqueda")
@JsModule("./src/vista-productosbusqueda.js")
public class VistaProductos_busqueda extends PolymerTemplate<VistaProductos_busqueda.VistaProductos_busquedaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("numero_pagina")
	private Span numero_pagina;
	@Id("boton_pagina_anterior")
	private Button boton_pagina_anterior;
	@Id("boton_pagina_siguiente")
	private Button boton_pagina_siguiente;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;

	/**
     * Creates a new VistaProductos_busqueda.
     */
    public VistaProductos_busqueda() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductos_busqueda and vista-productos_busqueda
     */
    public interface VistaProductos_busquedaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Span getNumero_pagina() {
		return numero_pagina;
	}

	public void setNumero_pagina(Span numero_pagina) {
		this.numero_pagina = numero_pagina;
	}

	public Button getBoton_pagina_anterior() {
		return boton_pagina_anterior;
	}

	public void setBoton_pagina_anterior(Button boton_pagina_anterior) {
		this.boton_pagina_anterior = boton_pagina_anterior;
	}

	public Button getBoton_pagina_siguiente() {
		return boton_pagina_siguiente;
	}

	public void setBoton_pagina_siguiente(Button boton_pagina_siguiente) {
		this.boton_pagina_siguiente = boton_pagina_siguiente;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}
}
