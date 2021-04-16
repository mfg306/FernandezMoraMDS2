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
@Table(name="Empleado")
@Inheritance(strategy=InheritanceType.JOINED)
public class Empleado implements Serializable {
	public Empleado() {
	}
	
	@Column(name="IdEmpleado", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="Base_de_Datos_EMPLEADO_IDEMPLEADO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="Base_de_Datos_EMPLEADO_IDEMPLEADO_GENERATOR", strategy="native")	
	private int idEmpleado;
	
	@Column(name="Correo", nullable=true, length=255)	
	private String correo;
	
	@Column(name="Contrasenia", nullable=true, length=255)	
	private String contrasenia;
	
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	private void setIdEmpleado(int value) {
		this.idEmpleado = value;
	}
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	
	public int getORMID() {
		return getIdEmpleado();
	}
	
	public void setContrasenia(String value) {
		this.contrasenia = value;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	public String toString() {
		return String.valueOf(getIdEmpleado());
	}
	
}
