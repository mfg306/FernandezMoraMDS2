package base_de_datos;

import basededatos.BDPrincipal;


import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Ofertas {
	public BDPrincipal _bDPrincipal;
	public Vector<Oferta> _oferta = new Vector<Oferta>();

	public Oferta[] cargarOfertas() throws PersistentException{
		Oferta[] ofertas = null;
		PersistentTransaction oferta = HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			ofertas = OfertaDAO.listOfertaByCriteria(null);

		} catch (Exception e) {
			oferta.rollback();
		}

		return ofertas;
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