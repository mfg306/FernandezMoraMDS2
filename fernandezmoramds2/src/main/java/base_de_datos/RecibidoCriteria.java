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

public class RecibidoCriteria extends AbstractORMCriteria {
	public final IntegerExpression codigo;
	public final IntegerExpression num_total_unidades;
	public final DoubleExpression precio_total;
	public final StringExpression fecha_estado;
	public final BooleanExpression recibido;
	public final IntegerExpression _recibeId;
	public final AssociationExpression _recibe;
	public final IntegerExpression _RecogeId;
	public final AssociationExpression _Recoge;
	
	public RecibidoCriteria(Criteria criteria) {
		super(criteria);
		codigo = new IntegerExpression("codigo", this);
		num_total_unidades = new IntegerExpression("num_total_unidades", this);
		precio_total = new DoubleExpression("precio_total", this);
		fecha_estado = new StringExpression("fecha_estado", this);
		recibido = new BooleanExpression("recibido", this);
		_recibeId = new IntegerExpression("_recibe.", this);
		_recibe = new AssociationExpression("_recibe", this);
		_RecogeId = new IntegerExpression("_Recoge.", this);
		_Recoge = new AssociationExpression("_Recoge", this);
	}
	
	public RecibidoCriteria(PersistentSession session) {
		this(session.createCriteria(Recibido.class));
	}
	
	public RecibidoCriteria() throws PersistentException {
		this(base_de_datos.HitoPersistentManager.instance().getSession());
	}
	
	public URCriteria create_recibeCriteria() {
		return new URCriteria(createCriteria("_recibe"));
	}
	
	public TransportistaCriteria create_RecogeCriteria() {
		return new TransportistaCriteria(createCriteria("_Recoge"));
	}
	
	public Recibido uniqueRecibido() {
		return (Recibido) super.uniqueResult();
	}
	
	public Recibido[] listRecibido() {
		java.util.List list = super.list();
		return (Recibido[]) list.toArray(new Recibido[list.size()]);
	}
}

