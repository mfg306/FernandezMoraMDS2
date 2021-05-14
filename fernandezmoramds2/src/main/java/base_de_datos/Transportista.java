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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Transportista")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="EmpleadoIdEmpleado", referencedColumnName="IdEmpleado")
public class Transportista extends base_de_datos.Empleado implements Serializable {
	public Transportista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_TRANSPORTISTA__RECIBIDO) {
			return ORM__Recibido;
		}
		else if (key == base_de_datos.ORMConstants.KEY_TRANSPORTISTA__ENVIADO) {
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
	
	@Column(name="Id_cola", nullable=true, length=10)	
	private int id_cola;
	
	@OneToMany(mappedBy="_Recoge", targetEntity=base_de_datos.Recibido.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Recibido = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Transportista", targetEntity=base_de_datos.Enviado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Enviado = new java.util.HashSet();
	
	public void setId_cola(int value) {
		this.id_cola = value;
	}
	
	public int getId_cola() {
		return id_cola;
	}
	
	private void setORM__Recibido(java.util.Set value) {
		this.ORM__Recibido = value;
	}
	
	private java.util.Set getORM__Recibido() {
		return ORM__Recibido;
	}
	
	@Transient	
	public final base_de_datos.RecibidoSetCollection _Recibido = new base_de_datos.RecibidoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TRANSPORTISTA__RECIBIDO, base_de_datos.ORMConstants.KEY_RECIBIDO__RECOGE, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Enviado(java.util.Set value) {
		this.ORM__Enviado = value;
	}
	
	private java.util.Set getORM__Enviado() {
		return ORM__Enviado;
	}
	
	@Transient	
	public final base_de_datos.EnviadoSetCollection _Enviado = new base_de_datos.EnviadoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TRANSPORTISTA__ENVIADO, base_de_datos.ORMConstants.KEY_ENVIADO__TRANSPORTISTA, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
