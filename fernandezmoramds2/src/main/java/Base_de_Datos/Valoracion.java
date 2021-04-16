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
@Table(name="Valoracion")
public class Valoracion implements Serializable {
	public Valoracion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_VALORACION__VALORADO) {
			return ORM__Valorado;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_VALORACION__VALORADO_POR) {
			this._Valorado_por = (Base_de_Datos.UR) owner;
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
	
	@Column(name="Id_valoracion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="Base_de_Datos_VALORACION_ID_VALORACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="Base_de_Datos_VALORACION_ID_VALORACION_GENERATOR", strategy="native")	
	private int id_valoracion;
	
	@ManyToOne(targetEntity=Base_de_Datos.UR.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="URUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKValoracion23089"))	
	private Base_de_Datos.UR _Valorado_por;
	
	@Column(name="Valoracion", nullable=false, length=10)	
	private int valoracion;
	
	@OneToMany(mappedBy="_Valorado_por", targetEntity=Base_de_Datos.Producto.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Valorado = new java.util.HashSet();
	
	private void setId_valoracion(int value) {
		this.id_valoracion = value;
	}
	
	public int getId_valoracion() {
		return id_valoracion;
	}
	
	public int getORMID() {
		return getId_valoracion();
	}
	
	public void setValoracion(int value) {
		this.valoracion = value;
	}
	
	public int getValoracion() {
		return valoracion;
	}
	
	public void set_Valorado_por(Base_de_Datos.UR value) {
		if (_Valorado_por != null) {
			_Valorado_por._Valora.remove(this);
		}
		if (value != null) {
			value._Valora.add(this);
		}
	}
	
	public Base_de_Datos.UR get_Valorado_por() {
		return _Valorado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Valorado_por(Base_de_Datos.UR value) {
		this._Valorado_por = value;
	}
	
	private Base_de_Datos.UR getORM__Valorado_por() {
		return _Valorado_por;
	}
	
	private void setORM__Valorado(java.util.Set value) {
		this.ORM__Valorado = value;
	}
	
	private java.util.Set getORM__Valorado() {
		return ORM__Valorado;
	}
	
	@Transient	
	public final Base_de_Datos.ProductoSetCollection _Valorado = new Base_de_Datos.ProductoSetCollection(this, _ormAdapter, Base_de_Datos.ORMConstants.KEY_VALORACION__VALORADO, Base_de_Datos.ORMConstants.KEY_PRODUCTO__VALORADO_POR, Base_de_Datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_valoracion());
	}
	
}
