package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-crear_producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crearproducto")
@JsModule("./src/vista-crearproducto.js")
public class VistaCrear_producto extends PolymerTemplate<VistaCrear_producto.VistaCrear_productoModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("nombreProducto")
	private TextField nombreProducto;
	@Id("precio")
	private TextField precio;
	@Id("añadeUnaDescripciónAlProducto")
	private TextArea añadeUnaDescripciónAlProducto;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("vaadinButton2")
	private Button vaadinButton2;
	@Id("cantidadProducto")
	private TextField cantidadProducto;
	@Id("huecoUpload")
	private Element huecoUpload;
	@Id("fotoProducto")
	private Image fotoProducto;

	/**
     * Creates a new VistaCrear_producto.
     */
    public VistaCrear_producto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCrear_producto and vista-crear_producto
     */
    public interface VistaCrear_productoModel extends TemplateModel {
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

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public TextField getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(TextField nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public TextField getPrecio() {
		return precio;
	}

	public void setPrecio(TextField precio) {
		this.precio = precio;
	}

	public TextArea getAñadeUnaDescripciónAlProducto() {
		return añadeUnaDescripciónAlProducto;
	}

	public void setAñadeUnaDescripciónAlProducto(TextArea añadeUnaDescripciónAlProducto) {
		this.añadeUnaDescripciónAlProducto = añadeUnaDescripciónAlProducto;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}

	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}

	public Button getVaadinButton1() {
		return vaadinButton1;
	}

	public void setVaadinButton1(Button vaadinButton1) {
		this.vaadinButton1 = vaadinButton1;
	}

	public Button getVaadinButton2() {
		return vaadinButton2;
	}

	public void setVaadinButton2(Button vaadinButton2) {
		this.vaadinButton2 = vaadinButton2;
	}

	public TextField getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(TextField cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public Element getHuecoUpload() {
		return huecoUpload;
	}

	public void setHuecoUpload(Element huecoUpload) {
		this.huecoUpload = huecoUpload;
	}

	public Image getFotoProducto() {
		return fotoProducto;
	}

	public void setFotoProducto(Image fotoProducto) {
		this.fotoProducto = fotoProducto;
	}

}
