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
package base_de_datos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ValoracionDAO {
	public static Valoracion loadValoracionByORMID(int id_valoracion) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadValoracionByORMID(session, id_valoracion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion getValoracionByORMID(int id_valoracion) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getValoracionByORMID(session, id_valoracion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByORMID(int id_valoracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadValoracionByORMID(session, id_valoracion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion getValoracionByORMID(int id_valoracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getValoracionByORMID(session, id_valoracion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByORMID(PersistentSession session, int id_valoracion) throws PersistentException {
		try {
			return (Valoracion) session.load(base_de_datos.Valoracion.class, new Integer(id_valoracion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion getValoracionByORMID(PersistentSession session, int id_valoracion) throws PersistentException {
		try {
			return (Valoracion) session.get(base_de_datos.Valoracion.class, new Integer(id_valoracion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByORMID(PersistentSession session, int id_valoracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Valoracion) session.load(base_de_datos.Valoracion.class, new Integer(id_valoracion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion getValoracionByORMID(PersistentSession session, int id_valoracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Valoracion) session.get(base_de_datos.Valoracion.class, new Integer(id_valoracion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryValoracion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryValoracion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryValoracion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryValoracion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion[] listValoracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listValoracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion[] listValoracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listValoracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryValoracion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Valoracion as Valoracion");
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
	
	public static List queryValoracion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Valoracion as Valoracion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Valoracion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion[] listValoracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryValoracion(session, condition, orderBy);
			return (Valoracion[]) list.toArray(new Valoracion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion[] listValoracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryValoracion(session, condition, orderBy, lockMode);
			return (Valoracion[]) list.toArray(new Valoracion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadValoracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadValoracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Valoracion[] valoracions = listValoracionByQuery(session, condition, orderBy);
		if (valoracions != null && valoracions.length > 0)
			return valoracions[0];
		else
			return null;
	}
	
	public static Valoracion loadValoracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Valoracion[] valoracions = listValoracionByQuery(session, condition, orderBy, lockMode);
		if (valoracions != null && valoracions.length > 0)
			return valoracions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateValoracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateValoracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateValoracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateValoracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateValoracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Valoracion as Valoracion");
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
	
	public static java.util.Iterator iterateValoracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Valoracion as Valoracion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Valoracion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion createValoracion() {
		return new base_de_datos.Valoracion();
	}
	
	public static boolean save(base_de_datos.Valoracion valoracion) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().saveObject(valoracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.Valoracion valoracion) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().deleteObject(valoracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Valoracion valoracion)throws PersistentException {
		try {
			if (valoracion.get_Valorado_por() != null) {
				valoracion.get_Valorado_por()._Valora.remove(valoracion);
			}
			
			base_de_datos.Producto[] l_Valorados = valoracion._Valorado.toArray();
			for(int i = 0; i < l_Valorados.length; i++) {
				l_Valorados[i].set_Valorado_por(null);
			}
			return delete(valoracion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Valoracion valoracion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (valoracion.get_Valorado_por() != null) {
				valoracion.get_Valorado_por()._Valora.remove(valoracion);
			}
			
			base_de_datos.Producto[] l_Valorados = valoracion._Valorado.toArray();
			for(int i = 0; i < l_Valorados.length; i++) {
				l_Valorados[i].set_Valorado_por(null);
			}
			try {
				session.delete(valoracion);
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
	
	public static boolean refresh(base_de_datos.Valoracion valoracion) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().getSession().refresh(valoracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.Valoracion valoracion) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().getSession().evict(valoracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByCriteria(ValoracionCriteria valoracionCriteria) {
		Valoracion[] valoracions = listValoracionByCriteria(valoracionCriteria);
		if(valoracions == null || valoracions.length == 0) {
			return null;
		}
		return valoracions[0];
	}
	
	public static Valoracion[] listValoracionByCriteria(ValoracionCriteria valoracionCriteria) {
		return valoracionCriteria.listValoracion();
	}
}
