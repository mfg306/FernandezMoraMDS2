package fernandezmora;

import org.orm.PersistentException;

import com.vaadin.flow.component.dependency.CssImport;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iUNR_;
import basededatos.iUR;
import interfaz.Administrador;
import interfaz.Encargado_de_compras;
import interfaz.Gestionar_categorias;
import interfaz.Iniciar_sesion_UNR;
import interfaz.Transportista;
import interfaz.UNR_;
import interfaz.UR;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and use @Route
 * annotation to announce it in a URL as a Spring managed bean. Use the @PWA
 * annotation make the application installable on phones, tablets and some
 * desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every browser
 * tab/window.
 */
@Route
@PWA(name = "Tienda electrodomesticos", shortName = "Tienda Electrodomesticos", description = "This is an example Vaadin application.", enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
@PreserveOnRefresh
public class MainView extends VerticalLayout {

	UNR_ unr = new UNR_();

	/**
	 * Construct a new Vaadin view.
	 * <p>
	 * Build the initial UI state for the user accessing the application.
	 *
	 * @param service The message service. Automatically injected Spring managed
	 *                bean.
	 */

	public MainView() {
		this.add(unr);
		this.setPadding(false);
	}


}