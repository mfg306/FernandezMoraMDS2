package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaCrear_empleados;

public class Crear_empleados extends VistaCrear_empleados{
	public Gestionar_empleados _gestionar_empleados;
	
	public Crear_empleados(Gestionar_empleados ge) {
		this._gestionar_empleados = ge;
		Añadir();
	}

	public void Añadir() {
		this.getVaadinButton().addClickListener(event -> {
			iAdministrador admin = new BDPrincipal();
			boolean esEncargado = false;
			
			try {
				if(!this.getVaadinCheckbox().isEmpty()) {
					esEncargado = false;
				}
				if(!this.getVaadinCheckbox1().isEmpty()) {
					esEncargado = true;
				}
				
				if(!this.getVaadinCheckbox().isEmpty() || !this.getVaadinCheckbox1().isEmpty()) {
					admin.insertarEmpleado(this.getIntroduzcaUnaContraseña().getValue(), this.getIntroduzcaUnCorreo().getValue(), esEncargado);
					this._gestionar_empleados.inicializar();
				} else {
					Notification.show("Debe marcar si es encargado o transportista");
				}
				
			} catch (PersistentException e) {
				e.printStackTrace();
			}	
		});

	}
}