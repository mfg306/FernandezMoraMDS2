package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import basededatos.iUR;
import vistas.VistaCambiar_contrasenia;

public class Cambiar_contraseña extends VistaCambiar_contrasenia {
	public Editar_perfil _editar_perfil;
	public Verificacion_contraseña_cambiada _verificacion_contraseña_cambiada;

	public Cambiar_contraseña(Editar_perfil _editar_perfil) {
		this._editar_perfil = _editar_perfil;
		inicializar();
	}

	public void inicializar() {
		cambiarContrasenia();
	}

	public void cambiarContrasenia() {
		iUR iur = new BDPrincipal();
		this.getBoton_guardar().addClickListener(event -> {
			try {
				this._editar_perfil._menu_UR._uR.UR = iur.buscarUsuarioPorCorreo(this._editar_perfil._menu_UR._uR.UR.getCorreo_electronico());
				if (!this._editar_perfil._menu_UR._uR.UR.getContrasenia().equals(this.getContrasenia_actual().getValue().toString())) {
					Notification.show("Introduce correctamente tu contraseña actual");
	
				} else if(!this.getNueva_contrasenia().getValue().toString().equals(this.getConfirmacion_nueva_contrasenia().getValue().toString())) {
					Notification.show("No coinciden las contraseñas, por favor asegurese que son iguales");
					
				}else if(this.getNueva_contrasenia().getValue().equals("") || this.getConfirmacion_nueva_contrasenia().getValue().equals("")) {
					Notification.show("Por favor introduzca su nueva contraseña");
				}
				else {
					iur.actualizarContrasenia(this._editar_perfil._menu_UR._uR.UR, this.getConfirmacion_nueva_contrasenia().getValue().toString());
					this._editar_perfil._menu_UR.layout.remove(this);
					Verificacion_contraseña_cambiada vcc = new Verificacion_contraseña_cambiada(this._editar_perfil._menu_UR,
							this._editar_perfil);
					this._editar_perfil._menu_UR.layout.add(vcc);
				}
			} catch (PersistentException e) {
				e.printStackTrace();
			}

		});

}}
