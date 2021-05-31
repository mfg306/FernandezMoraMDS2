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
@Table(name="Enviado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="CompraCodigo", referencedColumnName="Codigo")
public class Enviado extends base_de_datos.Compra implements Serializable {
	public Enviado() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ENVIADO__PROCESA) {
			this._Procesa = (base_de_datos.Encargado_de_compras) owner;
		}
		
		else if (key == ORMConstants.KEY_ENVIADO__TRANSPORTISTA) {
			this._Transportista = (base_de_datos.Transportista) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Enviado", nullable=false, length=1)	
	private boolean enviado;
	
	@Column(name="CodigoPendiente", nullable=false, length=10)	
	private int codigoPendiente;
	
	@ManyToOne(targetEntity=base_de_datos.Transportista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TransportistaEmpleadoIdEmpleado", referencedColumnName="EmpleadoIdEmpleado", nullable=false) }, foreignKey=@ForeignKey(name="FKEnviado870041"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private base_de_datos.Transportista _Transportista;
	
	@ManyToOne(targetEntity=base_de_datos.Encargado_de_compras.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Encargado_de_comprasEmpleadoIdEmpleado", referencedColumnName="EmpleadoIdEmpleado", nullable=false) }, foreignKey=@ForeignKey(name="FKEnviado404928"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private base_de_datos.Encargado_de_compras _Procesa;
	
	public void setEnviado(boolean value) {
		this.enviado = value;
	}
	
	public boolean getEnviado() {
		return enviado;
	}
	
	public void setCodigoPendiente(int value) {
		this.codigoPendiente = value;
	}
	
	public int getCodigoPendiente() {
		return codigoPendiente;
	}
	
	public void set_Procesa(base_de_datos.Encargado_de_compras value) {
		if (_Procesa != null) {
			_Procesa._Pedido_enviado.remove(this);
		}
		if (value != null) {
			value._Pedido_enviado.add(this);
		}
	}
	
	public base_de_datos.Encargado_de_compras get_Procesa() {
		return _Procesa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Procesa(base_de_datos.Encargado_de_compras value) {
		this._Procesa = value;
	}
	
	private base_de_datos.Encargado_de_compras getORM__Procesa() {
		return _Procesa;
	}
	
	public void set_Transportista(base_de_datos.Transportista value) {
		if (_Transportista != null) {
			_Transportista._Enviado.remove(this);
		}
		if (value != null) {
			value._Enviado.add(this);
		}
	}
	
	public base_de_datos.Transportista get_Transportista() {
		return _Transportista;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Transportista(base_de_datos.Transportista value) {
		this._Transportista = value;
	}
	
	private base_de_datos.Transportista getORM__Transportista() {
		return _Transportista;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
