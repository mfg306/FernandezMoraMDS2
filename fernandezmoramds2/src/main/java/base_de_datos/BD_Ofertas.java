package base_de_datos;

import basededatos.BDPrincipal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Ofertas {
	public BDPrincipal _bDPrincipal;
	public Vector<Oferta> _oferta = new Vector<Oferta>();

	
	public Oferta[] cargarOfertas() throws PersistentException {
		Oferta[] ofertas = null;
		Oferta[] ofertasResultado = null;

		ofertas = OfertaDAO.listOfertaByQuery(null, null);
		ofertasResultado = new Oferta[ofertas.length];
			
			/*LocalDate fecha1 = LocalDate.now();
			String fecha_Actual = fecha1.toString();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date fecha_hoy = sdf.parse(fecha_Actual);
			
			Date fecha_O = null;*/
			int contador = 0;
			//String fecha_Oferta = null;
			
			for (int i = 0; i < ofertas.length; i++) {
				//fecha_Oferta = ofertas[i].getFecha_caducidad();
			//	fecha_O = sdf.parse(fecha_Oferta.toString());
				ofertasResultado[contador] = ofertas[i];
				contador++;
			}
	

		return ofertasResultado;
	}

	public Oferta insertarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad,
			String aFechaRegistro, double[] aPrecios) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Oferta o = null;
		Producto_Rebajado pr = null;
		
		/* Paso 1. Crear la oferta */
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
		
		int contador = 0;
		/*
		 * Paso 2. Crear los productos rebajados basados en el producto seleccionado de
		 * la lista y enlazar este producto rebajado con la oferta
		 */
		try {
			for (Producto p : aListaProductos) {
				/*
				 * Crear el producto rebajado que va a ser una copia del Producto p pero con el
				 * precio rebajado
				 */
				pr = Producto_RebajadoDAO.createProducto_Rebajado();
				
				pr.setPrecio_producto(pr.getPrecio_producto());
				pr.setNombre(p.getNombre());
				pr.setDescripcion(p.getDescripcion());
				pr.set_Categoria(p.get_Categoria());
				pr.setNum_Unidades_Restantes(p.getNum_Unidades_Restantes());
				pr.setNum_Unidades_Vendidas(p.getNum_Unidades_Vendidas());
				
				pr.setPrecio_rebajado(aPrecios[contador]);
				
				contador ++;
				
				
				for(Imagen i : p._Imagen.toArray()) {
					pr._Imagen.add(i);
				}

				for (Comentario c : p._Pertenece_a.toArray()) {
					pr._Pertenece_a.add(c);
				}

				for (Producto_en_compra pc : p._Producto_en_compra.toArray()) {
					pr._Producto_en_compra.add(pc);
				}

				for (Valoracion v : p._Valorado_por.toArray()) {
					pr._Valorado_por.add(v);
				}

				/* Guardamos los cambios */
				Producto_RebajadoDAO.save(pr);
				o._Pertenece_a.add(pr);
			}

			OfertaDAO.save(o);

			t2.commit();
		} catch (Exception e) {
			e.printStackTrace();
			t2.rollback();
		}
		
		/*
		 * Paso 3. Eliminar el producto de la lista porque ya lo tenemos con
		 * Producto_Rebajado y no lo queremos repetido
		 */
		
		for (Producto p : aListaProductos) {
			this._bDPrincipal.eliminarProductoAdministrador(p.getId_Producto());
		}
		
		return o;

	}

	public Oferta actualizarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad,
			String aFechaActualizacion, int aIdOferta, double[] aPrecios) throws PersistentException {
		eliminarOfertaAdmin(aIdOferta, aListaProductos);
		return insertarOferta(aNombreOferta, aListaProductos, aFechaCaducidad, aFechaActualizacion, aPrecios);
	}

	public boolean eliminarOfertaAdmin(int aIdOferta, Producto[] aListaProductos) throws PersistentException {
		Oferta o = 	OfertaDAO.getOfertaByORMID(aIdOferta);
		
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {
			OfertaDAO.deleteAndDissociate(o);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
			return false;
		}
		
		PersistentTransaction t2 = HitoPersistentManager.instance().getSession().beginTransaction();

		try {
			for(Producto_Rebajado pr : o._Pertenece_a.toArray()) {
				System.out.println("Producto rebajado : " + pr.getNombre());
				Producto_RebajadoDAO.deleteAndDissociate(pr);
			}
			t2.commit();
		} catch(Exception e) {
			t2.rollback();
			e.printStackTrace();
		}
		
		return true;
	}
}