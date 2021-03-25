package fernandezmora.interfaz;

import vistas.VistaRecuperar_contrasenia;

public class Recuperar_contrasenia extends VistaRecuperar_contrasenia {

	public Iniciar_sesion_UNR _iniciar_sesion_UNR;
	public Establecer_nueva_contrasenia _establecer_nueva_contrasenia;
	public Gestor_Correos _unnamed_Gestor_Correos_;
	
	public Recuperar_contrasenia(Iniciar_sesion_UNR iunr){
		inicializar(iunr);
	}
	
	public void inicializar(Iniciar_sesion_UNR iunr) {
		this._iniciar_sesion_UNR = iunr;

	}

	public void Enviar_enlace_recuperacion() {
		throw new UnsupportedOperationException();
	}
}