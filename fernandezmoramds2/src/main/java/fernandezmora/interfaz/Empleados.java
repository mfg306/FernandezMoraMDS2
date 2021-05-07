package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEmpleados;

public class Empleados extends VistaEmpleados {
	public Gestionar_empleados _gestionar_empleados;
	public Vector<Empleado> _list_Empleado = new Vector<Empleado>();
	public VerticalLayout layout;

	
	public Empleados(Gestionar_empleados ge) {
		this._gestionar_empleados = ge;
		inicializar();
	}
	
	public void inicializar() {
		this._list_Empleado = new Vector<>();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	}
	
	public void add_Empleados(base_de_datos.Empleado e) {
		Empleado emp = new Empleado(e, this);
		this._list_Empleado.add(emp);
		layout.add(emp);
	}
	
	
	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}
}