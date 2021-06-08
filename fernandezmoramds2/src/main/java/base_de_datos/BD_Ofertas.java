package base_de_datos;

import basededatos.BDPrincipal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Ofertas {
	public BDPrincipal _bDPrincipal;
	public Vector<Oferta> _oferta = new Vector<Oferta>();

	public Oferta[] cargarOfertas() throws PersistentException {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String fechaActual = formatter.format(date); // Tipo 07/07/2000
		String fechaOferta = "";
		int anio, mes, dia;
		int anioActual, mesActual, diaActual;

		anioActual = Integer.parseInt(fechaActual.substring(6));
		mesActual = Integer.parseInt(fechaActual.substring(3, 5));
		diaActual = Integer.parseInt(fechaActual.substring(0, 2));

		Oferta[] ofertas = null;
		Oferta[] ofertasResultado = null;

		ofertas = OfertaDAO.listOfertaByQuery(null, null);
		ofertasResultado = new Oferta[ofertas.length];

		int contador = 0;

		for (int i = 0; i < ofertas.length; i++) {
			fechaOferta = ofertas[i].getFecha_caducidad(); // Tipo 2000-05-25

			anio = Integer.parseInt(fechaOferta.substring(0, 4));
			mes = Integer.parseInt(fechaOferta.substring(5, 7));
			dia = Integer.parseInt(fechaOferta.substring(8));

			/* Condiciones que no cumplen: */

			/* 1. Que se haya pasado el año */
			if (anioActual > anio)
				break;
			/* 2. Que estemos en el mismo año y se haya pasado el mes */
			if (anioActual == anio && mesActual > mes)
				break;
			/* 3. Que estemos en el mismo año y el mismo mes y se haya pasado el dia */
			if (anioActual == anio & mesActual == mes && diaActual > dia)
				break;

			/* En cualquier otro caso se añade */
			ofertasResultado[contador] = ofertas[i];
			contador++;
		}

		return ofertasResultado;
	}

	public Oferta insertarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad,
			String aFechaRegistro, double[] aPrecios) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
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

