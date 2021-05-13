package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;

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
		
		for(Transportista te : tEncontrados) {
			System.out.println(te.getCorreo());
		}

		if (tEncontrados.length == 0) return null;
		if (tEncontrados[0].getCorreo().equals(t.getCorreo())
				&& tEncontrados[0].getContrasenia().equals(t.getContrasenia()))
			return tEncontrados[0];

		return null;
	}
	
	public Transportista[] cargarTransportistas() throws PersistentException {
		Transportista[] transportistas = TransportistaDAO.listTransportistaByQuery(null, null);
		return transportistas;
	}
}