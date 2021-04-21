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
package base_de_datos;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Compra")
@Inheritance(strategy=InheritanceType.JOINED)
public class Compra implements Serializable {
	public Compra() {
	}
	
	@Column(name="Codigo", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_COMPRA_CODIGO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_COMPRA_CODIGO_GENERATOR", strategy="native")	
	private int codigo;
	
	@Column(name="Num_total_unidades", nullable=false, length=10)	
	private int num_total_unidades;
	
	@Column(name="Precio_total", nullable=false)	
	private double precio_total;
	
	@Column(name="Fecha_estado", nullable=true, length=255)	
	private String fecha_estado;
	
	public void setNum_total_unidades(int value) {
		this.num_total_unidades = value;
	}
	
	public int getNum_total_unidades() {
		return num_total_unidades;
	}
	
	public void setPrecio_total(double value) {
		this.precio_total = value;
	}
	
	public double getPrecio_total() {
		return precio_total;
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
	
	public void setFecha_estado(String value) {
		this.fecha_estado = value;
	}
	
	public String getFecha_estado() {
		return fecha_estado;
	}
	
	public base de datos.Compra[] cargarPedidos(base de datos.UR usuario) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getCodigo());
	}
	
}
