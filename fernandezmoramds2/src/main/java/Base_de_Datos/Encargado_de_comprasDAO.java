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

public class Encargado_de_comprasDAO {
	public static Encargado_de_compras loadEncargado_de_comprasByORMID(int idEmpleado) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadEncargado_de_comprasByORMID(session, idEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras getEncargado_de_comprasByORMID(int idEmpleado) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return getEncargado_de_comprasByORMID(session, idEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras loadEncargado_de_comprasByORMID(int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadEncargado_de_comprasByORMID(session, idEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras getEncargado_de_comprasByORMID(int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return getEncargado_de_comprasByORMID(session, idEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras loadEncargado_de_comprasByORMID(PersistentSession session, int idEmpleado) throws PersistentException {
		try {
			return (Encargado_de_compras) session.load(Base_de_Datos.Encargado_de_compras.class, new Integer(idEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras getEncargado_de_comprasByORMID(PersistentSession session, int idEmpleado) throws PersistentException {
		try {
			return (Encargado_de_compras) session.get(Base_de_Datos.Encargado_de_compras.class, new Integer(idEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras loadEncargado_de_comprasByORMID(PersistentSession session, int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Encargado_de_compras) session.load(Base_de_Datos.Encargado_de_compras.class, new Integer(idEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras getEncargado_de_comprasByORMID(PersistentSession session, int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Encargado_de_compras) session.get(Base_de_Datos.Encargado_de_compras.class, new Integer(idEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEncargado_de_compras(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return queryEncargado_de_compras(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEncargado_de_compras(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return queryEncargado_de_compras(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras[] listEncargado_de_comprasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return listEncargado_de_comprasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras[] listEncargado_de_comprasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return listEncargado_de_comprasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEncargado_de_compras(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Encargado_de_compras as Encargado_de_compras");
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
	
	public static List queryEncargado_de_compras(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Encargado_de_compras as Encargado_de_compras");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Encargado_de_compras", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras[] listEncargado_de_comprasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEncargado_de_compras(session, condition, orderBy);
			return (Encargado_de_compras[]) list.toArray(new Encargado_de_compras[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras[] listEncargado_de_comprasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEncargado_de_compras(session, condition, orderBy, lockMode);
			return (Encargado_de_compras[]) list.toArray(new Encargado_de_compras[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras loadEncargado_de_comprasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadEncargado_de_comprasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras loadEncargado_de_comprasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadEncargado_de_comprasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras loadEncargado_de_comprasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Encargado_de_compras[] encargado_de_comprases = listEncargado_de_comprasByQuery(session, condition, orderBy);
		if (encargado_de_comprases != null && encargado_de_comprases.length > 0)
			return encargado_de_comprases[0];
		else
			return null;
	}
	
	public static Encargado_de_compras loadEncargado_de_comprasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Encargado_de_compras[] encargado_de_comprases = listEncargado_de_comprasByQuery(session, condition, orderBy, lockMode);
		if (encargado_de_comprases != null && encargado_de_comprases.length > 0)
			return encargado_de_comprases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEncargado_de_comprasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return iterateEncargado_de_comprasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEncargado_de_comprasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return iterateEncargado_de_comprasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEncargado_de_comprasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Encargado_de_compras as Encargado_de_compras");
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
	
	public static java.util.Iterator iterateEncargado_de_comprasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Encargado_de_compras as Encargado_de_compras");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Encargado_de_compras", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras createEncargado_de_compras() {
		return new Base_de_Datos.Encargado_de_compras();
	}
	
	public static boolean save(Base_de_Datos.Encargado_de_compras encargado_de_compras) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().saveObject(encargado_de_compras);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Base_de_Datos.Encargado_de_compras encargado_de_compras) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().deleteObject(encargado_de_compras);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Base_de_Datos.Encargado_de_compras encargado_de_compras)throws PersistentException {
		try {
			Base_de_Datos.Pendiente[] l_Pendientes = encargado_de_compras._Pendiente.toArray();
			for(int i = 0; i < l_Pendientes.length; i++) {
				l_Pendientes[i].set_Encargado_de_compras(null);
			}
			Base_de_Datos.Enviado[] l_Pedido_enviados = encargado_de_compras._Pedido_enviado.toArray();
			for(int i = 0; i < l_Pedido_enviados.length; i++) {
				l_Pedido_enviados[i].set_Procesa(null);
			}
			return delete(encargado_de_compras);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Base_de_Datos.Encargado_de_compras encargado_de_compras, org.orm.PersistentSession session)throws PersistentException {
		try {
			Base_de_Datos.Pendiente[] l_Pendientes = encargado_de_compras._Pendiente.toArray();
			for(int i = 0; i < l_Pendientes.length; i++) {
				l_Pendientes[i].set_Encargado_de_compras(null);
			}
			Base_de_Datos.Enviado[] l_Pedido_enviados = encargado_de_compras._Pedido_enviado.toArray();
			for(int i = 0; i < l_Pedido_enviados.length; i++) {
				l_Pedido_enviados[i].set_Procesa(null);
			}
			try {
				session.delete(encargado_de_compras);
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
	
	public static boolean refresh(Base_de_Datos.Encargado_de_compras encargado_de_compras) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().getSession().refresh(encargado_de_compras);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Base_de_Datos.Encargado_de_compras encargado_de_compras) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().getSession().evict(encargado_de_compras);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras loadEncargado_de_comprasByCriteria(Encargado_de_comprasCriteria encargado_de_comprasCriteria) {
		Encargado_de_compras[] encargado_de_comprases = listEncargado_de_comprasByCriteria(encargado_de_comprasCriteria);
		if(encargado_de_comprases == null || encargado_de_comprases.length == 0) {
			return null;
		}
		return encargado_de_comprases[0];
	}
	
	public static Encargado_de_compras[] listEncargado_de_comprasByCriteria(Encargado_de_comprasCriteria encargado_de_comprasCriteria) {
		return encargado_de_comprasCriteria.listEncargado_de_compras();
	}
}
