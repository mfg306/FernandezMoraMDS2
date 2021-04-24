package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iUNR_;

public class Iniciar_sesion_UNR extends Iniciar_sesion {

	public Menu_UNR _menu_UNR;
	public Iniciar_sesion_con_Facebook _iniciar_sesion_con_Facebook;
	public Iniciar_sesion_con_Google _iniciar_sesion_con_Google;
	public Registrarse _registrarse;
	public Recuperar_contrasenia _recuperar_contrasenia;
	public VerticalLayout layout;

	public Iniciar_sesion_UNR(Menu_UNR munr) {
		inicializar(munr);
	}
	
	public void inicializar(Menu_UNR munr) {
		this._menu_UNR = munr;
		this._recuperar_contrasenia = new Recuperar_contrasenia(this);
		this._registrarse = new Registrarse(this);
		this.getNombre_usuario().setVisible(false);
		this.getCorreo().setVisible(true);
		abrir_RecuperarContraseña();
		abrir_Registrarse();
		
		/*this.getBoton_iniciar_sesion().addClickListener(event ->{
			try {
				this.iniciarSesion();
			}catch(Exception e) {
				e.printStackTrace();
			}
		});*/
	}

	public void abrir_RecuperarContraseña() {
		this.getVaadinButton1().addClickListener(event -> {
			this._menu_UNR.layout.remove(this);
			this._menu_UNR.layout.add(this._recuperar_contrasenia);

		});
	}
	
	public void abrir_Registrarse() {
		this.getBotonRegistrarse().addClickListener(event -> {
			this._menu_UNR.layout.remove(this);
			this._menu_UNR.layout.add(this._registrarse);

		});
	}
	
	
	public void iniciarSesion() throws PersistentException {
		iUNR_ iunr = new BDPrincipal();
		iAdministrador iadmin = new BDPrincipal();


		if(!iunr.iniciarSesion(this.getCorreo().getValue(), this.getContrasenia().getValue() )) {

			/*if(!iadmin.iniciarSesion(null, null)) {
			}*/
		}


		
	}

}