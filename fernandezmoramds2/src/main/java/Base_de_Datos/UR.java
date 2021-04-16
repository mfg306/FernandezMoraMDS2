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
@Table(name="UR")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="Usuario_GeneralId_Usuario", referencedColumnName="Id_Usuario")
public class UR extends Base_de_Datos.Usuario_General implements Serializable {
	public UR() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_UR__ES_DE_UN) {
			return ORM__Es_de_un;
		}
		else if (key == Base_de_Datos.ORMConstants.KEY_UR__COMPRA) {
			return ORM__Compra;
		}
		else if (key == Base_de_Datos.ORMConstants.KEY_UR__RECIBIDO) {
			return ORM__recibido;
		}
		else if (key == Base_de_Datos.ORMConstants.KEY_UR__ENVIA) {
			return ORM__Envia;
		}
		else if (key == Base_de_Datos.ORMConstants.KEY_UR__VALORA) {
			return ORM__Valora;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Direccion_envio", nullable=true, length=255)	
	private String direccion_envio;
	
	@Column(name="Metodo_pago", nullable=true, length=255)	
	private String metodo_pago;
	
	@Column(name="Nombre_usuario", nullable=true, length=255)	
	private String nombre_usuario;
	
	@Column(name="Esta_operativo", nullable=false, length=1)	
	private boolean esta_operativo;
	
	@OneToMany(mappedBy="_Realiza", targetEntity=Base_de_Datos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Es_de_un = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Hace_compra", targetEntity=Base_de_Datos.Pendiente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Compra = new java.util.HashSet();
	
	@OneToMany(mappedBy="_recibe", targetEntity=Base_de_Datos.Recibido.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__recibido = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Enviado_por_UR", targetEntity=Base_de_Datos.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Envia = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Valorado_por", targetEntity=Base_de_Datos.Valoracion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Valora = new java.util.HashSet();
	
	public void setDireccion_envio(String value) {
		this.direccion_envio = value;
	}
	
	public String getDireccion_envio() {
		return direccion_envio;
	}
	
	public void setMetodo_pago(String value) {
		this.metodo_pago = value;
	}
	
	public String getMetodo_pago() {
		return metodo_pago;
	}
	
	public void setNombre_usuario(String value) {
		this.nombre_usuario = value;
	}
	
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	
	public void setEsta_operativo(boolean value) {
		this.esta_operativo = value;
	}
	
	public boolean getEsta_operativo() {
		return esta_operativo;
	}
	
	private void setORM__Es_de_un(java.util.Set value) {
		this.ORM__Es_de_un = value;
	}
	
	private java.util.Set getORM__Es_de_un() {
		return ORM__Es_de_un;
	}
	
	@Transient	
	public final Base_de_Datos.ComentarioSetCollection _Es_de_un = new Base_de_Datos.ComentarioSetCollection(this, _ormAdapter, Base_de_Datos.ORMConstants.KEY_UR__ES_DE_UN, Base_de_Datos.ORMConstants.KEY_COMENTARIO__REALIZA, Base_de_Datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Compra(java.util.Set value) {
		this.ORM__Compra = value;
	}
	
	private java.util.Set getORM__Compra() {
		return ORM__Compra;
	}
	
	@Transient	
	public final Base_de_Datos.PendienteSetCollection _Compra = new Base_de_Datos.PendienteSetCollection(this, _ormAdapter, Base_de_Datos.ORMConstants.KEY_UR__COMPRA, Base_de_Datos.ORMConstants.KEY_PENDIENTE__HACE_COMPRA, Base_de_Datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__recibido(java.util.Set value) {
		this.ORM__recibido = value;
	}
	
	private java.util.Set getORM__recibido() {
		return ORM__recibido;
	}
	
	@Transient	
	public final Base_de_Datos.RecibidoSetCollection _recibido = new Base_de_Datos.RecibidoSetCollection(this, _ormAdapter, Base_de_Datos.ORMConstants.KEY_UR__RECIBIDO, Base_de_Datos.ORMConstants.KEY_RECIBIDO__RECIBE, Base_de_Datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Envia(java.util.Set value) {
		this.ORM__Envia = value;
	}
	
	private java.util.Set getORM__Envia() {
		return ORM__Envia;
	}
	
	@Transient	
	public final Base_de_Datos.MensajeSetCollection _Envia = new Base_de_Datos.MensajeSetCollection(this, _ormAdapter, Base_de_Datos.ORMConstants.KEY_UR__ENVIA, Base_de_Datos.ORMConstants.KEY_MENSAJE__ENVIADO_POR_UR, Base_de_Datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Valora(java.util.Set value) {
		this.ORM__Valora = value;
	}
	
	private java.util.Set getORM__Valora() {
		return ORM__Valora;
	}
	
	@Transient	
	public final Base_de_Datos.ValoracionSetCollection _Valora = new Base_de_Datos.ValoracionSetCollection(this, _ormAdapter, Base_de_Datos.ORMConstants.KEY_UR__VALORA, Base_de_Datos.ORMConstants.KEY_VALORACION__VALORADO_POR, Base_de_Datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
