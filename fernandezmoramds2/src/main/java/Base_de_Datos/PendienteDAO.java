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

public class PendienteDAO {
	public static Pendiente loadPendienteByORMID(int codigo) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadPendienteByORMID(session, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente getPendienteByORMID(int codigo) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return getPendienteByORMID(session, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByORMID(int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadPendienteByORMID(session, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente getPendienteByORMID(int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return getPendienteByORMID(session, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByORMID(PersistentSession session, int codigo) throws PersistentException {
		try {
			return (Pendiente) session.load(Base_de_Datos.Pendiente.class, new Integer(codigo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente getPendienteByORMID(PersistentSession session, int codigo) throws PersistentException {
		try {
			return (Pendiente) session.get(Base_de_Datos.Pendiente.class, new Integer(codigo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByORMID(PersistentSession session, int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pendiente) session.load(Base_de_Datos.Pendiente.class, new Integer(codigo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente getPendienteByORMID(PersistentSession session, int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pendiente) session.get(Base_de_Datos.Pendiente.class, new Integer(codigo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPendiente(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return queryPendiente(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPendiente(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return queryPendiente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente[] listPendienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return listPendienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente[] listPendienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return listPendienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPendiente(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Pendiente as Pendiente");
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
	
	public static List queryPendiente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Pendiente as Pendiente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pendiente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente[] listPendienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPendiente(session, condition, orderBy);
			return (Pendiente[]) list.toArray(new Pendiente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente[] listPendienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPendiente(session, condition, orderBy, lockMode);
			return (Pendiente[]) list.toArray(new Pendiente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadPendienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadPendienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Pendiente[] pendientes = listPendienteByQuery(session, condition, orderBy);
		if (pendientes != null && pendientes.length > 0)
			return pendientes[0];
		else
			return null;
	}
	
	public static Pendiente loadPendienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Pendiente[] pendientes = listPendienteByQuery(session, condition, orderBy, lockMode);
		if (pendientes != null && pendientes.length > 0)
			return pendientes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePendienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return iteratePendienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePendienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return iteratePendienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePendienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Pendiente as Pendiente");
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
	
	public static java.util.Iterator iteratePendienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Pendiente as Pendiente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pendiente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente createPendiente() {
		return new Base_de_Datos.Pendiente();
	}
	
	public static boolean save(Base_de_Datos.Pendiente pendiente) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().saveObject(pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Base_de_Datos.Pendiente pendiente) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().deleteObject(pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Base_de_Datos.Pendiente pendiente)throws PersistentException {
		try {
			if (pendiente.get_Encargado_de_compras() != null) {
				pendiente.get_Encargado_de_compras()._Pendiente.remove(pendiente);
			}
			
			if (pendiente.get_Hace_compra() != null) {
				pendiente.get_Hace_compra()._Compra.remove(pendiente);
			}
			
			Base_de_Datos.Producto_en_compra[] l_Producto_en_compras = pendiente._Producto_en_compra.toArray();
			for(int i = 0; i < l_Producto_en_compras.length; i++) {
				l_Producto_en_compras[i]._Pendiente.remove(pendiente);
			}
			return delete(pendiente);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Base_de_Datos.Pendiente pendiente, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (pendiente.get_Encargado_de_compras() != null) {
				pendiente.get_Encargado_de_compras()._Pendiente.remove(pendiente);
			}
			
			if (pendiente.get_Hace_compra() != null) {
				pendiente.get_Hace_compra()._Compra.remove(pendiente);
			}
			
			Base_de_Datos.Producto_en_compra[] l_Producto_en_compras = pendiente._Producto_en_compra.toArray();
			for(int i = 0; i < l_Producto_en_compras.length; i++) {
				l_Producto_en_compras[i]._Pendiente.remove(pendiente);
			}
			try {
				session.delete(pendiente);
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
	
	public static boolean refresh(Base_de_Datos.Pendiente pendiente) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().getSession().refresh(pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Base_de_Datos.Pendiente pendiente) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().getSession().evict(pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByCriteria(PendienteCriteria pendienteCriteria) {
		Pendiente[] pendientes = listPendienteByCriteria(pendienteCriteria);
		if(pendientes == null || pendientes.length == 0) {
			return null;
		}
		return pendientes[0];
	}
	
	public static Pendiente[] listPendienteByCriteria(PendienteCriteria pendienteCriteria) {
		return pendienteCriteria.listPendiente();
	}
}
