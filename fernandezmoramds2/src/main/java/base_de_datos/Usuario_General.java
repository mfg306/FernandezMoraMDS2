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
@Table(name="Usuario_General")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario_General implements Serializable {
	public Usuario_General() {
	}
	
	public static Usuario_General loadUsuario_GeneralByORMID(int id_Usuario) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadUsuario_GeneralByORMID(session, id_Usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General getUsuario_GeneralByORMID(int id_Usuario) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getUsuario_GeneralByORMID(session, id_Usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByORMID(int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadUsuario_GeneralByORMID(session, id_Usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General getUsuario_GeneralByORMID(int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getUsuario_GeneralByORMID(session, id_Usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByORMID(PersistentSession session, int id_Usuario) throws PersistentException {
		try {
			return (Usuario_General) session.load(base_de_datos.Usuario_General.class, new Integer(id_Usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General getUsuario_GeneralByORMID(PersistentSession session, int id_Usuario) throws PersistentException {
		try {
			return (Usuario_General) session.get(base_de_datos.Usuario_General.class, new Integer(id_Usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByORMID(PersistentSession session, int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_General) session.load(base_de_datos.Usuario_General.class, new Integer(id_Usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General getUsuario_GeneralByORMID(PersistentSession session, int id_Usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_General) session.get(base_de_datos.Usuario_General.class, new Integer(id_Usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_General(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryUsuario_General(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_General(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryUsuario_General(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General[] listUsuario_GeneralByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listUsuario_GeneralByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General[] listUsuario_GeneralByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listUsuario_GeneralByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_General(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Usuario_General as Usuario_General");
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
	
	public static List queryUsuario_General(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Usuario_General as Usuario_General");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_General", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General[] listUsuario_GeneralByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_General(session, condition, orderBy);
			return (Usuario_General[]) list.toArray(new Usuario_General[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General[] listUsuario_GeneralByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_General(session, condition, orderBy, lockMode);
			return (Usuario_General[]) list.toArray(new Usuario_General[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadUsuario_GeneralByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadUsuario_GeneralByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_General[] usuario_Generals = listUsuario_GeneralByQuery(session, condition, orderBy);
		if (usuario_Generals != null && usuario_Generals.length > 0)
			return usuario_Generals[0];
		else
			return null;
	}
	
	public static Usuario_General loadUsuario_GeneralByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_General[] usuario_Generals = listUsuario_GeneralByQuery(session, condition, orderBy, lockMode);
		if (usuario_Generals != null && usuario_Generals.length > 0)
			return usuario_Generals[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_GeneralByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateUsuario_GeneralByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_GeneralByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateUsuario_GeneralByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_GeneralByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Usuario_General as Usuario_General");
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
	
	public static java.util.Iterator iterateUsuario_GeneralByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Usuario_General as Usuario_General");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_General", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_General loadUsuario_GeneralByCriteria(Usuario_GeneralCriteria usuario_GeneralCriteria) {
		Usuario_General[] usuario_Generals = listUsuario_GeneralByCriteria(usuario_GeneralCriteria);
		if(usuario_Generals == null || usuario_Generals.length == 0) {
			return null;
		}
		return usuario_Generals[0];
	}
	
	public static Usuario_General[] listUsuario_GeneralByCriteria(Usuario_GeneralCriteria usuario_GeneralCriteria) {
		return usuario_GeneralCriteria.listUsuario_General();
	}
	
	public static Usuario_General createUsuario_General() {
		return new base_de_datos.Usuario_General();
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
	
	@Column(name="Id_Usuario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_USUARIO_GENERAL_ID_USUARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_USUARIO_GENERAL_ID_USUARIO_GENERATOR", strategy="native")	
	private int id_Usuario;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Primer_apellido", nullable=true, length=255)	
	private String primer_apellido;
	
	@Column(name="Segundo_apellido", nullable=true, length=255)	
	private String segundo_apellido;
	
	@Column(name="Correo_electronico", nullable=true, length=255)	
	private String correo_electronico;
	
	@Column(name="Contrasenia", nullable=true, length=255)	
	private String contrasenia;
	
	@Column(name="Es_administrador", nullable=false, length=1)	
	private boolean es_administrador;
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPrimer_apellido(String value) {
		this.primer_apellido = value;
	}
	
	public String getPrimer_apellido() {
		return primer_apellido;
	}
	
	public void setSegundo_apellido(String value) {
		this.segundo_apellido = value;
	}
	
	public String getSegundo_apellido() {
		return segundo_apellido;
	}
	
	public void setCorreo_electronico(String value) {
		this.correo_electronico = value;
	}
	
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	
	public void setContrasenia(String value) {
		this.contrasenia = value;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	private void setId_Usuario(int value) {
		this.id_Usuario = value;
	}
	
	public int getId_Usuario() {
		return id_Usuario;
	}
	
	public int getORMID() {
		return getId_Usuario();
	}
	
	public void setEs_administrador(boolean value) {
		this.es_administrador = value;
	}
	
	public boolean getEs_administrador() {
		return es_administrador;
	}
	
	public String toString() {
		return String.valueOf(getId_Usuario());
	}
	
}
