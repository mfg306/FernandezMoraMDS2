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

public class ComentarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_Comentario;
	public final IntegerExpression _RealizaId;
	public final AssociationExpression _Realiza;
	public final IntegerExpression _TieneId;
	public final AssociationExpression _Tiene;
	public final StringExpression comentario;
	public final StringExpression fecha;
	
	public ComentarioDetachedCriteria() {
		super(Base_de_Datos.Comentario.class, Base_de_Datos.ComentarioCriteria.class);
		id_Comentario = new IntegerExpression("id_Comentario", this.getDetachedCriteria());
		_RealizaId = new IntegerExpression("_Realiza.", this.getDetachedCriteria());
		_Realiza = new AssociationExpression("_Realiza", this.getDetachedCriteria());
		_TieneId = new IntegerExpression("_Tiene.id_Producto", this.getDetachedCriteria());
		_Tiene = new AssociationExpression("_Tiene", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Base_de_Datos.ComentarioCriteria.class);
		id_Comentario = new IntegerExpression("id_Comentario", this.getDetachedCriteria());
		_RealizaId = new IntegerExpression("_Realiza.", this.getDetachedCriteria());
		_Realiza = new AssociationExpression("_Realiza", this.getDetachedCriteria());
		_TieneId = new IntegerExpression("_Tiene.id_Producto", this.getDetachedCriteria());
		_Tiene = new AssociationExpression("_Tiene", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
	}
	
	public URDetachedCriteria create_RealizaCriteria() {
		return new URDetachedCriteria(createCriteria("_Realiza"));
	}
	
	public ProductoDetachedCriteria create_TieneCriteria() {
		return new ProductoDetachedCriteria(createCriteria("_Tiene"));
	}
	
	public Comentario uniqueComentario(PersistentSession session) {
		return (Comentario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentario[] listComentario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

