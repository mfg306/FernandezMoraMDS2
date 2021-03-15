package fernandezmora.interfaz;

import vistas.VistaEmpleado;

public class Empleado extends VistaEmpleado{
	public Empleados _empleados;
	public Editar_empleado _editar_empleado;

	public void Eliminar_empleado() {
		throw new UnsupportedOperationException();
	}
	
	public Empleado() {
		this._empleados = new Empleados();
		this._editar_empleado = new Editar_empleado();
	}
}