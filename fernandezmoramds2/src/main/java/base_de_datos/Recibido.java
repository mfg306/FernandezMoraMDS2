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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Recibido")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="CompraCodigo", referencedColumnName="Codigo")
public class Recibido extends base_de_datos.Compra implements Serializable {
	public Recibido() {
	}
	
	public static Recibido loadRecibidoByORMID(int codigo) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadRecibidoByORMID(session, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido getRecibidoByORMID(int codigo) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getRecibidoByORMID(session, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido loadRecibidoByORMID(int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadRecibidoByORMID(session, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido getRecibidoByORMID(int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getRecibidoByORMID(session, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido loadRecibidoByORMID(PersistentSession session, int codigo) throws PersistentException {
		try {
			return (Recibido) session.load(base_de_datos.Recibido.class, new Integer(codigo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido getRecibidoByORMID(PersistentSession session, int codigo) throws PersistentException {
		try {
			return (Recibido) session.get(base_de_datos.Recibido.class, new Integer(codigo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido loadRecibidoByORMID(PersistentSession session, int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Recibido) session.load(base_de_datos.Recibido.class, new Integer(codigo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido getRecibidoByORMID(PersistentSession session, int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Recibido) session.get(base_de_datos.Recibido.class, new Integer(codigo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRecibido(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryRecibido(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRecibido(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryRecibido(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido[] listRecibidoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listRecibidoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido[] listRecibidoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listRecibidoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRecibido(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Recibido as Recibido");
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
	
	public static List queryRecibido(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Recibido as Recibido");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Recibido", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido[] listRecibidoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRecibido(session, condition, orderBy);
			return (Recibido[]) list.toArray(new Recibido[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido[] listRecibidoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRecibido(session, condition, orderBy, lockMode);
			return (Recibido[]) list.toArray(new Recibido[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido loadRecibidoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadRecibidoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido loadRecibidoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadRecibidoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido loadRecibidoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Recibido[] recibidos = listRecibidoByQuery(session, condition, orderBy);
		if (recibidos != null && recibidos.length > 0)
			return recibidos[0];
		else
			return null;
	}
	
	public static Recibido loadRecibidoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Recibido[] recibidos = listRecibidoByQuery(session, condition, orderBy, lockMode);
		if (recibidos != null && recibidos.length > 0)
			return recibidos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRecibidoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateRecibidoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRecibidoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateRecibidoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRecibidoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Recibido as Recibido");
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
	
	public static java.util.Iterator iterateRecibidoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Recibido as Recibido");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Recibido", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Recibido loadRecibidoByCriteria(RecibidoCriteria recibidoCriteria) {
		Recibido[] recibidos = listRecibidoByCriteria(recibidoCriteria);
		if(recibidos == null || recibidos.length == 0) {
			return null;
		}
		return recibidos[0];
	}
	
	public static Recibido[] listRecibidoByCriteria(RecibidoCriteria recibidoCriteria) {
		return recibidoCriteria.listRecibido();
	}
	
	public static Recibido createRecibido() {
		return new base_de_datos.Recibido();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(get_recibe() != null) {
				get_recibe()._recibido.remove(this);
			}
			
			if(get_Recoge() != null) {
				get_Recoge()._Recibido.remove(this);
			}
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(get_recibe() != null) {
				get_recibe()._recibido.remove(this);
			}
			
			if(get_Recoge() != null) {
				get_Recoge()._Recibido.remove(this);
			}
			
			try {
				session.delete(this);
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
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_RECIBIDO__RECOGE) {
			this._Recoge = (base_de_datos.Transportista) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_RECIBIDO__RECIBE) {
			this._recibe = (base_de_datos.UR) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=base_de_datos.UR.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="URUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKRecibido916793"))	
	private base_de_datos.UR _recibe;
	
	@ManyToOne(targetEntity=base_de_datos.Transportista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TransportistaEmpleadoIdEmpleado", referencedColumnName="EmpleadoIdEmpleado", nullable=false) }, foreignKey=@ForeignKey(name="FKRecibido615365"))	
	private base_de_datos.Transportista _Recoge;
	
	public void set_Recoge(base_de_datos.Transportista value) {
		if (_Recoge != null) {
			_Recoge._Recibido.remove(this);
		}
		if (value != null) {
			value._Recibido.add(this);
		}
	}
	
	public base_de_datos.Transportista get_Recoge() {
		return _Recoge;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM__Recoge(base_de_datos.Transportista value) {
		this._Recoge = value;
	}
	
	private base_de_datos.Transportista getORM__Recoge() {
		return _Recoge;
	}
	
	public void set_recibe(base_de_datos.UR value) {
		if (_recibe != null) {
			_recibe._recibido.remove(this);
		}
		if (value != null) {
			value._recibido.add(this);
		}
	}
	
	public base_de_datos.UR get_recibe() {
		return _recibe;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM__recibe(base_de_datos.UR value) {
		this._recibe = value;
	}
	
	private base_de_datos.UR getORM__recibe() {
		return _recibe;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
