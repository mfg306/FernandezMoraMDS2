package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUR;
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
		editarPerfil();
		eliminar_cuenta();
		cambiar_contrasenia();
	}

	public void cambiar_contrasenia() {
		this.getBoton_cambiar_contrasenia().addClickListener(event -> {
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

	public void editarPerfil() {

		iUR iur = new BDPrincipal();
		try {
			base_de_datos.UR ur = iur.buscarUsuarioPorCorreo(this._menu_UR._uR.UR.getCorreo_electronico());
			this.getNombre_usuario().setValue(ur.getNombre_usuario().toString());
			this.getNombre().setValue(ur.getNombre().toString());
			this.getCorreo_electronico().setValue(ur.getCorreo_electronico().toString());
			this.getApellidos().setValue(ur.getPrimer_apellido().toString());
			
			if (this.getDireccion_envio().getValue().equals("")) {
				this.getDireccion_envio().setValue("Ninguna dirección de envío añadida");
			} else {
				this.getDireccion_envio().setValue(ur.getDireccion_envio());
			}
			if (this.getMetodo_pago().getValue().equals("")) {
				this.getMetodo_pago().setValue("Ningún método de pago añadido");
			} else {
				this.getMetodo_pago().setValue(ur.getMetodo_pago());
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}

	}
}