package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEmpleados;

public class Empleados extends VistaEmpleados {
	public Gestionar_empleados _gestionar_empleados;
	public Vector<Empleado> _list_Empleado = new Vector<Empleado>();
	public VerticalLayout layout;

	
	public Empleados() {
		this._list_Empleado = new Vector<>();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);		
	}
	
	public void add_Empleados() {
		Empleado e = new Empleado();
		this._list_Empleado.add(e);
		layout.add(e);
	}

	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}
}