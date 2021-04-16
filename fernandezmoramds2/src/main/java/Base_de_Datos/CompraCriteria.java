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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CompraCriteria extends AbstractORMCriteria {
	public final IntegerExpression codigo;
	public final IntegerExpression num_total_unidades;
	public final DoubleExpression precio_total;
	public final StringExpression fecha_estado;
	
	public CompraCriteria(Criteria criteria) {
		super(criteria);
		codigo = new IntegerExpression("codigo", this);
		num_total_unidades = new IntegerExpression("num_total_unidades", this);
		precio_total = new DoubleExpression("precio_total", this);
		fecha_estado = new StringExpression("fecha_estado", this);
	}
	
	public CompraCriteria(PersistentSession session) {
		this(session.createCriteria(Compra.class));
	}
	
	public CompraCriteria() throws PersistentException {
		this(Base_de_Datos.HitoPersistentManager.instance().getSession());
	}
	
	public Compra uniqueCompra() {
		return (Compra) super.uniqueResult();
	}
	
	public Compra[] listCompra() {
		java.util.List list = super.list();
		return (Compra[]) list.toArray(new Compra[list.size()]);
	}
}

