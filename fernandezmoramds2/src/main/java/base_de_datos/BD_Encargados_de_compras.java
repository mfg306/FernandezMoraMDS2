package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Encargado_de_compras;

public class BD_Encargados_de_compras {
	public BDPrincipal _bDPrincipal;
	public Vector<Encargado_de_compras> _encargado_de_compras = new Vector<Encargado_de_compras>();

	public boolean buscarUsuario(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}
}