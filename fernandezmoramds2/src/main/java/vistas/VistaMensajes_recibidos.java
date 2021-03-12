package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Span;

/**
 * A Designer generated component for the vista-mensajes_recibidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mensajesrecibidos")
@JsModule("./src/vista-mensajesrecibidos.js")
public class VistaMensajes_recibidos extends PolymerTemplate<VistaMensajes_recibidos.VistaMensajes_recibidosModel> {

    @Id("lista_mensajes_recibidos")
	private Element lista_mensajes_recibidos;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("boton_crear_mensaje")
	private Button boton_crear_mensaje;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("boton_pagina_anterior")
	private Button boton_pagina_anterior;
	@Id("numero_de_pagina")
	private Span numero_de_pagina;
	@Id("boton_pagina_siguiente")
	private Button boton_pagina_siguiente;
	/**
     * Creates a new VistaMensajes_recibidos.
     */
    public VistaMensajes_recibidos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMensajes_recibidos and vista-mensajes_recibidos
     */
    public interface VistaMensajes_recibidosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getLista_mensajes_recibidos() {
		return lista_mensajes_recibidos;
	}

	public void setLista_mensajes_recibidos(Element lista_mensajes_recibidos) {
		this.lista_mensajes_recibidos = lista_mensajes_recibidos;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getBoton_crear_mensaje() {
		return boton_crear_mensaje;
	}

	public void setBoton_crear_mensaje(Button boton_crear_mensaje) {
		this.boton_crear_mensaje = boton_crear_mensaje;
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

	public Span getNumero_de_pagina() {
		return numero_de_pagina;
	}

	public void setNumero_de_pagina(Span numero_de_pagina) {
		this.numero_de_pagina = numero_de_pagina;
	}

	public Button getBoton_pagina_siguiente() {
		return boton_pagina_siguiente;
	}

	public void setBoton_pagina_siguiente(Button boton_pagina_siguiente) {
		this.boton_pagina_siguiente = boton_pagina_siguiente;
	}
}
