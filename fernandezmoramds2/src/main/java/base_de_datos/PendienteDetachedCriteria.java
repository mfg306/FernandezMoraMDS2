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

public class PendienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression codigo;
	public final IntegerExpression num_total_unidades;
	public final DoubleExpression precio_total;
	public final StringExpression fecha_estado;
	public final BooleanExpression asignado;
	public final IntegerExpression _Encargado_de_comprasId;
	public final AssociationExpression _Encargado_de_compras;
	public final IntegerExpression _Hace_compraId;
	public final AssociationExpression _Hace_compra;
	public final CollectionExpression _Producto_en_compra;
	
	public PendienteDetachedCriteria() {
		super(base_de_datos.Pendiente.class, base_de_datos.PendienteCriteria.class);
		codigo = new IntegerExpression("codigo", this.getDetachedCriteria());
		num_total_unidades = new IntegerExpression("num_total_unidades", this.getDetachedCriteria());
		precio_total = new DoubleExpression("precio_total", this.getDetachedCriteria());
		fecha_estado = new StringExpression("fecha_estado", this.getDetachedCriteria());
		asignado = new BooleanExpression("asignado", this.getDetachedCriteria());
		_Encargado_de_comprasId = new IntegerExpression("_Encargado_de_compras.", this.getDetachedCriteria());
		_Encargado_de_compras = new AssociationExpression("_Encargado_de_compras", this.getDetachedCriteria());
		_Hace_compraId = new IntegerExpression("_Hace_compra.", this.getDetachedCriteria());
		_Hace_compra = new AssociationExpression("_Hace_compra", this.getDetachedCriteria());
		_Producto_en_compra = new CollectionExpression("ORM__Producto_en_compra", this.getDetachedCriteria());
	}
	
	public PendienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.PendienteCriteria.class);
		codigo = new IntegerExpression("codigo", this.getDetachedCriteria());
		num_total_unidades = new IntegerExpression("num_total_unidades", this.getDetachedCriteria());
		precio_total = new DoubleExpression("precio_total", this.getDetachedCriteria());
		fecha_estado = new StringExpression("fecha_estado", this.getDetachedCriteria());
		asignado = new BooleanExpression("asignado", this.getDetachedCriteria());
		_Encargado_de_comprasId = new IntegerExpression("_Encargado_de_compras.", this.getDetachedCriteria());
		_Encargado_de_compras = new AssociationExpression("_Encargado_de_compras", this.getDetachedCriteria());
		_Hace_compraId = new IntegerExpression("_Hace_compra.", this.getDetachedCriteria());
		_Hace_compra = new AssociationExpression("_Hace_compra", this.getDetachedCriteria());
		_Producto_en_compra = new CollectionExpression("ORM__Producto_en_compra", this.getDetachedCriteria());
	}
	
	public Encargado_de_comprasDetachedCriteria create_Encargado_de_comprasCriteria() {
		return new Encargado_de_comprasDetachedCriteria(createCriteria("_Encargado_de_compras"));
	}
	
	public URDetachedCriteria create_Hace_compraCriteria() {
		return new URDetachedCriteria(createCriteria("_Hace_compra"));
	}
	
	public base_de_datos.Producto_en_compraDetachedCriteria create_Producto_en_compraCriteria() {
		return new base_de_datos.Producto_en_compraDetachedCriteria(createCriteria("ORM__Producto_en_compra"));
	}
	
	public Pendiente uniquePendiente(PersistentSession session) {
		return (Pendiente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Pendiente[] listPendiente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Pendiente[]) list.toArray(new Pendiente[list.size()]);
	}
}

