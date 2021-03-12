package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-crear_empleados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */

@Tag("vista-crearempleados")
@JsModule("./src/vista-crearempleados.js")
public class VistaCrear_empleados extends PolymerTemplate<VistaCrear_empleados.VistaCrear_empleadosModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h1")
	private H1 h1;
	@Id("introduzcaUnCorreo")
	private TextField introduzcaUnCorreo;
	@Id("introduzcaUnaContraseña")
	private TextField introduzcaUnaContraseña;
	@Id("vaadinButton")
	private Button vaadinButton;

	/**
     * Creates a new VistaCrear_empleados.
     */
    public VistaCrear_empleados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCrear_empleados and vista-crear_empleados
     */
    public interface VistaCrear_empleadosModel extends TemplateModel {
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

	public TextField getIntroduzcaUnCorreo() {
		return introduzcaUnCorreo;
	}

	public void setIntroduzcaUnCorreo(TextField introduzcaUnCorreo) {
		this.introduzcaUnCorreo = introduzcaUnCorreo;
	}

	public TextField getIntroduzcaUnaContraseña() {
		return introduzcaUnaContraseña;
	}

	public void setIntroduzcaUnaContraseña(TextField introduzcaUnaContraseña) {
		this.introduzcaUnaContraseña = introduzcaUnaContraseña;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}
}
