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
package base_de_datos;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Producto_en_compra")
public class Producto_en_compra implements Serializable {
	public Producto_en_compra() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_PRODUCTO_EN_COMPRA__PRODUCTO) {
			return ORM__Producto;
		}
		else if (key == base_de_datos.ORMConstants.KEY_PRODUCTO_EN_COMPRA__PENDIENTE) {
			return ORM__Pendiente;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_Producto_en_compra", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_PRODUCTO_EN_COMPRA_ID_PRODUCTO_EN_COMPRA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_PRODUCTO_EN_COMPRA_ID_PRODUCTO_EN_COMPRA_GENERATOR", strategy="native")	
	private int id_Producto_en_compra;
	
	@Column(name="Num_unidades_producto", nullable=false, length=10)	
	private int num_unidades_producto;
	
	@ManyToMany(mappedBy="ORM__Producto_en_compra", targetEntity=base_de_datos.Producto.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Producto = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM__Producto_en_compra", targetEntity=base_de_datos.Pendiente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Pendiente = new java.util.HashSet();
	
	public void setNum_unidades_producto(int value) {
		this.num_unidades_producto = value;
	}
	
	public int getNum_unidades_producto() {
		return num_unidades_producto;
	}
	
	private void setId_Producto_en_compra(int value) {
		this.id_Producto_en_compra = value;
	}
	
	public int getId_Producto_en_compra() {
		return id_Producto_en_compra;
	}
	
	public int getORMID() {
		return getId_Producto_en_compra();
	}
	
	private void setORM__Producto(java.util.Set value) {
		this.ORM__Producto = value;
	}
	
	private java.util.Set getORM__Producto() {
		return ORM__Producto;
	}
	
	@Transient	
	public final base_de_datos.ProductoSetCollection _Producto = new base_de_datos.ProductoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_PRODUCTO_EN_COMPRA__PRODUCTO, base_de_datos.ORMConstants.KEY_PRODUCTO__PRODUCTO_EN_COMPRA, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM__Pendiente(java.util.Set value) {
		this.ORM__Pendiente = value;
	}
	
	private java.util.Set getORM__Pendiente() {
		return ORM__Pendiente;
	}
	
	@Transient	
	public final base_de_datos.PendienteSetCollection _Pendiente = new base_de_datos.PendienteSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_PRODUCTO_EN_COMPRA__PENDIENTE, base_de_datos.ORMConstants.KEY_PENDIENTE__PRODUCTO_EN_COMPRA, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_Producto_en_compra());
	}
	
}
