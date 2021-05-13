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
@Table(name="Encargado_de_compras")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="EmpleadoIdEmpleado", referencedColumnName="IdEmpleado")
public class Encargado_de_compras extends base_de_datos.Empleado implements Serializable {
	public Encargado_de_compras() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_ENCARGADO_DE_COMPRAS__PENDIENTE) {
			return ORM__Pendiente;
		}
		else if (key == base_de_datos.ORMConstants.KEY_ENCARGADO_DE_COMPRAS__PEDIDO_ENVIADO) {
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
	
	@OneToMany(mappedBy="_Encargado_de_compras", targetEntity=base_de_datos.Pendiente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Pendiente = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Procesa", targetEntity=base_de_datos.Enviado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Pedido_enviado = new java.util.HashSet();
	
	private void setORM__Pendiente(java.util.Set value) {
		this.ORM__Pendiente = value;
	}
	
	private java.util.Set getORM__Pendiente() {
		return ORM__Pendiente;
	}
	
	@Transient	
	public final base_de_datos.PendienteSetCollection _Pendiente = new base_de_datos.PendienteSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_ENCARGADO_DE_COMPRAS__PENDIENTE, base_de_datos.ORMConstants.KEY_PENDIENTE__ENCARGADO_DE_COMPRAS, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Pedido_enviado(java.util.Set value) {
		this.ORM__Pedido_enviado = value;
	}
	
	private java.util.Set getORM__Pedido_enviado() {
		return ORM__Pedido_enviado;
	}
	
	@Transient	
	public final base_de_datos.EnviadoSetCollection _Pedido_enviado = new base_de_datos.EnviadoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_ENCARGADO_DE_COMPRAS__PEDIDO_ENVIADO, base_de_datos.ORMConstants.KEY_ENVIADO__PROCESA, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
