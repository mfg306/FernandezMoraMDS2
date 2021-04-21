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
package base_de_datos;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CategoriaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Categoria;
	public final StringExpression nombre_categoria;
	public final StringExpression fecha_registro;
	public final CollectionExpression _Producto;
	
	public CategoriaCriteria(Criteria criteria) {
		super(criteria);
		id_Categoria = new IntegerExpression("id_Categoria", this);
		nombre_categoria = new StringExpression("nombre_categoria", this);
		fecha_registro = new StringExpression("fecha_registro", this);
		_Producto = new CollectionExpression("ORM__Producto", this);
	}
	
	public CategoriaCriteria(PersistentSession session) {
		this(session.createCriteria(Categoria.class));
	}
	
	public CategoriaCriteria() throws PersistentException {
		this(base_de_datos.HitoPersistentManager.instance().getSession());
	}
	
	public base_de_datos.ProductoCriteria create_ProductoCriteria() {
		return new base_de_datos.ProductoCriteria(createCriteria("ORM__Producto"));
	}
	
	public Categoria uniqueCategoria() {
		return (Categoria) super.uniqueResult();
	}
	
	public Categoria[] listCategoria() {
		java.util.List list = super.list();
		return (Categoria[]) list.toArray(new Categoria[list.size()]);
	}
}

