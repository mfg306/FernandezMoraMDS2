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

public class PendienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression codigo;
	public final IntegerExpression num_total_unidades;
	public final DoubleExpression precio_total;
	public final StringExpression fecha_estado;
	public final IntegerExpression _Encargado_de_comprasId;
	public final AssociationExpression _Encargado_de_compras;
	public final IntegerExpression _Hace_compraId;
	public final AssociationExpression _Hace_compra;
	public final CollectionExpression _Producto_en_compra;
	
	public PendienteCriteria(Criteria criteria) {
		super(criteria);
		codigo = new IntegerExpression("codigo", this);
		num_total_unidades = new IntegerExpression("num_total_unidades", this);
		precio_total = new DoubleExpression("precio_total", this);
		fecha_estado = new StringExpression("fecha_estado", this);
		_Encargado_de_comprasId = new IntegerExpression("_Encargado_de_compras.", this);
		_Encargado_de_compras = new AssociationExpression("_Encargado_de_compras", this);
		_Hace_compraId = new IntegerExpression("_Hace_compra.", this);
		_Hace_compra = new AssociationExpression("_Hace_compra", this);
		_Producto_en_compra = new CollectionExpression("ORM__Producto_en_compra", this);
	}
	
	public PendienteCriteria(PersistentSession session) {
		this(session.createCriteria(Pendiente.class));
	}
	
	public PendienteCriteria() throws PersistentException {
		this(Base_de_Datos.HitoPersistentManager.instance().getSession());
	}
	
	public Encargado_de_comprasCriteria create_Encargado_de_comprasCriteria() {
		return new Encargado_de_comprasCriteria(createCriteria("_Encargado_de_compras"));
	}
	
	public URCriteria create_Hace_compraCriteria() {
		return new URCriteria(createCriteria("_Hace_compra"));
	}
	
	public Base_de_Datos.Producto_en_compraCriteria create_Producto_en_compraCriteria() {
		return new Base_de_Datos.Producto_en_compraCriteria(createCriteria("ORM__Producto_en_compra"));
	}
	
	public Pendiente uniquePendiente() {
		return (Pendiente) super.uniqueResult();
	}
	
	public Pendiente[] listPendiente() {
		java.util.List list = super.list();
		return (Pendiente[]) list.toArray(new Pendiente[list.size()]);
	}
}

