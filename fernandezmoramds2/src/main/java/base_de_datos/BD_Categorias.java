package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;


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

	public void insertarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaRegistro) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Categoria c = null;
		
		try {
			c = CategoriaDAO.createCategoria();

			c.setNombre_categoria(aNombreCategoria);
			c.setFecha_registro(aFechaRegistro);

			CategoriaDAO.save(c);

			t.commit();
			
			System.out.println("Se ha creado la categoria");
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		/*Hasta este punto tenemos la categoria creada. Vamos a coger la lista de productos y actualizarle 
		 * su categoria*/
		
		PersistentTransaction t2 = HitoPersistentManager.instance().getSession().beginTransaction();
		
		try {
			for(Producto p : aListaProductos) { 
				Producto pr = ProductoDAO.getProductoByORMID(p.getId_Producto());
				pr.set_Categoria(c);
			}
			t2.commit();			
		} catch(Exception e) {
			e.printStackTrace();
			t2.rollback();
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
				
		return cat;
	}

	public void actualizarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaActualizacion, int aIdCategoria) throws PersistentException {
		if(eliminarCategoriaAdmin(aIdCategoria, aListaProductos)) System.out.println("Se ha eliminado la categoria");
//		insertarCategoria(aNombreCategoria, aListaProductos, aFechaActualizacion);
	}

	public boolean eliminarCategoriaAdmin(int aIdCategoria, Producto[] aListaProductos) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {
			Categoria c = CategoriaDAO.getCategoriaByORMID(aIdCategoria);
			CategoriaDAO.delete(c);
			t.commit();
			return true;
		} catch(Exception e) {
			t.rollback();
		}
		
		PersistentTransaction t2 = HitoPersistentManager.instance().getSession().beginTransaction();
		
		try {
			for(Producto p : aListaProductos) { 
				Producto pr = ProductoDAO.getProductoByORMID(p.getId_Producto());
//				pr.set_Categoria(c);
			}
			t2.commit();			
		} catch(Exception e) {
			e.printStackTrace();
			t2.rollback();
		}	
		
		return false;
	}
	

}