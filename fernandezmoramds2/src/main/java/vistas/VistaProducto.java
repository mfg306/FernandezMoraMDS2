package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-producto template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-producto")
@JsModule("./src/vista-producto.js")
public class VistaProducto extends PolymerTemplate<VistaProducto.VistaProductoModel> {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("nombre_producto")
	private Span nombre_producto;
	@Id("boton_anadir_carrito")
	private Button boton_anadir_carrito;
	@Id("img")
	private Image img;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("img1")
	private Image img1;
	@Id("img2")
	private Image img2;
	@Id("img3")
	private Image img3;
	@Id("img4")
	private Image img4;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("dejar_comentario")
	private TextField dejar_comentario;
	@Id("enviar_comentario")
	private Button enviar_comentario;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("etiqueta_descripcion")
	private Span etiqueta_descripcion;
	@Id("precio")
	private Span precio;
	@Id("caracteristicas_producto")
	private Element caracteristicas_producto;
	@Id("vaadinItem6")
	private Element vaadinItem6;
	@Id("vaadinVerticalLayout5")
	private Element vaadinVerticalLayout5;
	@Id("span")
	private Span span;
	@Id("valoracion_media")
	private Span valoracion_media;
	@Id("valorarProducto")
	private Element valorarProducto;
	@Id("listaComentarios")
	private Element listaComentarios;
	@Id("precioRebajado")
	private Span precioRebajado;
	/**
	 * Creates a new VistaProducto.
	 */
	public VistaProducto() {
		// You can initialise any data required for the connected UI components here.
	}

	/**
	 * This model binds properties between VistaProducto and vista-producto
	 */
	public interface VistaProductoModel extends TemplateModel {
		// Add setters and getters for template properties here.
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
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

	public Span getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(Span nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public Button getBoton_anadir_carrito() {
		return boton_anadir_carrito;
	}

	public void setBoton_anadir_carrito(Button boton_anadir_carrito) {
		this.boton_anadir_carrito = boton_anadir_carrito;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public Image getImg1() {
		return img1;
	}

	public void setImg1(Image img1) {
		this.img1 = img1;
	}

	public Image getImg2() {
		return img2;
	}

	public void setImg2(Image img2) {
		this.img2 = img2;
	}

	public Image getImg3() {
		return img3;
	}

	public void setImg3(Image img3) {
		this.img3 = img3;
	}

	public Image getImg4() {
		return img4;
	}

	public void setImg4(Image img4) {
		this.img4 = img4;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public TextField getDejar_comentario() {
		return dejar_comentario;
	}

	public void setDejar_comentario(TextField dejar_comentario) {
		this.dejar_comentario = dejar_comentario;
	}

	public Button getEnviar_comentario() {
		return enviar_comentario;
	}

	public void setEnviar_comentario(Button enviar_comentario) {
		this.enviar_comentario = enviar_comentario;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}

	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}

	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}

	public Span getEtiqueta_descripcion() {
		return etiqueta_descripcion;
	}

	public void setEtiqueta_descripcion(Span etiqueta_descripcion) {
		this.etiqueta_descripcion = etiqueta_descripcion;
	}

	public Span getPrecio() {
		return precio;
	}

	public void setPrecio(Span precio) {
		this.precio = precio;
	}

	public Element getCaracteristicas_producto() {
		return caracteristicas_producto;
	}

	public void setCaracteristicas_producto(Element caracteristicas_producto) {
		this.caracteristicas_producto = caracteristicas_producto;
	}

	public Element getVaadinItem6() {
		return vaadinItem6;
	}

	public void setVaadinItem6(Element vaadinItem6) {
		this.vaadinItem6 = vaadinItem6;
	}


	public Element getVaadinVerticalLayout5() {
		return vaadinVerticalLayout5;
	}

	public void setVaadinVerticalLayout5(Element vaadinVerticalLayout5) {
		this.vaadinVerticalLayout5 = vaadinVerticalLayout5;
	}

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}

	public Span getValoracion_media() {
		return valoracion_media;
	}

	public void setValoracion_media(Span valoracion_media) {
		this.valoracion_media = valoracion_media;
	}

	public Element getValorarProducto() {
		return valorarProducto;
	}

	public void setValorarProducto(Element valorarProducto) {
		this.valorarProducto = valorarProducto;
	}


	public Element getListaComentarios() {
		return listaComentarios;
	}

	public void setListaComentarios(Element listaComentarios) {
		this.listaComentarios = listaComentarios;
	}

	public Span getPrecioRebajado() {
		return precioRebajado;
	}

	public void setPrecioRebajado(Span precioRebajado) {
		this.precioRebajado = precioRebajado;
	}

}
