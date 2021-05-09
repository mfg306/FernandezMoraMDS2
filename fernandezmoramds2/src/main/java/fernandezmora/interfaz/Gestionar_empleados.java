package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaGestionar_empleados;

public class Gestionar_empleados extends VistaGestionar_empleados{

	public Administrador _administrador;
	public Crear_empleados _crear_empleados;
	public Empleados _empleados;
	public VerticalLayout layout;

	
	public Gestionar_empleados() {
		this._crear_empleados = new Crear_empleados(this);
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		inicializar();
	}
	
	public void inicializar() {
		this.getHuecoCrearEmpleados().as(VerticalLayout.class).add(_crear_empleados);
		this._empleados = new Empleados(this);

		abrirGestionarEmpleados();
		
		this.layout.removeAll();
		layout.add(this._crear_empleados);
		layout.add(this._empleados);
	}
	
	public void ocultar_Gestionar_Empleados() {
		this.layout.remove(this._crear_empleados);
		this.layout.remove(this._empleados);
		this.getH1().setVisible(false);
	}
		
	public void abrirGestionarEmpleados() {
		iAdministrador admin = new BDPrincipal();
		
		try {
			base_de_datos.Empleado[] empleados = admin.cargarEmpleados();
			for(base_de_datos.Empleado e : empleados) {
				this._empleados.add_Empleados(e);
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
	
}