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
@Table(name="Categoria")
public class Categoria implements Serializable {
	public Categoria() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CATEGORIA__PRODUCTO) {
			return ORM__Producto;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_Categoria", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_CATEGORIA_ID_CATEGORIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_CATEGORIA_ID_CATEGORIA_GENERATOR", strategy="native")	
	private int id_Categoria;
	
	@Column(name="Nombre_categoria", nullable=true, length=255)	
	private String nombre_categoria;
	
	@Column(name="Fecha_registro", nullable=true, length=255)	
	private String fecha_registro;
	
	@OneToMany(mappedBy="_Categoria", targetEntity=base_de_datos.Producto.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Producto = new java.util.HashSet();
	
	private void setId_Categoria(int value) {
		this.id_Categoria = value;
	}
	
	public int getId_Categoria() {
		return id_Categoria;
	}
	
	public int getORMID() {
		return getId_Categoria();
	}
	
	public void setNombre_categoria(String value) {
		this.nombre_categoria = value;
	}
	
	public String getNombre_categoria() {
		return nombre_categoria;
	}
	
	public void setFecha_registro(String value) {
		this.fecha_registro = value;
	}
	
	public String getFecha_registro() {
		return fecha_registro;
	}
	
	private void setORM__Producto(java.util.Set value) {
		this.ORM__Producto = value;
	}
	
	private java.util.Set getORM__Producto() {
		return ORM__Producto;
	}
	
	@Transient	
	public final base_de_datos.ProductoSetCollection _Producto = new base_de_datos.ProductoSetCollection(this, _ormAdapter, ORMConstants.KEY_CATEGORIA__PRODUCTO, ORMConstants.KEY_PRODUCTO__CATEGORIA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_Categoria());
	}
	
}
