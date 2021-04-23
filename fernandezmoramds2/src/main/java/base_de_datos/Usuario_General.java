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
@Table(name="Usuario_General")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario_General implements Serializable {
	public Usuario_General() {
	}
	
	

	@Column(name="Id_Usuario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_USUARIO_GENERAL_ID_USUARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_USUARIO_GENERAL_ID_USUARIO_GENERATOR", strategy="native")	
	private int id_Usuario;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Primer_apellido", nullable=true, length=255)	
	private String primer_apellido;
	
	@Column(name="Segundo_apellido", nullable=true, length=255)	
	private String segundo_apellido;
	
	@Column(name="Correo_electronico", nullable=true, length=255)	
	private String correo_electronico;
	
	@Column(name="Contrasenia", nullable=true, length=255)	
	private String contrasenia;
	
	@Column(name="Es_administrador", nullable=false, length=1)	
	private boolean es_administrador;
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPrimer_apellido(String value) {
		this.primer_apellido = value;
	}
	
	public String getPrimer_apellido() {
		return primer_apellido;
	}
	
	public void setSegundo_apellido(String value) {
		this.segundo_apellido = value;
	}
	
	public String getSegundo_apellido() {
		return segundo_apellido;
	}
	
	public void setCorreo_electronico(String value) {
		this.correo_electronico = value;
	}
	
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	
	public void setContrasenia(String value) {
		this.contrasenia = value;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	private void setId_Usuario(int value) {
		this.id_Usuario = value;
	}
	
	public int getId_Usuario() {
		return id_Usuario;
	}
	
	public int getORMID() {
		return getId_Usuario();
	}
	
	public void setEs_administrador(boolean value) {
		this.es_administrador = value;
	}
	
	public boolean getEs_administrador() {
		return es_administrador;
	}
	
	public String toString() {
		return String.valueOf(getId_Usuario());
	}
	
}
