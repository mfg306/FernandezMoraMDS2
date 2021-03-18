package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-vercategorias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercategorias")
@JsModule("./src/vista-vercategorias.js")
public class VistaVercategorias extends PolymerTemplate<VistaVercategorias.VistaVercategoriasModel> {

    /**
     * Creates a new VistaVercategorias.
     */
    public VistaVercategorias() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVercategorias and vista-vercategorias
     */
    public interface VistaVercategoriasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
