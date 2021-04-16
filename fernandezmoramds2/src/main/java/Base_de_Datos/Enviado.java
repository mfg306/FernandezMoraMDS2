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
@Table(name="Enviado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="CompraCodigo", referencedColumnName="Codigo")
public class Enviado extends Base_de_Datos.Compra implements Serializable {
	public Enviado() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_ENVIADO__PROCESA) {
			this._Procesa = (Base_de_Datos.Encargado_de_compras) owner;
		}
		
		else if (key == Base_de_Datos.ORMConstants.KEY_ENVIADO__TRANSPORTISTA) {
			this._Transportista = (Base_de_Datos.Transportista) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_Cola", nullable=false, length=10)	
	private int id_Cola;
	
	@ManyToOne(targetEntity=Base_de_Datos.Transportista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TransportistaEmpleadoIdEmpleado", referencedColumnName="EmpleadoIdEmpleado", nullable=false) }, foreignKey=@ForeignKey(name="FKEnviado870041"))	
	private Base_de_Datos.Transportista _Transportista;
	
	@ManyToOne(targetEntity=Base_de_Datos.Encargado_de_compras.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Encargado_de_comprasEmpleadoIdEmpleado", referencedColumnName="EmpleadoIdEmpleado", nullable=false) }, foreignKey=@ForeignKey(name="FKEnviado404928"))	
	private Base_de_Datos.Encargado_de_compras _Procesa;
	
	public void setId_Cola(int value) {
		this.id_Cola = value;
	}
	
	public int getId_Cola() {
		return id_Cola;
	}
	
	public void set_Procesa(Base_de_Datos.Encargado_de_compras value) {
		if (_Procesa != null) {
			_Procesa._Pedido_enviado.remove(this);
		}
		if (value != null) {
			value._Pedido_enviado.add(this);
		}
	}
	
	public Base_de_Datos.Encargado_de_compras get_Procesa() {
		return _Procesa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Procesa(Base_de_Datos.Encargado_de_compras value) {
		this._Procesa = value;
	}
	
	private Base_de_Datos.Encargado_de_compras getORM__Procesa() {
		return _Procesa;
	}
	
	public void set_Transportista(Base_de_Datos.Transportista value) {
		if (_Transportista != null) {
			_Transportista._Enviado.remove(this);
		}
		if (value != null) {
			value._Enviado.add(this);
		}
	}
	
	public Base_de_Datos.Transportista get_Transportista() {
		return _Transportista;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Transportista(Base_de_Datos.Transportista value) {
		this._Transportista = value;
	}
	
	private Base_de_Datos.Transportista getORM__Transportista() {
		return _Transportista;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
