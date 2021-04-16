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

public class Producto_en_compraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_Producto_en_compra;
	public final IntegerExpression num_unidades_producto;
	public final CollectionExpression _Producto;
	public final CollectionExpression _Pendiente;
	
	public Producto_en_compraDetachedCriteria() {
		super(Base_de_Datos.Producto_en_compra.class, Base_de_Datos.Producto_en_compraCriteria.class);
		id_Producto_en_compra = new IntegerExpression("id_Producto_en_compra", this.getDetachedCriteria());
		num_unidades_producto = new IntegerExpression("num_unidades_producto", this.getDetachedCriteria());
		_Producto = new CollectionExpression("ORM__Producto", this.getDetachedCriteria());
		_Pendiente = new CollectionExpression("ORM__Pendiente", this.getDetachedCriteria());
	}
	
	public Producto_en_compraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Base_de_Datos.Producto_en_compraCriteria.class);
		id_Producto_en_compra = new IntegerExpression("id_Producto_en_compra", this.getDetachedCriteria());
		num_unidades_producto = new IntegerExpression("num_unidades_producto", this.getDetachedCriteria());
		_Producto = new CollectionExpression("ORM__Producto", this.getDetachedCriteria());
		_Pendiente = new CollectionExpression("ORM__Pendiente", this.getDetachedCriteria());
	}
	
	public Base_de_Datos.ProductoDetachedCriteria create_ProductoCriteria() {
		return new Base_de_Datos.ProductoDetachedCriteria(createCriteria("ORM__Producto"));
	}
	
	public Base_de_Datos.PendienteDetachedCriteria create_PendienteCriteria() {
		return new Base_de_Datos.PendienteDetachedCriteria(createCriteria("ORM__Pendiente"));
	}
	
	public Producto_en_compra uniqueProducto_en_compra(PersistentSession session) {
		return (Producto_en_compra) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Producto_en_compra[] listProducto_en_compra(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Producto_en_compra[]) list.toArray(new Producto_en_compra[list.size()]);
	}
}

