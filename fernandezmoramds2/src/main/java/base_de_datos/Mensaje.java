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
@Table(name="Mensaje")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	public static Mensaje loadMensajeByORMID(int id_Mensaje) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadMensajeByORMID(session, id_Mensaje);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(int id_Mensaje) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getMensajeByORMID(session, id_Mensaje);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByORMID(int id_Mensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadMensajeByORMID(session, id_Mensaje, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(int id_Mensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getMensajeByORMID(session, id_Mensaje, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByORMID(PersistentSession session, int id_Mensaje) throws PersistentException {
		try {
			return (Mensaje) session.load(base_de_datos.Mensaje.class, new Integer(id_Mensaje));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(PersistentSession session, int id_Mensaje) throws PersistentException {
		try {
			return (Mensaje) session.get(base_de_datos.Mensaje.class, new Integer(id_Mensaje));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByORMID(PersistentSession session, int id_Mensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mensaje) session.load(base_de_datos.Mensaje.class, new Integer(id_Mensaje), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(PersistentSession session, int id_Mensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mensaje) session.get(base_de_datos.Mensaje.class, new Integer(id_Mensaje), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensaje(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryMensaje(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensaje(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryMensaje(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listMensajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listMensajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensaje(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Mensaje as Mensaje");
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
	
	public static List queryMensaje(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Mensaje as Mensaje");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mensaje", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMensaje(session, condition, orderBy);
			return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMensaje(session, condition, orderBy, lockMode);
			return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadMensajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadMensajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Mensaje[] mensajes = listMensajeByQuery(session, condition, orderBy);
		if (mensajes != null && mensajes.length > 0)
			return mensajes[0];
		else
			return null;
	}
	
	public static Mensaje loadMensajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Mensaje[] mensajes = listMensajeByQuery(session, condition, orderBy, lockMode);
		if (mensajes != null && mensajes.length > 0)
			return mensajes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMensajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateMensajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMensajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateMensajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMensajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Mensaje as Mensaje");
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
	
	public static java.util.Iterator iterateMensajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Mensaje as Mensaje");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mensaje", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByCriteria(MensajeCriteria mensajeCriteria) {
		Mensaje[] mensajes = listMensajeByCriteria(mensajeCriteria);
		if(mensajes == null || mensajes.length == 0) {
			return null;
		}
		return mensajes[0];
	}
	
	public static Mensaje[] listMensajeByCriteria(MensajeCriteria mensajeCriteria) {
		return mensajeCriteria.listMensaje();
	}
	
	public static Mensaje createMensaje() {
		return new base_de_datos.Mensaje();
	}
	
	public boolean save() throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(get_Enviado_por_Admin() != null) {
				get_Enviado_por_Admin()._Envia.remove(this);
			}
			
			if(get_Enviado_por_UR() != null) {
				get_Enviado_por_UR()._Envia.remove(this);
			}
			
			if(get_Responder_a() != null) {
				get_Responder_a().set_Mensaje(null);
			}
			
			if(get_Mensaje() != null) {
				get_Mensaje().set_Responder_a(null);
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
			if(get_Enviado_por_Admin() != null) {
				get_Enviado_por_Admin()._Envia.remove(this);
			}
			
			if(get_Enviado_por_UR() != null) {
				get_Enviado_por_UR()._Envia.remove(this);
			}
			
			if(get_Responder_a() != null) {
				get_Responder_a().set_Mensaje(null);
			}
			
			if(get_Mensaje() != null) {
				get_Mensaje().set_Responder_a(null);
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
		if (key == base_de_datos.ORMConstants.KEY_MENSAJE__RESPONDER_A) {
			this._Responder_a = (base_de_datos.Mensaje) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_MENSAJE__ENVIADO_POR_UR) {
			this._Enviado_por_UR = (base_de_datos.UR) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_MENSAJE__ENVIADO_POR_ADMIN) {
			this._Enviado_por_Admin = (base_de_datos.Administrador) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_MENSAJE__MENSAJE) {
			this._Mensaje = (base_de_datos.Mensaje) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_Mensaje", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_MENSAJE_ID_MENSAJE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_MENSAJE_ID_MENSAJE_GENERATOR", strategy="native")	
	private int id_Mensaje;
	
	@ManyToOne(targetEntity=base_de_datos.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje417461"))	
	private base_de_datos.Administrador _Enviado_por_Admin;
	
	@ManyToOne(targetEntity=base_de_datos.UR.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="URUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje321457"))	
	private base_de_datos.UR _Enviado_por_UR;
	
	@OneToOne(optional=false, targetEntity=base_de_datos.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeId_Mensaje", referencedColumnName="Id_Mensaje", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje231121"))	
	private base_de_datos.Mensaje _Responder_a;
	
	@Column(name="Correo_emisor", nullable=true, length=255)	
	private String correo_emisor;
	
	@Column(name="Correo_receptor", nullable=true, length=255)	
	private String correo_receptor;
	
	@Column(name="Mensaje", nullable=true, length=255)	
	private String mensaje;
	
	@Column(name="Codigo", nullable=true, length=255)	
	private String codigo;
	
	@OneToOne(mappedBy="_Responder_a", targetEntity=base_de_datos.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private base_de_datos.Mensaje _Mensaje;
	
	public void setCorreo_emisor(String value) {
		this.correo_emisor = value;
	}
	
	public String getCorreo_emisor() {
		return correo_emisor;
	}
	
	public void setCorreo_receptor(String value) {
		this.correo_receptor = value;
	}
	
	public String getCorreo_receptor() {
		return correo_receptor;
	}
	
	public void setMensaje(String value) {
		this.mensaje = value;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setCodigo(String value) {
		this.codigo = value;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	private void setId_Mensaje(int value) {
		this.id_Mensaje = value;
	}
	
	public int getId_Mensaje() {
		return id_Mensaje;
	}
	
	public int getORMID() {
		return getId_Mensaje();
	}
	
	public void set_Responder_a(base_de_datos.Mensaje value) {
		if (this._Responder_a != value) {
			base_de_datos.Mensaje l_Responder_a = this._Responder_a;
			this._Responder_a = value;
			if (value != null) {
				_Responder_a.set_Mensaje(this);
			}
			if (l_Responder_a != null && l_Responder_a.get_Mensaje() == this) {
				l_Responder_a.set_Mensaje(null);
			}
		}
	}
	
	public base_de_datos.Mensaje get_Responder_a() {
		return _Responder_a;
	}
	
	public void set_Enviado_por_UR(base_de_datos.UR value) {
		if (_Enviado_por_UR != null) {
			_Enviado_por_UR._Envia.remove(this);
		}
		if (value != null) {
			value._Envia.add(this);
		}
	}
	
	public base_de_datos.UR get_Enviado_por_UR() {
		return _Enviado_por_UR;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM__Enviado_por_UR(base_de_datos.UR value) {
		this._Enviado_por_UR = value;
	}
	
	private base_de_datos.UR getORM__Enviado_por_UR() {
		return _Enviado_por_UR;
	}
	
	public void set_Enviado_por_Admin(base_de_datos.Administrador value) {
		if (_Enviado_por_Admin != null) {
			_Enviado_por_Admin._Envia.remove(this);
		}
		if (value != null) {
			value._Envia.add(this);
		}
	}
	
	public base_de_datos.Administrador get_Enviado_por_Admin() {
		return _Enviado_por_Admin;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM__Enviado_por_Admin(base_de_datos.Administrador value) {
		this._Enviado_por_Admin = value;
	}
	
	private base_de_datos.Administrador getORM__Enviado_por_Admin() {
		return _Enviado_por_Admin;
	}
	
	public void set_Mensaje(base_de_datos.Mensaje value) {
		if (this._Mensaje != value) {
			base_de_datos.Mensaje l_Mensaje = this._Mensaje;
			this._Mensaje = value;
			if (value != null) {
				_Mensaje.set_Responder_a(this);
			}
			if (l_Mensaje != null && l_Mensaje.get_Responder_a() == this) {
				l_Mensaje.set_Responder_a(null);
			}
		}
	}
	
	public base_de_datos.Mensaje get_Mensaje() {
		return _Mensaje;
	}
	
	public String toString() {
		return String.valueOf(getId_Mensaje());
	}
	
}
