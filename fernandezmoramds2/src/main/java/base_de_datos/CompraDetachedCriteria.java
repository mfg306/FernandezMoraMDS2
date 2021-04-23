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

public class CompraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression codigo;
	public final IntegerExpression num_total_unidades;
	public final DoubleExpression precio_total;
	public final StringExpression fecha_estado;
	
	public CompraDetachedCriteria() {
		super(base_de_datos.Compra.class, base_de_datos.CompraCriteria.class);
		codigo = new IntegerExpression("codigo", this.getDetachedCriteria());
		num_total_unidades = new IntegerExpression("num_total_unidades", this.getDetachedCriteria());
		precio_total = new DoubleExpression("precio_total", this.getDetachedCriteria());
		fecha_estado = new StringExpression("fecha_estado", this.getDetachedCriteria());
	}
	
	public CompraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.CompraCriteria.class);
		codigo = new IntegerExpression("codigo", this.getDetachedCriteria());
		num_total_unidades = new IntegerExpression("num_total_unidades", this.getDetachedCriteria());
		precio_total = new DoubleExpression("precio_total", this.getDetachedCriteria());
		fecha_estado = new StringExpression("fecha_estado", this.getDetachedCriteria());
	}
	
	public Compra uniqueCompra(PersistentSession session) {
		return (Compra) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Compra[] listCompra(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Compra[]) list.toArray(new Compra[list.size()]);
	}
}

