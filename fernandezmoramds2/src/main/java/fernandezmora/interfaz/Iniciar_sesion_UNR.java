package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iUNR_;
import basededatos.iUR;

@Route(value = "iniciosesion")
public class Iniciar_sesion_UNR extends Iniciar_sesion  {

	public Menu_UNR _menu_UNR;
	public Iniciar_sesion_con_Facebook _iniciar_sesion_con_Facebook;
	public Iniciar_sesion_con_Google _iniciar_sesion_con_Google;
	public Registrarse _registrarse;
	public Recuperar_contrasenia _recuperar_contrasenia;
	public VerticalLayout layout;
	public base_de_datos.UR UR;
	
	public Iniciar_sesion_UNR(Menu_UNR munr) {
		
		UI.getCurrent().getPage().setTitle("Iniciar sesion");
		
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.inicializarUNR(munr);
	}

	public void inicializarUNR(Menu_UNR munr) {
		this._menu_UNR = munr;

		this._recuperar_contrasenia = new Recuperar_contrasenia(this);
		this._registrarse = new Registrarse(this);
		this.getNombre_usuario().setVisible(false);
		this.getCorreo().setVisible(true);
		abrir_RecuperarContraseña();
		abrir_Registrarse();

	}

	public void abrir_RecuperarContraseña() {
		this.getVaadinButton1().addClickListener(event -> {
			limpiar_interfaz();
			this._menu_UNR.layout.add(this._recuperar_contrasenia);

		});
	}

	public void abrir_Registrarse() {
		this.getBotonRegistrarse().addClickListener(event -> {
			limpiar_interfaz();
			this._menu_UNR.layout.add(this._registrarse);

		});
	}

	public void limpiar_interfaz() {
		this._menu_UNR.layout.remove(this);
	}

	@Override
	public void iniciarSesion() throws PersistentException {
		this.getBoton_iniciar_sesion().addClickListener(event -> {

			iUNR_ iunr = new BDPrincipal();
			iAdministrador iadmin = new BDPrincipal();
			iUR iur = new BDPrincipal();
			
			try {
				if (iunr.iniciarSesion(this.getCorreo().getValue(), this.getContrasenia().getValue()) == 1) {
					limpiar_interfaz();
					this.UR = iur.buscarUsuarioPorCorreo(this.getCorreo().getValue());
					this._menu_UNR.layout.add(new UR(UR));
				} else if (iadmin.iniciarSesion(this.getCorreo().getValue(), this.getContrasenia().getValue()) == 2) {
					limpiar_interfaz();
					this._menu_UNR.layout.add(new Administrador());
				} else {
					Notification.show("El usuario no está registrado");
				}
			} catch (PersistentException e) {
				e.printStackTrace();
			}

		});

	}


}