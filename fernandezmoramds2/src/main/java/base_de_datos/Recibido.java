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
@Table(name="Recibido")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="CompraCodigo", referencedColumnName="Codigo")
public class Recibido extends base_de_datos.Compra implements Serializable {
	public Recibido() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_RECIBIDO__RECOGE) {
			this._Recoge = (base_de_datos.Transportista) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_RECIBIDO__RECIBE) {
			this._recibe = (base_de_datos.UR) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Recibido", nullable=false, length=1)	
	private boolean recibido;
	
	@ManyToOne(targetEntity=base_de_datos.UR.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="URUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKRecibido916793"))	
	private base_de_datos.UR _recibe;
	
	@ManyToOne(targetEntity=base_de_datos.Transportista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TransportistaEmpleadoIdEmpleado", referencedColumnName="EmpleadoIdEmpleado", nullable=false) }, foreignKey=@ForeignKey(name="FKRecibido615365"))	
	private base_de_datos.Transportista _Recoge;
	
	public void setRecibido(boolean value) {
		this.recibido = value;
	}
	
	public boolean getRecibido() {
		return recibido;
	}
	
	public void set_Recoge(base_de_datos.Transportista value) {
		if (_Recoge != null) {
			_Recoge._Recibido.remove(this);
		}
		if (value != null) {
			value._Recibido.add(this);
		}
	}
	
	public base_de_datos.Transportista get_Recoge() {
		return _Recoge;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Recoge(base_de_datos.Transportista value) {
		this._Recoge = value;
	}
	
	private base_de_datos.Transportista getORM__Recoge() {
		return _Recoge;
	}
	
	public void set_recibe(base_de_datos.UR value) {
		if (_recibe != null) {
			_recibe._recibido.remove(this);
		}
		if (value != null) {
			value._recibido.add(this);
		}
	}
	
	public base_de_datos.UR get_recibe() {
		return _recibe;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__recibe(base_de_datos.UR value) {
		this._recibe = value;
	}
	
	private base_de_datos.UR getORM__recibe() {
		return _recibe;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
