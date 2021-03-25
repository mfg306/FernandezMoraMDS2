package fernandezmora.interfaz;

import vistas.VistaCambiar_contrasenia;

public class Cambiar_contraseña extends VistaCambiar_contrasenia {
	public Editar_perfil _editar_perfil;
	public Verificacion_contraseña_cambiada _verificacion_contraseña_cambiada;
	
	public Cambiar_contraseña(Menu_UR menu, Editar_perfil _editar_perfil) {
		inicializar(menu);
		this._editar_perfil = _editar_perfil;
	}
	public void inicializar(Menu_UR menu) {
		guardar(menu);
	}
	
	public void guardar(Menu_UR menu){
		this.getBoton_guardar().addClickListener(event ->{
			menu.layout.remove(this);
			Verificacion_contraseña_cambiada vcc = new Verificacion_contraseña_cambiada(menu, this._editar_perfil);
			menu.layout.add(vcc);
		});
	}
}