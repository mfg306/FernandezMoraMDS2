package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-editar_producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editarproducto")
@JsModule("./src/vista-editarproducto.js")
public class VistaEditar_producto extends PolymerTemplate<VistaEditar_producto.VistaEditar_productoModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("añadeUnaNuevaDescripción")
	private TextArea añadeUnaNuevaDescripción;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("nuevoNombreProducto")
	private TextField nuevoNombreProducto;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("nuevoPrecio")
	private TextField nuevoPrecio;
	@Id("label")
	private Label label;
	@Id("h2")
	private H2 h2;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("vaadinButton")
	private Button vaadinButton;

	/**
     * Creates a new VistaEditar_producto.
     */
    public VistaEditar_producto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEditar_producto and vista-editar_producto
     */
    public interface VistaEditar_productoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public TextArea getAñadeUnaNuevaDescripción() {
		return añadeUnaNuevaDescripción;
	}

	public void setAñadeUnaNuevaDescripción(TextArea añadeUnaNuevaDescripción) {
		this.añadeUnaNuevaDescripción = añadeUnaNuevaDescripción;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public TextField getNuevoNombreProducto() {
		return nuevoNombreProducto;
	}

	public void setNuevoNombreProducto(TextField nuevoNombreProducto) {
		this.nuevoNombreProducto = nuevoNombreProducto;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public TextField getNuevoPrecio() {
		return nuevoPrecio;
	}

	public void setNuevoPrecio(TextField nuevoPrecio) {
		this.nuevoPrecio = nuevoPrecio;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public H2 getH2() {
		return h2;
	}

	public void setH2(H2 h2) {
		this.h2 = h2;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Button getVaadinButton1() {
		return vaadinButton1;
	}

	public void setVaadinButton1(Button vaadinButton1) {
		this.vaadinButton1 = vaadinButton1;
	}
}
