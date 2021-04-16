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

public class TransportistaDAO {
	public static Transportista loadTransportistaByORMID(int idEmpleado) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadTransportistaByORMID(session, idEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(int idEmpleado) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return getTransportistaByORMID(session, idEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByORMID(int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadTransportistaByORMID(session, idEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return getTransportistaByORMID(session, idEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByORMID(PersistentSession session, int idEmpleado) throws PersistentException {
		try {
			return (Transportista) session.load(Base_de_Datos.Transportista.class, new Integer(idEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(PersistentSession session, int idEmpleado) throws PersistentException {
		try {
			return (Transportista) session.get(Base_de_Datos.Transportista.class, new Integer(idEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByORMID(PersistentSession session, int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Transportista) session.load(Base_de_Datos.Transportista.class, new Integer(idEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(PersistentSession session, int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Transportista) session.get(Base_de_Datos.Transportista.class, new Integer(idEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTransportista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return queryTransportista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTransportista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return queryTransportista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista[] listTransportistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return listTransportistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista[] listTransportistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return listTransportistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTransportista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Transportista as Transportista");
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
	
	public static List queryTransportista(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Transportista as Transportista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Transportista", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista[] listTransportistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTransportista(session, condition, orderBy);
			return (Transportista[]) list.toArray(new Transportista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista[] listTransportistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTransportista(session, condition, orderBy, lockMode);
			return (Transportista[]) list.toArray(new Transportista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadTransportistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return loadTransportistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Transportista[] transportistas = listTransportistaByQuery(session, condition, orderBy);
		if (transportistas != null && transportistas.length > 0)
			return transportistas[0];
		else
			return null;
	}
	
	public static Transportista loadTransportistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Transportista[] transportistas = listTransportistaByQuery(session, condition, orderBy, lockMode);
		if (transportistas != null && transportistas.length > 0)
			return transportistas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTransportistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return iterateTransportistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTransportistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Base_de_Datos.HitoPersistentManager.instance().getSession();
			return iterateTransportistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTransportistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Transportista as Transportista");
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
	
	public static java.util.Iterator iterateTransportistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Base_de_Datos.Transportista as Transportista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Transportista", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista createTransportista() {
		return new Base_de_Datos.Transportista();
	}
	
	public static boolean save(Base_de_Datos.Transportista transportista) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().saveObject(transportista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Base_de_Datos.Transportista transportista) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().deleteObject(transportista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Base_de_Datos.Transportista transportista)throws PersistentException {
		try {
			Base_de_Datos.Recibido[] l_Recibidos = transportista._Recibido.toArray();
			for(int i = 0; i < l_Recibidos.length; i++) {
				l_Recibidos[i].set_Recoge(null);
			}
			Base_de_Datos.Enviado[] l_Enviados = transportista._Enviado.toArray();
			for(int i = 0; i < l_Enviados.length; i++) {
				l_Enviados[i].set_Transportista(null);
			}
			return delete(transportista);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Base_de_Datos.Transportista transportista, org.orm.PersistentSession session)throws PersistentException {
		try {
			Base_de_Datos.Recibido[] l_Recibidos = transportista._Recibido.toArray();
			for(int i = 0; i < l_Recibidos.length; i++) {
				l_Recibidos[i].set_Recoge(null);
			}
			Base_de_Datos.Enviado[] l_Enviados = transportista._Enviado.toArray();
			for(int i = 0; i < l_Enviados.length; i++) {
				l_Enviados[i].set_Transportista(null);
			}
			try {
				session.delete(transportista);
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
	
	public static boolean refresh(Base_de_Datos.Transportista transportista) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().getSession().refresh(transportista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Base_de_Datos.Transportista transportista) throws PersistentException {
		try {
			Base_de_Datos.HitoPersistentManager.instance().getSession().evict(transportista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByCriteria(TransportistaCriteria transportistaCriteria) {
		Transportista[] transportistas = listTransportistaByCriteria(transportistaCriteria);
		if(transportistas == null || transportistas.length == 0) {
			return null;
		}
		return transportistas[0];
	}
	
	public static Transportista[] listTransportistaByCriteria(TransportistaCriteria transportistaCriteria) {
		return transportistaCriteria.listTransportista();
	}
}
