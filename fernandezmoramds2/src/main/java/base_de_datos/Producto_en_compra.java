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
@Table(name="Producto_en_compra")
public class Producto_en_compra implements Serializable {
	public Producto_en_compra() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_PRODUCTO_EN_COMPRA__PRODUCTO) {
			this._Producto = (base_de_datos.Producto) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_PRODUCTO_EN_COMPRA__PENDIENTE) {
			this._Pendiente = (base_de_datos.Pendiente) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Codigo", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_PRODUCTO_EN_COMPRA_CODIGO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_PRODUCTO_EN_COMPRA_CODIGO_GENERATOR", strategy="native")	
	private int codigo;
	
	@ManyToOne(targetEntity=base_de_datos.Pendiente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PendienteCompraCodigo", referencedColumnName="CompraCodigo", nullable=false) }, foreignKey=@ForeignKey(name="FKProducto_e460560"))	
	private base_de_datos.Pendiente _Pendiente;
	
	@ManyToOne(targetEntity=base_de_datos.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId_Producto", referencedColumnName="Id_Producto", nullable=false) }, foreignKey=@ForeignKey(name="FKProducto_e986574"))	
	private base_de_datos.Producto _Producto;
	
	@Column(name="Num_unidades_producto", nullable=false, length=10)	
	private int num_unidades_producto;
	
	public void setNum_unidades_producto(int value) {
		this.num_unidades_producto = value;
	}
	
	public int getNum_unidades_producto() {
		return num_unidades_producto;
	}
	
	private void setCodigo(int value) {
		this.codigo = value;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public int getORMID() {
		return getCodigo();
	}
	
	public void set_Producto(base_de_datos.Producto value) {
		if (_Producto != null) {
			_Producto._Producto_en_compra.remove(this);
		}
		if (value != null) {
			value._Producto_en_compra.add(this);
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
	
	public void set_Pendiente(base_de_datos.Pendiente value) {
		if (_Pendiente != null) {
			_Pendiente._Producto_en_compra.remove(this);
		}
		if (value != null) {
			value._Producto_en_compra.add(this);
		}
	}
	
	public base_de_datos.Pendiente get_Pendiente() {
		return _Pendiente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Pendiente(base_de_datos.Pendiente value) {
		this._Pendiente = value;
	}
	
	private base_de_datos.Pendiente getORM__Pendiente() {
		return _Pendiente;
	}
	
	public String toString() {
		return String.valueOf(getCodigo());
	}
	
}
