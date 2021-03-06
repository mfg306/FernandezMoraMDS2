package interfaz;

import java.io.Serializable;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import basededatos.BDPrincipal;
import basededatos.iUNR_;
import vistas.VistaRegistrarse;


@Route(value = "registro")
public class Registrarse extends VistaRegistrarse implements Serializable {

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

		this.getBoton_registrarse().addClickListener(event -> {
			try {
				registrarse();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});
	}
	
	public void limpiar_interfaz() {
		this._iniciar_sesion_UNR._menu_UNR.layout.remove(this);
		this._iniciar_sesion_UNR._menu_UNR.layout.add(this._iniciar_sesion_UNR);
	}

	public void abrir_Iniciar_Sesion_Registrarse() {

		this.getBotonIniciarSesion().addClickListener(event -> {
			this._iniciar_sesion_UNR._menu_UNR.layout.remove(this);
			this._iniciar_sesion_UNR._menu_UNR.layout.add(this._iniciar_sesion_UNR);
		});
	}

	public void registrarse() throws PersistentException {
		iUNR_ iunr = new BDPrincipal();
		int registroRealizado = iunr.registrarse(this.getNombre().getValue(), this.getApellidos().getValue(),this.getSegundoApellido().getValue(), this.getCorreo().getValue(), 
				this.getNombre_usuario().getValue(), this.getContrasenia().getValue(), this.getConfirmacionContrasenia().getValue());

		if(registroRealizado == 0) {
			limpiar_interfaz();
			Notification.show("Se ha registrado con exito. Inicie sesion");
		}else if(registroRealizado == 1) {
			Span mensajeError = new Span("La contraseña no debe ser mayor de 8 caracteres, debe contener al menos una mayuscula y un digito.");
			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(mensajeError);
		} else if(registroRealizado == 2) {
			Span mensajeError = new Span("El correo electrónico ya está registrado. Pruebe con otro.");
			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(mensajeError);
		} else {
			Span mensajeError = new Span("Ha ocurrido un error en la base de datos. Inténtelo de nuevo. ");
			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(mensajeError);
		}
		
	}

}