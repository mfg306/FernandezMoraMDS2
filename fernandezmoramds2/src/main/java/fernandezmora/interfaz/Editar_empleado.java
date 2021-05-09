package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaEditar_empleado;

public class Editar_empleado extends VistaEditar_empleado {

	public Empleado _empleado;
	public VerticalLayout layout;
	
	public Editar_empleado(Empleado e) {
		this._empleado = e;
		inicializar();
	}
	
	public void inicializar() {
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		cancelar_edicion();
		editarEmpleado();
	}

	
	public void cancelar_edicion() {
		this.getVaadinButton1().addClickListener(event ->{
			Gestionar_empleados ge = new Gestionar_empleados();
			this.getVaadinVerticalLayout1().setVisible(false);
			this.getH1().setVisible(false);
			layout.add(ge);
		});
	}
	
	public void editarEmpleado() {
		this.getVaadinButton().addClickListener(event ->{
			iAdministrador admin = new BDPrincipal();
			
			try {
				admin.actualizarEmpleado(this._empleado.e.getIdEmpleado(), this.getVaadinTextField1().getValue(), this.getVaadinTextField().getValue());
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});
	}
}