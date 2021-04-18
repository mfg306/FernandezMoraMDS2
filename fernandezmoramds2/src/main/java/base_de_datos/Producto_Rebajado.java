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
@Table(name="Producto_Rebajado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ProductoId_Producto", referencedColumnName="Id_Producto")
public class Producto_Rebajado extends base_de_datos.Producto implements Serializable {
	public Producto_Rebajado() {
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByORMID(int id_Producto) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadProducto_RebajadoByORMID(session, id_Producto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado getProducto_RebajadoByORMID(int id_Producto) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getProducto_RebajadoByORMID(session, id_Producto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByORMID(int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadProducto_RebajadoByORMID(session, id_Producto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado getProducto_RebajadoByORMID(int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getProducto_RebajadoByORMID(session, id_Producto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByORMID(PersistentSession session, int id_Producto) throws PersistentException {
		try {
			return (Producto_Rebajado) session.load(base_de_datos.Producto_Rebajado.class, new Integer(id_Producto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado getProducto_RebajadoByORMID(PersistentSession session, int id_Producto) throws PersistentException {
		try {
			return (Producto_Rebajado) session.get(base_de_datos.Producto_Rebajado.class, new Integer(id_Producto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByORMID(PersistentSession session, int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto_Rebajado) session.load(base_de_datos.Producto_Rebajado.class, new Integer(id_Producto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado getProducto_RebajadoByORMID(PersistentSession session, int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto_Rebajado) session.get(base_de_datos.Producto_Rebajado.class, new Integer(id_Producto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_Rebajado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryProducto_Rebajado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_Rebajado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryProducto_Rebajado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado[] listProducto_RebajadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listProducto_RebajadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado[] listProducto_RebajadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listProducto_RebajadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_Rebajado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto_Rebajado as Producto_Rebajado");
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
	
	public static List queryProducto_Rebajado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto_Rebajado as Producto_Rebajado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto_Rebajado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado[] listProducto_RebajadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProducto_Rebajado(session, condition, orderBy);
			return (Producto_Rebajado[]) list.toArray(new Producto_Rebajado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado[] listProducto_RebajadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProducto_Rebajado(session, condition, orderBy, lockMode);
			return (Producto_Rebajado[]) list.toArray(new Producto_Rebajado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadProducto_RebajadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadProducto_RebajadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Producto_Rebajado[] producto_Rebajados = listProducto_RebajadoByQuery(session, condition, orderBy);
		if (producto_Rebajados != null && producto_Rebajados.length > 0)
			return producto_Rebajados[0];
		else
			return null;
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Producto_Rebajado[] producto_Rebajados = listProducto_RebajadoByQuery(session, condition, orderBy, lockMode);
		if (producto_Rebajados != null && producto_Rebajados.length > 0)
			return producto_Rebajados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProducto_RebajadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateProducto_RebajadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_RebajadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateProducto_RebajadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_RebajadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto_Rebajado as Producto_Rebajado");
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
	
	public static java.util.Iterator iterateProducto_RebajadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto_Rebajado as Producto_Rebajado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto_Rebajado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByCriteria(Producto_RebajadoCriteria producto_RebajadoCriteria) {
		Producto_Rebajado[] producto_Rebajados = listProducto_RebajadoByCriteria(producto_RebajadoCriteria);
		if(producto_Rebajados == null || producto_Rebajados.length == 0) {
			return null;
		}
		return producto_Rebajados[0];
	}
	
	public static Producto_Rebajado[] listProducto_RebajadoByCriteria(Producto_RebajadoCriteria producto_RebajadoCriteria) {
		return producto_RebajadoCriteria.listProducto_Rebajado();
	}
	
	public static Producto_Rebajado createProducto_Rebajado() {
		return new base_de_datos.Producto_Rebajado();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(get_Tiene() != null) {
				get_Tiene()._Pertenece_a.remove(this);
			}
			
			if(get_Valorado_por() != null) {
				get_Valorado_por()._Valorado.remove(this);
			}
			
			if(get_Categoria() != null) {
				get_Categoria()._Producto.remove(this);
			}
			
			base_de_datos.Producto_en_compra[] l_Producto_en_compras = _Producto_en_compra.toArray();
			for(int i = 0; i < l_Producto_en_compras.length; i++) {
				l_Producto_en_compras[i]._Producto.remove(this);
			}
			base_de_datos.Comentario[] l_Pertenece_as = _Pertenece_a.toArray();
			for(int i = 0; i < l_Pertenece_as.length; i++) {
				l_Pertenece_as[i].set_Tiene(null);
			}
			base_de_datos.Imagen[] l_Imagens = _Imagen.toArray();
			for(int i = 0; i < l_Imagens.length; i++) {
				l_Imagens[i].set_Producto(null);
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
			if(get_Tiene() != null) {
				get_Tiene()._Pertenece_a.remove(this);
			}
			
			if(get_Valorado_por() != null) {
				get_Valorado_por()._Valorado.remove(this);
			}
			
			if(get_Categoria() != null) {
				get_Categoria()._Producto.remove(this);
			}
			
			base_de_datos.Producto_en_compra[] l_Producto_en_compras = _Producto_en_compra.toArray();
			for(int i = 0; i < l_Producto_en_compras.length; i++) {
				l_Producto_en_compras[i]._Producto.remove(this);
			}
			base_de_datos.Comentario[] l_Pertenece_as = _Pertenece_a.toArray();
			for(int i = 0; i < l_Pertenece_as.length; i++) {
				l_Pertenece_as[i].set_Tiene(null);
			}
			base_de_datos.Imagen[] l_Imagens = _Imagen.toArray();
			for(int i = 0; i < l_Imagens.length; i++) {
				l_Imagens[i].set_Producto(null);
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
		if (key == base_de_datos.ORMConstants.KEY_PRODUCTO_REBAJADO__TIENE) {
			this._Tiene = (base_de_datos.Oferta) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Precio_rebajado", nullable=false)	
	private double precio_rebajado;
	
	@ManyToOne(targetEntity=base_de_datos.Oferta.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="OfertaId_Oferta", referencedColumnName="Id_Oferta", nullable=false) }, foreignKey=@ForeignKey(name="FKProducto_R263979"))	
	private base_de_datos.Oferta _Tiene;
	
	public void setPrecio_rebajado(double value) {
		this.precio_rebajado = value;
	}
	
	public double getPrecio_rebajado() {
		return precio_rebajado;
	}
	
	public void set_Tiene(base_de_datos.Oferta value) {
		if (_Tiene != null) {
			_Tiene._Pertenece_a.remove(this);
		}
		if (value != null) {
			value._Pertenece_a.add(this);
		}
	}
	
	public base_de_datos.Oferta get_Tiene() {
		return _Tiene;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM__Tiene(base_de_datos.Oferta value) {
		this._Tiene = value;
	}
	
	private base_de_datos.Oferta getORM__Tiene() {
		return _Tiene;
	}
	
	public base_de_datos.Producto_Rebajado[] cargarProductosOferta(base_de_datos.Oferta oferta) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
