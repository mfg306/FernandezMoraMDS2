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

public class Encargado_de_comprasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idEmpleado;
	public final StringExpression correo;
	public final StringExpression contrasenia;
	public final CollectionExpression _Pendiente;
	public final CollectionExpression _Pedido_enviado;
	
	public Encargado_de_comprasDetachedCriteria() {
		super(base_de_datos.Encargado_de_compras.class, base_de_datos.Encargado_de_comprasCriteria.class);
		idEmpleado = new IntegerExpression("idEmpleado", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		_Pendiente = new CollectionExpression("ORM__Pendiente", this.getDetachedCriteria());
		_Pedido_enviado = new CollectionExpression("ORM__Pedido_enviado", this.getDetachedCriteria());
	}
	
	public Encargado_de_comprasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.Encargado_de_comprasCriteria.class);
		idEmpleado = new IntegerExpression("idEmpleado", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		_Pendiente = new CollectionExpression("ORM__Pendiente", this.getDetachedCriteria());
		_Pedido_enviado = new CollectionExpression("ORM__Pedido_enviado", this.getDetachedCriteria());
	}
	
	public base_de_datos.PendienteDetachedCriteria create_PendienteCriteria() {
		return new base_de_datos.PendienteDetachedCriteria(createCriteria("ORM__Pendiente"));
	}
	
	public base_de_datos.EnviadoDetachedCriteria create_Pedido_enviadoCriteria() {
		return new base_de_datos.EnviadoDetachedCriteria(createCriteria("ORM__Pedido_enviado"));
	}
	
	public Encargado_de_compras uniqueEncargado_de_compras(PersistentSession session) {
		return (Encargado_de_compras) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Encargado_de_compras[] listEncargado_de_compras(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Encargado_de_compras[]) list.toArray(new Encargado_de_compras[list.size()]);
	}
}

