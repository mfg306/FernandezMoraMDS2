package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEditar_perfil;

public class Editar_perfil extends VistaEditar_perfil {
	public Menu_UR _menu_UR;
	public Verificacion_cuenta_eliminada _verificacion_cuenta_eliminada;
	public Cambiar_contraseña _cambiar_contraseña;

	public Editar_perfil(Menu_UR _menu_UR) {
		inicializar(_menu_UR);
	}

	public void inicializar(Menu_UR _menu_UR) {
		this._menu_UR = _menu_UR;
		eliminar_cuenta();
		cambiar_contrasenia();

	}
	
	public void cambiar_contrasenia() {
		this.getBoton_cambiar_contrasenia().addClickListener(event ->{
			Cambiar_contraseña cc = new Cambiar_contraseña(this._menu_UR, this);
			limpiar_interfaz();
			this._menu_UR.layout.add(cc);
		});
	}

	public void eliminar_cuenta() {
		this.getBoton_eliminar_cuenta().addClickListener(event -> {
			Verificacion_cuenta_eliminada vce = new Verificacion_cuenta_eliminada(this._menu_UR);
			limpiar_interfaz();
			this._menu_UR.layout.add(vce);

		});
	}
	
	public void limpiar_interfaz() {
		this._menu_UR.layout.remove(this);
	}
}