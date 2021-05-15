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
@Table(name="Mensaje")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_MENSAJE__MENSAJE) {
			return ORM__Mensaje;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_MENSAJE__RESPONDER_A) {
			this._Responder_a = (base_de_datos.Mensaje) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_MENSAJE__ENVIADO_POR_UR) {
			this._Enviado_por_UR = (base_de_datos.UR) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_MENSAJE__ENVIADO_POR_ADMIN) {
			this._Enviado_por_Admin = (base_de_datos.Administrador) owner;
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
	
	@Column(name="Id_Mensaje", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_MENSAJE_ID_MENSAJE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_MENSAJE_ID_MENSAJE_GENERATOR", strategy="native")	
	private int id_Mensaje;
	
	@ManyToOne(targetEntity=base_de_datos.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje417461"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private base_de_datos.Administrador _Enviado_por_Admin;
	
	@ManyToOne(targetEntity=base_de_datos.UR.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="URUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje321457"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private base_de_datos.UR _Enviado_por_UR;
	
	@ManyToOne(targetEntity=base_de_datos.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeId_Mensaje", referencedColumnName="Id_Mensaje") }, foreignKey=@ForeignKey(name="FKMensaje231121"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private base_de_datos.Mensaje _Responder_a;
	
	@Column(name="Correo_emisor", nullable=true, length=255)	
	private String correo_emisor;
	
	@Column(name="Correo_receptor", nullable=true, length=255)	
	private String correo_receptor;
	
	@Column(name="Mensaje", nullable=true, length=255)	
	private String mensaje;
	
	@Column(name="Asunto", nullable=true, length=255)	
	private String asunto;
	
	@Column(name="Fecha", nullable=true, length=255)	
	private String fecha;
	
	@OneToMany(mappedBy="_Responder_a", targetEntity=base_de_datos.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Mensaje = new java.util.HashSet();
	
	public void setCorreo_emisor(String value) {
		this.correo_emisor = value;
	}
	
	public String getCorreo_emisor() {
		return correo_emisor;
	}
	
	public void setCorreo_receptor(String value) {
		this.correo_receptor = value;
	}
	
	public String getCorreo_receptor() {
		return correo_receptor;
	}
	
	public void setMensaje(String value) {
		this.mensaje = value;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	private void setId_Mensaje(int value) {
		this.id_Mensaje = value;
	}
	
	public int getId_Mensaje() {
		return id_Mensaje;
	}
	
	public int getORMID() {
		return getId_Mensaje();
	}
	
	public void setAsunto(String value) {
		this.asunto = value;
	}
	
	public String getAsunto() {
		return asunto;
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void set_Responder_a(base_de_datos.Mensaje value) {
		if (_Responder_a != null) {
			_Responder_a._Mensaje.remove(this);
		}
		if (value != null) {
			value._Mensaje.add(this);
		}
	}
	
	public base_de_datos.Mensaje get_Responder_a() {
		return _Responder_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Responder_a(base_de_datos.Mensaje value) {
		this._Responder_a = value;
	}
	
	private base_de_datos.Mensaje getORM__Responder_a() {
		return _Responder_a;
	}
	
	public void set_Enviado_por_UR(base_de_datos.UR value) {
		if (_Enviado_por_UR != null) {
			_Enviado_por_UR._Envia.remove(this);
		}
		if (value != null) {
			value._Envia.add(this);
		}
	}
	
	public base_de_datos.UR get_Enviado_por_UR() {
		return _Enviado_por_UR;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Enviado_por_UR(base_de_datos.UR value) {
		this._Enviado_por_UR = value;
	}
	
	private base_de_datos.UR getORM__Enviado_por_UR() {
		return _Enviado_por_UR;
	}
	
	public void set_Enviado_por_Admin(base_de_datos.Administrador value) {
		if (_Enviado_por_Admin != null) {
			_Enviado_por_Admin._Envia.remove(this);
		}
		if (value != null) {
			value._Envia.add(this);
		}
	}
	
	public base_de_datos.Administrador get_Enviado_por_Admin() {
		return _Enviado_por_Admin;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Enviado_por_Admin(base_de_datos.Administrador value) {
		this._Enviado_por_Admin = value;
	}
	
	private base_de_datos.Administrador getORM__Enviado_por_Admin() {
		return _Enviado_por_Admin;
	}
	
	private void setORM__Mensaje(java.util.Set value) {
		this.ORM__Mensaje = value;
	}
	
	private java.util.Set getORM__Mensaje() {
		return ORM__Mensaje;
	}
	
	@Transient	
	public final base_de_datos.MensajeSetCollection _Mensaje = new base_de_datos.MensajeSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_MENSAJE__MENSAJE, base_de_datos.ORMConstants.KEY_MENSAJE__RESPONDER_A, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_Mensaje());
	}
	
}
