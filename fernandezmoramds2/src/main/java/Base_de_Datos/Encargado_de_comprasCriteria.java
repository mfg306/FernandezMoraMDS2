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

public class Encargado_de_comprasCriteria extends AbstractORMCriteria {
	public final IntegerExpression idEmpleado;
	public final StringExpression correo;
	public final StringExpression contrasenia;
	public final IntegerExpression id_Encargado;
	public final StringExpression correo_Empleado;
	public final CollectionExpression _Pendiente;
	public final CollectionExpression _Pedido_enviado;
	
	public Encargado_de_comprasCriteria(Criteria criteria) {
		super(criteria);
		idEmpleado = new IntegerExpression("idEmpleado", this);
		correo = new StringExpression("correo", this);
		contrasenia = new StringExpression("contrasenia", this);
		id_Encargado = new IntegerExpression("id_Encargado", this);
		correo_Empleado = new StringExpression("correo_Empleado", this);
		_Pendiente = new CollectionExpression("ORM__Pendiente", this);
		_Pedido_enviado = new CollectionExpression("ORM__Pedido_enviado", this);
	}
	
	public Encargado_de_comprasCriteria(PersistentSession session) {
		this(session.createCriteria(Encargado_de_compras.class));
	}
	
	public Encargado_de_comprasCriteria() throws PersistentException {
		this(Base_de_Datos.HitoPersistentManager.instance().getSession());
	}
	
	public Base_de_Datos.PendienteCriteria create_PendienteCriteria() {
		return new Base_de_Datos.PendienteCriteria(createCriteria("ORM__Pendiente"));
	}
	
	public Base_de_Datos.EnviadoCriteria create_Pedido_enviadoCriteria() {
		return new Base_de_Datos.EnviadoCriteria(createCriteria("ORM__Pedido_enviado"));
	}
	
	public Encargado_de_compras uniqueEncargado_de_compras() {
		return (Encargado_de_compras) super.uniqueResult();
	}
	
	public Encargado_de_compras[] listEncargado_de_compras() {
		java.util.List list = super.list();
		return (Encargado_de_compras[]) list.toArray(new Encargado_de_compras[list.size()]);
	}
}

