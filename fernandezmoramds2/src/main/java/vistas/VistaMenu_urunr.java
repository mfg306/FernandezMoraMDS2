package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-menu_urunr template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-menuurunr")
@JsModule("./src/vista-menuurunr.js")
public class VistaMenu_urunr extends PolymerTemplate<VistaMenu_urunr.VistaMenu_urunrModel> {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("logo_tienda")
	private Image logo_tienda;
	@Id("clasificar_categoria")
	private Select clasificar_categoria;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("vaadinItem1")
	private Element vaadinItem1;
	@Id("vaadinItem2")
	private Element vaadinItem2;
	@Id("buscador_productos")
	private Element buscador_productos;
	@Id("datos_cuenta")
	private Select datos_cuenta;
	@Id("vaadinListBox1")
	private Element vaadinListBox1;
	@Id("vaadinItem3")
	private Element vaadinItem3;
	@Id("vaadinItem4")
	private Element vaadinItem4;
	@Id("vaadinItem5")
	private Element vaadinItem5;
	@Id("vaadinItem6")
	private Element vaadinItem6;
	@Id("vaadinItem7")
	private Element vaadinItem7;
	@Id("boton_iniciar_sesion")
	private Button boton_iniciar_sesion;
	@Id("boton_carrito")
	private Button boton_carrito;
	@Id("menu")
	private Element menu;
	

	/**
     * Creates a new VistaMenu_urunr.
     */
    public VistaMenu_urunr() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMenu_urunr and vista-menu_urunr
     */
    public interface VistaMenu_urunrModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getMenu() {
		return menu;
	}

	public void setMenu(Element menu) {
		this.menu = menu;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Image getLogo_tienda() {
		return logo_tienda;
	}

	public void setLogo_tienda(Image logo_tienda) {
		this.logo_tienda = logo_tienda;
	}

	public Select getClasificar_categoria() {
		return clasificar_categoria;
	}

	public void setClasificar_categoria(Select clasificar_categoria) {
		this.clasificar_categoria = clasificar_categoria;
	}

	public Element getVaadinListBox() {
		return vaadinListBox;
	}

	public void setVaadinListBox(Element vaadinListBox) {
		this.vaadinListBox = vaadinListBox;
	}

	public Element getVaadinItem() {
		return vaadinItem;
	}

	public void setVaadinItem(Element vaadinItem) {
		this.vaadinItem = vaadinItem;
	}

	public Element getVaadinItem1() {
		return vaadinItem1;
	}

	public void setVaadinItem1(Element vaadinItem1) {
		this.vaadinItem1 = vaadinItem1;
	}

	public Element getVaadinItem2() {
		return vaadinItem2;
	}

	public void setVaadinItem2(Element vaadinItem2) {
		this.vaadinItem2 = vaadinItem2;
	}

	public Element getBuscador_productos() {
		return buscador_productos;
	}

	public void setBuscador_productos(Element buscador_productos) {
		this.buscador_productos = buscador_productos;
	}

	public Select getDatos_cuenta() {
		return datos_cuenta;
	}

	public void setDatos_cuenta(Select datos_cuenta) {
		this.datos_cuenta = datos_cuenta;
	}

	public Element getVaadinListBox1() {
		return vaadinListBox1;
	}

	public void setVaadinListBox1(Element vaadinListBox1) {
		this.vaadinListBox1 = vaadinListBox1;
	}

	public Element getVaadinItem3() {
		return vaadinItem3;
	}

	public void setVaadinItem3(Element vaadinItem3) {
		this.vaadinItem3 = vaadinItem3;
	}

	public Element getVaadinItem4() {
		return vaadinItem4;
	}

	public void setVaadinItem4(Element vaadinItem4) {
		this.vaadinItem4 = vaadinItem4;
	}

	public Element getVaadinItem5() {
		return vaadinItem5;
	}

	public void setVaadinItem5(Element vaadinItem5) {
		this.vaadinItem5 = vaadinItem5;
	}

	public Element getVaadinItem6() {
		return vaadinItem6;
	}

	public void setVaadinItem6(Element vaadinItem6) {
		this.vaadinItem6 = vaadinItem6;
	}

	public Element getVaadinItem7() {
		return vaadinItem7;
	}

	public void setVaadinItem7(Element vaadinItem7) {
		this.vaadinItem7 = vaadinItem7;
	}

	public Button getBoton_iniciar_sesion() {
		return boton_iniciar_sesion;
	}

	public void setBoton_iniciar_sesion(Button boton_iniciar_sesion) {
		this.boton_iniciar_sesion = boton_iniciar_sesion;
	}

	public Button getBoton_carrito() {
		return boton_carrito;
	}

	public void setBoton_carrito(Button boton_carrito) {
		this.boton_carrito = boton_carrito;
	}
}
