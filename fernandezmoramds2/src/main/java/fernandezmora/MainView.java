package fernandezmora;


import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import fernandezmora.interfaz.Administrador;
import fernandezmora.interfaz.Encargado_de_compras;
import fernandezmora.interfaz.Gestionar_categorias;
import fernandezmora.interfaz.Iniciar_sesion_UNR;
import fernandezmora.interfaz.Prueba_prueba;
import fernandezmora.interfaz.Transportista;
import fernandezmora.interfaz.UNR_;
import fernandezmora.interfaz.UR;


/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

	//Buscador b = new Buscador();
	
	 UNR_ unr = new UNR_();
	
	
    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
	
    public MainView() {    	
    	this.add(unr);
    	
    	login(); //Falaba porque se me habia olvidado poner esto jeje
   }
    
    public void login() {
    	Iniciar_sesion_UNR inicio_sesion = unr._menu_UNR._iniciar_sesion_UNR;
    	
    	inicio_sesion.getBoton_iniciar_sesion().addClickListener(event -> {
    		
			if(inicio_sesion.getCorreo().getValue().equals("usuario")){
				UR ur = new UR();
				remove(unr);
				add(ur);
				
				//Añadir el clickListener al desplegable
			}else if(inicio_sesion.getCorreo().getValue().equals("admin")){
				Administrador admin = new Administrador();
				remove(unr);
				add(admin);
				    		    		
			} else if(inicio_sesion.getCorreo().getValue().equals("t")) {
				Transportista t = new Transportista();
				remove(unr);
				add(t);
			} else if(inicio_sesion.getCorreo().getValue().equals("e")) {
				Encargado_de_compras e = new Encargado_de_compras();
				remove(unr);
				add(e);
			}
			
			else {
		    	Notification.show("Este usuario no esta registrado");
		    }
			
			
		});
    	
  
    }
}