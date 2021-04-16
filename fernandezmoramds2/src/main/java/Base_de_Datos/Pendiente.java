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
@Table(name="Pendiente")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="CompraCodigo", referencedColumnName="Codigo")
public class Pendiente extends Base_de_Datos.Compra implements Serializable {
	public Pendiente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_PENDIENTE__PRODUCTO_EN_COMPRA) {
			return ORM__Producto_en_compra;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_PENDIENTE__HACE_COMPRA) {
			this._Hace_compra = (Base_de_Datos.UR) owner;
		}
		
		else if (key == Base_de_Datos.ORMConstants.KEY_PENDIENTE__ENCARGADO_DE_COMPRAS) {
			this._Encargado_de_compras = (Base_de_Datos.Encargado_de_compras) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=Base_de_Datos.Encargado_de_compras.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Encargado_de_comprasEmpleadoIdEmpleado", referencedColumnName="EmpleadoIdEmpleado", nullable=false) }, foreignKey=@ForeignKey(name="FKPendiente822971"))	
	private Base_de_Datos.Encargado_de_compras _Encargado_de_compras;
	
	@ManyToOne(targetEntity=Base_de_Datos.UR.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="URUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKPendiente405808"))	
	private Base_de_Datos.UR _Hace_compra;
	
	@ManyToMany(targetEntity=Base_de_Datos.Producto_en_compra.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Producto_en_compra_Pendiente", joinColumns={ @JoinColumn(name="PendienteCompraCodigo") }, inverseJoinColumns={ @JoinColumn(name="Producto_en_compraId_Producto_en_compra") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Producto_en_compra = new java.util.HashSet();
	
	private void setORM__Producto_en_compra(java.util.Set value) {
		this.ORM__Producto_en_compra = value;
	}
	
	private java.util.Set getORM__Producto_en_compra() {
		return ORM__Producto_en_compra;
	}
	
	@Transient	
	public final Base_de_Datos.Producto_en_compraSetCollection _Producto_en_compra = new Base_de_Datos.Producto_en_compraSetCollection(this, _ormAdapter, Base_de_Datos.ORMConstants.KEY_PENDIENTE__PRODUCTO_EN_COMPRA, Base_de_Datos.ORMConstants.KEY_PRODUCTO_EN_COMPRA__PENDIENTE, Base_de_Datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void set_Hace_compra(Base_de_Datos.UR value) {
		if (_Hace_compra != null) {
			_Hace_compra._Compra.remove(this);
		}
		if (value != null) {
			value._Compra.add(this);
		}
	}
	
	public Base_de_Datos.UR get_Hace_compra() {
		return _Hace_compra;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Hace_compra(Base_de_Datos.UR value) {
		this._Hace_compra = value;
	}
	
	private Base_de_Datos.UR getORM__Hace_compra() {
		return _Hace_compra;
	}
	
	public void set_Encargado_de_compras(Base_de_Datos.Encargado_de_compras value) {
		if (_Encargado_de_compras != null) {
			_Encargado_de_compras._Pendiente.remove(this);
		}
		if (value != null) {
			value._Pendiente.add(this);
		}
	}
	
	public Base_de_Datos.Encargado_de_compras get_Encargado_de_compras() {
		return _Encargado_de_compras;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Encargado_de_compras(Base_de_Datos.Encargado_de_compras value) {
		this._Encargado_de_compras = value;
	}
	
	private Base_de_Datos.Encargado_de_compras getORM__Encargado_de_compras() {
		return _Encargado_de_compras;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
