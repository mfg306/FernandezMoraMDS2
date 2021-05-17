package interfaz;

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
		this.getBotonRegistrarse().setVisible(false);
		this.getVaadinButton1().setVisible(false);
		this.getModoEmpleado().setVisible(true);
		this.getH1().setVisible(false);
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
			base_de_datos.Empleado empleado = tenr.iniciarSesionEmpleados(this.getNombre_usuario().getValue(), this.getContrasenia().getValue());
			this.ocultar_iniciar_sesion();
			
			if(empleado instanceof base_de_datos.Encargado_de_compras) {
				this.layout.add(new Encargado_de_compras((base_de_datos.Encargado_de_compras)empleado));
			}
			
			if(empleado instanceof base_de_datos.Transportista) {
				this.layout.add(new Transportista((base_de_datos.Transportista)empleado));
			}
			
			if(empleado == null) {
				Notification.show("No se ha encontrado su cuenta");
			}
		});


	}

}