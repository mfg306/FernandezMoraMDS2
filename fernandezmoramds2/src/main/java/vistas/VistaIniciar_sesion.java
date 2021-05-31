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
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-iniciar_sesion template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-iniciarsesion")
@JsModule("./src/vista-iniciarsesion.js")
public class VistaIniciar_sesion extends PolymerTemplate<VistaIniciar_sesion.VistaIniciar_sesionModel> {


	@Id("nombre_usuario")
	private TextField nombre_usuario;
	@Id("correo")
	private TextField correo;
	@Id("span")
	private Span span;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("botonOlvidarContraseña")
	private Button vaadinButton1;
	@Id("botonRegistrarse")
	private Button botonRegistrarse;
	@Id("contrasenia")
	private PasswordField contrasenia;
	@Id("boton_iniciar_sesion")
	private Button boton_iniciar_sesion;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("enlaceEmpleados")
	private Button enlaceEmpleados;
	@Id("boton_iniciar_sesion_empleados")
	private Button boton_iniciar_sesion_empleados;
	@Id("img")
	private Image img;
	/**
	 * Creates a new VistaIniciar_sesion.
	 */
	public VistaIniciar_sesion() {
		// You can initialise any data required for the connected UI components here.
	}

	/**
	 * This model binds properties between VistaIniciar_sesion and
	 * vista-iniciar_sesion
	 */
	public interface VistaIniciar_sesionModel extends TemplateModel {
		// Add setters and getters for template properties here.
	}

	public Button getBoton_iniciar_sesion() {
		return boton_iniciar_sesion;
	}

	public void setBoton_iniciar_sesion(Button boton_iniciar_sesion) {
		this.boton_iniciar_sesion = boton_iniciar_sesion;
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

	public Button getBotonRegistrarse() {
		return botonRegistrarse;
	}

	public void setBotonRegistrarse(Button botonRegistrarse) {
		this.botonRegistrarse = botonRegistrarse;
	}

	public Button getVaadinButton1() {
		return vaadinButton1;
	}

	public void setVaadinButton1(Button vaadinButton1) {
		this.vaadinButton1 = vaadinButton1;
	}

	public PasswordField getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(PasswordField contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getEnlaceEmpleados() {
		return enlaceEmpleados;
	}

	public void setEnlaceEmpleados(Button enlaceEmpleados) {
		this.enlaceEmpleados = enlaceEmpleados;
	}

	public Button getBoton_iniciar_sesion_empleados() {
		return boton_iniciar_sesion_empleados;
	}

	public void setBoton_iniciar_sesion_empleados(Button boton_iniciar_sesion_empleados) {
		this.boton_iniciar_sesion_empleados = boton_iniciar_sesion_empleados;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}


}
