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

public class TransportistaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idEmpleado;
	public final StringExpression correo;
	public final StringExpression contrasenia;
	public final IntegerExpression id_cola;
	public final CollectionExpression _Recibido;
	public final CollectionExpression _Enviado;
	
	public TransportistaCriteria(Criteria criteria) {
		super(criteria);
		idEmpleado = new IntegerExpression("idEmpleado", this);
		correo = new StringExpression("correo", this);
		contrasenia = new StringExpression("contrasenia", this);
		id_cola = new IntegerExpression("id_cola", this);
		_Recibido = new CollectionExpression("ORM__Recibido", this);
		_Enviado = new CollectionExpression("ORM__Enviado", this);
	}
	
	public TransportistaCriteria(PersistentSession session) {
		this(session.createCriteria(Transportista.class));
	}
	
	public TransportistaCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public RecibidoCriteria create_RecibidoCriteria() {
		return new RecibidoCriteria(createCriteria("ORM__Recibido"));
	}
	
	public EnviadoCriteria create_EnviadoCriteria() {
		return new EnviadoCriteria(createCriteria("ORM__Enviado"));
	}
	
	public Transportista uniqueTransportista() {
		return (Transportista) super.uniqueResult();
	}
	
	public Transportista[] listTransportista() {
		java.util.List list = super.list();
		return (Transportista[]) list.toArray(new Transportista[list.size()]);
	}
}

