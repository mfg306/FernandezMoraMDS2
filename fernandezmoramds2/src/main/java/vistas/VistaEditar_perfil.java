package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-editar_perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editarperfil")
@JsModule("./src/vista-editarperfil.js")
public class VistaEditar_perfil extends PolymerTemplate<VistaEditar_perfil.VistaEditar_perfilModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("span")
	private Span span;
	@Id("img")
	private Image img;
	@Id("editar_imagen_perfil")
	private Button editar_imagen_perfil;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("span1")
	private Span span1;
	@Id("nombre_usuario")
	private TextField nombre_usuario;
	@Id("nombre")
	private TextField nombre;
	@Id("correo_electronico")
	private TextField correo_electronico;
	@Id("direccion_envio")
	private TextField direccion_envio;
	@Id("metodo_pago")
	private TextField metodo_pago;
	@Id("apellidos")
	private TextField apellidos;
	@Id("boton_cambiar_contrasenia")
	private Button boton_cambiar_contrasenia;
	@Id("boton_guardar")
	private Button boton_guardar;
	@Id("span2")
	private Span span2;
	@Id("boton_eliminar_cuenta")
	private Button boton_eliminar_cuenta;

	/**
     * Creates a new VistaEditar_perfil.
     */
    public VistaEditar_perfil() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEditar_perfil and vista-editar_perfil
     */
    public interface VistaEditar_perfilModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public Button getEditar_imagen_perfil() {
		return editar_imagen_perfil;
	}

	public void setEditar_imagen_perfil(Button editar_imagen_perfil) {
		this.editar_imagen_perfil = editar_imagen_perfil;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Span getSpan1() {
		return span1;
	}

	public void setSpan1(Span span1) {
		this.span1 = span1;
	}

	public TextField getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(TextField nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public TextField getNombre() {
		return nombre;
	}

	public void setNombre(TextField nombre) {
		this.nombre = nombre;
	}

	public TextField getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(TextField correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public TextField getDireccion_envio() {
		return direccion_envio;
	}

	public void setDireccion_envio(TextField direccion_envio) {
		this.direccion_envio = direccion_envio;
	}

	public TextField getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(TextField metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	public TextField getApellidos() {
		return apellidos;
	}

	public void setApellidos(TextField apellidos) {
		this.apellidos = apellidos;
	}

	public Button getBoton_cambiar_contrasenia() {
		return boton_cambiar_contrasenia;
	}

	public void setBoton_cambiar_contrasenia(Button boton_cambiar_contrasenia) {
		this.boton_cambiar_contrasenia = boton_cambiar_contrasenia;
	}

	public Button getBoton_guardar() {
		return boton_guardar;
	}

	public void setBoton_guardar(Button boton_guardar) {
		this.boton_guardar = boton_guardar;
	}

	public Span getSpan2() {
		return span2;
	}

	public void setSpan2(Span span2) {
		this.span2 = span2;
	}

	public Button getBoton_eliminar_cuenta() {
		return boton_eliminar_cuenta;
	}

	public void setBoton_eliminar_cuenta(Button boton_eliminar_cuenta) {
		this.boton_eliminar_cuenta = boton_eliminar_cuenta;
	}
}
