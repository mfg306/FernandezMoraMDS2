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

public class Producto_RebajadoDAO {
	public static Producto_Rebajado loadProducto_RebajadoByORMID(int id_Producto) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadProducto_RebajadoByORMID(session, id_Producto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado getProducto_RebajadoByORMID(int id_Producto) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return getProducto_RebajadoByORMID(session, id_Producto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByORMID(int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadProducto_RebajadoByORMID(session, id_Producto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado getProducto_RebajadoByORMID(int id_Producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
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
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryProducto_Rebajado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_Rebajado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return queryProducto_Rebajado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado[] listProducto_RebajadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return listProducto_RebajadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado[] listProducto_RebajadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
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
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return loadProducto_RebajadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_Rebajado loadProducto_RebajadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
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
			PersistentSession session = MDS2PersistentManager.instance().getSession();
			return iterateProducto_RebajadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_RebajadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2PersistentManager.instance().getSession();
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
	
	public static Producto_Rebajado createProducto_Rebajado() {
		return new base_de_datos.Producto_Rebajado();
	}
	
	public static boolean save(base_de_datos.Producto_Rebajado producto_Rebajado) throws PersistentException {
		try {
			MDS2PersistentManager.instance().saveObject(producto_Rebajado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.Producto_Rebajado producto_Rebajado) throws PersistentException {
		try {
			MDS2PersistentManager.instance().deleteObject(producto_Rebajado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Producto_Rebajado producto_Rebajado)throws PersistentException {
		try {
			base_de_datos.Oferta[] l_Tienes = producto_Rebajado._Tiene.toArray();
			for(int i = 0; i < l_Tienes.length; i++) {
				l_Tienes[i]._Pertenece_a.remove(producto_Rebajado);
			}
			if (producto_Rebajado.get_Categoria() != null) {
				producto_Rebajado.get_Categoria()._Producto.remove(producto_Rebajado);
			}
			
			base_de_datos.Producto_en_compra[] l_Producto_en_compras = producto_Rebajado._Producto_en_compra.toArray();
			for(int i = 0; i < l_Producto_en_compras.length; i++) {
				l_Producto_en_compras[i].set_Producto(null);
			}
			base_de_datos.Comentario[] l_Pertenece_as = producto_Rebajado._Pertenece_a.toArray();
			for(int i = 0; i < l_Pertenece_as.length; i++) {
				l_Pertenece_as[i].set_Tiene(null);
			}
			base_de_datos.Imagen[] l_Imagens = producto_Rebajado._Imagen.toArray();
			for(int i = 0; i < l_Imagens.length; i++) {
				l_Imagens[i].set_Producto(null);
			}
			base_de_datos.Valoracion[] l_Valorado_pors = producto_Rebajado._Valorado_por.toArray();
			for(int i = 0; i < l_Valorado_pors.length; i++) {
				l_Valorado_pors[i].set_Valorado(null);
			}
			return delete(producto_Rebajado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Producto_Rebajado producto_Rebajado, org.orm.PersistentSession session)throws PersistentException {
		try {
			base_de_datos.Oferta[] l_Tienes = producto_Rebajado._Tiene.toArray();
			for(int i = 0; i < l_Tienes.length; i++) {
				l_Tienes[i]._Pertenece_a.remove(producto_Rebajado);
			}
			if (producto_Rebajado.get_Categoria() != null) {
				producto_Rebajado.get_Categoria()._Producto.remove(producto_Rebajado);
			}
			
			base_de_datos.Producto_en_compra[] l_Producto_en_compras = producto_Rebajado._Producto_en_compra.toArray();
			for(int i = 0; i < l_Producto_en_compras.length; i++) {
				l_Producto_en_compras[i].set_Producto(null);
			}
			base_de_datos.Comentario[] l_Pertenece_as = producto_Rebajado._Pertenece_a.toArray();
			for(int i = 0; i < l_Pertenece_as.length; i++) {
				l_Pertenece_as[i].set_Tiene(null);
			}
			base_de_datos.Imagen[] l_Imagens = producto_Rebajado._Imagen.toArray();
			for(int i = 0; i < l_Imagens.length; i++) {
				l_Imagens[i].set_Producto(null);
			}
			base_de_datos.Valoracion[] l_Valorado_pors = producto_Rebajado._Valorado_por.toArray();
			for(int i = 0; i < l_Valorado_pors.length; i++) {
				l_Valorado_pors[i].set_Valorado(null);
			}
			try {
				session.delete(producto_Rebajado);
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
	
	public static boolean refresh(base_de_datos.Producto_Rebajado producto_Rebajado) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().refresh(producto_Rebajado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.Producto_Rebajado producto_Rebajado) throws PersistentException {
		try {
			MDS2PersistentManager.instance().getSession().evict(producto_Rebajado);
			return true;
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
}
