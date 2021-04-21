package Base_de_Datos;

import basededatos.BDPrincipal;
import java.util.Vector;
import Base_de_Datos.Oferta;

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