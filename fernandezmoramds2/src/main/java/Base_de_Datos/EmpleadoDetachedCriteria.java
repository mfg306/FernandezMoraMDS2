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

public class EmpleadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idEmpleado;
	public final StringExpression correo;
	public final StringExpression contrasenia;
	
	public EmpleadoDetachedCriteria() {
		super(Base_de_Datos.Empleado.class, Base_de_Datos.EmpleadoCriteria.class);
		idEmpleado = new IntegerExpression("idEmpleado", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
	}
	
	public EmpleadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Base_de_Datos.EmpleadoCriteria.class);
		idEmpleado = new IntegerExpression("idEmpleado", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
	}
	
	public Empleado uniqueEmpleado(PersistentSession session) {
		return (Empleado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Empleado[] listEmpleado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Empleado[]) list.toArray(new Empleado[list.size()]);
	}
}

