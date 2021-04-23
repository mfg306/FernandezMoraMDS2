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
@Embeddable
public class Producto_en_compraPK implements Serializable {
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Producto_en_compraPK))
			return false;
		Producto_en_compraPK producto_en_comprapk = (Producto_en_compraPK)aObj;
		if (get_Pendiente() == null) {
			if (producto_en_comprapk.get_Pendiente() != null)
				return false;
		}
		else if (!get_Pendiente().equals(producto_en_comprapk.get_Pendiente()))
			return false;
		if (get_Producto() == null) {
			if (producto_en_comprapk.get_Producto() != null)
				return false;
		}
		else if (!get_Producto().equals(producto_en_comprapk.get_Producto()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (get_Pendiente() != null) {
			hashcode = hashcode + (int) get_Pendiente().getORMID();
		}
		if (get_Producto() != null) {
			hashcode = hashcode + (int) get_Producto().getORMID();
		}
		return hashcode;
	}
	
	@ManyToOne(targetEntity=base_de_datos.Pendiente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PendienteCompraCodigo", referencedColumnName="CompraCodigo", nullable=false) }, foreignKey=@ForeignKey(name="FKProducto_e460560"))	
	private base_de_datos.Pendiente _Pendiente;
	
	public void set_Pendiente(base_de_datos.Pendiente value)  {
		this._Pendiente =  value;
	}
	
	public base_de_datos.Pendiente get_Pendiente()  {
		return this._Pendiente;
	}
	
	@ManyToOne(targetEntity=base_de_datos.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId_Producto", referencedColumnName="Id_Producto", nullable=false) }, foreignKey=@ForeignKey(name="FKProducto_e986574"))	
	private base_de_datos.Producto _Producto;
	
	public void set_Producto(base_de_datos.Producto value)  {
		this._Producto =  value;
	}
	
	public base_de_datos.Producto get_Producto()  {
		return this._Producto;
	}
	
}
