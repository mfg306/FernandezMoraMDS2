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
@Table(name="UR")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="Usuario_GeneralId_Usuario", referencedColumnName="Id_Usuario")
public class UR extends base_de_datos.Usuario_General implements Serializable {
	public UR() {
	}
	
	public static UR loadURByORMID(int id_Usuario) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadURByORMID(session, id_Usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR getURByORMID(int id_Usuario) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getURByORMID(session, id_Usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByORMID(int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadURByORMID(session, id_Usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR getURByORMID(int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getURByORMID(session, id_Usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByORMID(PersistentSession session, int id_Usuario) throws PersistentException {
		try {
			return (UR) session.load(base_de_datos.UR.class, new Integer(id_Usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR getURByORMID(PersistentSession session, int id_Usuario) throws PersistentException {
		try {
			return (UR) session.get(base_de_datos.UR.class, new Integer(id_Usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByORMID(PersistentSession session, int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UR) session.load(base_de_datos.UR.class, new Integer(id_Usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR getURByORMID(PersistentSession session, int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UR) session.get(base_de_datos.UR.class, new Integer(id_Usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUR(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryUR(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUR(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryUR(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR[] listURByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listURByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR[] listURByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listURByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUR(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.UR as UR");
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
	
	public static List queryUR(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.UR as UR");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UR", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR[] listURByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUR(session, condition, orderBy);
			return (UR[]) list.toArray(new UR[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR[] listURByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUR(session, condition, orderBy, lockMode);
			return (UR[]) list.toArray(new UR[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadURByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadURByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UR[] uRs = listURByQuery(session, condition, orderBy);
		if (uRs != null && uRs.length > 0)
			return uRs[0];
		else
			return null;
	}
	
	public static UR loadURByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UR[] uRs = listURByQuery(session, condition, orderBy, lockMode);
		if (uRs != null && uRs.length > 0)
			return uRs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateURByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateURByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateURByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateURByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateURByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.UR as UR");
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
	
	public static java.util.Iterator iterateURByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.UR as UR");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UR", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UR loadURByCriteria(URCriteria uRCriteria) {
		UR[] uRs = listURByCriteria(uRCriteria);
		if(uRs == null || uRs.length == 0) {
			return null;
		}
		return uRs[0];
	}
	
	public static UR[] listURByCriteria(URCriteria uRCriteria) {
		return uRCriteria.listUR();
	}
	
	public static UR createUR() {
		return new base_de_datos.UR();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			base_de_datos.Comentario[] l_Es_de_uns = _Es_de_un.toArray();
			for(int i = 0; i < l_Es_de_uns.length; i++) {
				l_Es_de_uns[i].set_Realiza(null);
			}
			base_de_datos.Pendiente[] l_Compras = _Compra.toArray();
			for(int i = 0; i < l_Compras.length; i++) {
				l_Compras[i].set_Hace_compra(null);
			}
			base_de_datos.Recibido[] l_recibidos = _recibido.toArray();
			for(int i = 0; i < l_recibidos.length; i++) {
				l_recibidos[i].set_recibe(null);
			}
			base_de_datos.Mensaje[] l_Envias = _Envia.toArray();
			for(int i = 0; i < l_Envias.length; i++) {
				l_Envias[i].set_Enviado_por_UR(null);
			}
			base_de_datos.Valoracion[] l_Valoras = _Valora.toArray();
			for(int i = 0; i < l_Valoras.length; i++) {
				l_Valoras[i].set_Valorado_por(null);
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
			base_de_datos.Comentario[] l_Es_de_uns = _Es_de_un.toArray();
			for(int i = 0; i < l_Es_de_uns.length; i++) {
				l_Es_de_uns[i].set_Realiza(null);
			}
			base_de_datos.Pendiente[] l_Compras = _Compra.toArray();
			for(int i = 0; i < l_Compras.length; i++) {
				l_Compras[i].set_Hace_compra(null);
			}
			base_de_datos.Recibido[] l_recibidos = _recibido.toArray();
			for(int i = 0; i < l_recibidos.length; i++) {
				l_recibidos[i].set_recibe(null);
			}
			base_de_datos.Mensaje[] l_Envias = _Envia.toArray();
			for(int i = 0; i < l_Envias.length; i++) {
				l_Envias[i].set_Enviado_por_UR(null);
			}
			base_de_datos.Valoracion[] l_Valoras = _Valora.toArray();
			for(int i = 0; i < l_Valoras.length; i++) {
				l_Valoras[i].set_Valorado_por(null);
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
		if (key == base_de_datos.ORMConstants.KEY_UR__ES_DE_UN) {
			return ORM__Es_de_un;
		}
		else if (key == base_de_datos.ORMConstants.KEY_UR__COMPRA) {
			return ORM__Compra;
		}
		else if (key == base_de_datos.ORMConstants.KEY_UR__RECIBIDO) {
			return ORM__recibido;
		}
		else if (key == base_de_datos.ORMConstants.KEY_UR__ENVIA) {
			return ORM__Envia;
		}
		else if (key == base_de_datos.ORMConstants.KEY_UR__VALORA) {
			return ORM__Valora;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Direccion_envio", nullable=true, length=255)	
	private String direccion_envio;
	
	@Column(name="Metodo_pago", nullable=true, length=255)	
	private String metodo_pago;
	
	@Column(name="Nombre_usuario", nullable=true, length=255)	
	private String nombre_usuario;
	
	@Column(name="Esta_operativo", nullable=false, length=1)	
	private boolean esta_operativo;
	
	@OneToMany(mappedBy="_Realiza", targetEntity=base_de_datos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Es_de_un = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Hace_compra", targetEntity=base_de_datos.Pendiente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Compra = new java.util.HashSet();
	
	@OneToMany(mappedBy="_recibe", targetEntity=base_de_datos.Recibido.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__recibido = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Enviado_por_UR", targetEntity=base_de_datos.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Envia = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Valorado_por", targetEntity=base_de_datos.Valoracion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Valora = new java.util.HashSet();
	
	public void setDireccion_envio(String value) {
		this.direccion_envio = value;
	}
	
	public String getDireccion_envio() {
		return direccion_envio;
	}
	
	public void setMetodo_pago(String value) {
		this.metodo_pago = value;
	}
	
	public String getMetodo_pago() {
		return metodo_pago;
	}
	
	public void setNombre_usuario(String value) {
		this.nombre_usuario = value;
	}
	
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	
	public void setEsta_operativo(boolean value) {
		this.esta_operativo = value;
	}
	
	public boolean getEsta_operativo() {
		return esta_operativo;
	}
	
	private void setORM__Es_de_un(java.util.Set value) {
		this.ORM__Es_de_un = value;
	}
	
	private java.util.Set getORM__Es_de_un() {
		return ORM__Es_de_un;
	}
	
	@Transient	
	public final base_de_datos.ComentarioSetCollection _Es_de_un = new base_de_datos.ComentarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_UR__ES_DE_UN, base_de_datos.ORMConstants.KEY_COMENTARIO__REALIZA, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Compra(java.util.Set value) {
		this.ORM__Compra = value;
	}
	
	private java.util.Set getORM__Compra() {
		return ORM__Compra;
	}
	
	@Transient	
	public final base_de_datos.PendienteSetCollection _Compra = new base_de_datos.PendienteSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_UR__COMPRA, base_de_datos.ORMConstants.KEY_PENDIENTE__HACE_COMPRA, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__recibido(java.util.Set value) {
		this.ORM__recibido = value;
	}
	
	private java.util.Set getORM__recibido() {
		return ORM__recibido;
	}
	
	@Transient	
	public final base_de_datos.RecibidoSetCollection _recibido = new base_de_datos.RecibidoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_UR__RECIBIDO, base_de_datos.ORMConstants.KEY_RECIBIDO__RECIBE, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Envia(java.util.Set value) {
		this.ORM__Envia = value;
	}
	
	private java.util.Set getORM__Envia() {
		return ORM__Envia;
	}
	
	@Transient	
	public final base_de_datos.MensajeSetCollection _Envia = new base_de_datos.MensajeSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_UR__ENVIA, base_de_datos.ORMConstants.KEY_MENSAJE__ENVIADO_POR_UR, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Valora(java.util.Set value) {
		this.ORM__Valora = value;
	}
	
	private java.util.Set getORM__Valora() {
		return ORM__Valora;
	}
	
	@Transient	
	public final base_de_datos.ValoracionSetCollection _Valora = new base_de_datos.ValoracionSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_UR__VALORA, base_de_datos.ORMConstants.KEY_VALORACION__VALORADO_POR, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
