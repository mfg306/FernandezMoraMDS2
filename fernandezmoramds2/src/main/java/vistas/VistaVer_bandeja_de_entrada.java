package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-ver_bandeja_de_entrada template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verbandejadeentrada")
@JsModule("./src/vista-verbandejadeentrada.js")
public class VistaVer_bandeja_de_entrada extends PolymerTemplate<VistaVer_bandeja_de_entrada.VistaVer_bandeja_de_entradaModel> {

    @Id("span")
	private Span span;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("boton_enviados")
	private Button boton_enviados;
	@Id("boton_recibidos")
	private Button boton_recibidos;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	
	/*Menu*/
	@Id("logo")
	private Image logo;
	@Id("correo")
	private Button correo;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("cerrar_sesion")
	private Button cerrar_sesion;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("huecoMensajes")
	private Element huecoMensajes;

	/**
     * Creates a new VistaVer_bandeja_de_entrada.
     */
    public VistaVer_bandeja_de_entrada() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVer_bandeja_de_entrada and vista-ver_bandeja_de_entrada
     */
    public interface VistaVer_bandeja_de_entradaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}


	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Button getBoton_enviados() {
		return boton_enviados;
	}

	public void setBoton_enviados(Button boton_enviados) {
		this.boton_enviados = boton_enviados;
	}

	public Button getBoton_recibidos() {
		return boton_recibidos;
	}

	public void setBoton_recibidos(Button boton_recibidos) {
		this.boton_recibidos = boton_recibidos;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Image getLogo() {
		return logo;
	}

	public void setLogo(Image logo) {
		this.logo = logo;
	}

	public Button getCorreo() {
		return correo;
	}

	public void setCorreo(Button correo) {
		this.correo = correo;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Button getCerrar_sesion() {
		return cerrar_sesion;
	}

	public void setCerrar_sesion(Button cerrar_sesion) {
		this.cerrar_sesion = cerrar_sesion;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getHuecoMensajes() {
		return huecoMensajes;
	}

	public void setHuecoMensajes(Element huecoMensajes) {
		this.huecoMensajes = huecoMensajes;
	}

}
