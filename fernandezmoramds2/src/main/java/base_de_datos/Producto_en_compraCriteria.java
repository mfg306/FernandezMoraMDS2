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
	public final IntegerExpression codigo;
	public final IntegerExpression _PendienteId;
	public final AssociationExpression _Pendiente;
	public final IntegerExpression _ProductoId;
	public final AssociationExpression _Producto;
	public final IntegerExpression num_unidades_producto;
	
	public Producto_en_compraCriteria(Criteria criteria) {
		super(criteria);
		codigo = new IntegerExpression("codigo", this);
		_PendienteId = new IntegerExpression("_Pendiente.", this);
		_Pendiente = new AssociationExpression("_Pendiente", this);
		_ProductoId = new IntegerExpression("_Producto.id_Producto", this);
		_Producto = new AssociationExpression("_Producto", this);
		num_unidades_producto = new IntegerExpression("num_unidades_producto", this);
	}
	
	public Producto_en_compraCriteria(PersistentSession session) {
		this(session.createCriteria(Producto_en_compra.class));
	}
	
	public Producto_en_compraCriteria() throws PersistentException {
		this(base_de_datos.HitoPersistentManager.instance().getSession());
	}
	
	public PendienteCriteria create_PendienteCriteria() {
		return new PendienteCriteria(createCriteria("_Pendiente"));
	}
	
	public ProductoCriteria create_ProductoCriteria() {
		return new ProductoCriteria(createCriteria("_Producto"));
	}
	
	public Producto_en_compra uniqueProducto_en_compra() {
		return (Producto_en_compra) super.uniqueResult();
	}
	
	public Producto_en_compra[] listProducto_en_compra() {
		java.util.List list = super.list();
		return (Producto_en_compra[]) list.toArray(new Producto_en_compra[list.size()]);
	}
}

