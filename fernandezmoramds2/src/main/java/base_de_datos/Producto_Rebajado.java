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
@Table(name="Producto_Rebajado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ProductoId_Producto", referencedColumnName="Id_Producto")
public class Producto_Rebajado extends base_de_datos.Producto implements Serializable {
	public Producto_Rebajado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_PRODUCTO_REBAJADO__TIENE) {
			return ORM__Tiene;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Precio_rebajado", nullable=false)	
	private double precio_rebajado;
	
	@ManyToMany(mappedBy="ORM__Pertenece_a", targetEntity=base_de_datos.Oferta.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Tiene = new java.util.HashSet();
	
	public void setPrecio_rebajado(double value) {
		this.precio_rebajado = value;
	}
	
	public double getPrecio_rebajado() {
		return precio_rebajado;
	}
	
	private void setORM__Tiene(java.util.Set value) {
		this.ORM__Tiene = value;
	}
	
	private java.util.Set getORM__Tiene() {
		return ORM__Tiene;
	}
	
	@Transient	
	public final base_de_datos.OfertaSetCollection _Tiene = new base_de_datos.OfertaSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_PRODUCTO_REBAJADO__TIENE, base_de_datos.ORMConstants.KEY_OFERTA__PERTENECE_A, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public base_de_datos.Producto_Rebajado[] cargarProductosOferta(base_de_datos.Oferta oferta) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
