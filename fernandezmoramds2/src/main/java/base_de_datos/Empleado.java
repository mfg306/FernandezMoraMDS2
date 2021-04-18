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
@Table(name="Empleado")
@Inheritance(strategy=InheritanceType.JOINED)
public class Empleado implements Serializable {
	public Empleado() {
	}
	
	public static Empleado loadEmpleadoByORMID(int idEmpleado) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadEmpleadoByORMID(session, idEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado getEmpleadoByORMID(int idEmpleado) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getEmpleadoByORMID(session, idEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByORMID(int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadEmpleadoByORMID(session, idEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado getEmpleadoByORMID(int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return getEmpleadoByORMID(session, idEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByORMID(PersistentSession session, int idEmpleado) throws PersistentException {
		try {
			return (Empleado) session.load(base_de_datos.Empleado.class, new Integer(idEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado getEmpleadoByORMID(PersistentSession session, int idEmpleado) throws PersistentException {
		try {
			return (Empleado) session.get(base_de_datos.Empleado.class, new Integer(idEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByORMID(PersistentSession session, int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Empleado) session.load(base_de_datos.Empleado.class, new Integer(idEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado getEmpleadoByORMID(PersistentSession session, int idEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Empleado) session.get(base_de_datos.Empleado.class, new Integer(idEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryEmpleado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return queryEmpleado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado[] listEmpleadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listEmpleadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado[] listEmpleadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return listEmpleadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Empleado as Empleado");
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
	
	public static List queryEmpleado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Empleado as Empleado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Empleado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado[] listEmpleadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEmpleado(session, condition, orderBy);
			return (Empleado[]) list.toArray(new Empleado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado[] listEmpleadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEmpleado(session, condition, orderBy, lockMode);
			return (Empleado[]) list.toArray(new Empleado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadEmpleadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return loadEmpleadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Empleado[] empleados = listEmpleadoByQuery(session, condition, orderBy);
		if (empleados != null && empleados.length > 0)
			return empleados[0];
		else
			return null;
	}
	
	public static Empleado loadEmpleadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Empleado[] empleados = listEmpleadoByQuery(session, condition, orderBy, lockMode);
		if (empleados != null && empleados.length > 0)
			return empleados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEmpleadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateEmpleadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpleadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.HitoPersistentManager.instance().getSession();
			return iterateEmpleadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpleadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Empleado as Empleado");
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
	
	public static java.util.Iterator iterateEmpleadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Empleado as Empleado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Empleado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByCriteria(EmpleadoCriteria empleadoCriteria) {
		Empleado[] empleados = listEmpleadoByCriteria(empleadoCriteria);
		if(empleados == null || empleados.length == 0) {
			return null;
		}
		return empleados[0];
	}
	
	public static Empleado[] listEmpleadoByCriteria(EmpleadoCriteria empleadoCriteria) {
		return empleadoCriteria.listEmpleado();
	}
	
	public static Empleado createEmpleado() {
		return new base_de_datos.Empleado();
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
	
	@Column(name="IdEmpleado", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_EMPLEADO_IDEMPLEADO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_EMPLEADO_IDEMPLEADO_GENERATOR", strategy="native")	
	private int idEmpleado;
	
	@Column(name="Correo", nullable=true, length=255)	
	private String correo;
	
	@Column(name="Contrasenia", nullable=true, length=255)	
	private String contrasenia;
	
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	private void setIdEmpleado(int value) {
		this.idEmpleado = value;
	}
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	
	public int getORMID() {
		return getIdEmpleado();
	}
	
	public void setContrasenia(String value) {
		this.contrasenia = value;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	public String toString() {
		return String.valueOf(getIdEmpleado());
	}
	
}
