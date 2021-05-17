package base_de_datos;

import basededatos.BDPrincipal;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Producto;

public class BD_Productos {
	public BDPrincipal _bDPrincipal;
	public Vector<Producto> _producto = new Vector<Producto>();

	public Producto[] cargarProductosMasVendidos(String aNombreCategoria) {
		throw new UnsupportedOperationException();
	}

	public Producto cargarProducto(int aIdProducto) throws PersistentException {
		return ProductoDAO.listProductoByQuery("Id_Producto = '" + aIdProducto + "'", null)[0];
	}

	public Producto[] cargarProductosCategoria(Categoria aCategoria) throws PersistentException {
		Producto[] pds = null;
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			System.out.println("El id que me ha llegado es : " + aCategoria.getId_Categoria());
			Categoria c = CategoriaDAO.loadCategoriaByORMID(aCategoria.getId_Categoria());
			pds = c._Producto.toArray();
		} catch (Exception e) {
			t.rollback();
		}

		return pds;
	}

	public Producto[] cargarProductosOferta(Oferta aOferta) throws PersistentException {
		Producto[] pds = null;
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {
			Oferta o = OfertaDAO.loadOfertaByORMID(aOferta.getId_Oferta());
			pds = o._Pertenece_a.toArray();
		} catch (Exception e) {
			t.rollback();
		}

		return pds;
	}

	public Producto[] cargarProductos() {
		return null;
	}

	public void eliminarProductoAdministrador(int aIdProducto) throws PersistentException {
		Producto p = ProductoDAO.getProductoByORMID(aIdProducto);

		this._bDPrincipal = new BDPrincipal();

		if (p != null) {
			this._bDPrincipal.eliminarImagenProducto(p);
			this._bDPrincipal._bD_Productos_Rebajados.eliminarProductosRebajados(p.getId_Producto());
		}

		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {
			ProductoDAO.delete(p);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}

		this._bDPrincipal.eliminarComentarioProducto(p);
		this._bDPrincipal.eliminarValoracionesProducto(p);
	}

	public Producto insertarProducto(String aNombreProducto, String aDescripcion, double aPrecio, int aNumUnidades,
			String[] aRuta) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Producto p = null;
		int contador = 0 ;
		boolean esPrincipal = false;
		try {
			p = ProductoDAO.createProducto();

			p.setNombre(aNombreProducto);
			p.setDescripcion(aDescripcion);
			p.setPrecio_producto(aPrecio);
			p.setNum_Unidades_Restantes(aNumUnidades);

			ProductoDAO.save(p);

			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}

		this._bDPrincipal = new BDPrincipal();
		for (String ruta : aRuta) {
			if (ruta != null) {
				if(contador == 0) esPrincipal = true;
				this._bDPrincipal.guardarImagenesProducto(ruta, p, esPrincipal);
				esPrincipal = false;
				contador ++;
			}
		}

		return p;
	}

	public Producto[] cargarProductosListado() throws PersistentException {
		return ProductoDAO.listProductoByQuery(null, null);

	}

	public Producto actualizarProducto(int aIdProducto, String aNombre, double aPrecio, String aDescripcion,
			String[] aRutaImagen, int aNumUnidades) throws PersistentException {
		
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Producto p = null;
		int contador = 0 ;
		boolean esPrincipal = false;
		
		try {
			p = ProductoDAO.getProductoByORMID(aIdProducto);
			
			p.setNombre(aNombre);
			p.setDescripcion(aDescripcion);
			p.setPrecio_producto(aPrecio);
			p.setNum_Unidades_Restantes(aNumUnidades);
					
			ProductoDAO.save(p);
			
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		

		this._bDPrincipal = new BDPrincipal();
		for (String ruta : aRutaImagen) {
			if (ruta != null) {
				if(contador == 0) esPrincipal = true;
				this._bDPrincipal.guardarImagenesProducto(ruta, p, esPrincipal);
				esPrincipal = false;
				contador ++;
			}
		}
		return p;
	}

	public Producto[] cargarProductosBusquedaZonaProductos(String aProducto) throws PersistentException {
		return ProductoDAO.listProductoByQuery("Nombre LIKE '%" + aProducto + "%'", "nombre");
	}

	public Producto[] cargarProductos(String aProducto) throws PersistentException {

		return null;
	}

	public Producto[] cargarProductosPorCategoria(String aNombreCategoria, String aNombreProducto) throws PersistentException {
		if (aNombreCategoria != null) {
			Categoria c = CategoriaDAO.loadCategoriaByQuery("Nombre_categoria LIKE '%" + aNombreCategoria + "%'", null);
			Producto[] p = ProductoDAO.listProductoByQuery(
					"CategoriaId_Categoria = " + c.getId_Categoria() + " AND Nombre LIKE '%" + aNombreProducto + "%'",
					null);

			return p;
		} else {
			Producto[] p = ProductoDAO.listProductoByQuery("Nombre LIKE '%" + aNombreProducto + "%'", "Nombre");
			return p;
		}
	}

}
