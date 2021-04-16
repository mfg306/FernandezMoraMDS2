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

public class Usuario_GeneralDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_Usuario;
	public final StringExpression nombre;
	public final StringExpression primer_apellido;
	public final StringExpression segundo_apellido;
	public final StringExpression correo_electronico;
	public final StringExpression contrasenia;
	public final BooleanExpression es_administrador;
	
	public Usuario_GeneralDetachedCriteria() {
		super(Base_de_Datos.Usuario_General.class, Base_de_Datos.Usuario_GeneralCriteria.class);
		id_Usuario = new IntegerExpression("id_Usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		primer_apellido = new StringExpression("primer_apellido", this.getDetachedCriteria());
		segundo_apellido = new StringExpression("segundo_apellido", this.getDetachedCriteria());
		correo_electronico = new StringExpression("correo_electronico", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		es_administrador = new BooleanExpression("es_administrador", this.getDetachedCriteria());
	}
	
	public Usuario_GeneralDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Base_de_Datos.Usuario_GeneralCriteria.class);
		id_Usuario = new IntegerExpression("id_Usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		primer_apellido = new StringExpression("primer_apellido", this.getDetachedCriteria());
		segundo_apellido = new StringExpression("segundo_apellido", this.getDetachedCriteria());
		correo_electronico = new StringExpression("correo_electronico", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		es_administrador = new BooleanExpression("es_administrador", this.getDetachedCriteria());
	}
	
	public Usuario_General uniqueUsuario_General(PersistentSession session) {
		return (Usuario_General) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_General[] listUsuario_General(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_General[]) list.toArray(new Usuario_General[list.size()]);
	}
}

