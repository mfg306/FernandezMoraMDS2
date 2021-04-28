package base_de_datos;

import basededatos.BDPrincipal;
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

	public void eliminarCategoria(int aIdCategoria) {
		throw new UnsupportedOperationException();
	}

	public void insertarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaRegistro) {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargarCategoriasAdministrador() throws PersistentException {
		Categoria[] cat = null;
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			cat = CategoriaDAO.listCategoriaByQuery(null, null);
		} catch (Exception e) {
			t.rollback();
		}

		return cat;
	}

	public void actualizarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaActualizacion) {
		throw new UnsupportedOperationException();
	}
}