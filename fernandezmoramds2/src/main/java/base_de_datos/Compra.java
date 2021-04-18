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
@Table(name="Compra")
@Inheritance(strategy=InheritanceType.JOINED)
public class Compra implements Serializable {
	public Compra() {
	}
	
	public static Compra loadCompraByORMID(int codigo) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadCompraByORMID(session, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra getCompraByORMID(int codigo) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getCompraByORMID(session, codigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByORMID(int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadCompraByORMID(session, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra getCompraByORMID(int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getCompraByORMID(session, codigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByORMID(PersistentSession session, int codigo) throws PersistentException {
		try {
			return (Compra) session.load(base_de_datos.Compra.class, new Integer(codigo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra getCompraByORMID(PersistentSession session, int codigo) throws PersistentException {
		try {
			return (Compra) session.get(base_de_datos.Compra.class, new Integer(codigo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByORMID(PersistentSession session, int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compra) session.load(base_de_datos.Compra.class, new Integer(codigo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra getCompraByORMID(PersistentSession session, int codigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compra) session.get(base_de_datos.Compra.class, new Integer(codigo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryCompra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryCompra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra[] listCompraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listCompraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra[] listCompraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listCompraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Compra as Compra");
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
	
	public static List queryCompra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Compra as Compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra[] listCompraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCompra(session, condition, orderBy);
			return (Compra[]) list.toArray(new Compra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra[] listCompraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCompra(session, condition, orderBy, lockMode);
			return (Compra[]) list.toArray(new Compra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadCompraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadCompraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Compra[] compras = listCompraByQuery(session, condition, orderBy);
		if (compras != null && compras.length > 0)
			return compras[0];
		else
			return null;
	}
	
	public static Compra loadCompraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Compra[] compras = listCompraByQuery(session, condition, orderBy, lockMode);
		if (compras != null && compras.length > 0)
			return compras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCompraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateCompraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateCompraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Compra as Compra");
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
	
	public static java.util.Iterator iterateCompraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Compra as Compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByCriteria(CompraCriteria compraCriteria) {
		Compra[] compras = listCompraByCriteria(compraCriteria);
		if(compras == null || compras.length == 0) {
			return null;
		}
		return compras[0];
	}
	
	public static Compra[] listCompraByCriteria(CompraCriteria compraCriteria) {
		return compraCriteria.listCompra();
	}
	
	public static Compra createCompra() {
		return new base_de_datos.Compra();
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
	
	@Column(name="Codigo", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_COMPRA_CODIGO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_COMPRA_CODIGO_GENERATOR", strategy="native")	
	private int codigo;
	
	@Column(name="Num_total_unidades", nullable=false, length=10)	
	private int num_total_unidades;
	
	@Column(name="Precio_total", nullable=false)	
	private double precio_total;
	
	@Column(name="Fecha_estado", nullable=true, length=255)	
	private String fecha_estado;
	
	public void setNum_total_unidades(int value) {
		this.num_total_unidades = value;
	}
	
	public int getNum_total_unidades() {
		return num_total_unidades;
	}
	
	public void setPrecio_total(double value) {
		this.precio_total = value;
	}
	
	public double getPrecio_total() {
		return precio_total;
	}
	
	private void setCodigo(int value) {
		this.codigo = value;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public int getORMID() {
		return getCodigo();
	}
	
	public void setFecha_estado(String value) {
		this.fecha_estado = value;
	}
	
	public String getFecha_estado() {
		return fecha_estado;
	}
	
	public base_de_datos.Compra[] cargarPedidos(base_de_datos.UR usuario) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getCodigo());
	}
	
}
