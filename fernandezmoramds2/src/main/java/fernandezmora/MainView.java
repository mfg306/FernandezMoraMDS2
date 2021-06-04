package fernandezmora;

import com.vaadin.flow.component.dependency.CssImport;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Inline;
import com.vaadin.flow.component.page.LoadingIndicatorConfiguration;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.server.PageConfigurator;
import com.vaadin.flow.spring.annotation.EnableVaadin;
import com.vaadin.flow.theme.NoTheme;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

import interfaz.UNR_;

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
@Route()
@PWA(name = "Tienda electrodomesticos", shortName = "Tienda Electrodomesticos", description = "This is an example Vaadin application.", enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
@CssImport(value="./styles/vaadin-button-styles.css", themeFor = "vaadin-button")
@CssImport(value="./styles/vaadin-span-styles.css", themeFor = "span")
@PreserveOnRefresh
@EnableVaadin(value = "interfaz")
public class MainView extends VerticalLayout implements PageConfigurator {

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

	@Override
	public void configurePage(InitialPageSettings settings) {
		settings.addFavIcon("icon", "icons/icon.png", "192x192");

		LoadingIndicatorConfiguration conf = settings.getLoadingIndicatorConfiguration();

		// disable default theme -> loading indicator will not be shown
		conf.setApplyDefaultTheme(false);

	}

}