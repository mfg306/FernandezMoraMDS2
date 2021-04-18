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
@Table(name="Oferta")
public class Oferta implements Serializable {
	public Oferta() {
	}
	
	public static Oferta loadOfertaByORMID(int id_Oferta) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadOfertaByORMID(session, id_Oferta);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta getOfertaByORMID(int id_Oferta) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getOfertaByORMID(session, id_Oferta);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByORMID(int id_Oferta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadOfertaByORMID(session, id_Oferta, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta getOfertaByORMID(int id_Oferta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getOfertaByORMID(session, id_Oferta, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByORMID(PersistentSession session, int id_Oferta) throws PersistentException {
		try {
			return (Oferta) session.load(base_de_datos.Oferta.class, new Integer(id_Oferta));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta getOfertaByORMID(PersistentSession session, int id_Oferta) throws PersistentException {
		try {
			return (Oferta) session.get(base_de_datos.Oferta.class, new Integer(id_Oferta));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByORMID(PersistentSession session, int id_Oferta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Oferta) session.load(base_de_datos.Oferta.class, new Integer(id_Oferta), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta getOfertaByORMID(PersistentSession session, int id_Oferta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Oferta) session.get(base_de_datos.Oferta.class, new Integer(id_Oferta), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOferta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryOferta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOferta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryOferta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta[] listOfertaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listOfertaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta[] listOfertaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listOfertaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOferta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Oferta as Oferta");
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
	
	public static List queryOferta(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Oferta as Oferta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Oferta", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta[] listOfertaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOferta(session, condition, orderBy);
			return (Oferta[]) list.toArray(new Oferta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta[] listOfertaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOferta(session, condition, orderBy, lockMode);
			return (Oferta[]) list.toArray(new Oferta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadOfertaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadOfertaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Oferta[] ofertas = listOfertaByQuery(session, condition, orderBy);
		if (ofertas != null && ofertas.length > 0)
			return ofertas[0];
		else
			return null;
	}
	
	public static Oferta loadOfertaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Oferta[] ofertas = listOfertaByQuery(session, condition, orderBy, lockMode);
		if (ofertas != null && ofertas.length > 0)
			return ofertas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateOfertaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateOfertaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOfertaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateOfertaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOfertaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Oferta as Oferta");
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
	
	public static java.util.Iterator iterateOfertaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Oferta as Oferta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Oferta", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByCriteria(OfertaCriteria ofertaCriteria) {
		Oferta[] ofertas = listOfertaByCriteria(ofertaCriteria);
		if(ofertas == null || ofertas.length == 0) {
			return null;
		}
		return ofertas[0];
	}
	
	public static Oferta[] listOfertaByCriteria(OfertaCriteria ofertaCriteria) {
		return ofertaCriteria.listOferta();
	}
	
	public static Oferta createOferta() {
		return new base_de_datos.Oferta();
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
			base_de_datos.Producto_Rebajado[] l_Pertenece_as = _Pertenece_a.toArray();
			for(int i = 0; i < l_Pertenece_as.length; i++) {
				l_Pertenece_as[i].set_Tiene(null);
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
			base_de_datos.Producto_Rebajado[] l_Pertenece_as = _Pertenece_a.toArray();
			for(int i = 0; i < l_Pertenece_as.length; i++) {
				l_Pertenece_as[i].set_Tiene(null);
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
		if (key == base_de_datos.ORMConstants.KEY_OFERTA__PERTENECE_A) {
			return ORM__Pertenece_a;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_Oferta", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_OFERTA_ID_OFERTA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_OFERTA_ID_OFERTA_GENERATOR", strategy="native")	
	private int id_Oferta;
	
	@Column(name="Nombre_Oferta", nullable=true, length=255)	
	private String nombre_Oferta;
	
	@Column(name="Fecha_caducidad", nullable=true, length=255)	
	private String fecha_caducidad;
	
	@Column(name="Fecha_registro", nullable=true, length=255)	
	private String fecha_registro;
	
	@OneToMany(mappedBy="_Tiene", targetEntity=base_de_datos.Producto_Rebajado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Pertenece_a = new java.util.HashSet();
	
	private void setId_Oferta(int value) {
		this.id_Oferta = value;
	}
	
	public int getId_Oferta() {
		return id_Oferta;
	}
	
	public int getORMID() {
		return getId_Oferta();
	}
	
	public void setNombre_Oferta(String value) {
		this.nombre_Oferta = value;
	}
	
	public String getNombre_Oferta() {
		return nombre_Oferta;
	}
	
	public void setFecha_caducidad(String value) {
		this.fecha_caducidad = value;
	}
	
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}
	
	public void setFecha_registro(String value) {
		this.fecha_registro = value;
	}
	
	public String getFecha_registro() {
		return fecha_registro;
	}
	
	private void setORM__Pertenece_a(java.util.Set value) {
		this.ORM__Pertenece_a = value;
	}
	
	private java.util.Set getORM__Pertenece_a() {
		return ORM__Pertenece_a;
	}
	
	@Transient	
	public final base_de_datos.Producto_RebajadoSetCollection _Pertenece_a = new base_de_datos.Producto_RebajadoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_OFERTA__PERTENECE_A, base_de_datos.ORMConstants.KEY_PRODUCTO_REBAJADO__TIENE, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_Oferta());
	}
	
}
