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

public class AdministradorCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Usuario;
	public final StringExpression nombre;
	public final StringExpression primer_apellido;
	public final StringExpression segundo_apellido;
	public final StringExpression correo_electronico;
	public final StringExpression contrasenia;
	public final BooleanExpression es_administrador;
	public final CollectionExpression _Envia;
	
	public AdministradorCriteria(Criteria criteria) {
		super(criteria);
		id_Usuario = new IntegerExpression("id_Usuario", this);
		nombre = new StringExpression("nombre", this);
		primer_apellido = new StringExpression("primer_apellido", this);
		segundo_apellido = new StringExpression("segundo_apellido", this);
		correo_electronico = new StringExpression("correo_electronico", this);
		contrasenia = new StringExpression("contrasenia", this);
		es_administrador = new BooleanExpression("es_administrador", this);
		_Envia = new CollectionExpression("ORM__Envia", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public MensajeCriteria create_EnviaCriteria() {
		return new MensajeCriteria(createCriteria("ORM__Envia"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

