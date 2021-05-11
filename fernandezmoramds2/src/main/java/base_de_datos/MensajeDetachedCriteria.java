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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MensajeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_Mensaje;
	public final IntegerExpression _Enviado_por_AdminId;
	public final AssociationExpression _Enviado_por_Admin;
	public final IntegerExpression _Enviado_por_URId;
	public final AssociationExpression _Enviado_por_UR;
	public final IntegerExpression _Responder_aId;
	public final AssociationExpression _Responder_a;
	public final StringExpression correo_emisor;
	public final StringExpression correo_receptor;
	public final StringExpression mensaje;
	public final IntegerExpression _MensajeId;
	public final AssociationExpression _Mensaje;
	
	public MensajeDetachedCriteria() {
		super(base_de_datos.Mensaje.class, base_de_datos.MensajeCriteria.class);
		id_Mensaje = new IntegerExpression("id_Mensaje", this.getDetachedCriteria());
		_Enviado_por_AdminId = new IntegerExpression("_Enviado_por_Admin.", this.getDetachedCriteria());
		_Enviado_por_Admin = new AssociationExpression("_Enviado_por_Admin", this.getDetachedCriteria());
		_Enviado_por_URId = new IntegerExpression("_Enviado_por_UR.", this.getDetachedCriteria());
		_Enviado_por_UR = new AssociationExpression("_Enviado_por_UR", this.getDetachedCriteria());
		_Responder_aId = new IntegerExpression("_Responder_a.id_Mensaje", this.getDetachedCriteria());
		_Responder_a = new AssociationExpression("_Responder_a", this.getDetachedCriteria());
		correo_emisor = new StringExpression("correo_emisor", this.getDetachedCriteria());
		correo_receptor = new StringExpression("correo_receptor", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		_MensajeId = new IntegerExpression("_Mensaje.id_Mensaje", this.getDetachedCriteria());
		_Mensaje = new AssociationExpression("_Mensaje", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.MensajeCriteria.class);
		id_Mensaje = new IntegerExpression("id_Mensaje", this.getDetachedCriteria());
		_Enviado_por_AdminId = new IntegerExpression("_Enviado_por_Admin.", this.getDetachedCriteria());
		_Enviado_por_Admin = new AssociationExpression("_Enviado_por_Admin", this.getDetachedCriteria());
		_Enviado_por_URId = new IntegerExpression("_Enviado_por_UR.", this.getDetachedCriteria());
		_Enviado_por_UR = new AssociationExpression("_Enviado_por_UR", this.getDetachedCriteria());
		_Responder_aId = new IntegerExpression("_Responder_a.id_Mensaje", this.getDetachedCriteria());
		_Responder_a = new AssociationExpression("_Responder_a", this.getDetachedCriteria());
		correo_emisor = new StringExpression("correo_emisor", this.getDetachedCriteria());
		correo_receptor = new StringExpression("correo_receptor", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		_MensajeId = new IntegerExpression("_Mensaje.id_Mensaje", this.getDetachedCriteria());
		_Mensaje = new AssociationExpression("_Mensaje", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria create_Enviado_por_AdminCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("_Enviado_por_Admin"));
	}
	
	public URDetachedCriteria create_Enviado_por_URCriteria() {
		return new URDetachedCriteria(createCriteria("_Enviado_por_UR"));
	}
	
	public MensajeDetachedCriteria create_Responder_aCriteria() {
		return new MensajeDetachedCriteria(createCriteria("_Responder_a"));
	}
	
	public MensajeDetachedCriteria create_MensajeCriteria() {
		return new MensajeDetachedCriteria(createCriteria("_Mensaje"));
	}
	
	public Mensaje uniqueMensaje(PersistentSession session) {
		return (Mensaje) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mensaje[] listMensaje(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

