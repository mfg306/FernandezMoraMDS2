package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-administrar_productos_anadidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrarproductosanadidos")
@JsModule("./src/vista-administrarproductosanadidos.js")
public class VistaAdministrar_productos_anadidos extends PolymerTemplate<VistaAdministrar_productos_anadidos.VistaAdministrar_productos_anadidosModel> {


	@Id("vertical-layout_administrar_productos_anadidios")
	private Element verticalLayout_administrar_productos_anadidios;
	@Id("vaadinHorizontalLayout_administrador_productos_anadidos")
	private HorizontalLayout vaadinHorizontalLayout_administrador_productos_anadidos;
	@Id("vaadinVerticalLayout_zonaProductos")
	private Element vaadinVerticalLayout_zonaProductos;
	@Id("h2")
	private H2 h2;
	@Id("vaadinHorizontalLayout1_zonaProductos")
	private HorizontalLayout vaadinHorizontalLayout1_zonaProductos;
	@Id("vaadinVerticalLayout1_productos_anadidos")
	private Element vaadinVerticalLayout1_productos_anadidos;
	@Id("vaadinHorizontalLayout2_productos_anadidos")
	private HorizontalLayout vaadinHorizontalLayout2_productos_anadidos;
	@Id("h21")
	private H2 h21;

	@Id("buscador")
	private TextField vaadinTextField;
	@Id("botonesCG")
	private Element botonesCG;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("botonCancelar")
	private Button botonCancelar;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("layoutCrearCategoria")
	private Element layoutCrearCategoria;
	@Id("h1CrearCategoria")
	private H1 h1CrearCategoria;
	@Id("h2CrearCategoria")
	private H2 h2CrearCategoria;
	@Id("layoutEditarCategoria")
	private Element layoutEditarCategoria;
	@Id("h1EditarCategoria")
	private H1 h1EditarCategoria;
	@Id("h2EditarCategoria")
	private H2 h2EditarCategoria;
	@Id("layoutCrearOferta")
	private Element layoutCrearOferta;
	@Id("h1CrearOferta")
	private H1 h1CrearOferta;
	@Id("h2CrearOferta")
	private H2 h2CrearOferta;
	@Id("layoutEditarOferta")
	private Element layoutEditarOferta;
	@Id("h1EditarOferta")
	private H1 h1EditarOferta;
	@Id("h2EditarOferta")
	private H2 h2EditarOferta;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("layoutNombreCategoria")
	private HorizontalLayout layoutNombreCategoria;
	@Id("nombreCategoria")
	private Label nombreCategoria;
	@Id("campoCategoria")
	private TextField campoCategoria;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("layoutNombreOferta")
	private HorizontalLayout layoutNombreOferta;
	@Id("nombreOferta")
	private Label nombreOferta;
	@Id("campoOferta")
	private TextField campoOferta;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;

	/**
     * Creates a new VistaAdministrar_productos_anadidos.
     */
    public VistaAdministrar_productos_anadidos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAdministrar_productos_anadidos and vista-administrar_productos_anadidos
     */
    public interface VistaAdministrar_productos_anadidosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVerticalLayout_administrar_productos_anadidios() {
		return verticalLayout_administrar_productos_anadidios;
	}

	public void setVerticalLayout_administrar_productos_anadidios(Element verticalLayout_administrar_productos_anadidios) {
		this.verticalLayout_administrar_productos_anadidios = verticalLayout_administrar_productos_anadidios;
	}

	public HorizontalLayout getVaadinHorizontalLayout_administrador_productos_anadidos() {
		return vaadinHorizontalLayout_administrador_productos_anadidos;
	}

	public void setVaadinHorizontalLayout_administrador_productos_anadidos(
			HorizontalLayout vaadinHorizontalLayout_administrador_productos_anadidos) {
		this.vaadinHorizontalLayout_administrador_productos_anadidos = vaadinHorizontalLayout_administrador_productos_anadidos;
	}

	public Element getVaadinVerticalLayout_zonaProductos() {
		return vaadinVerticalLayout_zonaProductos;
	}

	public void setVaadinVerticalLayout_zonaProductos(Element vaadinVerticalLayout_zonaProductos) {
		this.vaadinVerticalLayout_zonaProductos = vaadinVerticalLayout_zonaProductos;
	}

	public H2 getH2() {
		return h2;
	}

	public void setH2(H2 h2) {
		this.h2 = h2;
	}

	public HorizontalLayout getVaadinHorizontalLayout1_zonaProductos() {
		return vaadinHorizontalLayout1_zonaProductos;
	}

	public void setVaadinHorizontalLayout1_zonaProductos(HorizontalLayout vaadinHorizontalLayout1_zonaProductos) {
		this.vaadinHorizontalLayout1_zonaProductos = vaadinHorizontalLayout1_zonaProductos;
	}

	public Element getVaadinVerticalLayout1_productos_anadidos() {
		return vaadinVerticalLayout1_productos_anadidos;
	}

