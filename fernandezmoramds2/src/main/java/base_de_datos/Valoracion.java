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
@Table(name="Valoracion")
public class Valoracion implements Serializable {
	public Valoracion() {
	}
	
	public static Valoracion loadValoracionByORMID(int id_valoracion) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadValoracionByORMID(session, id_valoracion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion getValoracionByORMID(int id_valoracion) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getValoracionByORMID(session, id_valoracion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByORMID(int id_valoracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadValoracionByORMID(session, id_valoracion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion getValoracionByORMID(int id_valoracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getValoracionByORMID(session, id_valoracion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByORMID(PersistentSession session, int id_valoracion) throws PersistentException {
		try {
			return (Valoracion) session.load(base_de_datos.Valoracion.class, new Integer(id_valoracion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion getValoracionByORMID(PersistentSession session, int id_valoracion) throws PersistentException {
		try {
			return (Valoracion) session.get(base_de_datos.Valoracion.class, new Integer(id_valoracion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByORMID(PersistentSession session, int id_valoracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Valoracion) session.load(base_de_datos.Valoracion.class, new Integer(id_valoracion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion getValoracionByORMID(PersistentSession session, int id_valoracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Valoracion) session.get(base_de_datos.Valoracion.class, new Integer(id_valoracion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryValoracion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryValoracion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryValoracion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryValoracion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion[] listValoracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listValoracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion[] listValoracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listValoracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryValoracion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Valoracion as Valoracion");
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
	
	public static List queryValoracion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Valoracion as Valoracion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Valoracion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion[] listValoracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryValoracion(session, condition, orderBy);
			return (Valoracion[]) list.toArray(new Valoracion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion[] listValoracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryValoracion(session, condition, orderBy, lockMode);
			return (Valoracion[]) list.toArray(new Valoracion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadValoracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadValoracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Valoracion[] valoracions = listValoracionByQuery(session, condition, orderBy);
		if (valoracions != null && valoracions.length > 0)
			return valoracions[0];
		else
			return null;
	}
	
	public static Valoracion loadValoracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Valoracion[] valoracions = listValoracionByQuery(session, condition, orderBy, lockMode);
		if (valoracions != null && valoracions.length > 0)
			return valoracions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateValoracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateValoracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateValoracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateValoracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateValoracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Valoracion as Valoracion");
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
	
	public static java.util.Iterator iterateValoracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Valoracion as Valoracion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Valoracion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Valoracion loadValoracionByCriteria(ValoracionCriteria valoracionCriteria) {
		Valoracion[] valoracions = listValoracionByCriteria(valoracionCriteria);
		if(valoracions == null || valoracions.length == 0) {
			return null;
		}
		return valoracions[0];
	}
	
	public static Valoracion[] listValoracionByCriteria(ValoracionCriteria valoracionCriteria) {
		return valoracionCriteria.listValoracion();
	}
	
	public static Valoracion createValoracion() {
		return new base_de_datos.Valoracion();
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
			if(get_Valorado_por() != null) {
				get_Valorado_por()._Valora.remove(this);
			}
			
			base_de_datos.Producto[] l_Valorados = _Valorado.toArray();
			for(int i = 0; i < l_Valorados.length; i++) {
				l_Valorados[i].set_Valorado_por(null);
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
			if(get_Valorado_por() != null) {
				get_Valorado_por()._Valora.remove(this);
			}
			
			base_de_datos.Producto[] l_Valorados = _Valorado.toArray();
			for(int i = 0; i < l_Valorados.length; i++) {
				l_Valorados[i].set_Valorado_por(null);
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
		if (key == base_de_datos.ORMConstants.KEY_VALORACION__VALORADO) {
			return ORM__Valorado;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_VALORACION__VALORADO_POR) {
			this._Valorado_por = (base_de_datos.UR) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_valoracion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_VALORACION_ID_VALORACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_VALORACION_ID_VALORACION_GENERATOR", strategy="native")	
	private int id_valoracion;
	
	@ManyToOne(targetEntity=base_de_datos.UR.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="URUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKValoracion23089"))	
	private base_de_datos.UR _Valorado_por;
	
	@Column(name="Valoracion", nullable=false, length=10)	
	private int valoracion;
	
	@OneToMany(mappedBy="_Valorado_por", targetEntity=base_de_datos.Producto.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Valorado = new java.util.HashSet();
	
	private void setId_valoracion(int value) {
		this.id_valoracion = value;
	}
	
	public int getId_valoracion() {
		return id_valoracion;
	}
	
	public int getORMID() {
		return getId_valoracion();
	}
	
	public void setValoracion(int value) {
		this.valoracion = value;
	}
	
	public int getValoracion() {
		return valoracion;
	}
	
	public void set_Valorado_por(base_de_datos.UR value) {
		if (_Valorado_por != null) {
			_Valorado_por._Valora.remove(this);
		}
		if (value != null) {
			value._Valora.add(this);
		}
	}
	
	public base_de_datos.UR get_Valorado_por() {
		return _Valorado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM__Valorado_por(base_de_datos.UR value) {
		this._Valorado_por = value;
	}
	
	private base_de_datos.UR getORM__Valorado_por() {
		return _Valorado_por;
	}
	
	private void setORM__Valorado(java.util.Set value) {
		this.ORM__Valorado = value;
	}
	
	private java.util.Set getORM__Valorado() {
		return ORM__Valorado;
	}
	
	@Transient	
	public final base_de_datos.ProductoSetCollection _Valorado = new base_de_datos.ProductoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_VALORACION__VALORADO, base_de_datos.ORMConstants.KEY_PRODUCTO__VALORADO_POR, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_valoracion());
	}
	
}
