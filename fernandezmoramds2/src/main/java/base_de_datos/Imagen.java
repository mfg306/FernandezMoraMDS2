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
@Table(name="Imagen")
public class Imagen implements Serializable {
	public Imagen() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_IMAGEN__PRODUCTO) {
			this._Producto = (base_de_datos.Producto) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_IMAGEN_UR) {
			this.uR = (base_de_datos.UR) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_IMAGEN_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_IMAGEN_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToOne(targetEntity=base_de_datos.UR.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="URUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario") }, foreignKey=@ForeignKey(name="FKImagen698946"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private base_de_datos.UR uR;
	
	@ManyToOne(targetEntity=base_de_datos.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId_Producto", referencedColumnName="Id_Producto") }, foreignKey=@ForeignKey(name="FKImagen195906"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private base_de_datos.Producto _Producto;
	
	@Column(name="Ruta", nullable=true, length=255)	
	private String ruta;
	
	@Column(name="Principal", nullable=false, length=1)	
	private boolean principal;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setRuta(String value) {
		this.ruta = value;
	}
	
	public String getRuta() {
		return ruta;
	}
	
	public void setPrincipal(boolean value) {
		this.principal = value;
	}
	
	public boolean getPrincipal() {
		return principal;
	}
	
	public void set_Producto(base_de_datos.Producto value) {
		if (_Producto != null) {
			_Producto._Imagen.remove(this);
		}
		if (value != null) {
			value._Imagen.add(this);
		}
	}
	
	public base_de_datos.Producto get_Producto() {
		return _Producto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Producto(base_de_datos.Producto value) {
		this._Producto = value;
	}
	
	private base_de_datos.Producto getORM__Producto() {
		return _Producto;
	}
	
	public void setuR(base_de_datos.UR value) {
		if (this.uR != value) {
			base_de_datos.UR luR = this.uR;
			this.uR = value;
			if (value != null) {
				uR.setImagen(this);
			}
			if (luR != null && luR.getImagen() == this) {
				luR.setImagen(null);
			}
		}
	}
	
	public base_de_datos.UR getuR() {
		return uR;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
