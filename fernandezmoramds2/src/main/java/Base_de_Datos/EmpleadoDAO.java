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

public class EmpleadoDAO {
	public static Empleado loadEmpleadoByORMID(int idEmpleado) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadEmpleadoByORMID(session, idEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado getEmpleadoByORMID(int idEmpleado) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return getEmpleadoByORMID(session, idEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByORMID(int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadEmpleadoByORMID(session, idEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado getEmpleadoByORMID(int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return getEmpleadoByORMID(session, idEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByORMID(PersistentSession session, int idEmpleado) throws PersistentException {
		try {
			return (Empleado) session.load(Base_de_Datos.Empleado.class, new Integer(idEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado getEmpleadoByORMID(PersistentSession session, int idEmpleado) throws PersistentException {
		try {
			return (Empleado) session.get(Base_de_Datos.Empleado.class, new Integer(idEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByORMID(PersistentSession session, int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Empleado) session.load(Base_de_Datos.Empleado.class, new Integer(idEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado getEmpleadoByORMID(PersistentSession session, int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Empleado) session.get(Base_de_Datos.Empleado.class, new Integer(idEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return queryEmpleado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return queryEmpleado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado[] listEmpleadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return listEmpleadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado[] listEmpleadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return listEmpleadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Empleado as Empleado");
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
	
	public static List queryEmpleado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Empleado as Empleado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Empleado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado[] listEmpleadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEmpleado(session, condition, orderBy);
			return (Empleado[]) list.toArray(new Empleado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado[] listEmpleadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEmpleado(session, condition, orderBy, lockMode);
			return (Empleado[]) list.toArray(new Empleado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadEmpleadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadEmpleadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Empleado[] empleados = listEmpleadoByQuery(session, condition, orderBy);
		if (empleados != null && empleados.length > 0)
			return empleados[0];
		else
			return null;
	}
	
	public static Empleado loadEmpleadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Empleado[] empleados = listEmpleadoByQuery(session, condition, orderBy, lockMode);
		if (empleados != null && empleados.length > 0)
			return empleados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEmpleadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return iterateEmpleadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpleadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return iterateEmpleadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpleadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Empleado as Empleado");
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
	
	public static java.util.Iterator iterateEmpleadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Empleado as Empleado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Empleado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado createEmpleado() {
		return new Base_de_Datos.Empleado();
	}
	
	public static boolean save(Base_de_Datos.Empleado empleado) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().saveObject(empleado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Base_de_Datos.Empleado empleado) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().deleteObject(empleado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Base_de_Datos.Empleado empleado) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().getSession().refresh(empleado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Base_de_Datos.Empleado empleado) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().getSession().evict(empleado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByCriteria(EmpleadoCriteria empleadoCriteria) {
		Empleado[] empleados = listEmpleadoByCriteria(empleadoCriteria);
		if(empleados == null || empleados.length == 0) {
			return null;
		}
		return empleados[0];
	}
	
	public static Empleado[] listEmpleadoByCriteria(EmpleadoCriteria empleadoCriteria) {
		return empleadoCriteria.listEmpleado();
	}
}
