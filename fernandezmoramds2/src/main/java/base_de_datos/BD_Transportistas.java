package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;

import base_de_datos.Transportista;

public class BD_Transportistas {
	public BDPrincipal _bDPrincipal;
	public Vector<Transportista> _transportista = new Vector<Transportista>();

	public int buscarUsuario(String aNombreUsuario, String aPassword) throws PersistentException {
		Transportista t = TransportistaDAO.createTransportista();
		
		t.setCorreo(aNombreUsuario);
		t.setContrasenia(aPassword);
		
		Transportista[] tEncontrados = TransportistaDAO.listTransportistaByQuery("correo_Transportista = '" +  aNombreUsuario + "'", "correo_Transportista");
		
		if(tEncontrados.length == 0) return 0;
		if(tEncontrados[0].getCorreo_Transportista().equals(t.getCorreo_Transportista()) && 
				tEncontrados[0].getContrasenia().equals(t.getContrasenia())) return 1;
		
		return 0;
		
	}
}