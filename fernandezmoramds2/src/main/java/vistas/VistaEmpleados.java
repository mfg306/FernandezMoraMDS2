package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-empleados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-empleados")
@JsModule("./src/vista-empleados.js")
public class VistaEmpleados extends PolymerTemplate<VistaEmpleados.VistaEmpleadosModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("paginaActual")
	private Span paginaActual;
	@Id("de")
	private Span de;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("totalPaginas")
	private Span totalPaginas;
	@Id("botonSiguientes")
	private Button botonSiguientes;
	@Id("botonAnteriores")
	private Button botonAnteriores;
	@Id("huecoEmpleados")
	private Element huecoEmpleados;

	/**
     * Creates a new VistaEmpleados.
     */
    public VistaEmpleados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmpleados and vista-empleados
     */
    public interface VistaEmpleadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Span getPaginaActual() {
		return paginaActual;
	}

	public void setPaginaActual(Span paginaActual) {
		this.paginaActual = paginaActual;
	}

	public Span getDe() {
		return de;
	}

	public void setDe(Span de) {
		this.de = de;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Span getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(Span totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public Button getBotonSiguientes() {
		return botonSiguientes;
	}

	public void setBotonSiguientes(Button botonSiguientes) {
		this.botonSiguientes = botonSiguientes;
	}

	public Button getBotonAnteriores() {
		return botonAnteriores;
	}

	public void setBotonAnteriores(Button botonAnteriores) {
		this.botonAnteriores = botonAnteriores;
	}

	public Element getHuecoEmpleados() {
		return huecoEmpleados;
	}

	public void setHuecoEmpleados(Element huecoEmpleados) {
		this.huecoEmpleados = huecoEmpleados;
	}
}
