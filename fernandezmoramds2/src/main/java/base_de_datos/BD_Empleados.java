package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Empleado;

public class BD_Empleados {
	public BDPrincipal _bDPrincipal;
	public Vector<Empleado> _empleado = new Vector<Empleado>();

	public Empleado[] cargarEmpleados() {
		throw new UnsupportedOperationException();
	}

	public void eliminarEmpleado(int aIdEmpleado) {
		throw new UnsupportedOperationException();
	}

	public void insertarEmpleado(String aNombreUsuario, String aContrasenia, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void actualizarEmpleado(String aNombreUsuario, String aContrasenia, String aCorreo) {
		throw new UnsupportedOperationException();
	}
}