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
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			cat = CategoriaDAO.listCategoriaByQuery(null, null);
		} catch (Exception e) {
			t.rollback();
		}

		return cat;
	}

	public Categoria insertarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaRegistro) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Categoria c = CategoriaDAO.createCategoria();
			
		try {

			if(c == null) System.out.println("C ES NULL");
			else System.out.println("NO ES NULL");
			
			
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
				System.out.println("Tratando el producto : " + p.getNombre() + " para introducirlo en la categoria : " + c.getNombre_categoria());
				Producto pr = ProductoDAO.getProductoByORMID(p.getId_Producto());
				System.out.println("ENTONRADO");
//				pr.set_Categoria(c);
				pr.setORM__Categoria(c);
				System.out.println("INTRODUCIDO");
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
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
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
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {
			Categoria c = CategoriaDAO.getCategoriaByORMID(aIdCategoria);
			CategoriaDAO.delete(c);
			t.commit();
		} catch(Exception e) {
			t.rollback();
			e.printStackTrace();
			return false;
		}
		
		PersistentTransaction t2 = HitoPersistentManager.instance().getSession().beginTransaction();
		
		try {
			for(Producto p : aListaProductos) { 
				Producto pr = ProductoDAO.getProductoByORMID(p.getId_Producto());
				pr.setORM__Categoria(null);
//				pr.set_Categoria(null);
			}
			t2.commit();			
		} catch(Exception e) {
			e.printStackTrace();
			t2.rollback();
			return false;
		}	
		
		return true;
	}
	

}