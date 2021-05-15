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
			this._bDPrincipal._bD_Productos_Rebajados.eliminarProductosRebajados(p.getId_Producto());
			this._bDPrincipal._dB_Imagen.eliminarImagenProducto(p);
		}

		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {

			Producto_en_compra pLista[] = p._Producto_en_compra.toArray();
			for (Producto_en_compra pEC : pLista) {
				p._Producto_en_compra.remove(pEC);
			}

			Comentario comentarios[] = p._Pertenece_a.toArray();
			for(Comentario c : comentarios) {
				p._Pertenece_a.remove(c);
			}
			
			Valoracion valoraciones[] = p._Valorado_por.toArray();
			for(Valoracion v : valoraciones) {
				p._Valorado_por.remove(v);
			}
			
			
			ProductoDAO.delete(p);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}

	}

	public Producto insertarProducto(String aNombreProducto, String aDescripcion, double aPrecio, int aNumUnidades,
			String aRuta) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Producto p = null;
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
		this._bDPrincipal.guardarImagenesProducto(aRuta, p);

		return p;
	}

	public Producto[] cargarProductosListado() throws PersistentException {
		return ProductoDAO.listProductoByQuery(null, null);

	}

	public void actualizarProducto(int aIdProducto, String aNombre, double aPrecio, String aDescripcion,
			String aRutaImagen, int aNumUnidades) throws PersistentException {
		System.out.println("Se va a ejecutar este metodo");
		eliminarProductoAdministrador(aIdProducto);
//		insertarProducto(aNombre, aDescripcion, aPrecio, aNumUnidades, aRutaImagen);
	}

	public Producto[] cargarProductosBusquedaZonaProductos(String aProducto) throws PersistentException {
		return ProductoDAO.listProductoByQuery("Nombre LIKE '%" + aProducto + "%'", "nombre");
	}

	public Producto[] cargarProductos(String aProducto) throws PersistentException {

		return null;
	}

	public Producto[] cargarProductosPorCategoria(String aNombreCategoria, String aNombreProducto)throws PersistentException {
		if(aNombreCategoria != null) {
		Categoria c = CategoriaDAO.loadCategoriaByQuery("Nombre_categoria LIKE '%" + aNombreCategoria + "%'", null);
		Producto[] p = ProductoDAO.listProductoByQuery(
				"CategoriaId_Categoria = " + c.getId_Categoria() + " AND Nombre LIKE '%" + aNombreProducto + "%'",
				null);

		return p;
		}else {
			Producto[] p = ProductoDAO.listProductoByQuery("Nombre LIKE '%" + aNombreProducto + "%'","Nombre");
			return p;
		}
	}

}
