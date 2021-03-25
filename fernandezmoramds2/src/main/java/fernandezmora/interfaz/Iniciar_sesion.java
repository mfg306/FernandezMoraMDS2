package fernandezmora.interfaz;

import vistas.VistaIniciar_sesion;

public class Iniciar_sesion extends VistaIniciar_sesion{

	public Transportista_Encargado_NR _iniciar_sesion;
	
	public Iniciar_sesion() {
		inicializar();
	}
	
	public void inicializar() {
		this.getCorreo().setVisible(false);
		this.getBoton_iniciar_sesion_facebook().setVisible(false);
		this.getBoton_iniciar_sesion_google().setVisible(false);
	}
	
}