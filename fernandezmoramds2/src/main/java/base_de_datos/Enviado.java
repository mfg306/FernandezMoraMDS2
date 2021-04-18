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
@Table(name="Enviado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="CompraCodigo", referencedColumnName="Codigo")
public class Enviado extends base_de_datos.Compra implements Serializable {
	public Enviado() {
	}
	
	public static Enviado loadEnviadoByORMID(int codigo) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadEnviadoByORMID(session, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado getEnviadoByORMID(int codigo) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getEnviadoByORMID(session, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByORMID(int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadEnviadoByORMID(session, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado getEnviadoByORMID(int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getEnviadoByORMID(session, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByORMID(PersistentSession session, int codigo) throws PersistentException {
		try {
			return (Enviado) session.load(base_de_datos.Enviado.class, new Integer(codigo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado getEnviadoByORMID(PersistentSession session, int codigo) throws PersistentException {
		try {
			return (Enviado) session.get(base_de_datos.Enviado.class, new Integer(codigo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByORMID(PersistentSession session, int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Enviado) session.load(base_de_datos.Enviado.class, new Integer(codigo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado getEnviadoByORMID(PersistentSession session, int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Enviado) session.get(base_de_datos.Enviado.class, new Integer(codigo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEnviado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryEnviado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEnviado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryEnviado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado[] listEnviadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listEnviadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado[] listEnviadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listEnviadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEnviado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Enviado as Enviado");
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
	
	public static List queryEnviado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Enviado as Enviado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Enviado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado[] listEnviadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEnviado(session, condition, orderBy);
			return (Enviado[]) list.toArray(new Enviado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado[] listEnviadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEnviado(session, condition, orderBy, lockMode);
			return (Enviado[]) list.toArray(new Enviado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadEnviadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadEnviadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Enviado[] enviados = listEnviadoByQuery(session, condition, orderBy);
		if (enviados != null && enviados.length > 0)
			return enviados[0];
		else
			return null;
	}
	
	public static Enviado loadEnviadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Enviado[] enviados = listEnviadoByQuery(session, condition, orderBy, lockMode);
		if (enviados != null && enviados.length > 0)
			return enviados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEnviadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateEnviadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEnviadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateEnviadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEnviadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Enviado as Enviado");
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
	
	public static java.util.Iterator iterateEnviadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Enviado as Enviado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Enviado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByCriteria(EnviadoCriteria enviadoCriteria) {
		Enviado[] enviados = listEnviadoByCriteria(enviadoCriteria);
		if(enviados == null || enviados.length == 0) {
			return null;
		}
		return enviados[0];
	}
	
	public static Enviado[] listEnviadoByCriteria(EnviadoCriteria enviadoCriteria) {
		return enviadoCriteria.listEnviado();
	}
	
	public static Enviado createEnviado() {
		return new base_de_datos.Enviado();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(get_Transportista() != null) {
				get_Transportista()._Enviado.remove(this);
			}
			
			if(get_Procesa() != null) {
				get_Procesa()._Pedido_enviado.remove(this);
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
			if(get_Transportista() != null) {
				get_Transportista()._Enviado.remove(this);
			}
			
			if(get_Procesa() != null) {
				get_Procesa()._Pedido_enviado.remove(this);
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
		if (key == base_de_datos.ORMConstants.KEY_ENVIADO__PROCESA) {
			this._Procesa = (base_de_datos.Encargado_de_compras) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_ENVIADO__TRANSPORTISTA) {
			this._Transportista = (base_de_datos.Transportista) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_Cola", nullable=false, length=10)	
	private int id_Cola;
	
	@ManyToOne(targetEntity=base_de_datos.Transportista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TransportistaEmpleadoIdEmpleado", referencedColumnName="EmpleadoIdEmpleado", nullable=false) }, foreignKey=@ForeignKey(name="FKEnviado870041"))	
	private base_de_datos.Transportista _Transportista;
	
	@ManyToOne(targetEntity=base_de_datos.Encargado_de_compras.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Encargado_de_comprasEmpleadoIdEmpleado", referencedColumnName="EmpleadoIdEmpleado", nullable=false) }, foreignKey=@ForeignKey(name="FKEnviado404928"))	
	private base_de_datos.Encargado_de_compras _Procesa;
	
	public void setId_Cola(int value) {
		this.id_Cola = value;
	}
	
	public int getId_Cola() {
		return id_Cola;
	}
	
	public void set_Procesa(base_de_datos.Encargado_de_compras value) {
		if (_Procesa != null) {
			_Procesa._Pedido_enviado.remove(this);
		}
		if (value != null) {
			value._Pedido_enviado.add(this);
		}
	}
	
	public base_de_datos.Encargado_de_compras get_Procesa() {
		return _Procesa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM__Procesa(base_de_datos.Encargado_de_compras value) {
		this._Procesa = value;
	}
	
	private base_de_datos.Encargado_de_compras getORM__Procesa() {
		return _Procesa;
	}
	
	public void set_Transportista(base_de_datos.Transportista value) {
		if (_Transportista != null) {
			_Transportista._Enviado.remove(this);
		}
		if (value != null) {
			value._Enviado.add(this);
		}
	}
	
	public base_de_datos.Transportista get_Transportista() {
		return _Transportista;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM__Transportista(base_de_datos.Transportista value) {
		this._Transportista = value;
	}
	
	private base_de_datos.Transportista getORM__Transportista() {
		return _Transportista;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
