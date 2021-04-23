package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Recibido;

public class BD_Recibido {
	public BDPrincipal _bDPrincipal;
	public Vector<Recibido> _recibido = new Vector<Recibido>();

	public Recibido[] cargarVentas() {
		throw new UnsupportedOperationException();
	}
}