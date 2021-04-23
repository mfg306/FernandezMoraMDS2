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

public class Usuario_GeneralDAO {
	public static Usuario_General loadUsuario_GeneralByORMID(int id_Usuario) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadUsuario_GeneralByORMID(session, id_Usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General getUsuario_GeneralByORMID(int id_Usuario) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getUsuario_GeneralByORMID(session, id_Usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByORMID(int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadUsuario_GeneralByORMID(session, id_Usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General getUsuario_GeneralByORMID(int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getUsuario_GeneralByORMID(session, id_Usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByORMID(PersistentSession session, int id_Usuario) throws PersistentException {
		try {
			return (Usuario_General) session.load(base_de_datos.Usuario_General.class, new Integer(id_Usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General getUsuario_GeneralByORMID(PersistentSession session, int id_Usuario) throws PersistentException {
		try {
			return (Usuario_General) session.get(base_de_datos.Usuario_General.class, new Integer(id_Usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByORMID(PersistentSession session, int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_General) session.load(base_de_datos.Usuario_General.class, new Integer(id_Usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General getUsuario_GeneralByORMID(PersistentSession session, int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_General) session.get(base_de_datos.Usuario_General.class, new Integer(id_Usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_General(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryUsuario_General(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_General(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryUsuario_General(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General[] listUsuario_GeneralByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listUsuario_GeneralByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General[] listUsuario_GeneralByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listUsuario_GeneralByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_General(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Usuario_General as Usuario_General");
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
	
	public static List queryUsuario_General(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Usuario_General as Usuario_General");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_General", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General[] listUsuario_GeneralByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_General(session, condition, orderBy);
			return (Usuario_General[]) list.toArray(new Usuario_General[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General[] listUsuario_GeneralByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_General(session, condition, orderBy, lockMode);
			return (Usuario_General[]) list.toArray(new Usuario_General[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadUsuario_GeneralByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadUsuario_GeneralByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_General[] usuario_Generals = listUsuario_GeneralByQuery(session, condition, orderBy);
		if (usuario_Generals != null && usuario_Generals.length > 0)
			return usuario_Generals[0];
		else
			return null;
	}
	
	public static Usuario_General loadUsuario_GeneralByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_General[] usuario_Generals = listUsuario_GeneralByQuery(session, condition, orderBy, lockMode);
		if (usuario_Generals != null && usuario_Generals.length > 0)
			return usuario_Generals[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_GeneralByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateUsuario_GeneralByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_GeneralByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateUsuario_GeneralByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_GeneralByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Usuario_General as Usuario_General");
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
	
	public static java.util.Iterator iterateUsuario_GeneralByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Usuario_General as Usuario_General");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_General", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General createUsuario_General() {
		return new base_de_datos.Usuario_General();
	}
	
	public static boolean save(base_de_datos.Usuario_General usuario_General) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().saveObject(usuario_General);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.Usuario_General usuario_General) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().deleteObject(usuario_General);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(base_de_datos.Usuario_General usuario_General) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().getSession().refresh(usuario_General);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.Usuario_General usuario_General) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().getSession().evict(usuario_General);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByCriteria(Usuario_GeneralCriteria usuario_GeneralCriteria) {
		Usuario_General[] usuario_Generals = listUsuario_GeneralByCriteria(usuario_GeneralCriteria);
		if(usuario_Generals == null || usuario_Generals.length == 0) {
			return null;
		}
		return usuario_Generals[0];
	}
	
	public static Usuario_General[] listUsuario_GeneralByCriteria(Usuario_GeneralCriteria usuario_GeneralCriteria) {
		return usuario_GeneralCriteria.listUsuario_General();
	}
}
