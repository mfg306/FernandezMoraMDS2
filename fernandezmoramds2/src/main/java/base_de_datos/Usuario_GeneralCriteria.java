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

public class Usuario_GeneralCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Usuario;
	public final StringExpression nombre;
	public final StringExpression primer_apellido;
	public final StringExpression segundo_apellido;
	public final StringExpression correo_electronico;
	public final StringExpression contrasenia;
	public final BooleanExpression es_administrador;
	
	public Usuario_GeneralCriteria(Criteria criteria) {
		super(criteria);
		id_Usuario = new IntegerExpression("id_Usuario", this);
		nombre = new StringExpression("nombre", this);
		primer_apellido = new StringExpression("primer_apellido", this);
		segundo_apellido = new StringExpression("segundo_apellido", this);
		correo_electronico = new StringExpression("correo_electronico", this);
		contrasenia = new StringExpression("contrasenia", this);
		es_administrador = new BooleanExpression("es_administrador", this);
	}
	
	public Usuario_GeneralCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario_General.class));
	}
	
	public Usuario_GeneralCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public Usuario_General uniqueUsuario_General() {
		return (Usuario_General) super.uniqueResult();
	}
	
	public Usuario_General[] listUsuario_General() {
		java.util.List list = super.list();
		return (Usuario_General[]) list.toArray(new Usuario_General[list.size()]);
	}
}

