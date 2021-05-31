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

public class EmpleadoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idEmpleado;
	public final StringExpression correo;
	public final StringExpression contrasenia;
	
	public EmpleadoCriteria(Criteria criteria) {
		super(criteria);
		idEmpleado = new IntegerExpression("idEmpleado", this);
		correo = new StringExpression("correo", this);
		contrasenia = new StringExpression("contrasenia", this);
	}
	
	public EmpleadoCriteria(PersistentSession session) {
		this(session.createCriteria(Empleado.class));
	}
	
	public EmpleadoCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public Empleado uniqueEmpleado() {
		return (Empleado) super.uniqueResult();
	}
	
	public Empleado[] listEmpleado() {
		java.util.List list = super.list();
		return (Empleado[]) list.toArray(new Empleado[list.size()]);
	}
}

