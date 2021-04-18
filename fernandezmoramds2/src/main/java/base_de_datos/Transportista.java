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
@Table(name="Transportista")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="EmpleadoIdEmpleado", referencedColumnName="IdEmpleado")
public class Transportista extends base_de_datos.Empleado implements Serializable {
	public Transportista() {
	}
	
	public static Transportista loadTransportistaByORMID(int idEmpleado) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadTransportistaByORMID(session, idEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(int idEmpleado) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getTransportistaByORMID(session, idEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByORMID(int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadTransportistaByORMID(session, idEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getTransportistaByORMID(session, idEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByORMID(PersistentSession session, int idEmpleado) throws PersistentException {
		try {
			return (Transportista) session.load(base_de_datos.Transportista.class, new Integer(idEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(PersistentSession session, int idEmpleado) throws PersistentException {
		try {
			return (Transportista) session.get(base_de_datos.Transportista.class, new Integer(idEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByORMID(PersistentSession session, int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Transportista) session.load(base_de_datos.Transportista.class, new Integer(idEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(PersistentSession session, int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Transportista) session.get(base_de_datos.Transportista.class, new Integer(idEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTransportista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryTransportista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTransportista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryTransportista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista[] listTransportistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listTransportistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista[] listTransportistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listTransportistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTransportista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Transportista as Transportista");
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
		StringBuffer sb = new StringBuffer("From base_de_datos.Transportista as Transportista");
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
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadTransportistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
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
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateTransportistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTransportistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateTransportistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTransportistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Transportista as Transportista");
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
		StringBuffer sb = new StringBuffer("From base_de_datos.Transportista as Transportista");
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
	
	public static Transportista createTransportista() {
		return new base_de_datos.Transportista();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			base_de_datos.Recibido[] l_Recibidos = _Recibido.toArray();
			for(int i = 0; i < l_Recibidos.length; i++) {
				l_Recibidos[i].set_Recoge(null);
			}
			base_de_datos.Enviado[] l_Enviados = _Enviado.toArray();
			for(int i = 0; i < l_Enviados.length; i++) {
				l_Enviados[i].set_Transportista(null);
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
			base_de_datos.Recibido[] l_Recibidos = _Recibido.toArray();
			for(int i = 0; i < l_Recibidos.length; i++) {
				l_Recibidos[i].set_Recoge(null);
			}
			base_de_datos.Enviado[] l_Enviados = _Enviado.toArray();
			for(int i = 0; i < l_Enviados.length; i++) {
				l_Enviados[i].set_Transportista(null);
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
		if (key == base_de_datos.ORMConstants.KEY_TRANSPORTISTA__RECIBIDO) {
			return ORM__Recibido;
		}
		else if (key == base_de_datos.ORMConstants.KEY_TRANSPORTISTA__ENVIADO) {
			return ORM__Enviado;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_Transportista", nullable=false, length=10)	
	private int id_Transportista;
	
	@Column(name="Correo_Transportista", nullable=true, length=255)	
	private String correo_Transportista;
	
	@Column(name="Contrasenia", nullable=true, length=255)	
	private String contrasenia;
	
	@OneToMany(mappedBy="_Recoge", targetEntity=base_de_datos.Recibido.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Recibido = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Transportista", targetEntity=base_de_datos.Enviado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Enviado = new java.util.HashSet();
	
	public void setId_Transportista(int value) {
		this.id_Transportista = value;
	}
	
	public int getId_Transportista() {
		return id_Transportista;
	}
	
	public void setCorreo_Transportista(String value) {
		this.correo_Transportista = value;
	}
	
	public String getCorreo_Transportista() {
		return correo_Transportista;
	}
	
	public void setContrasenia(String value) {
		this.contrasenia = value;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	private void setORM__Recibido(java.util.Set value) {
		this.ORM__Recibido = value;
	}
	
	private java.util.Set getORM__Recibido() {
		return ORM__Recibido;
	}
	
	@Transient	
	public final base_de_datos.RecibidoSetCollection _Recibido = new base_de_datos.RecibidoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TRANSPORTISTA__RECIBIDO, base_de_datos.ORMConstants.KEY_RECIBIDO__RECOGE, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Enviado(java.util.Set value) {
		this.ORM__Enviado = value;
	}
	
	private java.util.Set getORM__Enviado() {
		return ORM__Enviado;
	}
	
	@Transient	
	public final base_de_datos.EnviadoSetCollection _Enviado = new base_de_datos.EnviadoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TRANSPORTISTA__ENVIADO, base_de_datos.ORMConstants.KEY_ENVIADO__TRANSPORTISTA, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
