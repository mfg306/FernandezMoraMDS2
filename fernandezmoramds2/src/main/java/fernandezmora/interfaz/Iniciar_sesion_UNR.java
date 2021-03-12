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
		
		this.getNombre_usuario().setVisible(false);
		this.getCorreo().setVisible(true);
		this.getBoton_iniciar_sesion_facebook().setVisible(true);
		this.getBoton_iniciar_sesion_google().setVisible(true);
		this.getEnlace_recuperar_contrasenia().setVisible(true);
		this.getEnlace_registrarse().setVisible(true);
				
	}
	
	/*Método que nos cambia a la vista para poder recuperar la contraseña*/
	public void abrirRecuperarContrasenia(VerticalLayout layout, Menu_UNR m_unr) {
		m_unr._iniciar_sesion_UNR.getEnlace_recuperar_contrasenia().addEventListener("click",e->{
			
			Recuperar_contrasenia recuperar_contrasenia = new Recuperar_contrasenia();
			layout.remove(m_unr._iniciar_sesion_UNR);
			layout.add(recuperar_contrasenia);	
	});
	}
	
	/*Metodo que nos cambia a la vista de registrarse*/
	public void abrirRegistrarse(VerticalLayout layout, Menu_UNR m_unr) {
	m_unr._iniciar_sesion_UNR.getEnlace_registrarse().addEventListener("click",e->{
			
			Registrarse registrarse = new Registrarse();
			layout.remove(m_unr._iniciar_sesion_UNR);
			layout.add(registrarse);	
	});
	}
}