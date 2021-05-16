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
@Table(name="UR")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="Usuario_GeneralId_Usuario", referencedColumnName="Id_Usuario")
public class UR extends base_de_datos.Usuario_General implements Serializable {
	public UR() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_UR__ES_DE_UN) {
			return ORM__Es_de_un;
		}
		else if (key == base_de_datos.ORMConstants.KEY_UR__COMPRA) {
			return ORM__Compra;
		}
		else if (key == base_de_datos.ORMConstants.KEY_UR__RECIBIDO) {
			return ORM__recibido;
		}
		else if (key == base_de_datos.ORMConstants.KEY_UR__ENVIA) {
			return ORM__Envia;
		}
		else if (key == base_de_datos.ORMConstants.KEY_UR__VALORA) {
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
	
	@OneToMany(mappedBy="_Realiza", targetEntity=base_de_datos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Es_de_un = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Hace_compra", targetEntity=base_de_datos.Pendiente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Compra = new java.util.HashSet();
	
	@OneToMany(mappedBy="_recibe", targetEntity=base_de_datos.Recibido.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__recibido = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Enviado_por_UR", targetEntity=base_de_datos.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Envia = new java.util.HashSet();
	
	@OneToMany(mappedBy="_Valorado_por", targetEntity=base_de_datos.Valoracion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Valora = new java.util.HashSet();
	
	@OneToOne(mappedBy="uR", targetEntity=base_de_datos.Imagen.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private base_de_datos.Imagen imagen;
	
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
	public final base_de_datos.ComentarioSetCollection _Es_de_un = new base_de_datos.ComentarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_UR__ES_DE_UN, base_de_datos.ORMConstants.KEY_COMENTARIO__REALIZA, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Compra(java.util.Set value) {
		this.ORM__Compra = value;
	}
	
	private java.util.Set getORM__Compra() {
		return ORM__Compra;
	}
	
	@Transient	
	public final base_de_datos.PendienteSetCollection _Compra = new base_de_datos.PendienteSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_UR__COMPRA, base_de_datos.ORMConstants.KEY_PENDIENTE__HACE_COMPRA, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__recibido(java.util.Set value) {
		this.ORM__recibido = value;
	}
	
	private java.util.Set getORM__recibido() {
		return ORM__recibido;
	}
	
	@Transient	
	public final base_de_datos.RecibidoSetCollection _recibido = new base_de_datos.RecibidoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_UR__RECIBIDO, base_de_datos.ORMConstants.KEY_RECIBIDO__RECIBE, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Envia(java.util.Set value) {
		this.ORM__Envia = value;
	}
	
	private java.util.Set getORM__Envia() {
		return ORM__Envia;
	}
	
	@Transient	
	public final base_de_datos.MensajeSetCollection _Envia = new base_de_datos.MensajeSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_UR__ENVIA, base_de_datos.ORMConstants.KEY_MENSAJE__ENVIADO_POR_UR, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__Valora(java.util.Set value) {
		this.ORM__Valora = value;
	}
	
	private java.util.Set getORM__Valora() {
		return ORM__Valora;
	}
	
	@Transient	
	public final base_de_datos.ValoracionSetCollection _Valora = new base_de_datos.ValoracionSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_UR__VALORA, base_de_datos.ORMConstants.KEY_VALORACION__VALORADO_POR, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setImagen(base_de_datos.Imagen value) {
		if (this.imagen != value) {
			base_de_datos.Imagen limagen = this.imagen;
			this.imagen = value;
			if (value != null) {
				imagen.setuR(this);
			}
			if (limagen != null && limagen.getuR() == this) {
				limagen.setuR(null);
			}
		}
	}
	
	public base_de_datos.Imagen getImagen() {
		return imagen;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
