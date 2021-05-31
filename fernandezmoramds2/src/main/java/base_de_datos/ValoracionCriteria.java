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

public class ValoracionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_valoracion;
	public final IntegerExpression _ValoradoId;
	public final AssociationExpression _Valorado;
	public final IntegerExpression _Valorado_porId;
	public final AssociationExpression _Valorado_por;
	public final IntegerExpression valoracion;
	
	public ValoracionCriteria(Criteria criteria) {
		super(criteria);
		id_valoracion = new IntegerExpression("id_valoracion", this);
		_ValoradoId = new IntegerExpression("_Valorado.id_Producto", this);
		_Valorado = new AssociationExpression("_Valorado", this);
		_Valorado_porId = new IntegerExpression("_Valorado_por.", this);
		_Valorado_por = new AssociationExpression("_Valorado_por", this);
		valoracion = new IntegerExpression("valoracion", this);
	}
	
	public ValoracionCriteria(PersistentSession session) {
		this(session.createCriteria(Valoracion.class));
	}
	
	public ValoracionCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public ProductoCriteria create_ValoradoCriteria() {
		return new ProductoCriteria(createCriteria("_Valorado"));
	}
	
	public URCriteria create_Valorado_porCriteria() {
		return new URCriteria(createCriteria("_Valorado_por"));
	}
	
	public Valoracion uniqueValoracion() {
		return (Valoracion) super.uniqueResult();
	}
	
	public Valoracion[] listValoracion() {
		java.util.List list = super.list();
		return (Valoracion[]) list.toArray(new Valoracion[list.size()]);
	}
}

