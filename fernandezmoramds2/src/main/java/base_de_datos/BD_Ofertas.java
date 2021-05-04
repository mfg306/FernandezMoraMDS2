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

	public void insertarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad, String aFechaRegistro) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Oferta c = null;
		
		try {
			
			c = OfertaDAO.createOferta();
			c.setNombre_Oferta(aNombreOferta);
			c.setFecha_registro(aFechaRegistro);
			c.setFecha_caducidad(aFechaCaducidad);
			
			OfertaDAO.save(c);
			
			t.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		/*Hasta este punto tenemos la oferta creada. Nos falta relacionarla con los productos rebajados*/
		
		
	}

	public void actualizarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad, String aFechaActualizacion, int aIdOferta) throws PersistentException {
		if(eliminarOfertaAdmin(aIdOferta, aListaProductos)) System.out.println("Se ha eliminado la oferta");
		insertarOferta(aNombreOferta, aListaProductos, aFechaCaducidad, aFechaActualizacion);
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
		
		return true;
	}
}