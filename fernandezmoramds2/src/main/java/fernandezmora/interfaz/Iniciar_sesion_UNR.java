package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Iniciar_sesion_UNR extends Iniciar_sesion {

	public Menu_UNR _menu_UNR;
	public Iniciar_sesion_con_Facebook _iniciar_sesion_con_Facebook;
	public Iniciar_sesion_con_Google _iniciar_sesion_con_Google;
	public Registrarse _registrarse;
	public Recuperar_contrasenia _recuperar_contrasenia;
	public VerticalLayout layout;

	public Iniciar_sesion_UNR() {

		this._registrarse = new Registrarse();
		this.getNombre_usuario().setVisible(false);
		this.getCorreo().setVisible(true);
		this.getBoton_iniciar_sesion_facebook().setVisible(true);
		this.getBoton_iniciar_sesion_google().setVisible(true);

	}

}