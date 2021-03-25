package fernandezmora.interfaz;

import vistas.VistaRegistrarse;

public class Registrarse extends VistaRegistrarse {

	public Iniciar_sesion_UNR _iniciar_sesion_UNR;
	public Registrarse_con_Google _registrarse_con_Google;
	public Registrarse_con_Facebook _registrarse_con_Facebook;
	public Confirmación_registro _confirmacion_registro;

	public Registrarse(Iniciar_sesion_UNR iunr) {
		inicializar(iunr);
	}
	
	public void inicializar(Iniciar_sesion_UNR iunr) {
		this._iniciar_sesion_UNR = iunr;
		abrir_Iniciar_Sesion_Registrarse();
	}

	public void abrir_Iniciar_Sesion_Registrarse() {

		this.getBotonIniciarSesion().addClickListener(event -> {
			this._iniciar_sesion_UNR._menu_UNR.layout.remove(this);
			this._iniciar_sesion_UNR._menu_UNR.layout.add(this._iniciar_sesion_UNR);
		});
	}

}