//		MDS2PersistentManager.instance().disposePersistentManager();

		PersistentTransaction t2 = MDS2PersistentManager.instance().getSession().beginTransaction();
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

				pr.setPrecio_producto(p.getPrecio_producto());
				pr.setNombre(p.getNombre());
				pr.setDescripcion(p.getDescripcion());
				pr.setORM__Categoria(p.get_Categoria());
				pr.setNum_Unidades_Restantes(p.getNum_Unidades_Restantes());
				pr.setNum_Unidades_Vendidas(p.getNum_Unidades_Vendidas());
				pr.setORM__Tiene(o);

				pr.setPrecio_rebajado(aPrecios[contador]);

				contador++;

				for (Imagen i : p._Imagen.toArray()) {
					i.set_Producto(pr);
				}

				for (Comentario c : p._Pertenece_a.toArray()) {
					c.set_Tiene(pr);
				}

				for (Producto_en_compra pc : p._Producto_en_compra.toArray()) {
					pc.set_Producto(pr);
				}

				for (Valoracion v : p._Valorado_por.toArray()) {
					v.set_Valorado(pr);
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

		MDS2PersistentManager.instance().disposePersistentManager();

		/*
		 * Paso 3. Eliminar el producto de la lista porque ya lo tenemos con
		 * Producto_Rebajado y no lo queremos repetido
		 */

		for (Producto p : aListaProductos) {
			this._bDPrincipal.eliminarProductoOriginalOferta(p);
		}

		return o;

	}

	public Oferta actualizarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad,
			String aFechaActualizacion, int aIdOferta, double[] aPrecios) throws PersistentException {

		PersistentTransaction t2 = MDS2PersistentManager.instance().getSession().beginTransaction();
		this._bDPrincipal = new BDPrincipal();
		Producto_Rebajado pr = null;
		boolean creandoNuevo = false;
		int contador = 0;

		Oferta o = OfertaDAO.listOfertaByQuery("Nombre_Oferta = '" + aNombreOferta + "'", null)[0];

		try {
			for (Producto p : aListaProductos) {

				System.out.println("Empezando con el producto : " + p.getNombre());

//				Producto_Rebajado listado[] = Producto_RebajadoDAO.listProducto_RebajadoByQuery("ProductoId_Producto = " + 
//				p.getId_Producto(), null);

				/*
				 * Si el producto rebajado ya existia, modificamos sus datos, si no, lo creamos
				 */

				pr = Producto_RebajadoDAO.createProducto_Rebajado();
				pr.setPrecio_producto(p.getPrecio_producto());
				pr.setNombre(p.getNombre());
				pr.setDescripcion(p.getDescripcion());
				pr.setORM__Categoria(p.get_Categoria());
				pr.setNum_Unidades_Restantes(p.getNum_Unidades_Restantes());
				pr.setNum_Unidades_Vendidas(p.getNum_Unidades_Vendidas());
				pr.setORM__Tiene(o);

				pr.setPrecio_rebajado(aPrecios[contador]);

				contador++;

				for (Imagen i : p._Imagen.toArray()) {
					i.set_Producto(pr);
				}

				for (Comentario c : p._Pertenece_a.toArray()) {
					c.set_Tiene(pr);
				}

				for (Producto_en_compra pc : p._Producto_en_compra.toArray()) {
					pc.set_Producto(pr);
				}

				for (Valoracion v : p._Valorado_por.toArray()) {
					v.set_Valorado(pr);
				}

				/* Guardamos los cambios */
				Producto_RebajadoDAO.save(pr);
				o._Pertenece_a.add(pr);
				System.out.println("Terminando con el producto : " + p.getNombre());

			}

			OfertaDAO.save(o);

			t2.commit();

		} catch (Exception e) {
			e.printStackTrace();
			t2.rollback();
		}

		MDS2PersistentManager.instance().disposePersistentManager();

		for (Producto p : aListaProductos) {
			this._bDPrincipal.eliminarProductoOriginalOferta(p);
		}

		return o;

	}

	public boolean eliminarOfertaAdmin(int aIdOferta, Producto[] aListaProductos) throws PersistentException {

		/* Recuperamos el producto original */
		PersistentTransaction t3 = MDS2PersistentManager.instance().getSession().beginTransaction();

		try {
			for (Producto p : aListaProductos) {
				Producto product = ProductoDAO.createProducto();
				product.setORM__Categoria(p.get_Categoria());
				product.setDescripcion(p.getDescripcion());
				product.setNombre(p.getNombre());
				product.setNum_Unidades_Restantes(p.getNum_Unidades_Restantes());
				product.setNum_Unidades_Vendidas(p.getNum_Unidades_Vendidas());
				product.setPrecio_producto(p.getPrecio_producto());

				for (Imagen i : p._Imagen.toArray()) {
					i.set_Producto(product);
				}

				for (Comentario c : p._Pertenece_a.toArray()) {
					c.set_Tiene(product);
				}

				for (Producto_en_compra pc : p._Producto_en_compra.toArray()) {
					pc.set_Producto(product);
				}

				for (Valoracion v : p._Valorado_por.toArray()) {
					v.set_Valorado(product);
				}

				ProductoDAO.save(product);
			}

			t3.commit();
		} catch (Exception e) {
			e.printStackTrace();
			t3.rollback();
		}

		MDS2PersistentManager.instance().disposePersistentManager();

		Oferta o = OfertaDAO.getOfertaByORMID(aIdOferta);

		/* Nos deshacemos del producto rebajado */
		PersistentTransaction t2 = MDS2PersistentManager.instance().getSession().beginTransaction();

		try {
			for (Producto_Rebajado pr : o._Pertenece_a.toArray()) {
				Producto_RebajadoDAO.deleteAndDissociate(pr);
			}
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
			e.printStackTrace();
		}

		MDS2PersistentManager.instance().disposePersistentManager();

		/* Borramos la oferta */
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

		try {
			OfertaDAO.deleteAndDissociate(o);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
			return false;
		}

		/*
		 * Aqui faltaria una vez se borra el producto rebajado, volver a insertarlo como
		 * producto normal
		 */

		return true;
	}

	public Oferta[] cargarOfertasAdmin() throws PersistentException {
		return OfertaDAO.listOfertaByQuery(null, null);
	}

}