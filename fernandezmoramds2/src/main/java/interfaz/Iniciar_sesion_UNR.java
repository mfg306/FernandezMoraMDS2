package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iUNR_;
import basededatos.iUR;

@Route(value = "iniciosesion")
public class Iniciar_sesion_UNR extends Iniciar_sesion {

	public Menu_UNR _menu_UNR;
	public Iniciar_sesion_con_Facebook _iniciar_sesion_con_Facebook;
	public Iniciar_sesion_con_Google _iniciar_sesion_con_Google;
	public Registrarse _registrarse;
	public Recuperar_contrasenia _recuperar_contrasenia;
	public VerticalLayout layout;
	public base_de_datos.UR UR;
	public base_de_datos.Administrador admin;

	public Iniciar_sesion_UNR(Menu_UNR munr) {

		UI.getCurrent().getPage().setTitle("Iniciar sesion");

		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.inicializarUNR(munr);
	}

	public void inicializarUNR(Menu_UNR munr) {
		this._menu_UNR = munr;

		this._recuperar_contrasenia = new Recuperar_contrasenia(this);
		this.getBoton_iniciar_sesion().setVisible(true);
		this.getBoton_iniciar_sesion_empleados().setVisible(false);


		this.getNombre_usuario().setVisible(false);
		this.getCorreo().setVisible(true);
		this.getBotonRegistrarse().setVisible(true);
		this.getVaadinButton1().setVisible(true);
		abrir_RecuperarContraseña();
		abrir_Registrarse();
		abrirIniciarSesionEmpleados();
		
		
		try {
			this.iniciarSesion();
		} catch (PersistentException e) {
			e.printStackTrace();
		};

	}

	public void abrir_RecuperarContraseña() {
		this.getVaadinButton1().addClickListener(event -> {
			limpiar_interfaz();
			this._menu_UNR.layout.add(this._recuperar_contrasenia);

		});
	}

	public void abrir_Registrarse() {
		this.getBotonRegistrarse().addClickListener(event -> {
			this._registrarse = new Registrarse(this);
			limpiar_interfaz();
			this._menu_UNR.layout.add(this._registrarse);

		});
	}

	public void abrirIniciarSesionEmpleados() {
		this.getEnlaceEmpleados().addClickListener(event -> {
			this.getNombre_usuario().setVisible(true);
			this.getCorreo().setVisible(false);
			this.getBotonRegistrarse().setVisible(false);
			this.getVaadinButton1().setVisible(false);
			this.getEnlaceEmpleados().setVisible(false);
			
			
			this.getBoton_iniciar_sesion_empleados().setVisible(true);
			this.getBoton_iniciar_sesion().setVisible(false);
			
			
		});
	}

	public void limpiar_interfaz() {
		this._menu_UNR.layout.remove(this);
	}

	public void iniciarSesion() throws PersistentException {
		this.getBoton_iniciar_sesion().addClickListener(event -> {

			iUNR_ iunr = new BDPrincipal();
			base_de_datos.Usuario_General usuario = null;

			try {
				usuario = iunr.iniciarSesion(this.getCorreo().getValue(), this.getContrasenia().getValue());

				if (usuario != null && usuario instanceof base_de_datos.UR) {
					limpiar_interfaz();
					this._menu_UNR.layout.add(new UR(usuario));
				} else if (usuario != null && usuario instanceof base_de_datos.Administrador) {
					limpiar_interfaz();
					this._menu_UNR.layout.add(new Administrador(usuario, this));
				} else {
					Notification.show("El usuario no está registrado");
				}

			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});

	}

}