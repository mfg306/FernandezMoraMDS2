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
			ofertas = OfertaDAO.listOfertaByQuery(null,null);

		} catch (Exception e) {
			oferta.rollback();
		}

		return ofertas;
	}

	public void insertarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad, String aFechaRegistro) {
		throw new UnsupportedOperationException();
	}

	public void actualizarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad, String aFechaActualizacion) {
		throw new UnsupportedOperationException();
	}
	
	public boolean eliminarOfertaAdmin(int aIdOferta, Producto[] aListaProductos) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Oferta o = null;
		try {
			o = OfertaDAO.getOfertaByORMID(aIdOferta);
			OfertaDAO.delete(o);			
			t.commit();
		} catch(Exception e) {
			t.rollback();
			e.printStackTrace();
			return false;
		}
		
	
		PersistentTransaction t2 = HitoPersistentManager.instance().getSession().beginTransaction();
		Producto_RebajadoSetCollection pr = o._Pertenece_a;
		Producto_Rebajado productoR;

		try {
			for(Producto p : aListaProductos) {
				productoR = Producto_RebajadoDAO.listProducto_RebajadoByQuery("ProductoId_Producto = " + p.getId_Producto(), null)[0];
				pr.remove(productoR);
			}
			
			t2.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t2.rollback();
			return false;
		}
		
		/*Lo que tenemos que hacer es para cada producto que tenemos, ver si el id de
		 * alguno coincide con el id Producto de la tabla ProductoRebajado. Si coincide
		 * es que estaba rebajado y hay que eliminarlo
		 * */
		
		
		return true;
	}
}