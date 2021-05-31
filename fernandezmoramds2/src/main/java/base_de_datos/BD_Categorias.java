package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import javax.validation.ConstraintViolationException;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;


public class BD_Categorias {
	public BDPrincipal _bDPrincipal;
	public Vector<Categoria> _categoria = new Vector<Categoria>();

	public Categoria[] cargarCategorias() throws PersistentException {
		Categoria[] cat = null;
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			cat = CategoriaDAO.listCategoriaByQuery(null, null);
		} catch (Exception e) {
			t.rollback();
		}

		return cat;
	}

	public Categoria insertarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaRegistro) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		Categoria c = CategoriaDAO.createCategoria();
			
		try {
			c.setNombre_categoria(aNombreCategoria);
			c.setFecha_registro(aFechaRegistro);

			CategoriaDAO.save(c);

			t.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		/*Hasta este punto tenemos la categoria creada. Vamos a coger la lista de productos y actualizarle 
		 * su categoria*/
		
		PersistentTransaction t2 = MDS2PersistentManager.instance().getSession().beginTransaction();
		
		try {
			for(Producto p : aListaProductos) { 
				Producto pr = ProductoDAO.getProductoByORMID(p.getId_Producto());
				pr.setORM__Categoria(c);
			}
			t2.commit();			
		} catch(Exception e) {
			e.printStackTrace();
			t2.rollback();
		}	
		
		return c;
	}

	public Categoria[] cargarCategoriasAdministrador() throws PersistentException {
		Categoria[] cat = null;
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			cat = CategoriaDAO.listCategoriaByQuery(null, null);
		} catch (Exception e) {
			t.rollback();
		}
				
		return cat;
	}

	public Categoria actualizarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaActualizacion, Categoria aCategoria) throws PersistentException, ConstraintViolationException {
		eliminarCategoriaAdmin(aCategoria.getId_Categoria(), aListaProductos);
		return insertarCategoria(aNombreCategoria, aListaProductos, aFechaActualizacion);
	}

	public boolean eliminarCategoriaAdmin(int aIdCategoria, Producto[] aListaProductos) throws PersistentException {
		PersistentTransaction t2 = MDS2PersistentManager.instance().getSession().beginTransaction();
		
		try {
			for(Producto p : aListaProductos) { 
				Producto pr = ProductoDAO.getProductoByORMID(p.getId_Producto());
				pr.setORM__Categoria(null);
			}
			t2.commit();			
		} catch(Exception e) {
			e.printStackTrace();
			t2.rollback();
			return false;
		}	
		
		
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

		try {
			Categoria c = CategoriaDAO.getCategoriaByORMID(aIdCategoria);

			CategoriaDAO.delete(c);
			t.commit();
		} catch(Exception e) {
			t.rollback();
			e.printStackTrace();
			return false;
		}
		
		
		return true;
	}
	

}