	public void setVaadinVerticalLayout1_productos_anadidos(Element vaadinVerticalLayout1_productos_anadidos) {
		this.vaadinVerticalLayout1_productos_anadidos = vaadinVerticalLayout1_productos_anadidos;
	}

	public HorizontalLayout getVaadinHorizontalLayout2_productos_anadidos() {
		return vaadinHorizontalLayout2_productos_anadidos;
	}

	public void setVaadinHorizontalLayout2_productos_anadidos(HorizontalLayout vaadinHorizontalLayout2_productos_anadidos) {
		this.vaadinHorizontalLayout2_productos_anadidos = vaadinHorizontalLayout2_productos_anadidos;
	}

	public H2 getH21() {
		return h21;
	}

	public void setH21(H2 h21) {
		this.h21 = h21;
	}

	public TextField getVaadinTextField() {
		return vaadinTextField;
	}

	public void setVaadinTextField(TextField vaadinTextField) {
		this.vaadinTextField = vaadinTextField;
	}

	public Element getBotonesCG() {
		return botonesCG;
	}

	public void setBotonesCG(Element botonesCG) {
		this.botonesCG = botonesCG;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Button getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(Button botonCancelar) {
		this.botonCancelar = botonCancelar;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Element getLayoutCrearCategoria() {
		return layoutCrearCategoria;
	}

	public void setLayoutCrearCategoria(Element layoutCrearCategoria) {
		this.layoutCrearCategoria = layoutCrearCategoria;
	}

	public H1 getH1CrearCategoria() {
		return h1CrearCategoria;
	}

	public void setH1CrearCategoria(H1 h1CrearCategoria) {
		this.h1CrearCategoria = h1CrearCategoria;
	}

	public H2 getH2CrearCategoria() {
		return h2CrearCategoria;
	}

	public void setH2CrearCategoria(H2 h2CrearCategoria) {
		this.h2CrearCategoria = h2CrearCategoria;
	}

	public Element getLayoutEditarCategoria() {
		return layoutEditarCategoria;
	}

	public void setLayoutEditarCategoria(Element layoutEditarCategoria) {
		this.layoutEditarCategoria = layoutEditarCategoria;
	}

	public H1 getH1EditarCategoria() {
		return h1EditarCategoria;
	}

	public void setH1EditarCategoria(H1 h1EditarCategoria) {
		this.h1EditarCategoria = h1EditarCategoria;
	}

	public H2 getH2EditarCategoria() {
		return h2EditarCategoria;
	}

	public void setH2EditarCategoria(H2 h2EditarCategoria) {
		this.h2EditarCategoria = h2EditarCategoria;
	}

	public Element getLayoutCrearOferta() {
		return layoutCrearOferta;
	}

	public void setLayoutCrearOferta(Element layoutCrearOferta) {
		this.layoutCrearOferta = layoutCrearOferta;
	}

	public H1 getH1CrearOferta() {
		return h1CrearOferta;
	}

	public void setH1CrearOferta(H1 h1CrearOferta) {
		this.h1CrearOferta = h1CrearOferta;
	}

	public H2 getH2CrearOferta() {
		return h2CrearOferta;
	}

	public void setH2CrearOferta(H2 h2CrearOferta) {
		this.h2CrearOferta = h2CrearOferta;
	}

	public Element getLayoutEditarOferta() {
		return layoutEditarOferta;
	}

	public void setLayoutEditarOferta(Element layoutEditarOferta) {
		this.layoutEditarOferta = layoutEditarOferta;
	}

	public H1 getH1EditarOferta() {
		return h1EditarOferta;
	}

	public void setH1EditarOferta(H1 h1EditarOferta) {
		this.h1EditarOferta = h1EditarOferta;
	}

	public H2 getH2EditarOferta() {
		return h2EditarOferta;
	}

	public void setH2EditarOferta(H2 h2EditarOferta) {
		this.h2EditarOferta = h2EditarOferta;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getLayoutNombreCategoria() {
		return layoutNombreCategoria;
	}

	public void setLayoutNombreCategoria(HorizontalLayout layoutNombreCategoria) {
		this.layoutNombreCategoria = layoutNombreCategoria;
	}

	public Label getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(Label nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public TextField getCampoCategoria() {
		return campoCategoria;
	}

	public void setCampoCategoria(TextField campoCategoria) {
		this.campoCategoria = campoCategoria;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public HorizontalLayout getLayoutNombreOferta() {
		return layoutNombreOferta;
	}

	public void setLayoutNombreOferta(HorizontalLayout layoutNombreOferta) {
		this.layoutNombreOferta = layoutNombreOferta;
	}

	public Label getNombreOferta() {
		return nombreOferta;
	}

	public void setNombreOferta(Label nombreOferta) {
		this.nombreOferta = nombreOferta;
	}

	public TextField getCampoOferta() {
		return campoOferta;
	}

	public void setCampoOferta(TextField campoOferta) {
		this.campoOferta = campoOferta;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}




}
