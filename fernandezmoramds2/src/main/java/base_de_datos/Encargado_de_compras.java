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
@Table(name="Encargado_de_compras")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="EmpleadoIdEmpleado", referencedColumnName="IdEmpleado")
public class Encargado_de_compras extends base_de_datos.Empleado implements Serializable {
	public Encargado_de_compras() {
	}
	
	public static Encargado_de_compras loadEncargado_de_comprasByORMID(int idEmpleado) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadEncargado_de_comprasByORMID(session, idEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras getEncargado_de_comprasByORMID(int idEmpleado) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getEncargado_de_comprasByORMID(session, idEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras loadEncargado_de_comprasByORMID(int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadEncargado_de_comprasByORMID(session, idEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras getEncargado_de_comprasByORMID(int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getEncargado_de_comprasByORMID(session, idEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras loadEncargado_de_comprasByORMID(PersistentSession session, int idEmpleado) throws PersistentException {
		try {
			return (Encargado_de_compras) session.load(base_de_datos.Encargado_de_compras.class, new Integer(idEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras getEncargado_de_comprasByORMID(PersistentSession session, int idEmpleado) throws PersistentException {
		try {
			return (Encargado_de_compras) session.get(base_de_datos.Encargado_de_compras.class, new Integer(idEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras loadEncargado_de_comprasByORMID(PersistentSession session, int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Encargado_de_compras) session.load(base_de_datos.Encargado_de_compras.class, new Integer(idEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras getEncargado_de_comprasByORMID(PersistentSession session, int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Encargado_de_compras) session.get(base_de_datos.Encargado_de_compras.class, new Integer(idEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEncargado_de_compras(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryEncargado_de_compras(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEncargado_de_compras(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryEncargado_de_compras(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras[] listEncargado_de_comprasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listEncargado_de_comprasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras[] listEncargado_de_comprasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listEncargado_de_comprasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEncargado_de_compras(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Encargado_de_compras as Encargado_de_compras");
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
		StringBuffer sb = new StringBuffer("From base_de_datos.Encargado_de_compras as Encargado_de_compras");
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
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadEncargado_de_comprasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado_de_compras loadEncargado_de_comprasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
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
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateEncargado_de_comprasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEncargado_de_comprasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateEncargado_de_comprasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEncargado_de_comprasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Encargado_de_compras as Encargado_de_compras");
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
		StringBuffer sb = new StringBuffer("From base_de_datos.Encargado_de_compras as Encargado_de_compras");
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
	
	public static Encargado_de_compras createEncargado_de_compras() {
		return new base_de_datos.Encargado_de_compras();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			base_de_datos.Pendiente[] l_Pendientes = _Pendiente.toArray();
			for(int i = 0; i < l_Pendientes.length; i++) {
				l_Pendientes[i].set_Encargado_de_compras(null);
			}
			base_de_datos.Enviado[] l_Pedido_enviados = _Pedido_enviado.toArray();
			for(int i = 0; i < l_Pedido_enviados.length; i++) {
				l_Pedido_enviados[i].set_Procesa(null);
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
			base_de_datos.Pendiente[] l_Pendientes = _Pendiente.toArray();
			for(int i = 0; i < l_Pendientes.length; i++) {
				l_Pendientes[i].set_Encargado_de_compras(null);
			}
			base_de_datos.Enviado[] l_Pedido_enviados = _Pedido_enviado.toArray();
			for(int i = 0; i < l_Pedido_enviados.length; i++) {
				l_Pedido_enviados[i].set_Procesa(null);
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
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_ENCARGADO_DE_COMPRAS__PENDIENTE) {
			return ORM__Pendiente;
		}
		else if (key == base_de_datos.ORMConstants.KEY_ENCARGADO_DE_COMPRAS__PEDIDO_ENVIADO) {
			return ORM__Pedido_enviado;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_Encargado", nullable=false, length=10)	
	private int id_Encargado;
	
	@Column(name="Correo_Empleado", nullable=true, length=255)	
	private String correo_Empleado;
	
	@Column(name="Contrasenia", nullable=true, length=255)	
	private String contrasenia;
	
	@OneToMany(mappedBy="_Encargado_de_compras", targetEntity=base_de_datos.Pendiente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Pendiente = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Procesa", targetEntity=base_de_datos.Enviado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Pedido_enviado = new java.util.HashSet();
	
	public void setId_Encargado(int value) {
		this.id_Encargado = value;
	}
	
	public int getId_Encargado() {
		return id_Encargado;
	}
	
	public void setCorreo_Empleado(String value) {
		this.correo_Empleado = value;
	}
	
	public String getCorreo_Empleado() {
		return correo_Empleado;
	}
	
	public void setContrasenia(String value) {
		this.contrasenia = value;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	private void setORM__Pendiente(java.util.Set value) {
		this.ORM__Pendiente = value;
	}
	
	private java.util.Set getORM__Pendiente() {
		return ORM__Pendiente;
	}
	
	@Transient	
	public final base_de_datos.PendienteSetCollection _Pendiente = new base_de_datos.PendienteSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_ENCARGADO_DE_COMPRAS__PENDIENTE, base_de_datos.ORMConstants.KEY_PENDIENTE__ENCARGADO_DE_COMPRAS, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Pedido_enviado(java.util.Set value) {
		this.ORM__Pedido_enviado = value;
	}
	
	private java.util.Set getORM__Pedido_enviado() {
		return ORM__Pedido_enviado;
	}
	
	@Transient	
	public final base_de_datos.EnviadoSetCollection _Pedido_enviado = new base_de_datos.EnviadoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_ENCARGADO_DE_COMPRAS__PEDIDO_ENVIADO, base_de_datos.ORMConstants.KEY_ENVIADO__PROCESA, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
