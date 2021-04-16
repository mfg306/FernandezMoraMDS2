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
@Table(name="Producto_Rebajado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ProductoId_Producto", referencedColumnName="Id_Producto")
public class Producto_Rebajado extends Base_de_Datos.Producto implements Serializable {
	public Producto_Rebajado() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_PRODUCTO_REBAJADO__TIENE) {
			this._Tiene = (Base_de_Datos.Oferta) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Precio_rebajado", nullable=false)	
	private double precio_rebajado;
	
	@ManyToOne(targetEntity=Base_de_Datos.Oferta.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="OfertaId_Oferta", referencedColumnName="Id_Oferta", nullable=false) }, foreignKey=@ForeignKey(name="FKProducto_R263979"))	
	private Base_de_Datos.Oferta _Tiene;
	
	public void setPrecio_rebajado(double value) {
		this.precio_rebajado = value;
	}
	
	public double getPrecio_rebajado() {
		return precio_rebajado;
	}
	
	public void set_Tiene(Base_de_Datos.Oferta value) {
		if (_Tiene != null) {
			_Tiene._Pertenece_a.remove(this);
		}
		if (value != null) {
			value._Pertenece_a.add(this);
		}
	}
	
	public Base_de_Datos.Oferta get_Tiene() {
		return _Tiene;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Tiene(Base_de_Datos.Oferta value) {
		this._Tiene = value;
	}
	
	private Base_de_Datos.Oferta getORM__Tiene() {
		return _Tiene;
	}
	
	public base de datos.Producto_Rebajado[] cargarProductosOferta(base de datos.Oferta oferta) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
