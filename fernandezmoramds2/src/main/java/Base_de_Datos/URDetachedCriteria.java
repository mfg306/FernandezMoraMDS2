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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class URDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_Usuario;
	public final StringExpression nombre;
	public final StringExpression primer_apellido;
	public final StringExpression segundo_apellido;
	public final StringExpression correo_electronico;
	public final StringExpression contrasenia;
	public final BooleanExpression es_administrador;
	public final StringExpression direccion_envio;
	public final StringExpression metodo_pago;
	public final StringExpression nombre_usuario;
	public final BooleanExpression esta_operativo;
	public final CollectionExpression _Es_de_un;
	public final CollectionExpression _Compra;
	public final CollectionExpression _recibido;
	public final CollectionExpression _Envia;
	public final CollectionExpression _Valora;
	
	public URDetachedCriteria() {
		super(Base_de_Datos.UR.class, Base_de_Datos.URCriteria.class);
		id_Usuario = new IntegerExpression("id_Usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		primer_apellido = new StringExpression("primer_apellido", this.getDetachedCriteria());
		segundo_apellido = new StringExpression("segundo_apellido", this.getDetachedCriteria());
		correo_electronico = new StringExpression("correo_electronico", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		es_administrador = new BooleanExpression("es_administrador", this.getDetachedCriteria());
		direccion_envio = new StringExpression("direccion_envio", this.getDetachedCriteria());
		metodo_pago = new StringExpression("metodo_pago", this.getDetachedCriteria());
		nombre_usuario = new StringExpression("nombre_usuario", this.getDetachedCriteria());
		esta_operativo = new BooleanExpression("esta_operativo", this.getDetachedCriteria());
		_Es_de_un = new CollectionExpression("ORM__Es_de_un", this.getDetachedCriteria());
		_Compra = new CollectionExpression("ORM__Compra", this.getDetachedCriteria());
		_recibido = new CollectionExpression("ORM__recibido", this.getDetachedCriteria());
		_Envia = new CollectionExpression("ORM__Envia", this.getDetachedCriteria());
		_Valora = new CollectionExpression("ORM__Valora", this.getDetachedCriteria());
	}
	
	public URDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Base_de_Datos.URCriteria.class);
		id_Usuario = new IntegerExpression("id_Usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		primer_apellido = new StringExpression("primer_apellido", this.getDetachedCriteria());
		segundo_apellido = new StringExpression("segundo_apellido", this.getDetachedCriteria());
		correo_electronico = new StringExpression("correo_electronico", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		es_administrador = new BooleanExpression("es_administrador", this.getDetachedCriteria());
		direccion_envio = new StringExpression("direccion_envio", this.getDetachedCriteria());
		metodo_pago = new StringExpression("metodo_pago", this.getDetachedCriteria());
		nombre_usuario = new StringExpression("nombre_usuario", this.getDetachedCriteria());
		esta_operativo = new BooleanExpression("esta_operativo", this.getDetachedCriteria());
		_Es_de_un = new CollectionExpression("ORM__Es_de_un", this.getDetachedCriteria());
		_Compra = new CollectionExpression("ORM__Compra", this.getDetachedCriteria());
		_recibido = new CollectionExpression("ORM__recibido", this.getDetachedCriteria());
		_Envia = new CollectionExpression("ORM__Envia", this.getDetachedCriteria());
		_Valora = new CollectionExpression("ORM__Valora", this.getDetachedCriteria());
	}
	
	public Base_de_Datos.ComentarioDetachedCriteria create_Es_de_unCriteria() {
		return new Base_de_Datos.ComentarioDetachedCriteria(createCriteria("ORM__Es_de_un"));
	}
	
	public Base_de_Datos.PendienteDetachedCriteria create_CompraCriteria() {
		return new Base_de_Datos.PendienteDetachedCriteria(createCriteria("ORM__Compra"));
	}
	
	public Base_de_Datos.RecibidoDetachedCriteria create_recibidoCriteria() {
		return new Base_de_Datos.RecibidoDetachedCriteria(createCriteria("ORM__recibido"));
	}
	
	public Base_de_Datos.MensajeDetachedCriteria create_EnviaCriteria() {
		return new Base_de_Datos.MensajeDetachedCriteria(createCriteria("ORM__Envia"));
	}
	
	public Base_de_Datos.ValoracionDetachedCriteria create_ValoraCriteria() {
		return new Base_de_Datos.ValoracionDetachedCriteria(createCriteria("ORM__Valora"));
	}
	
	public UR uniqueUR(PersistentSession session) {
		return (UR) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UR[] listUR(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UR[]) list.toArray(new UR[list.size()]);
	}
}

