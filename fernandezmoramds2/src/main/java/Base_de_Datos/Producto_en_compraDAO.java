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

public class Producto_en_compraDAO {
	public static Producto_en_compra loadProducto_en_compraByORMID(int id_Producto_en_compra) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadProducto_en_compraByORMID(session, id_Producto_en_compra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra getProducto_en_compraByORMID(int id_Producto_en_compra) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return getProducto_en_compraByORMID(session, id_Producto_en_compra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByORMID(int id_Producto_en_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadProducto_en_compraByORMID(session, id_Producto_en_compra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra getProducto_en_compraByORMID(int id_Producto_en_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return getProducto_en_compraByORMID(session, id_Producto_en_compra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByORMID(PersistentSession session, int id_Producto_en_compra) throws PersistentException {
		try {
			return (Producto_en_compra) session.load(Base_de_Datos.Producto_en_compra.class, new Integer(id_Producto_en_compra));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra getProducto_en_compraByORMID(PersistentSession session, int id_Producto_en_compra) throws PersistentException {
		try {
			return (Producto_en_compra) session.get(Base_de_Datos.Producto_en_compra.class, new Integer(id_Producto_en_compra));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByORMID(PersistentSession session, int id_Producto_en_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto_en_compra) session.load(Base_de_Datos.Producto_en_compra.class, new Integer(id_Producto_en_compra), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra getProducto_en_compraByORMID(PersistentSession session, int id_Producto_en_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto_en_compra) session.get(Base_de_Datos.Producto_en_compra.class, new Integer(id_Producto_en_compra), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_en_compra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return queryProducto_en_compra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_en_compra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return queryProducto_en_compra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra[] listProducto_en_compraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return listProducto_en_compraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra[] listProducto_en_compraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return listProducto_en_compraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_en_compra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Producto_en_compra as Producto_en_compra");
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
	
	public static List queryProducto_en_compra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Producto_en_compra as Producto_en_compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto_en_compra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra[] listProducto_en_compraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProducto_en_compra(session, condition, orderBy);
			return (Producto_en_compra[]) list.toArray(new Producto_en_compra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra[] listProducto_en_compraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProducto_en_compra(session, condition, orderBy, lockMode);
			return (Producto_en_compra[]) list.toArray(new Producto_en_compra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadProducto_en_compraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadProducto_en_compraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Producto_en_compra[] producto_en_compras = listProducto_en_compraByQuery(session, condition, orderBy);
		if (producto_en_compras != null && producto_en_compras.length > 0)
			return producto_en_compras[0];
		else
			return null;
	}
	
	public static Producto_en_compra loadProducto_en_compraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Producto_en_compra[] producto_en_compras = listProducto_en_compraByQuery(session, condition, orderBy, lockMode);
		if (producto_en_compras != null && producto_en_compras.length > 0)
			return producto_en_compras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProducto_en_compraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return iterateProducto_en_compraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_en_compraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return iterateProducto_en_compraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_en_compraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Producto_en_compra as Producto_en_compra");
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
	
	public static java.util.Iterator iterateProducto_en_compraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Producto_en_compra as Producto_en_compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto_en_compra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra createProducto_en_compra() {
		return new Base_de_Datos.Producto_en_compra();
	}
	
	public static boolean save(Base_de_Datos.Producto_en_compra producto_en_compra) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().saveObject(producto_en_compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Base_de_Datos.Producto_en_compra producto_en_compra) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().deleteObject(producto_en_compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Base_de_Datos.Producto_en_compra producto_en_compra)throws PersistentException {
		try {
			Base_de_Datos.Producto[] l_Productos = producto_en_compra._Producto.toArray();
			for(int i = 0; i < l_Productos.length; i++) {
				l_Productos[i]._Producto_en_compra.remove(producto_en_compra);
			}
			Base_de_Datos.Pendiente[] l_Pendientes = producto_en_compra._Pendiente.toArray();
			for(int i = 0; i < l_Pendientes.length; i++) {
				l_Pendientes[i]._Producto_en_compra.remove(producto_en_compra);
			}
			return delete(producto_en_compra);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Base_de_Datos.Producto_en_compra producto_en_compra, org.orm.PersistentSession session)throws PersistentException {
		try {
			Base_de_Datos.Producto[] l_Productos = producto_en_compra._Producto.toArray();
			for(int i = 0; i < l_Productos.length; i++) {
				l_Productos[i]._Producto_en_compra.remove(producto_en_compra);
			}
			Base_de_Datos.Pendiente[] l_Pendientes = producto_en_compra._Pendiente.toArray();
			for(int i = 0; i < l_Pendientes.length; i++) {
				l_Pendientes[i]._Producto_en_compra.remove(producto_en_compra);
			}
			try {
				session.delete(producto_en_compra);
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
	
	public static boolean refresh(Base_de_Datos.Producto_en_compra producto_en_compra) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().getSession().refresh(producto_en_compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Base_de_Datos.Producto_en_compra producto_en_compra) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().getSession().evict(producto_en_compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByCriteria(Producto_en_compraCriteria producto_en_compraCriteria) {
		Producto_en_compra[] producto_en_compras = listProducto_en_compraByCriteria(producto_en_compraCriteria);
		if(producto_en_compras == null || producto_en_compras.length == 0) {
			return null;
		}
		return producto_en_compras[0];
	}
	
	public static Producto_en_compra[] listProducto_en_compraByCriteria(Producto_en_compraCriteria producto_en_compraCriteria) {
		return producto_en_compraCriteria.listProducto_en_compra();
	}
}
