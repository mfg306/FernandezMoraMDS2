package fernandezmora.interfaz;

import java.util.Vector;

import vistas.VistaEmpleados;

public class Empleados extends VistaEmpleados {
	/*private Label _panel_ver_usuario;
	private Label _empleadosL;
	private Label _numero_paginasL;
	private event _ver_anteriores;
	private event _ver_siguientes;
	private Panel _panel_empleados;*/
	public Gestionar_empleados _gestionar_empleados;
	public Vector<Empleado> _list_Empleado = new Vector<Empleado>();

	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}
}