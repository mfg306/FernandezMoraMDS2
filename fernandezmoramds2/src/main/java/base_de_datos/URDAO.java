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

public class URDAO {
	public static UR loadURByORMID(int id_Usuario) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadURByORMID(session, id_Usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR getURByORMID(int id_Usuario) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getURByORMID(session, id_Usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByORMID(int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadURByORMID(session, id_Usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR getURByORMID(int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getURByORMID(session, id_Usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByORMID(PersistentSession session, int id_Usuario) throws PersistentException {
		try {
			return (UR) session.load(base_de_datos.UR.class, new Integer(id_Usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR getURByORMID(PersistentSession session, int id_Usuario) throws PersistentException {
		try {
			return (UR) session.get(base_de_datos.UR.class, new Integer(id_Usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByORMID(PersistentSession session, int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UR) session.load(base_de_datos.UR.class, new Integer(id_Usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR getURByORMID(PersistentSession session, int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UR) session.get(base_de_datos.UR.class, new Integer(id_Usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUR(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryUR(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUR(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryUR(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR[] listURByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listURByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR[] listURByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listURByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUR(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.UR as UR");
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
	
	public static List queryUR(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.UR as UR");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UR", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR[] listURByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUR(session, condition, orderBy);
			return (UR[]) list.toArray(new UR[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR[] listURByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUR(session, condition, orderBy, lockMode);
			return (UR[]) list.toArray(new UR[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadURByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadURByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UR[] uRs = listURByQuery(session, condition, orderBy);
		if (uRs != null && uRs.length > 0)
			return uRs[0];
		else
			return null;
	}
	
	public static UR loadURByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UR[] uRs = listURByQuery(session, condition, orderBy, lockMode);
		if (uRs != null && uRs.length > 0)
			return uRs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateURByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateURByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateURByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateURByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateURByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.UR as UR");
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
	
	public static java.util.Iterator iterateURByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.UR as UR");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UR", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR createUR() {
		return new base_de_datos.UR();
	}
	
	public static boolean save(base_de_datos.UR uR) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().saveObject(uR);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.UR uR) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().deleteObject(uR);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.UR uR)throws PersistentException {
		try {
			base_de_datos.Comentario[] l_Es_de_uns = uR._Es_de_un.toArray();
			for(int i = 0; i < l_Es_de_uns.length; i++) {
				l_Es_de_uns[i].set_Realiza(null);
			}
			base_de_datos.Pendiente[] l_Compras = uR._Compra.toArray();
			for(int i = 0; i < l_Compras.length; i++) {
				l_Compras[i].set_Hace_compra(null);
			}
			base_de_datos.Recibido[] l_recibidos = uR._recibido.toArray();
			for(int i = 0; i < l_recibidos.length; i++) {
				l_recibidos[i].set_recibe(null);
			}
			base_de_datos.Mensaje[] l_Envias = uR._Envia.toArray();
			for(int i = 0; i < l_Envias.length; i++) {
				l_Envias[i].set_Enviado_por_UR(null);
			}
			base_de_datos.Valoracion[] l_Valoras = uR._Valora.toArray();
			for(int i = 0; i < l_Valoras.length; i++) {
				l_Valoras[i].set_Valorado_por(null);
			}
			if (uR.getImagen() != null) {
				uR.getImagen().setuR(null);
			}
			
			return delete(uR);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.UR uR, org.orm.PersistentSession session)throws PersistentException {
		try {
			base_de_datos.Comentario[] l_Es_de_uns = uR._Es_de_un.toArray();
			for(int i = 0; i < l_Es_de_uns.length; i++) {
				l_Es_de_uns[i].set_Realiza(null);
			}
			base_de_datos.Pendiente[] l_Compras = uR._Compra.toArray();
			for(int i = 0; i < l_Compras.length; i++) {
				l_Compras[i].set_Hace_compra(null);
			}
			base_de_datos.Recibido[] l_recibidos = uR._recibido.toArray();
			for(int i = 0; i < l_recibidos.length; i++) {
				l_recibidos[i].set_recibe(null);
			}
			base_de_datos.Mensaje[] l_Envias = uR._Envia.toArray();
			for(int i = 0; i < l_Envias.length; i++) {
				l_Envias[i].set_Enviado_por_UR(null);
			}
			base_de_datos.Valoracion[] l_Valoras = uR._Valora.toArray();
			for(int i = 0; i < l_Valoras.length; i++) {
				l_Valoras[i].set_Valorado_por(null);
			}
			if (uR.getImagen() != null) {
				uR.getImagen().setuR(null);
			}
			
			try {
				session.delete(uR);
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
	
	public static boolean refresh(base_de_datos.UR uR) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().getSession().refresh(uR);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.UR uR) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().getSession().evict(uR);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByCriteria(URCriteria uRCriteria) {
		UR[] uRs = listURByCriteria(uRCriteria);
		if(uRs == null || uRs.length == 0) {
			return null;
		}
		return uRs[0];
	}
	
	public static UR[] listURByCriteria(URCriteria uRCriteria) {
		return uRCriteria.listUR();
	}
}
