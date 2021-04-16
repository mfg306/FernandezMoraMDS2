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

public class TransportistaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idEmpleado;
	public final StringExpression correo;
	public final StringExpression contrasenia;
	public final IntegerExpression id_Transportista;
	public final StringExpression correo_Transportista;
	public final CollectionExpression _Recibido;
	public final CollectionExpression _Enviado;
	
	public TransportistaDetachedCriteria() {
		super(Base_de_Datos.Transportista.class, Base_de_Datos.TransportistaCriteria.class);
		idEmpleado = new IntegerExpression("idEmpleado", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		id_Transportista = new IntegerExpression("id_Transportista", this.getDetachedCriteria());
		correo_Transportista = new StringExpression("correo_Transportista", this.getDetachedCriteria());
		_Recibido = new CollectionExpression("ORM__Recibido", this.getDetachedCriteria());
		_Enviado = new CollectionExpression("ORM__Enviado", this.getDetachedCriteria());
	}
	
	public TransportistaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Base_de_Datos.TransportistaCriteria.class);
		idEmpleado = new IntegerExpression("idEmpleado", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		id_Transportista = new IntegerExpression("id_Transportista", this.getDetachedCriteria());
		correo_Transportista = new StringExpression("correo_Transportista", this.getDetachedCriteria());
		_Recibido = new CollectionExpression("ORM__Recibido", this.getDetachedCriteria());
		_Enviado = new CollectionExpression("ORM__Enviado", this.getDetachedCriteria());
	}
	
	public Base_de_Datos.RecibidoDetachedCriteria create_RecibidoCriteria() {
		return new Base_de_Datos.RecibidoDetachedCriteria(createCriteria("ORM__Recibido"));
	}
	
	public Base_de_Datos.EnviadoDetachedCriteria create_EnviadoCriteria() {
		return new Base_de_Datos.EnviadoDetachedCriteria(createCriteria("ORM__Enviado"));
	}
	
	public Transportista uniqueTransportista(PersistentSession session) {
		return (Transportista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Transportista[] listTransportista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Transportista[]) list.toArray(new Transportista[list.size()]);
	}
}

