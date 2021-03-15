package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaZona_productos;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-editar_categoria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editarcategoria")
@JsModule("./src/vista-editarcategoria.js")
public class VistaEditar_categoria extends PolymerTemplate<VistaEditar_categoria.VistaEditar_categoriaModel> {

	/**
     * Creates a new VistaEditar_categoria.
     */
    public VistaEditar_categoria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEditar_categoria and vista-editar_categoria
     */
    public interface VistaEditar_categoriaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	
}
