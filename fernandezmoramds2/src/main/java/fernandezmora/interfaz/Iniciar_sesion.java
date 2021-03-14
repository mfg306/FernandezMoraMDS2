package fernandezmora.interfaz;

import vistas.VistaIniciar_sesion;

public class Iniciar_sesion extends VistaIniciar_sesion{

	public Transportista_Encargado_NR _iniciar_sesion;
	
	public Iniciar_sesion() {
		
		this.getCorreo().setVisible(false);
		this.getBoton_iniciar_sesion_facebook().setVisible(false);
		this.getBoton_iniciar_sesion_google().setVisible(false);
		this.getEnlace_recuperar_contrasenia().setVisible(false);
		this.getEnlace_registrarse().setVisible(false);
		
	}
	
}