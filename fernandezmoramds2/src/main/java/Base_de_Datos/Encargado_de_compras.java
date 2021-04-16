/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: jorge(University of Almeria)
 * License Type: Academic
 */
package Base_de_Datos;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Encargado_de_compras")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="EmpleadoIdEmpleado", referencedColumnName="IdEmpleado")
public class Encargado_de_compras extends Base_de_Datos.Empleado implements Serializable {
	public Encargado_de_compras() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_ENCARGADO_DE_COMPRAS__PENDIENTE) {
			return ORM__Pendiente;
		}
		else if (key == Base_de_Datos.ORMConstants.KEY_ENCARGADO_DE_COMPRAS__PEDIDO_ENVIADO) {
			return ORM__Pedido_enviado;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_Encargado", nullable=false, length=10)	
	private int id_Encargado;
	
	@Column(name="Correo_Empleado", nullable=true, length=255)	
	private String correo_Empleado;
	
	@Column(name="Contrasenia", nullable=true, length=255)	
	private String contrasenia;
	
	@OneToMany(mappedBy="_Encargado_de_compras", targetEntity=Base_de_Datos.Pendiente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Pendiente = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Procesa", targetEntity=Base_de_Datos.Enviado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Pedido_enviado = new java.util.HashSet();
	
	public void setId_Encargado(int value) {
		this.id_Encargado = value;
	}
	
	public int getId_Encargado() {
		return id_Encargado;
	}
	
	public void setCorreo_Empleado(String value) {
		this.correo_Empleado = value;
	}
	
	public String getCorreo_Empleado() {
		return correo_Empleado;
	}
	
	public void setContrasenia(String value) {
		this.contrasenia = value;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	private void setORM__Pendiente(java.util.Set value) {
		this.ORM__Pendiente = value;
	}
	
	private java.util.Set getORM__Pendiente() {
		return ORM__Pendiente;
	}
	
	@Transient	
	public final Base_de_Datos.PendienteSetCollection _Pendiente = new Base_de_Datos.PendienteSetCollection(this, _ormAdapter, Base_de_Datos.ORMConstants.KEY_ENCARGADO_DE_COMPRAS__PENDIENTE, Base_de_Datos.ORMConstants.KEY_PENDIENTE__ENCARGADO_DE_COMPRAS, Base_de_Datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Pedido_enviado(java.util.Set value) {
		this.ORM__Pedido_enviado = value;
	}
	
	private java.util.Set getORM__Pedido_enviado() {
		return ORM__Pedido_enviado;
	}
	
	@Transient	
	public final Base_de_Datos.EnviadoSetCollection _Pedido_enviado = new Base_de_Datos.EnviadoSetCollection(this, _ormAdapter, Base_de_Datos.ORMConstants.KEY_ENCARGADO_DE_COMPRAS__PEDIDO_ENVIADO, Base_de_Datos.ORMConstants.KEY_ENVIADO__PROCESA, Base_de_Datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
