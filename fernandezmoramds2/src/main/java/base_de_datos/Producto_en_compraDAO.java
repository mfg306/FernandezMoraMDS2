/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: martafernandez(University of Almeria)
 * License Type: Academic
 */
package base_de_datos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Producto_en_compraDAO {
	public static Producto_en_compra loadProducto_en_compraByORMID(int codigo) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadProducto_en_compraByORMID(session, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra getProducto_en_compraByORMID(int codigo) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getProducto_en_compraByORMID(session, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByORMID(int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadProducto_en_compraByORMID(session, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra getProducto_en_compraByORMID(int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getProducto_en_compraByORMID(session, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByORMID(PersistentSession session, int codigo) throws PersistentException {
		try {
			return (Producto_en_compra) session.load(base_de_datos.Producto_en_compra.class, new Integer(codigo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra getProducto_en_compraByORMID(PersistentSession session, int codigo) throws PersistentException {
		try {
			return (Producto_en_compra) session.get(base_de_datos.Producto_en_compra.class, new Integer(codigo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByORMID(PersistentSession session, int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto_en_compra) session.load(base_de_datos.Producto_en_compra.class, new Integer(codigo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra getProducto_en_compraByORMID(PersistentSession session, int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto_en_compra) session.get(base_de_datos.Producto_en_compra.class, new Integer(codigo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_en_compra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryProducto_en_compra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_en_compra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryProducto_en_compra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra[] listProducto_en_compraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listProducto_en_compraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra[] listProducto_en_compraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listProducto_en_compraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_en_compra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto_en_compra as Producto_en_compra");
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
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto_en_compra as Producto_en_compra");
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
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadProducto_en_compraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
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
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateProducto_en_compraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_en_compraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateProducto_en_compraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_en_compraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto_en_compra as Producto_en_compra");
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
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto_en_compra as Producto_en_compra");
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
		return new base_de_datos.Producto_en_compra();
	}
	
	public static boolean save(base_de_datos.Producto_en_compra producto_en_compra) throws PersistentException {
		try {
			MDS2PersistentManager.instance().saveObject(producto_en_compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.Producto_en_compra producto_en_compra) throws PersistentException {
		try {
			MDS2PersistentManager.instance().deleteObject(producto_en_compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Producto_en_compra producto_en_compra)throws PersistentException {
		try {
			if (producto_en_compra.get_Pendiente() != null) {
				producto_en_compra.get_Pendiente()._Producto_en_compra.remove(producto_en_compra);
			}
			
			if (producto_en_compra.get_Producto() != null) {
				producto_en_compra.get_Producto()._Producto_en_compra.remove(producto_en_compra);
			}
			
			return delete(producto_en_compra);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Producto_en_compra producto_en_compra, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (producto_en_compra.get_Pendiente() != null) {
				producto_en_compra.get_Pendiente()._Producto_en_compra.remove(producto_en_compra);
			}
			
			if (producto_en_compra.get_Producto() != null) {
				producto_en_compra.get_Producto()._Producto_en_compra.remove(producto_en_compra);
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
	
	public static boolean refresh(base_de_datos.Producto_en_compra producto_en_compra) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().refresh(producto_en_compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.Producto_en_compra producto_en_compra) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().evict(producto_en_compra);
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
