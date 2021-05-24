package interfaz;

import vistas.VistaVerificacion_contrasenia_cambiada;

public class Verificacion_contraseña_cambiada extends VistaVerificacion_contrasenia_cambiada {

	public Cambiar_contraseña _cambiar_contraseña;
	
	public Verificacion_contraseña_cambiada(Menu_UR menu, Editar_perfil ep) {
		inicializar(menu, ep);
	}

	
	public void inicializar(Menu_UR menu, Editar_perfil ep) {
		this._cambiar_contraseña = new Cambiar_contraseña(ep);
		this.getBoton_aceptar().addClickListener(event ->{
			this._cambiar_contraseña._editar_perfil = new Editar_perfil(menu);
			menu.layout.remove(this);
			menu.layout.add(this._cambiar_contraseña._editar_perfil);
		});
		
	}
	
	
	
	
}