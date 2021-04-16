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
@Table(name="Imagen")
public class Imagen implements Serializable {
	public Imagen() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_IMAGEN__PRODUCTO) {
			this._Producto = (Base_de_Datos.Producto) owner;
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
	@GeneratedValue(generator="Base_de_Datos_IMAGEN_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="Base_de_Datos_IMAGEN_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Base_de_Datos.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId_Producto", referencedColumnName="Id_Producto", nullable=false) }, foreignKey=@ForeignKey(name="FKImagen195906"))	
	private Base_de_Datos.Producto _Producto;
	
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
	
	public void set_Producto(Base_de_Datos.Producto value) {
		if (_Producto != null) {
			_Producto._Imagen.remove(this);
		}
		if (value != null) {
			value._Imagen.add(this);
		}
	}
	
	public Base_de_Datos.Producto get_Producto() {
		return _Producto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Producto(Base_de_Datos.Producto value) {
		this._Producto = value;
	}
	
	private Base_de_Datos.Producto getORM__Producto() {
		return _Producto;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
