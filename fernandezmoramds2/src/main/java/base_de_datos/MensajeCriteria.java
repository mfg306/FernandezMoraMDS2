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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MensajeCriteria extends AbstractORMCriteria {
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
	public final StringExpression codigo;
	public final IntegerExpression _MensajeId;
	public final AssociationExpression _Mensaje;
	
	public MensajeCriteria(Criteria criteria) {
		super(criteria);
		id_Mensaje = new IntegerExpression("id_Mensaje", this);
		_Enviado_por_AdminId = new IntegerExpression("_Enviado_por_Admin.", this);
		_Enviado_por_Admin = new AssociationExpression("_Enviado_por_Admin", this);
		_Enviado_por_URId = new IntegerExpression("_Enviado_por_UR.", this);
		_Enviado_por_UR = new AssociationExpression("_Enviado_por_UR", this);
		_Responder_aId = new IntegerExpression("_Responder_a.id_Mensaje", this);
		_Responder_a = new AssociationExpression("_Responder_a", this);
		correo_emisor = new StringExpression("correo_emisor", this);
		correo_receptor = new StringExpression("correo_receptor", this);
		mensaje = new StringExpression("mensaje", this);
		codigo = new StringExpression("codigo", this);
		_MensajeId = new IntegerExpression("_Mensaje.id_Mensaje", this);
		_Mensaje = new AssociationExpression("_Mensaje", this);
	}
	
	public MensajeCriteria(PersistentSession session) {
		this(session.createCriteria(Mensaje.class));
	}
	
	public MensajeCriteria() throws PersistentException {
		this(base_de_datos.HitoPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria create_Enviado_por_AdminCriteria() {
		return new AdministradorCriteria(createCriteria("_Enviado_por_Admin"));
	}
	
	public URCriteria create_Enviado_por_URCriteria() {
		return new URCriteria(createCriteria("_Enviado_por_UR"));
	}
	
	public MensajeCriteria create_Responder_aCriteria() {
		return new MensajeCriteria(createCriteria("_Responder_a"));
	}
	
	public MensajeCriteria create_MensajeCriteria() {
		return new MensajeCriteria(createCriteria("_Mensaje"));
	}
	
	public Mensaje uniqueMensaje() {
		return (Mensaje) super.uniqueResult();
	}
	
	public Mensaje[] listMensaje() {
		java.util.List list = super.list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

