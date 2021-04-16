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
@Table(name="Transportista")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="EmpleadoIdEmpleado", referencedColumnName="IdEmpleado")
public class Transportista extends Base_de_Datos.Empleado implements Serializable {
	public Transportista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_TRANSPORTISTA__RECIBIDO) {
			return ORM__Recibido;
		}
		else if (key == Base_de_Datos.ORMConstants.KEY_TRANSPORTISTA__ENVIADO) {
			return ORM__Enviado;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_Transportista", nullable=false, length=10)	
	private int id_Transportista;
	
	@Column(name="Correo_Transportista", nullable=true, length=255)	
	private String correo_Transportista;
	
	@Column(name="Contrasenia", nullable=true, length=255)	
	private String contrasenia;
	
	@OneToMany(mappedBy="_Recoge", targetEntity=Base_de_Datos.Recibido.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Recibido = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Transportista", targetEntity=Base_de_Datos.Enviado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Enviado = new java.util.HashSet();
	
	public void setId_Transportista(int value) {
		this.id_Transportista = value;
	}
	
	public int getId_Transportista() {
		return id_Transportista;
	}
	
	public void setCorreo_Transportista(String value) {
		this.correo_Transportista = value;
	}
	
	public String getCorreo_Transportista() {
		return correo_Transportista;
	}
	
	public void setContrasenia(String value) {
		this.contrasenia = value;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	private void setORM__Recibido(java.util.Set value) {
		this.ORM__Recibido = value;
	}
	
	private java.util.Set getORM__Recibido() {
		return ORM__Recibido;
	}
	
	@Transient	
	public final Base_de_Datos.RecibidoSetCollection _Recibido = new Base_de_Datos.RecibidoSetCollection(this, _ormAdapter, Base_de_Datos.ORMConstants.KEY_TRANSPORTISTA__RECIBIDO, Base_de_Datos.ORMConstants.KEY_RECIBIDO__RECOGE, Base_de_Datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Enviado(java.util.Set value) {
		this.ORM__Enviado = value;
	}
	
	private java.util.Set getORM__Enviado() {
		return ORM__Enviado;
	}
	
	@Transient	
	public final Base_de_Datos.EnviadoSetCollection _Enviado = new Base_de_Datos.EnviadoSetCollection(this, _ormAdapter, Base_de_Datos.ORMConstants.KEY_TRANSPORTISTA__ENVIADO, Base_de_Datos.ORMConstants.KEY_ENVIADO__TRANSPORTISTA, Base_de_Datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
