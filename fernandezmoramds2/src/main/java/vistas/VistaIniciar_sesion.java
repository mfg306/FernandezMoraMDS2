package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the vista-iniciar_sesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciarsesion")
@JsModule("./src/vista-iniciarsesion.js")
public class VistaIniciar_sesion extends PolymerTemplate<VistaIniciar_sesion.VistaIniciar_sesionModel> {

    @Id("enlace_registrarse")
	private Element enlace_registrarse;
	@Id("boton_iniciar_sesion_facebook")
	private Button boton_iniciar_sesion_facebook;
	@Id("boton_iniciar_sesion_google")
	private Button boton_iniciar_sesion_google;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("boton_iniciar_sesion")
	private Button boton_iniciar_sesion;
	@Id("enlace_recuperar_contrasenia")
	private Element enlace_recuperar_contrasenia;
	@Id("contrasenia")
	private TextField contrasenia;
	@Id("nombre_usuario")
	private TextField nombre_usuario;
	@Id("correo")
	private TextField correo;
	@Id("span")
	private Span span;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("BotonPrueba")
	private Button botonPrueba;


	/**
     * Creates a new VistaIniciar_sesion.
     */
    public VistaIniciar_sesion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaIniciar_sesion and vista-iniciar_sesion
     */
    public interface VistaIniciar_sesionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getEnlace_registrarse() {
		return enlace_registrarse;
	}

	public void setEnlace_registrarse(Element enlace_registrarse) {
		this.enlace_registrarse = enlace_registrarse;
	}

	public Button getBoton_iniciar_sesion_facebook() {
		return boton_iniciar_sesion_facebook;
	}

	public void setBoton_iniciar_sesion_facebook(Button boton_iniciar_sesion_facebook) {
		this.boton_iniciar_sesion_facebook = boton_iniciar_sesion_facebook;
	}

	public Button getBoton_iniciar_sesion_google() {
		return boton_iniciar_sesion_google;
	}

	public void setBoton_iniciar_sesion_google(Button boton_iniciar_sesion_google) {
		this.boton_iniciar_sesion_google = boton_iniciar_sesion_google;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getBoton_iniciar_sesion() {
		return boton_iniciar_sesion;
	}

	public void setBoton_iniciar_sesion(Button boton_iniciar_sesion) {
		this.boton_iniciar_sesion = boton_iniciar_sesion;
	}

	public Element getEnlace_recuperar_contrasenia() {
		return enlace_recuperar_contrasenia;
	}

	public void setEnlace_recuperar_contrasenia(Element enlace_recuperar_contrasenia) {
		this.enlace_recuperar_contrasenia = enlace_recuperar_contrasenia;
	}

	public TextField getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(TextField contrasenia) {
		this.contrasenia = contrasenia;
	}

	public TextField getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(TextField nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public TextField getCorreo() {
		return correo;
	}

	public void setCorreo(TextField correo) {
		this.correo = correo;
	}

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

}
