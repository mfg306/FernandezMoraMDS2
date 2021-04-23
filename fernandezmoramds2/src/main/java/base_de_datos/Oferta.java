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
@Table(name="Oferta")
public class Oferta implements Serializable {
	public Oferta() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_OFERTA__PERTENECE_A) {
			return ORM__Pertenece_a;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_Oferta", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_OFERTA_ID_OFERTA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_OFERTA_ID_OFERTA_GENERATOR", strategy="native")	
	private int id_Oferta;
	
	@Column(name="Nombre_Oferta", nullable=true, length=255)	
	private String nombre_Oferta;
	
	@Column(name="Fecha_caducidad", nullable=true, length=255)	
	private String fecha_caducidad;
	
	@Column(name="Fecha_registro", nullable=true, length=255)	
	private String fecha_registro;
	
	@OneToMany(mappedBy="_Tiene", targetEntity=base_de_datos.Producto_Rebajado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Pertenece_a = new java.util.HashSet();
	
	private void setId_Oferta(int value) {
		this.id_Oferta = value;
	}
	
	public int getId_Oferta() {
		return id_Oferta;
	}
	
	public int getORMID() {
		return getId_Oferta();
	}
	
	public void setNombre_Oferta(String value) {
		this.nombre_Oferta = value;
	}
	
	public String getNombre_Oferta() {
		return nombre_Oferta;
	}
	
	public void setFecha_caducidad(String value) {
		this.fecha_caducidad = value;
	}
	
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}
	
	public void setFecha_registro(String value) {
		this.fecha_registro = value;
	}
	
	public String getFecha_registro() {
		return fecha_registro;
	}
	
	private void setORM__Pertenece_a(java.util.Set value) {
		this.ORM__Pertenece_a = value;
	}
	
	private java.util.Set getORM__Pertenece_a() {
		return ORM__Pertenece_a;
	}
	
	@Transient	
	public final base_de_datos.Producto_RebajadoSetCollection _Pertenece_a = new base_de_datos.Producto_RebajadoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_OFERTA__PERTENECE_A, base_de_datos.ORMConstants.KEY_PRODUCTO_REBAJADO__TIENE, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_Oferta());
	}
	
}
