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
@Table(name="Mensaje")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_MENSAJE__RESPONDER_A) {
			this._Responder_a = (Base_de_Datos.Mensaje) owner;
		}
		
		else if (key == Base_de_Datos.ORMConstants.KEY_MENSAJE__ENVIADO_POR_UR) {
			this._Enviado_por_UR = (Base_de_Datos.UR) owner;
		}
		
		else if (key == Base_de_Datos.ORMConstants.KEY_MENSAJE__ENVIADO_POR_ADMIN) {
			this._Enviado_por_Admin = (Base_de_Datos.Administrador) owner;
		}
		
		else if (key == Base_de_Datos.ORMConstants.KEY_MENSAJE__MENSAJE) {
			this._Mensaje = (Base_de_Datos.Mensaje) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_Mensaje", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="Base_de_Datos_MENSAJE_ID_MENSAJE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="Base_de_Datos_MENSAJE_ID_MENSAJE_GENERATOR", strategy="native")	
	private int id_Mensaje;
	
	@ManyToOne(targetEntity=Base_de_Datos.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje417461"))	
	private Base_de_Datos.Administrador _Enviado_por_Admin;
	
	@ManyToOne(targetEntity=Base_de_Datos.UR.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="URUsuario_GeneralId_Usuario", referencedColumnName="Usuario_GeneralId_Usuario", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje321457"))	
	private Base_de_Datos.UR _Enviado_por_UR;
	
	@OneToOne(optional=false, targetEntity=Base_de_Datos.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeId_Mensaje", referencedColumnName="Id_Mensaje", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje231121"))	
	private Base_de_Datos.Mensaje _Responder_a;
	
	@Column(name="Correo_emisor", nullable=true, length=255)	
	private String correo_emisor;
	
	@Column(name="Correo_receptor", nullable=true, length=255)	
	private String correo_receptor;
	
	@Column(name="Mensaje", nullable=true, length=255)	
	private String mensaje;
	
	@Column(name="Codigo", nullable=true, length=255)	
	private String codigo;
	
	@OneToOne(mappedBy="_Responder_a", targetEntity=Base_de_Datos.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private Base_de_Datos.Mensaje _Mensaje;
	
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
	
	public void setCodigo(String value) {
		this.codigo = value;
	}
	
	public String getCodigo() {
		return codigo;
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
	
	public void set_Responder_a(Base_de_Datos.Mensaje value) {
		if (this._Responder_a != value) {
			Base_de_Datos.Mensaje l_Responder_a = this._Responder_a;
			this._Responder_a = value;
			if (value != null) {
				_Responder_a.set_Mensaje(this);
			}
			if (l_Responder_a != null && l_Responder_a.get_Mensaje() == this) {
				l_Responder_a.set_Mensaje(null);
			}
		}
	}
	
	public Base_de_Datos.Mensaje get_Responder_a() {
		return _Responder_a;
	}
	
	public void set_Enviado_por_UR(Base_de_Datos.UR value) {
		if (_Enviado_por_UR != null) {
			_Enviado_por_UR._Envia.remove(this);
		}
		if (value != null) {
			value._Envia.add(this);
		}
	}
	
	public Base_de_Datos.UR get_Enviado_por_UR() {
		return _Enviado_por_UR;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Enviado_por_UR(Base_de_Datos.UR value) {
		this._Enviado_por_UR = value;
	}
	
	private Base_de_Datos.UR getORM__Enviado_por_UR() {
		return _Enviado_por_UR;
	}
	
	public void set_Enviado_por_Admin(Base_de_Datos.Administrador value) {
		if (_Enviado_por_Admin != null) {
			_Enviado_por_Admin._Envia.remove(this);
		}
		if (value != null) {
			value._Envia.add(this);
		}
	}
	
	public Base_de_Datos.Administrador get_Enviado_por_Admin() {
		return _Enviado_por_Admin;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM__Enviado_por_Admin(Base_de_Datos.Administrador value) {
		this._Enviado_por_Admin = value;
	}
	
	private Base_de_Datos.Administrador getORM__Enviado_por_Admin() {
		return _Enviado_por_Admin;
	}
	
	public void set_Mensaje(Base_de_Datos.Mensaje value) {
		if (this._Mensaje != value) {
			Base_de_Datos.Mensaje l_Mensaje = this._Mensaje;
			this._Mensaje = value;
			if (value != null) {
				_Mensaje.set_Responder_a(this);
			}
			if (l_Mensaje != null && l_Mensaje.get_Responder_a() == this) {
				l_Mensaje.set_Responder_a(null);
			}
		}
	}
	
	public Base_de_Datos.Mensaje get_Mensaje() {
		return _Mensaje;
	}
	
	public String toString() {
		return String.valueOf(getId_Mensaje());
	}
	
}
