package interfaz;

import org.orm.PersistentException;
import com.vaadin.flow.component.notification.Notification;
import basededatos.BDPrincipal;
import basededatos.iUR;
import generarContrasenia.PasswordGenerator;
import vistas.VistaRecuperar_contrasenia;

public class Recuperar_contrasenia extends VistaRecuperar_contrasenia {

	public Iniciar_sesion_UNR _iniciar_sesion_UNR;
	public Establecer_nueva_contrasenia _establecer_nueva_contrasenia;
	public Gestor_Correos _unnamed_Gestor_Correos_;
	
	
	public Recuperar_contrasenia(Iniciar_sesion_UNR iunr) {
		inicializar(iunr);
	}

	public void inicializar(Iniciar_sesion_UNR iunr) {
		this._iniciar_sesion_UNR = iunr;
		recuperarContrasenia();

	}

	public void recuperarContrasenia() {
		
		iUR iur = new BDPrincipal();
		
		this.getBoton_enviar_correo().addClickListener(event -> {
		try {
			base_de_datos.UR ur = iur.buscarUsuarioPorCorreo(this.getCorreo().getValue());
			if(ur != null) {
				String contrasenia = PasswordGenerator.getPassword(10);
				iur.cambiarContraseniaUsuario(this.getCorreo().getValue(), contrasenia);
				Gestor_Correos.enviarCorreo(ur.getCorreo_electronico(), "Tu nueva contraseña de TiendaElectrodomésticos", contrasenia);
				Notification.show("Le acabamos de enviar una contraseña temporal a su correo  " + ur.getCorreo_electronico() + "  revise su bandeja de entrada");
			}else {
				Notification.show("No esta registrado este correo");
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		});
	
	}
}
