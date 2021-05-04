package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import basededatos.BDPrincipal;
import basededatos.iTransportista_Encargado_NR;
import vistas.VistaIniciar_sesion;

@Route(value = "iniciarSesionEmpleados")
public class Iniciar_sesion extends VistaIniciar_sesion {

	public Transportista_Encargado_NR _iniciar_sesion;
	public VerticalLayout layout;

	public Iniciar_sesion() {

		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		inicializar();
	}

	public void ocultar_iniciar_sesion() {
		this.layout.removeAll();
	}

	public void inicializar() {

		try {
			iniciarSesion();
		} catch (PersistentException e) {
			e.printStackTrace();
		}

		this.getCorreo().setVisible(false);
	}

	public void iniciarSesion() throws PersistentException {

		this.getBoton_iniciar_sesion().addClickListener(event -> {
			iTransportista_Encargado_NR tenr = new BDPrincipal();

			tenr.buscarUsuario(this.getCorreo().getValue(), this.getContrasenia().getValue());

		});


	}

}