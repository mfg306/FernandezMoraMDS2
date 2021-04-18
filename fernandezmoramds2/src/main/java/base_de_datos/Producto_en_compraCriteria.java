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

public class Producto_en_compraCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Producto_en_compra;
	public final IntegerExpression num_unidades_producto;
	public final CollectionExpression _Producto;
	public final CollectionExpression _Pendiente;
	
	public Producto_en_compraCriteria(Criteria criteria) {
		super(criteria);
		id_Producto_en_compra = new IntegerExpression("id_Producto_en_compra", this);
		num_unidades_producto = new IntegerExpression("num_unidades_producto", this);
		_Producto = new CollectionExpression("ORM__Producto", this);
		_Pendiente = new CollectionExpression("ORM__Pendiente", this);
	}
	
	public Producto_en_compraCriteria(PersistentSession session) {
		this(session.createCriteria(Producto_en_compra.class));
	}
	
	public Producto_en_compraCriteria() throws PersistentException {
		this(base_de_datos.HitoPersistentManager.instance().getSession());
	}
	
	public base_de_datos.ProductoCriteria create_ProductoCriteria() {
		return new base_de_datos.ProductoCriteria(createCriteria("ORM__Producto"));
	}
	
	public base_de_datos.PendienteCriteria create_PendienteCriteria() {
		return new base_de_datos.PendienteCriteria(createCriteria("ORM__Pendiente"));
	}
	
	public Producto_en_compra uniqueProducto_en_compra() {
		return (Producto_en_compra) super.uniqueResult();
	}
	
	public Producto_en_compra[] listProducto_en_compra() {
		java.util.List list = super.list();
		return (Producto_en_compra[]) list.toArray(new Producto_en_compra[list.size()]);
	}
}

