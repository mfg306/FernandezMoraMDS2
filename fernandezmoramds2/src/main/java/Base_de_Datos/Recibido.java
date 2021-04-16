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
@Table(name="Recibido")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="CompraCodigo", referencedColumnName="Codigo")
public class Recibido extends Base_de_Datos.Compra implements Serializable {
	public Recibido() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_RECIBIDO__RECOGE) {
			this._Recoge = (Base_de_Datos.Transportista) owner;
		}
		
		else if (key == Base_de_Datos.ORMConstants.KEY_RECIBIDO__RECIBE) {
			this._recibe = (Base_de_Datos.UR) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=Base_de_Datos.UR.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="URUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKRecibido916793"))	
	private Base_de_Datos.UR _recibe;
	
	@ManyToOne(targetEntity=Base_de_Datos.Transportista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TransportistaEmpleadoIdEmpleado", referencedColumnName="EmpleadoIdEmpleado", nullable=false) }, foreignKey=@ForeignKey(name="FKRecibido615365"))	
	private Base_de_Datos.Transportista _Recoge;
	
	public void set_Recoge(Base_de_Datos.Transportista value) {
		if (_Recoge != null) {
			_Recoge._Recibido.remove(this);
		}
		if (value != null) {
			value._Recibido.add(this);
		}
	}
	
	public Base_de_Datos.Transportista get_Recoge() {
		return _Recoge;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Recoge(Base_de_Datos.Transportista value) {
		this._Recoge = value;
	}
	
	private Base_de_Datos.Transportista getORM__Recoge() {
		return _Recoge;
	}
	
	public void set_recibe(Base_de_Datos.UR value) {
		if (_recibe != null) {
			_recibe._recibido.remove(this);
		}
		if (value != null) {
			value._recibido.add(this);
		}
	}
	
	public Base_de_Datos.UR get_recibe() {
		return _recibe;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__recibe(Base_de_Datos.UR value) {
		this._recibe = value;
	}
	
	private Base_de_Datos.UR getORM__recibe() {
		return _recibe;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
