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
@Table(name="Producto")
@Inheritance(strategy=InheritanceType.JOINED)
public class Producto implements Serializable {
	public Producto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_PRODUCTO__PRODUCTO_EN_COMPRA) {
			return ORM__Producto_en_compra;
		}
		else if (key == base_de_datos.ORMConstants.KEY_PRODUCTO__PERTENECE_A) {
			return ORM__Pertenece_a;
		}
		else if (key == base_de_datos.ORMConstants.KEY_PRODUCTO__IMAGEN) {
			return ORM__Imagen;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_PRODUCTO__CATEGORIA) {
			this._Categoria = (base_de_datos.Categoria) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_PRODUCTO__VALORADO_POR) {
			this._Valorado_por = (base_de_datos.Valoracion) owner;
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
	
	@Column(name="Id_Producto", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_PRODUCTO_ID_PRODUCTO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_PRODUCTO_ID_PRODUCTO_GENERATOR", strategy="native")	
	private int id_Producto;
	
	@ManyToOne(targetEntity=base_de_datos.Valoracion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ValoracionId_valoracion", referencedColumnName="Id_valoracion", nullable=false) }, foreignKey=@ForeignKey(name="FKProducto367958"))	
	private base_de_datos.Valoracion _Valorado_por;
	
	@ManyToOne(targetEntity=base_de_datos.Categoria.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CategoriaId_Categoria", referencedColumnName="Id_Categoria", nullable=false) }, foreignKey=@ForeignKey(name="FKProducto634639"))	
	private base_de_datos.Categoria _Categoria;
	
	@Column(name="Precio_producto", nullable=false)	
	private double precio_producto;
	
	@Column(name="Num_Unidades_Vendidas", nullable=true, length=255)	
	private String num_Unidades_Vendidas;
	
	@Column(name="Num_Unidades_Restantes", nullable=false, length=10)	
	private int num_Unidades_Restantes;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@OneToMany(mappedBy="_Producto", targetEntity=base_de_datos.Producto_en_compra.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Producto_en_compra = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Tiene", targetEntity=base_de_datos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Pertenece_a = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Producto", targetEntity=base_de_datos.Imagen.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Imagen = new java.util.HashSet();
	
	private void setId_Producto(int value) {
		this.id_Producto = value;
	}
	
	public int getId_Producto() {
		return id_Producto;
	}
	
	public int getORMID() {
		return getId_Producto();
	}
	
	public void setPrecio_producto(double value) {
		this.precio_producto = value;
	}
	
	public double getPrecio_producto() {
		return precio_producto;
	}
	
	public void setNum_Unidades_Vendidas(String value) {
		this.num_Unidades_Vendidas = value;
	}
	
	public String getNum_Unidades_Vendidas() {
		return num_Unidades_Vendidas;
	}
	
	public void setNum_Unidades_Restantes(int value) {
		this.num_Unidades_Restantes = value;
	}
	
	public int getNum_Unidades_Restantes() {
		return num_Unidades_Restantes;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void set_Categoria(base_de_datos.Categoria value) {
		if (_Categoria != null) {
			_Categoria._Producto.remove(this);
		}
		if (value != null) {
			value._Producto.add(this);
		}
	}
	
	public base_de_datos.Categoria get_Categoria() {
		return _Categoria;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Categoria(base_de_datos.Categoria value) {
		this._Categoria = value;
	}
	
	private base_de_datos.Categoria getORM__Categoria() {
		return _Categoria;
	}
	
	private void setORM__Producto_en_compra(java.util.Set value) {
		this.ORM__Producto_en_compra = value;
	}
	
	private java.util.Set getORM__Producto_en_compra() {
		return ORM__Producto_en_compra;
	}
	
	@Transient	
	public final base_de_datos.Producto_en_compraSetCollection _Producto_en_compra = new base_de_datos.Producto_en_compraSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_PRODUCTO__PRODUCTO_EN_COMPRA, base_de_datos.ORMConstants.KEY_PRODUCTO_EN_COMPRA__PRODUCTO, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Pertenece_a(java.util.Set value) {
		this.ORM__Pertenece_a = value;
	}
	
	private java.util.Set getORM__Pertenece_a() {
		return ORM__Pertenece_a;
	}
	
	@Transient	
	public final base_de_datos.ComentarioSetCollection _Pertenece_a = new base_de_datos.ComentarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_PRODUCTO__PERTENECE_A, base_de_datos.ORMConstants.KEY_COMENTARIO__TIENE, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Imagen(java.util.Set value) {
		this.ORM__Imagen = value;
	}
	
	private java.util.Set getORM__Imagen() {
		return ORM__Imagen;
	}
	
	@Transient	
	public final base_de_datos.ImagenSetCollection _Imagen = new base_de_datos.ImagenSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_PRODUCTO__IMAGEN, base_de_datos.ORMConstants.KEY_IMAGEN__PRODUCTO, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void set_Valorado_por(base_de_datos.Valoracion value) {
		if (_Valorado_por != null) {
			_Valorado_por._Valorado.remove(this);
		}
		if (value != null) {
			value._Valorado.add(this);
		}
	}
	
	public base_de_datos.Valoracion get_Valorado_por() {
		return _Valorado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Valorado_por(base_de_datos.Valoracion value) {
		this._Valorado_por = value;
	}
	
	private base_de_datos.Valoracion getORM__Valorado_por() {
		return _Valorado_por;
	}
	
	public base_de_datos.Producto[] cargarProductos(String nombreProducto) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getId_Producto());
	}
	
}
