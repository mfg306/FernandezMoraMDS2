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
		return ProductoDAO.listProductoByQuery("IdProducto = '"+aIdProducto+"'",null )[0];
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
		} catch(Exception e) {
			t.rollback();
		}
		
		return pds;		
	}

	public Producto[] cargarProductos() {
		throw new UnsupportedOperationException();
	}

	public void eliminarProductoAdministrador(int aIdProducto) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Producto p = null;
		
		try {
			p = ProductoDAO.getProductoByORMID(aIdProducto);
			
			for(Comentario c : p._Pertenece_a.toArray()) {
				p._Pertenece_a.remove(c);
			}
			
			/*Hay que eliminar los comentarios del producto*/
			
			
			ProductoDAO.delete(p);
			t.commit();			
		} catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		
	}

	public Producto[] cargarProductos(String aProducto) throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public Producto insertarProducto(String aNombreProducto, String aDescripcion, double aPrecio, int aNumUnidades) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		
		try {
			 Producto p = ProductoDAO.createProducto();
			 
			 p.setNombre(aNombreProducto);
			 p.setDescripcion(aDescripcion);
			 p.setPrecio_producto(aPrecio);
			 p.setNum_Unidades_Restantes(aNumUnidades);
			 
			 ProductoDAO.save(p);
			
			 t.commit();
			 
			 return p;	 
		} catch(Exception e) {
			t.rollback();
		}
		
		return null;
		
	}

	public Producto[] cargarProductosListado() throws PersistentException {
		return ProductoDAO.listProductoByQuery(null,null);
		
	}

	public void actualizarProducto(String aNombreProducto, String aDescripcion) {
		throw new UnsupportedOperationException();
	}
	
	public Producto[] cargarProductosBusquedaZonaProductos(String aProducto) throws PersistentException{	
		return ProductoDAO.listProductoByQuery("Nombre LIKE '%" + aProducto + "%'", "nombre");
	}
	
}
