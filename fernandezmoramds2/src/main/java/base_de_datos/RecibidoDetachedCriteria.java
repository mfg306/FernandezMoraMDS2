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

public class RecibidoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression codigo;
	public final IntegerExpression num_total_unidades;
	public final DoubleExpression precio_total;
	public final StringExpression fecha_estado;
	public final IntegerExpression _recibeId;
	public final AssociationExpression _recibe;
	public final IntegerExpression _RecogeId;
	public final AssociationExpression _Recoge;
	
	public RecibidoDetachedCriteria() {
		super(base_de_datos.Recibido.class, base_de_datos.RecibidoCriteria.class);
		codigo = new IntegerExpression("codigo", this.getDetachedCriteria());
		num_total_unidades = new IntegerExpression("num_total_unidades", this.getDetachedCriteria());
		precio_total = new DoubleExpression("precio_total", this.getDetachedCriteria());
		fecha_estado = new StringExpression("fecha_estado", this.getDetachedCriteria());
		_recibeId = new IntegerExpression("_recibe.", this.getDetachedCriteria());
		_recibe = new AssociationExpression("_recibe", this.getDetachedCriteria());
		_RecogeId = new IntegerExpression("_Recoge.", this.getDetachedCriteria());
		_Recoge = new AssociationExpression("_Recoge", this.getDetachedCriteria());
	}
	
	public RecibidoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.RecibidoCriteria.class);
		codigo = new IntegerExpression("codigo", this.getDetachedCriteria());
		num_total_unidades = new IntegerExpression("num_total_unidades", this.getDetachedCriteria());
		precio_total = new DoubleExpression("precio_total", this.getDetachedCriteria());
		fecha_estado = new StringExpression("fecha_estado", this.getDetachedCriteria());
		_recibeId = new IntegerExpression("_recibe.", this.getDetachedCriteria());
		_recibe = new AssociationExpression("_recibe", this.getDetachedCriteria());
		_RecogeId = new IntegerExpression("_Recoge.", this.getDetachedCriteria());
		_Recoge = new AssociationExpression("_Recoge", this.getDetachedCriteria());
	}
	
	public URDetachedCriteria create_recibeCriteria() {
		return new URDetachedCriteria(createCriteria("_recibe"));
	}
	
	public TransportistaDetachedCriteria create_RecogeCriteria() {
		return new TransportistaDetachedCriteria(createCriteria("_Recoge"));
	}
	
	public Recibido uniqueRecibido(PersistentSession session) {
		return (Recibido) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Recibido[] listRecibido(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Recibido[]) list.toArray(new Recibido[list.size()]);
	}
}

