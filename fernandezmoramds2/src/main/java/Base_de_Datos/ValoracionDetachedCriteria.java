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

public class ValoracionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_valoracion;
	public final IntegerExpression _Valorado_porId;
	public final AssociationExpression _Valorado_por;
	public final IntegerExpression valoracion;
	public final CollectionExpression _Valorado;
	
	public ValoracionDetachedCriteria() {
		super(Base_de_Datos.Valoracion.class, Base_de_Datos.ValoracionCriteria.class);
		id_valoracion = new IntegerExpression("id_valoracion", this.getDetachedCriteria());
		_Valorado_porId = new IntegerExpression("_Valorado_por.", this.getDetachedCriteria());
		_Valorado_por = new AssociationExpression("_Valorado_por", this.getDetachedCriteria());
		valoracion = new IntegerExpression("valoracion", this.getDetachedCriteria());
		_Valorado = new CollectionExpression("ORM__Valorado", this.getDetachedCriteria());
	}
	
	public ValoracionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Base_de_Datos.ValoracionCriteria.class);
		id_valoracion = new IntegerExpression("id_valoracion", this.getDetachedCriteria());
		_Valorado_porId = new IntegerExpression("_Valorado_por.", this.getDetachedCriteria());
		_Valorado_por = new AssociationExpression("_Valorado_por", this.getDetachedCriteria());
		valoracion = new IntegerExpression("valoracion", this.getDetachedCriteria());
		_Valorado = new CollectionExpression("ORM__Valorado", this.getDetachedCriteria());
	}
	
	public URDetachedCriteria create_Valorado_porCriteria() {
		return new URDetachedCriteria(createCriteria("_Valorado_por"));
	}
	
	public Base_de_Datos.ProductoDetachedCriteria create_ValoradoCriteria() {
		return new Base_de_Datos.ProductoDetachedCriteria(createCriteria("ORM__Valorado"));
	}
	
	public Valoracion uniqueValoracion(PersistentSession session) {
		return (Valoracion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Valoracion[] listValoracion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Valoracion[]) list.toArray(new Valoracion[list.size()]);
	}
}

