package base_de_datos;

import basededatos.BDPrincipal;

import java.util.Iterator;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Categoria;

public class BD_Categorias {
	public BDPrincipal _bDPrincipal;
	public Vector<Categoria> _categoria = new Vector<Categoria>();

	public Categoria[] cargarCategorias() throws PersistentException {
		Categoria[] cat = null;
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			cat = CategoriaDAO.listCategoriaByQuery(null, null);
		} catch (Exception e) {
			t.rollback();
		}

		return cat;
	}

	public void insertarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaRegistro)
			throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {
			Categoria c = CategoriaDAO.createCategoria();

			c.setNombre_categoria(aNombreCategoria);
			c.setFecha_registro(aFechaRegistro);

			for (Producto p : aListaProductos) {
				p.set_Categoria(c);
				c._Producto.add(p);
			}

			CategoriaDAO.save(c);
			t.commit();
			HitoPersistentManager.instance().disposePersistentManager();
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}
	}

	public Categoria[] cargarCategoriasAdministrador() throws PersistentException {
		Categoria[] cat = null;
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			cat = CategoriaDAO.listCategoriaByQuery(null, null);
			
		} catch (Exception e) {
			t.rollback();
		}
		
		HitoPersistentManager.instance().disposePersistentManager();
		
		return cat;
	}

	public void actualizarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaActualizacion, int aIdCategoria) throws PersistentException {
		
//		Categoria c = CategoriaDAO.getCategoriaByORMID(aIdCategoria);
//		Iterator<Producto> listaProductosC = c._Producto.getIterator();
//		
//		while(listaProductosC.hasNext()) {
//			listaProductosC.next().set_Categoria(null);
//		}
			
		eliminarCategoriaAdmin(aIdCategoria);
		HitoPersistentManager.instance().disposePersistentManager();
		insertarCategoria(aNombreCategoria, aListaProductos, aFechaActualizacion);
		HitoPersistentManager.instance().disposePersistentManager();

	}

	public boolean eliminarCategoriaAdmin(int aIdCategoria) throws PersistentException {
		Categoria c = CategoriaDAO.getCategoriaByORMID(aIdCategoria);
		if (CategoriaDAO.delete(c)) {
			return true;
		}
		return false;
	}

}