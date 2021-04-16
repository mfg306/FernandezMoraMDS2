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
@Table(name="Administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="Usuario_GeneralId_Usuario", referencedColumnName="Id_Usuario")
public class Administrador extends Base_de_Datos.Usuario_General implements Serializable {
	public Administrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == Base_de_Datos.ORMConstants.KEY_ADMINISTRADOR__ENVIA) {
			return ORM__Envia;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="_Enviado_por_Admin", targetEntity=Base_de_Datos.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__Envia = new java.util.HashSet();
	
	private void setORM__Envia(java.util.Set value) {
		this.ORM__Envia = value;
	}
	
	private java.util.Set getORM__Envia() {
		return ORM__Envia;
	}
	
	@Transient	
	public final Base_de_Datos.MensajeSetCollection _Envia = new Base_de_Datos.MensajeSetCollection(this, _ormAdapter, Base_de_Datos.ORMConstants.KEY_ADMINISTRADOR__ENVIA, Base_de_Datos.ORMConstants.KEY_MENSAJE__ENVIADO_POR_ADMIN, Base_de_Datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
