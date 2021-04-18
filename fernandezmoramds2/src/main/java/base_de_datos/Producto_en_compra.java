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
@Table(name="Producto_en_compra")
public class Producto_en_compra implements Serializable {
	public Producto_en_compra() {
	}
	
	public static Producto_en_compra loadProducto_en_compraByORMID(int id_Producto_en_compra) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadProducto_en_compraByORMID(session, id_Producto_en_compra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra getProducto_en_compraByORMID(int id_Producto_en_compra) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getProducto_en_compraByORMID(session, id_Producto_en_compra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByORMID(int id_Producto_en_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadProducto_en_compraByORMID(session, id_Producto_en_compra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra getProducto_en_compraByORMID(int id_Producto_en_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getProducto_en_compraByORMID(session, id_Producto_en_compra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByORMID(PersistentSession session, int id_Producto_en_compra) throws PersistentException {
		try {
			return (Producto_en_compra) session.load(base_de_datos.Producto_en_compra.class, new Integer(id_Producto_en_compra));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra getProducto_en_compraByORMID(PersistentSession session, int id_Producto_en_compra) throws PersistentException {
		try {
			return (Producto_en_compra) session.get(base_de_datos.Producto_en_compra.class, new Integer(id_Producto_en_compra));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByORMID(PersistentSession session, int id_Producto_en_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto_en_compra) session.load(base_de_datos.Producto_en_compra.class, new Integer(id_Producto_en_compra), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra getProducto_en_compraByORMID(PersistentSession session, int id_Producto_en_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto_en_compra) session.get(base_de_datos.Producto_en_compra.class, new Integer(id_Producto_en_compra), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_en_compra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryProducto_en_compra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_en_compra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryProducto_en_compra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra[] listProducto_en_compraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listProducto_en_compraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra[] listProducto_en_compraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listProducto_en_compraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_en_compra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto_en_compra as Producto_en_compra");
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
	
	public static List queryProducto_en_compra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto_en_compra as Producto_en_compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto_en_compra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra[] listProducto_en_compraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProducto_en_compra(session, condition, orderBy);
			return (Producto_en_compra[]) list.toArray(new Producto_en_compra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra[] listProducto_en_compraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProducto_en_compra(session, condition, orderBy, lockMode);
			return (Producto_en_compra[]) list.toArray(new Producto_en_compra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadProducto_en_compraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadProducto_en_compraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Producto_en_compra[] producto_en_compras = listProducto_en_compraByQuery(session, condition, orderBy);
		if (producto_en_compras != null && producto_en_compras.length > 0)
			return producto_en_compras[0];
		else
			return null;
	}
	
	public static Producto_en_compra loadProducto_en_compraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Producto_en_compra[] producto_en_compras = listProducto_en_compraByQuery(session, condition, orderBy, lockMode);
		if (producto_en_compras != null && producto_en_compras.length > 0)
			return producto_en_compras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProducto_en_compraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateProducto_en_compraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_en_compraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateProducto_en_compraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_en_compraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto_en_compra as Producto_en_compra");
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
	
	public static java.util.Iterator iterateProducto_en_compraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto_en_compra as Producto_en_compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto_en_compra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_en_compra loadProducto_en_compraByCriteria(Producto_en_compraCriteria producto_en_compraCriteria) {
		Producto_en_compra[] producto_en_compras = listProducto_en_compraByCriteria(producto_en_compraCriteria);
		if(producto_en_compras == null || producto_en_compras.length == 0) {
			return null;
		}
		return producto_en_compras[0];
	}
	
	public static Producto_en_compra[] listProducto_en_compraByCriteria(Producto_en_compraCriteria producto_en_compraCriteria) {
		return producto_en_compraCriteria.listProducto_en_compra();
	}
	
	public static Producto_en_compra createProducto_en_compra() {
		return new base_de_datos.Producto_en_compra();
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
			base_de_datos.Producto[] l_Productos = _Producto.toArray();
			for(int i = 0; i < l_Productos.length; i++) {
				l_Productos[i]._Producto_en_compra.remove(this);
			}
			base_de_datos.Pendiente[] l_Pendientes = _Pendiente.toArray();
			for(int i = 0; i < l_Pendientes.length; i++) {
				l_Pendientes[i]._Producto_en_compra.remove(this);
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
			base_de_datos.Producto[] l_Productos = _Producto.toArray();
			for(int i = 0; i < l_Productos.length; i++) {
				l_Productos[i]._Producto_en_compra.remove(this);
			}
			base_de_datos.Pendiente[] l_Pendientes = _Pendiente.toArray();
			for(int i = 0; i < l_Pendientes.length; i++) {
				l_Pendientes[i]._Producto_en_compra.remove(this);
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
		if (key == base_de_datos.ORMConstants.KEY_PRODUCTO_EN_COMPRA__PRODUCTO) {
			return ORM__Producto;
		}
		else if (key == base_de_datos.ORMConstants.KEY_PRODUCTO_EN_COMPRA__PENDIENTE) {
			return ORM__Pendiente;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_Producto_en_compra", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_PRODUCTO_EN_COMPRA_ID_PRODUCTO_EN_COMPRA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_PRODUCTO_EN_COMPRA_ID_PRODUCTO_EN_COMPRA_GENERATOR", strategy="native")	
	private int id_Producto_en_compra;
	
	@Column(name="Num_unidades_producto", nullable=false, length=10)	
	private int num_unidades_producto;
	
	@ManyToMany(mappedBy="ORM__Producto_en_compra", targetEntity=base_de_datos.Producto.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Producto = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM__Producto_en_compra", targetEntity=base_de_datos.Pendiente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Pendiente = new java.util.HashSet();
	
	public void setNum_unidades_producto(int value) {
		this.num_unidades_producto = value;
	}
	
	public int getNum_unidades_producto() {
		return num_unidades_producto;
	}
	
	private void setId_Producto_en_compra(int value) {
		this.id_Producto_en_compra = value;
	}
	
	public int getId_Producto_en_compra() {
		return id_Producto_en_compra;
	}
	
	public int getORMID() {
		return getId_Producto_en_compra();
	}
	
	private void setORM__Producto(java.util.Set value) {
		this.ORM__Producto = value;
	}
	
	private java.util.Set getORM__Producto() {
		return ORM__Producto;
	}
	
	@Transient	
	public final base_de_datos.ProductoSetCollection _Producto = new base_de_datos.ProductoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_PRODUCTO_EN_COMPRA__PRODUCTO, base_de_datos.ORMConstants.KEY_PRODUCTO__PRODUCTO_EN_COMPRA, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM__Pendiente(java.util.Set value) {
		this.ORM__Pendiente = value;
	}
	
	private java.util.Set getORM__Pendiente() {
		return ORM__Pendiente;
	}
	
	@Transient	
	public final base_de_datos.PendienteSetCollection _Pendiente = new base_de_datos.PendienteSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_PRODUCTO_EN_COMPRA__PENDIENTE, base_de_datos.ORMConstants.KEY_PENDIENTE__PRODUCTO_EN_COMPRA, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_Producto_en_compra());
	}
	
}
