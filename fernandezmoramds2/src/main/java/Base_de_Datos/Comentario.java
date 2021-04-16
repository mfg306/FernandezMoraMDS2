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
@Table(name="Comentario")
public class Comentario implements Serializable {
	public Comentario() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_COMENTARIO__TIENE) {
			this._Tiene = (Base_de_Datos.Producto) owner;
		}
		
		else if (key == Base_de_Datos.ORMConstants.KEY_COMENTARIO__REALIZA) {
			this._Realiza = (Base_de_Datos.UR) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_Comentario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="Base_de_Datos_COMENTARIO_ID_COMENTARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="Base_de_Datos_COMENTARIO_ID_COMENTARIO_GENERATOR", strategy="native")	
	private int id_Comentario;
	
	@ManyToOne(targetEntity=Base_de_Datos.UR.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="URUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario896062"))	
	private Base_de_Datos.UR _Realiza;
	
	@ManyToOne(targetEntity=Base_de_Datos.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId_Producto", referencedColumnName="Id_Producto", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario180675"))	
	private Base_de_Datos.Producto _Tiene;
	
	@Column(name="Comentario", nullable=true, length=255)	
	private String comentario;
	
	@Column(name="Fecha", nullable=true, length=255)	
	private String fecha;
	
	public void setComentario(String value) {
		this.comentario = value;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	private void setId_Comentario(int value) {
		this.id_Comentario = value;
	}
	
	public int getId_Comentario() {
		return id_Comentario;
	}
	
	public int getORMID() {
		return getId_Comentario();
	}
	
	public void set_Tiene(Base_de_Datos.Producto value) {
		if (_Tiene != null) {
			_Tiene._Pertenece_a.remove(this);
		}
		if (value != null) {
			value._Pertenece_a.add(this);
		}
	}
	
	public Base_de_Datos.Producto get_Tiene() {
		return _Tiene;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Tiene(Base_de_Datos.Producto value) {
		this._Tiene = value;
	}
	
	private Base_de_Datos.Producto getORM__Tiene() {
		return _Tiene;
	}
	
	public void set_Realiza(Base_de_Datos.UR value) {
		if (_Realiza != null) {
			_Realiza._Es_de_un.remove(this);
		}
		if (value != null) {
			value._Es_de_un.add(this);
		}
	}
	
	public Base_de_Datos.UR get_Realiza() {
		return _Realiza;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Realiza(Base_de_Datos.UR value) {
		this._Realiza = value;
	}
	
	private Base_de_Datos.UR getORM__Realiza() {
		return _Realiza;
	}
	
	public String toString() {
		return String.valueOf(getId_Comentario());
	}
	
}
