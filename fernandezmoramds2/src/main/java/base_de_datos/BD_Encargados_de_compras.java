package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;

import base_de_datos.Encargado_de_compras;

public class BD_Encargados_de_compras {
	public BDPrincipal _bDPrincipal;
	public Vector<Encargado_de_compras> _encargado_de_compras = new Vector<Encargado_de_compras>();

	public Empleado iniciarSesionEmpleados(String aNombreUsuario, String aPassword) throws PersistentException {
		Encargado_de_compras e = Encargado_de_comprasDAO.createEncargado_de_compras();

		e.setCorreo(aNombreUsuario);
		e.setContrasenia(aPassword);

		Encargado_de_compras[] eEncontrados = Encargado_de_comprasDAO
				.listEncargado_de_comprasByQuery("correo = '" + aNombreUsuario + "'", "correo");

		if (eEncontrados.length == 0)
			return null;
		if (eEncontrados[0].getCorreo().equals(e.getCorreo())
				&& eEncontrados[0].getContrasenia().equals(e.getContrasenia())) return eEncontrados[0];

		return null;
	}
	
	
}