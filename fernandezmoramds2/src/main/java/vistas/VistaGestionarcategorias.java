package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.button.Button;
import vistas.VistaCategorias_administrador;

/**
 * A Designer generated component for the vista-gestionarcategorias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-gestionarcategorias")
@JsModule("./src/vista-gestionarcategorias.js")
public class VistaGestionarcategorias extends PolymerTemplate<VistaGestionarcategorias.VistaGestionarcategoriasModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("titulo")
	private H1 titulo;
	@Id("botonNuevaCategoria")
	private Button botonNuevaCategoria;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vistaCategoriasadministrador")
	private VistaCategorias_administrador vistaCategoriasadministrador;

	/**
     * Creates a new VistaGestionarcategorias.
     */
    public VistaGestionarcategorias() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaGestionarcategorias and vista-gestionarcategorias
     */
    public interface VistaGestionarcategoriasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public H1 getTitulo() {
		return titulo;
	}

	public void setTitulo(H1 titulo) {
		this.titulo = titulo;
	}

	public Button getBotonNuevaCategoria() {
		return botonNuevaCategoria;
	}

	public void setBotonNuevaCategoria(Button botonNuevaCategoria) {
		this.botonNuevaCategoria = botonNuevaCategoria;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public VistaCategorias_administrador getVistaCategoriasadministrador() {
		return vistaCategoriasadministrador;
	}

	public void setVistaCategoriasadministrador(VistaCategorias_administrador vistaCategoriasadministrador) {
		this.vistaCategoriasadministrador = vistaCategoriasadministrador;
	}
}
