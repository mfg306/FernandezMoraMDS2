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

public class ProductoDAO {
	public static Producto loadProductoByORMID(int id_Producto) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadProductoByORMID(session, id_Producto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(int id_Producto) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getProductoByORMID(session, id_Producto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByORMID(int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadProductoByORMID(session, id_Producto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getProductoByORMID(session, id_Producto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByORMID(PersistentSession session, int id_Producto) throws PersistentException {
		try {
			return (Producto) session.load(base_de_datos.Producto.class, new Integer(id_Producto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(PersistentSession session, int id_Producto) throws PersistentException {
		try {
			return (Producto) session.get(base_de_datos.Producto.class, new Integer(id_Producto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByORMID(PersistentSession session, int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto) session.load(base_de_datos.Producto.class, new Integer(id_Producto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(PersistentSession session, int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto) session.get(base_de_datos.Producto.class, new Integer(id_Producto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryProducto(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryProducto(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listProductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listProductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto as Producto");
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
	
	public static List queryProducto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto as Producto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProducto(session, condition, orderBy);
			return (Producto[]) list.toArray(new Producto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProducto(session, condition, orderBy, lockMode);
			return (Producto[]) list.toArray(new Producto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadProductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadProductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Producto[] productos = listProductoByQuery(session, condition, orderBy);
		if (productos != null && productos.length > 0)
			return productos[0];
		else
			return null;
	}
	
	public static Producto loadProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Producto[] productos = listProductoByQuery(session, condition, orderBy, lockMode);
		if (productos != null && productos.length > 0)
			return productos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProductoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateProductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateProductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto as Producto");
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
	
	public static java.util.Iterator iterateProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Producto as Producto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto createProducto() {
		return new base_de_datos.Producto();
	}
	
	public static boolean save(base_de_datos.Producto producto) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().saveObject(producto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.Producto producto) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().deleteObject(producto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Producto producto)throws PersistentException {
		if (producto instanceof base_de_datos.Producto_Rebajado) {
			return base_de_datos.Producto_RebajadoDAO.deleteAndDissociate((base_de_datos.Producto_Rebajado) producto);
		}
		
		try {
			if (producto.get_Categoria() != null) {
				producto.get_Categoria()._Producto.remove(producto);
			}
			
			base_de_datos.Producto_en_compra[] l_Producto_en_compras = producto._Producto_en_compra.toArray();
			for(int i = 0; i < l_Producto_en_compras.length; i++) {
				l_Producto_en_compras[i].set_Producto(null);
			}
			base_de_datos.Comentario[] l_Pertenece_as = producto._Pertenece_a.toArray();
			for(int i = 0; i < l_Pertenece_as.length; i++) {
				l_Pertenece_as[i].set_Tiene(null);
			}
			base_de_datos.Imagen[] l_Imagens = producto._Imagen.toArray();
			for(int i = 0; i < l_Imagens.length; i++) {
				l_Imagens[i].set_Producto(null);
			}
			base_de_datos.Valoracion[] l_Valorado_pors = producto._Valorado_por.toArray();
			for(int i = 0; i < l_Valorado_pors.length; i++) {
				l_Valorado_pors[i].set_Valorado(null);
			}
			return delete(producto);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Producto producto, org.orm.PersistentSession session)throws PersistentException {
		if (producto instanceof base_de_datos.Producto_Rebajado) {
			return base_de_datos.Producto_RebajadoDAO.deleteAndDissociate((base_de_datos.Producto_Rebajado) producto, session);
		}
		
		try {
			if (producto.get_Categoria() != null) {
				producto.get_Categoria()._Producto.remove(producto);
			}
			
			base_de_datos.Producto_en_compra[] l_Producto_en_compras = producto._Producto_en_compra.toArray();
			for(int i = 0; i < l_Producto_en_compras.length; i++) {
				l_Producto_en_compras[i].set_Producto(null);
			}
			base_de_datos.Comentario[] l_Pertenece_as = producto._Pertenece_a.toArray();
			for(int i = 0; i < l_Pertenece_as.length; i++) {
				l_Pertenece_as[i].set_Tiene(null);
			}
			base_de_datos.Imagen[] l_Imagens = producto._Imagen.toArray();
			for(int i = 0; i < l_Imagens.length; i++) {
				l_Imagens[i].set_Producto(null);
			}
			base_de_datos.Valoracion[] l_Valorado_pors = producto._Valorado_por.toArray();
			for(int i = 0; i < l_Valorado_pors.length; i++) {
				l_Valorado_pors[i].set_Valorado(null);
			}
			try {
				session.delete(producto);
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
	
	public static boolean refresh(base_de_datos.Producto producto) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().getSession().refresh(producto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.Producto producto) throws PersistentException {
		try {
			base_de_datos.HitoPersistentManager.instance().getSession().evict(producto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByCriteria(ProductoCriteria productoCriteria) {
		Producto[] productos = listProductoByCriteria(productoCriteria);
		if(productos == null || productos.length == 0) {
			return null;
		}
		return productos[0];
	}
	
	public static Producto[] listProductoByCriteria(ProductoCriteria productoCriteria) {
		return productoCriteria.listProducto();
	}
}
