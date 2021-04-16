/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: jorge(University of Almeria)
 * License Type: Academic
 */
package Base_de_Datos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Producto_RebajadoDAO {
	public static Producto_Rebajado loadProducto_RebajadoByORMID(int id_Producto) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadProducto_RebajadoByORMID(session, id_Producto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado getProducto_RebajadoByORMID(int id_Producto) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return getProducto_RebajadoByORMID(session, id_Producto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByORMID(int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadProducto_RebajadoByORMID(session, id_Producto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado getProducto_RebajadoByORMID(int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return getProducto_RebajadoByORMID(session, id_Producto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByORMID(PersistentSession session, int id_Producto) throws PersistentException {
		try {
			return (Producto_Rebajado) session.load(Base_de_Datos.Producto_Rebajado.class, new Integer(id_Producto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado getProducto_RebajadoByORMID(PersistentSession session, int id_Producto) throws PersistentException {
		try {
			return (Producto_Rebajado) session.get(Base_de_Datos.Producto_Rebajado.class, new Integer(id_Producto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByORMID(PersistentSession session, int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto_Rebajado) session.load(Base_de_Datos.Producto_Rebajado.class, new Integer(id_Producto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado getProducto_RebajadoByORMID(PersistentSession session, int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto_Rebajado) session.get(Base_de_Datos.Producto_Rebajado.class, new Integer(id_Producto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_Rebajado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return queryProducto_Rebajado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_Rebajado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return queryProducto_Rebajado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado[] listProducto_RebajadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return listProducto_RebajadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado[] listProducto_RebajadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return listProducto_RebajadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_Rebajado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Producto_Rebajado as Producto_Rebajado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_Rebajado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Producto_Rebajado as Producto_Rebajado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto_Rebajado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado[] listProducto_RebajadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProducto_Rebajado(session, condition, orderBy);
			return (Producto_Rebajado[]) list.toArray(new Producto_Rebajado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado[] listProducto_RebajadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProducto_Rebajado(session, condition, orderBy, lockMode);
			return (Producto_Rebajado[]) list.toArray(new Producto_Rebajado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadProducto_RebajadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadProducto_RebajadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Producto_Rebajado[] producto_Rebajados = listProducto_RebajadoByQuery(session, condition, orderBy);
		if (producto_Rebajados != null && producto_Rebajados.length > 0)
			return producto_Rebajados[0];
		else
			return null;
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Producto_Rebajado[] producto_Rebajados = listProducto_RebajadoByQuery(session, condition, orderBy, lockMode);
		if (producto_Rebajados != null && producto_Rebajados.length > 0)
			return producto_Rebajados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProducto_RebajadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return iterateProducto_RebajadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_RebajadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return iterateProducto_RebajadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_RebajadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Producto_Rebajado as Producto_Rebajado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_RebajadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Producto_Rebajado as Producto_Rebajado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto_Rebajado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado createProducto_Rebajado() {
		return new Base_de_Datos.Producto_Rebajado();
	}
	
	public static boolean save(Base_de_Datos.Producto_Rebajado producto_Rebajado) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().saveObject(producto_Rebajado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Base_de_Datos.Producto_Rebajado producto_Rebajado) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().deleteObject(producto_Rebajado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Base_de_Datos.Producto_Rebajado producto_Rebajado)throws PersistentException {
		try {
			if (producto_Rebajado.get_Tiene() != null) {
				producto_Rebajado.get_Tiene()._Pertenece_a.remove(producto_Rebajado);
			}
			
			if (producto_Rebajado.get_Valorado_por() != null) {
				producto_Rebajado.get_Valorado_por()._Valorado.remove(producto_Rebajado);
			}
			
			if (producto_Rebajado.get_Categoria() != null) {
				producto_Rebajado.get_Categoria()._Producto.remove(producto_Rebajado);
			}
			
			Base_de_Datos.Producto_en_compra[] l_Producto_en_compras = producto_Rebajado._Producto_en_compra.toArray();
			for(int i = 0; i < l_Producto_en_compras.length; i++) {
				l_Producto_en_compras[i]._Producto.remove(producto_Rebajado);
			}
			Base_de_Datos.Comentario[] l_Pertenece_as = producto_Rebajado._Pertenece_a.toArray();
			for(int i = 0; i < l_Pertenece_as.length; i++) {
				l_Pertenece_as[i].set_Tiene(null);
			}
			Base_de_Datos.Imagen[] l_Imagens = producto_Rebajado._Imagen.toArray();
			for(int i = 0; i < l_Imagens.length; i++) {
				l_Imagens[i].set_Producto(null);
			}
			return delete(producto_Rebajado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Base_de_Datos.Producto_Rebajado producto_Rebajado, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (producto_Rebajado.get_Tiene() != null) {
				producto_Rebajado.get_Tiene()._Pertenece_a.remove(producto_Rebajado);
			}
			
			if (producto_Rebajado.get_Valorado_por() != null) {
				producto_Rebajado.get_Valorado_por()._Valorado.remove(producto_Rebajado);
			}
			
			if (producto_Rebajado.get_Categoria() != null) {
				producto_Rebajado.get_Categoria()._Producto.remove(producto_Rebajado);
			}
			
			Base_de_Datos.Producto_en_compra[] l_Producto_en_compras = producto_Rebajado._Producto_en_compra.toArray();
			for(int i = 0; i < l_Producto_en_compras.length; i++) {
				l_Producto_en_compras[i]._Producto.remove(producto_Rebajado);
			}
			Base_de_Datos.Comentario[] l_Pertenece_as = producto_Rebajado._Pertenece_a.toArray();
			for(int i = 0; i < l_Pertenece_as.length; i++) {
				l_Pertenece_as[i].set_Tiene(null);
			}
			Base_de_Datos.Imagen[] l_Imagens = producto_Rebajado._Imagen.toArray();
			for(int i = 0; i < l_Imagens.length; i++) {
				l_Imagens[i].set_Producto(null);
			}
			try {
				session.delete(producto_Rebajado);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Base_de_Datos.Producto_Rebajado producto_Rebajado) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().getSession().refresh(producto_Rebajado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Base_de_Datos.Producto_Rebajado producto_Rebajado) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().getSession().evict(producto_Rebajado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByCriteria(Producto_RebajadoCriteria producto_RebajadoCriteria) {
		Producto_Rebajado[] producto_Rebajados = listProducto_RebajadoByCriteria(producto_RebajadoCriteria);
		if(producto_Rebajados == null || producto_Rebajados.length == 0) {
			return null;
		}
		return producto_Rebajados[0];
	}
	
	public static Producto_Rebajado[] listProducto_RebajadoByCriteria(Producto_RebajadoCriteria producto_RebajadoCriteria) {
		return producto_RebajadoCriteria.listProducto_Rebajado();
	}
}
