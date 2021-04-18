package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the vista-registrarse template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registrarse")
@JsModule("./src/vista-registrarse.js")
public class VistaRegistrarse extends PolymerTemplate<VistaRegistrarse.VistaRegistrarseModel> {

    @Id("div")
	private Div div;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("span")
	private Span span;
	@Id("nombre")
	private TextField nombre;
	@Id("apellidos")
	private TextField apellidos;
	@Id("correo")
	private TextField correo;

	@Id("boton_registrarse")
	private Button boton_registrarse;
	@Id("botonIniciarSesion")
	private Button botonIniciarSesion;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("nombre_usuario")
	private TextField nombre_usuario;
	@Id("contrasenia")
	private PasswordField contrasenia;
	@Id("confirmacionContrasenia")
	private PasswordField confirmacionContrasenia;

	/**
     * Creates a new VistaRegistrarse.
     */
    public VistaRegistrarse() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaRegistrarse and vista-registrarse
     */
    public interface VistaRegistrarseModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Div getDiv() {
		return div;
	}

	public void setDiv(Div div) {
		this.div = div;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}

	public TextField getNombre() {
		return nombre;
	}

	public void setNombre(TextField nombre) {
		this.nombre = nombre;
	}

	public TextField getApellidos() {
		return apellidos;
	}

	public void setApellidos(TextField apellidos) {
		this.apellidos = apellidos;
	}

	public TextField getCorreo() {
		return correo;
	}

	public void setCorreo(TextField correo) {
		this.correo = correo;
	}

	public Button getBoton_registrarse() {
		return boton_registrarse;
	}

	public void setBoton_registrarse(Button boton_registrarse) {
		this.boton_registrarse = boton_registrarse;
	}

	public Button getBotonIniciarSesion() {
		return botonIniciarSesion;
	}

	public void setBotonIniciarSesion(Button botonIniciarSesion) {
		this.botonIniciarSesion = botonIniciarSesion;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public TextField getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(TextField nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public PasswordField getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(PasswordField contrasenia) {
		this.contrasenia = contrasenia;
	}

	public PasswordField getConfirmacionContrasenia() {
		return confirmacionContrasenia;
	}

	public void setConfirmacionContrasenia(PasswordField confirmacionContrasenia) {
		this.confirmacionContrasenia = confirmacionContrasenia;
	}
}
