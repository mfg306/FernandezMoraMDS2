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
@Table(name="Comentario")
public class Comentario implements Serializable {
	public Comentario() {
	}
	
	public static Comentario loadComentarioByORMID(int id_Comentario) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadComentarioByORMID(session, id_Comentario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(int id_Comentario) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getComentarioByORMID(session, id_Comentario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByORMID(int id_Comentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadComentarioByORMID(session, id_Comentario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(int id_Comentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getComentarioByORMID(session, id_Comentario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByORMID(PersistentSession session, int id_Comentario) throws PersistentException {
		try {
			return (Comentario) session.load(base_de_datos.Comentario.class, new Integer(id_Comentario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(PersistentSession session, int id_Comentario) throws PersistentException {
		try {
			return (Comentario) session.get(base_de_datos.Comentario.class, new Integer(id_Comentario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByORMID(PersistentSession session, int id_Comentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comentario) session.load(base_de_datos.Comentario.class, new Integer(id_Comentario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(PersistentSession session, int id_Comentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comentario) session.get(base_de_datos.Comentario.class, new Integer(id_Comentario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryComentario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryComentario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Comentario as Comentario");
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
	
	public static List queryComentario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Comentario as Comentario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comentario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryComentario(session, condition, orderBy);
			return (Comentario[]) list.toArray(new Comentario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryComentario(session, condition, orderBy, lockMode);
			return (Comentario[]) list.toArray(new Comentario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Comentario[] comentarios = listComentarioByQuery(session, condition, orderBy);
		if (comentarios != null && comentarios.length > 0)
			return comentarios[0];
		else
			return null;
	}
	
	public static Comentario loadComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Comentario[] comentarios = listComentarioByQuery(session, condition, orderBy, lockMode);
		if (comentarios != null && comentarios.length > 0)
			return comentarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Comentario as Comentario");
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
	
	public static java.util.Iterator iterateComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Comentario as Comentario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comentario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByCriteria(ComentarioCriteria comentarioCriteria) {
		Comentario[] comentarios = listComentarioByCriteria(comentarioCriteria);
		if(comentarios == null || comentarios.length == 0) {
			return null;
		}
		return comentarios[0];
	}
	
	public static Comentario[] listComentarioByCriteria(ComentarioCriteria comentarioCriteria) {
		return comentarioCriteria.listComentario();
	}
	
	public static Comentario createComentario() {
		return new base_de_datos.Comentario();
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
			if(get_Realiza() != null) {
				get_Realiza()._Es_de_un.remove(this);
			}
			
			if(get_Tiene() != null) {
				get_Tiene()._Pertenece_a.remove(this);
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
			if(get_Realiza() != null) {
				get_Realiza()._Es_de_un.remove(this);
			}
			
			if(get_Tiene() != null) {
				get_Tiene()._Pertenece_a.remove(this);
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
		if (key == base_de_datos.ORMConstants.KEY_COMENTARIO__TIENE) {
			this._Tiene = (base_de_datos.Producto) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_COMENTARIO__REALIZA) {
			this._Realiza = (base_de_datos.UR) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_Comentario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_COMENTARIO_ID_COMENTARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_COMENTARIO_ID_COMENTARIO_GENERATOR", strategy="native")	
	private int id_Comentario;
	
	@ManyToOne(targetEntity=base_de_datos.UR.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="URUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario896062"))	
	private base_de_datos.UR _Realiza;
	
	@ManyToOne(targetEntity=base_de_datos.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId_Producto", referencedColumnName="Id_Producto", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario180675"))	
	private base_de_datos.Producto _Tiene;
	
	@Column(name="Comentario", nullable=true, length=255)	
	private String comentario;
	
	@Column(name="Fecha", nullable=true, length=255)	
	private String fecha;
	
	public void setComentario(String value) {
		this.comentario = value;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	private void setId_Comentario(int value) {
		this.id_Comentario = value;
	}
	
	public int getId_Comentario() {
		return id_Comentario;
	}
	
	public int getORMID() {
		return getId_Comentario();
	}
	
	public void set_Tiene(base_de_datos.Producto value) {
		if (_Tiene != null) {
			_Tiene._Pertenece_a.remove(this);
		}
		if (value != null) {
			value._Pertenece_a.add(this);
		}
	}
	
	public base_de_datos.Producto get_Tiene() {
		return _Tiene;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM__Tiene(base_de_datos.Producto value) {
		this._Tiene = value;
	}
	
	private base_de_datos.Producto getORM__Tiene() {
		return _Tiene;
	}
	
	public void set_Realiza(base_de_datos.UR value) {
		if (_Realiza != null) {
			_Realiza._Es_de_un.remove(this);
		}
		if (value != null) {
			value._Es_de_un.add(this);
		}
	}
	
	public base_de_datos.UR get_Realiza() {
		return _Realiza;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM__Realiza(base_de_datos.UR value) {
		this._Realiza = value;
	}
	
	private base_de_datos.UR getORM__Realiza() {
		return _Realiza;
	}
	
	public String toString() {
		return String.valueOf(getId_Comentario());
	}
	
}
