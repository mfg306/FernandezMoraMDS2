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
		

		
		PersistentTransaction t2 = HitoPersistentManager.instance().getSession().beginTransaction();
		this._bDPrincipal = new BDPrincipal();
		
		

		try {
			for (Producto p : aListaProductos) {
				/*Crear el producto rebajado que va a ser una copia del Producto p pero con el 
				 * precio rebajado*/
				pr = Producto_RebajadoDAO.createProducto_Rebajado();
				pr.setPrecio_producto(0.0);
				pr.setNombre(p.getNombre());
				pr.setDescripcion(p.getDescripcion());
				pr.set_Categoria(p.get_Categoria());
				pr.setNum_Unidades_Restantes(p.getNum_Unidades_Restantes());
				pr.setNum_Unidades_Vendidas(p.getNum_Unidades_Vendidas());
				pr.setPrecio_producto(p.getPrecio_producto());
				
								
				for(Comentario c : p._Pertenece_a.toArray()) {
					pr._Pertenece_a.add(c);
				}
				
				for(Producto_en_compra pc : p._Producto_en_compra.toArray()) {
					pr._Producto_en_compra.add(pc);
				}
				
				for(Valoracion v : p._Valorado_por.toArray()) {
					pr._Valorado_por.add(v);
				}

				/*Guardamos los cambios*/
				Producto_RebajadoDAO.save(pr);				
				o._Pertenece_a.add(pr);
			}

			OfertaDAO.save(o);
			
			t2.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t2.rollback();
		}
		
		
		/*Eliminamos el producto p porque ya lo tenemos con Producto_Rebajado y no lo queremos repetido*/
		for (Producto p : aListaProductos) {
			this._bDPrincipal.eliminarProductoAdministrador(p.getId_Producto());
		}	

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