package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Transportista;

public class BD_Transportistas {
	public BDPrincipal _bDPrincipal;
	public Vector<Transportista> _transportista = new Vector<Transportista>();

	public Empleado iniciarSesionEmpleados(String aNombreUsuario, String aPassword) throws PersistentException {
		Transportista t = TransportistaDAO.createTransportista();

		t.setCorreo(aNombreUsuario);
		t.setContrasenia(aPassword);

		Transportista[] tEncontrados = TransportistaDAO.listTransportistaByQuery("correo = '" + aNombreUsuario + "'",
				"correo");

		if (tEncontrados.length == 0) return null;
		if (tEncontrados[0].getCorreo().equals(t.getCorreo())
				&& tEncontrados[0].getContrasenia().equals(t.getContrasenia()))
			return tEncontrados[0];

		return null;
	}
	
	public Transportista[] cargarTransportistas() throws PersistentException {
		Transportista[] transportistas = null;
		try {
			transportistas = TransportistaDAO.listTransportistaByQuery(null, null);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return transportistas;
	}
}