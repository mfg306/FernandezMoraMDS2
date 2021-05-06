package base_de_datos;

import basededatos.BDPrincipal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Ofertas {
	public BDPrincipal _bDPrincipal;
	public Vector<Oferta> _oferta = new Vector<Oferta>();
	private Oferta[] ofertas_Bs;

	public Oferta[] cargarOfertas() throws PersistentException {
		Oferta[] ofertas = null;
		int contador = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		PersistentTransaction oferta = HitoPersistentManager.instance().getSession().beginTransaction();
		
		try {
			
			Date fecha;
			ofertas = OfertaDAO.listOfertaByQuery(null, null);
				
		} catch (Exception e) {
			oferta.rollback();
		}

		return ofertas;
	}

	public void insertarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad,
			String aFechaRegistro) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Oferta o = null;
		Producto_Rebajado pr = null;
		/*¿Al indicarle aqui que el owner es "o" ya se crea la relacion?*/
		Producto_RebajadoSetCollection prCollection = new Producto_RebajadoSetCollection(o, null, 0, 0);

		try {

			o = OfertaDAO.createOferta();
			o.setNombre_Oferta(aNombreOferta);
			o.setFecha_registro(aFechaRegistro);
			o.setFecha_caducidad(aFechaCaducidad);

			OfertaDAO.save(o);

			t.commit();

		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}

		/*
		 * Hasta este punto tenemos la oferta creada. Nos falta relacionarla con los
		 * productos rebajados
		 */

		/*
		 * A partir del listado de productos que nos han pasado tenemos que crear los
		 * Productos_Rebajados, puesto que al incorporarlos en una oferta pasan a ser
		 * rebajados
		 */

		for (Producto p : aListaProductos) {
			pr = Producto_RebajadoDAO.createProducto_Rebajado();
			pr.setPrecio_rebajado(0.0);
			
			/*¿Como indicar que este producto rebajado se corresponde con el producto p?*/
			Producto_RebajadoDAO.save(pr);
			
			prCollection.add(pr);
			
			/*¿Como indicar que este producto rebajado pertenece a la oferta "o"*/
		}
		
		/*¿Como indicar que la oferta "o" tiene los productos rebajados "prCollection"?*/

	}

	public void actualizarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad,
			String aFechaActualizacion, int aIdOferta) throws PersistentException {
		if (eliminarOfertaAdmin(aIdOferta, aListaProductos))
			System.out.println("Se ha eliminado la oferta");
		insertarOferta(aNombreOferta, aListaProductos, aFechaCaducidad, aFechaActualizacion);
	}

	public boolean eliminarOfertaAdmin(int aIdOferta, Producto[] aListaProductos) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Oferta o = null;
		try {
			o = OfertaDAO.getOfertaByORMID(aIdOferta);
			OfertaDAO.delete(o);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
			return false;
		}

		return true;
	}
}