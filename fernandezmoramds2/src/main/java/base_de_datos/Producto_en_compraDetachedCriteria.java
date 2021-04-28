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

public class Producto_en_compraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression codigo;
	public final IntegerExpression _PendienteId;
	public final AssociationExpression _Pendiente;
	public final IntegerExpression _ProductoId;
	public final AssociationExpression _Producto;
	public final IntegerExpression num_unidades_producto;
	
	public Producto_en_compraDetachedCriteria() {
		super(base_de_datos.Producto_en_compra.class, base_de_datos.Producto_en_compraCriteria.class);
		codigo = new IntegerExpression("codigo", this.getDetachedCriteria());
		_PendienteId = new IntegerExpression("_Pendiente.", this.getDetachedCriteria());
		_Pendiente = new AssociationExpression("_Pendiente", this.getDetachedCriteria());
		_ProductoId = new IntegerExpression("_Producto.id_Producto", this.getDetachedCriteria());
		_Producto = new AssociationExpression("_Producto", this.getDetachedCriteria());
		num_unidades_producto = new IntegerExpression("num_unidades_producto", this.getDetachedCriteria());
	}
	
	public Producto_en_compraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.Producto_en_compraCriteria.class);
		codigo = new IntegerExpression("codigo", this.getDetachedCriteria());
		_PendienteId = new IntegerExpression("_Pendiente.", this.getDetachedCriteria());
		_Pendiente = new AssociationExpression("_Pendiente", this.getDetachedCriteria());
		_ProductoId = new IntegerExpression("_Producto.id_Producto", this.getDetachedCriteria());
		_Producto = new AssociationExpression("_Producto", this.getDetachedCriteria());
		num_unidades_producto = new IntegerExpression("num_unidades_producto", this.getDetachedCriteria());
	}
	
	public PendienteDetachedCriteria create_PendienteCriteria() {
		return new PendienteDetachedCriteria(createCriteria("_Pendiente"));
	}
	
	public ProductoDetachedCriteria create_ProductoCriteria() {
		return new ProductoDetachedCriteria(createCriteria("_Producto"));
	}
	
	public Producto_en_compra uniqueProducto_en_compra(PersistentSession session) {
		return (Producto_en_compra) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Producto_en_compra[] listProducto_en_compra(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Producto_en_compra[]) list.toArray(new Producto_en_compra[list.size()]);
	}
}

