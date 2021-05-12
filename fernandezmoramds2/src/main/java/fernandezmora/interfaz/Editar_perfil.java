package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.UR;
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
		eliminarCuenta();
		cambiar_contrasenia();
	}

	public void cambiar_contrasenia() {
		this.getBoton_cambiar_contrasenia().addClickListener(event -> {
			Cambiar_contraseña cc = new Cambiar_contraseña(this._menu_UR, this);
			limpiar_interfaz();
			this._menu_UR.layout.add(cc);
		});
	}

	/*public void eliminar_cuenta() {
		this.getBoton_eliminar_cuenta().addClickListener(event -> {
			Verificacion_cuenta_eliminada vce = new Verificacion_cuenta_eliminada(this._menu_UR);
			limpiar_interfaz();
			this._menu_UR.layout.add(vce);

		});
	}*/

	public void limpiar_interfaz() {
		this._menu_UR.layout.remove(this);
	}

	public void editarPerfil() {

		iUR iur = new BDPrincipal();
		
		try {
		
			this._menu_UR._uR.UR = iur.buscarUsuarioPorCorreo(this._menu_UR._uR.UR.getCorreo_electronico());
			this.getNombre_usuario().setValue(this._menu_UR._uR.UR.getNombre_usuario().toString());
			this.getNombre().setValue(this._menu_UR._uR.UR.getNombre().toString());
			this.getCorreo_electronico().setValue(this._menu_UR._uR.UR.getCorreo_electronico().toString());
			this.getApellidos().setValue(this._menu_UR._uR.UR.getPrimer_apellido().toString());
			
			if (this._menu_UR._uR.UR.getDireccion_envio() == null) {
				this.getDireccion_envio().setValue("Ninguna dirección de envío añadida");
			} else {
				this.getDireccion_envio().setValue(this._menu_UR._uR.UR.getDireccion_envio().toString());
			}
			if (this._menu_UR._uR.UR.getMetodo_pago() == null) {
				this.getMetodo_pago().setValue("Ningún método de pago añadido");
			} else {
				this.getMetodo_pago().setValue(this._menu_UR._uR.UR.getMetodo_pago().toString());
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		this.getBoton_guardar().addClickListener(event ->{
			try {
				iur.cambiarDatosUsuario(this.getNombre_usuario().getValue(), this.getNombre().getValue(), this.getApellidos().getValue()
						, this.getCorreo_electronico().getValue(), this.getDireccion_envio().getValue(), this.getMetodo_pago().getValue());
				Notification.show("Configuración guardada con éxito");
				
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}
	
	public void eliminarCuenta() {
		iUR iur = new BDPrincipal();
		this.getBoton_eliminar_cuenta().addClickListener(event ->{
			try {
				iur.eliminarUsuario(this._menu_UR._uR.UR.getCorreo_electronico());
				Verificacion_cuenta_eliminada vce = new Verificacion_cuenta_eliminada(this._menu_UR);
				limpiar_interfaz();
				this._menu_UR.layout.add(vce);
			} catch (PersistentException e) {
			
				e.printStackTrace();
			}
		});
	}
}
