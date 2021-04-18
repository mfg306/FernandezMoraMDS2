package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Imagen;

public class DB_Imagen {
	public BDPrincipal _bDPrincipal;
	public Vector<Imagen> _imagen = new Vector<Imagen>();

	public void guardarImagenesProducto(Imagen[] aImagenes) {
		throw new UnsupportedOperationException();
	}
}