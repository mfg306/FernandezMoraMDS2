package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Oferta;

public class BD_Ofertas {
	public BDPrincipal _bDPrincipal;
	public Vector<Oferta> _oferta = new Vector<Oferta>();

	public Oferta[] cargarOfertas() {
		throw new UnsupportedOperationException();
	}

	public void eliminarOfertaAdministrador(int aIdOferta) {
		throw new UnsupportedOperationException();
	}

	public void insertarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad, String aFechaRegistro) {
		throw new UnsupportedOperationException();
	}

	public void actualizarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad, String aFechaActualizacion) {
		throw new UnsupportedOperationException();
	}
}