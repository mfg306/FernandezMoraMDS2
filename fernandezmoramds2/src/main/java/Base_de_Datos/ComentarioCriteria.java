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

public class ComentarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Comentario;
	public final IntegerExpression _RealizaId;
	public final AssociationExpression _Realiza;
	public final IntegerExpression _TieneId;
	public final AssociationExpression _Tiene;
	public final StringExpression comentario;
	public final StringExpression fecha;
	
	public ComentarioCriteria(Criteria criteria) {
		super(criteria);
		id_Comentario = new IntegerExpression("id_Comentario", this);
		_RealizaId = new IntegerExpression("_Realiza.", this);
		_Realiza = new AssociationExpression("_Realiza", this);
		_TieneId = new IntegerExpression("_Tiene.id_Producto", this);
		_Tiene = new AssociationExpression("_Tiene", this);
		comentario = new StringExpression("comentario", this);
		fecha = new StringExpression("fecha", this);
	}
	
	public ComentarioCriteria(PersistentSession session) {
		this(session.createCriteria(Comentario.class));
	}
	
	public ComentarioCriteria() throws PersistentException {
		this(Base_de_Datos.HitoPersistentManager.instance().getSession());
	}
	
	public URCriteria create_RealizaCriteria() {
		return new URCriteria(createCriteria("_Realiza"));
	}
	
	public ProductoCriteria create_TieneCriteria() {
		return new ProductoCriteria(createCriteria("_Tiene"));
	}
	
	public Comentario uniqueComentario() {
		return (Comentario) super.uniqueResult();
	}
	
	public Comentario[] listComentario() {
		java.util.List list = super.list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

