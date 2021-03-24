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

/**
 * A Designer generated component for the vista-introducir_datos_compra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-introducirdatoscompra")
@JsModule("./src/vista-introducirdatoscompra.js")
public class VistaIntroducir_datos_compra extends PolymerTemplate<VistaIntroducir_datos_compra.VistaIntroducir_datos_compraModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("span")
	private Span span;
	@Id("direccion_envio")
	private TextField direccion_envio;
	@Id("metodo_pago")
	private TextField metodo_pago;
	@Id("boton_continuar")
	private Button boton_continuar;

	/**
     * Creates a new VistaIntroducir_datos_compra.
     */
    public VistaIntroducir_datos_compra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaIntroducir_datos_compra and vista-introducir_datos_compra
     */
    public interface VistaIntroducir_datos_compraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
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

	public Button getBoton_continuar() {
		return boton_continuar;
	}

	public void setBoton_continuar(Button boton_continuar) {
		this.boton_continuar = boton_continuar;
	}
}