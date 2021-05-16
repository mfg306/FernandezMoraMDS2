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

public class URCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Usuario;
	public final StringExpression nombre;
	public final StringExpression primer_apellido;
	public final StringExpression segundo_apellido;
	public final StringExpression correo_electronico;
	public final StringExpression contrasenia;
	public final BooleanExpression es_administrador;
	public final StringExpression direccion_envio;
	public final StringExpression metodo_pago;
	public final StringExpression nombre_usuario;
	public final BooleanExpression esta_operativo;
	public final CollectionExpression _Es_de_un;
	public final CollectionExpression _Compra;
	public final CollectionExpression _recibido;
	public final CollectionExpression _Envia;
	public final CollectionExpression _Valora;
	public final IntegerExpression imagenId;
	public final AssociationExpression imagen;
	
	public URCriteria(Criteria criteria) {
		super(criteria);
		id_Usuario = new IntegerExpression("id_Usuario", this);
		nombre = new StringExpression("nombre", this);
		primer_apellido = new StringExpression("primer_apellido", this);
		segundo_apellido = new StringExpression("segundo_apellido", this);
		correo_electronico = new StringExpression("correo_electronico", this);
		contrasenia = new StringExpression("contrasenia", this);
		es_administrador = new BooleanExpression("es_administrador", this);
		direccion_envio = new StringExpression("direccion_envio", this);
		metodo_pago = new StringExpression("metodo_pago", this);
		nombre_usuario = new StringExpression("nombre_usuario", this);
		esta_operativo = new BooleanExpression("esta_operativo", this);
		_Es_de_un = new CollectionExpression("ORM__Es_de_un", this);
		_Compra = new CollectionExpression("ORM__Compra", this);
		_recibido = new CollectionExpression("ORM__recibido", this);
		_Envia = new CollectionExpression("ORM__Envia", this);
		_Valora = new CollectionExpression("ORM__Valora", this);
		imagenId = new IntegerExpression("imagen.", this);
		imagen = new AssociationExpression("imagen", this);
	}
	
	public URCriteria(PersistentSession session) {
		this(session.createCriteria(UR.class));
	}
	
	public URCriteria() throws PersistentException {
		this(base_de_datos.HitoPersistentManager.instance().getSession());
	}
	
	public base_de_datos.ComentarioCriteria create_Es_de_unCriteria() {
		return new base_de_datos.ComentarioCriteria(createCriteria("ORM__Es_de_un"));
	}
	
	public base_de_datos.PendienteCriteria create_CompraCriteria() {
		return new base_de_datos.PendienteCriteria(createCriteria("ORM__Compra"));
	}
	
	public base_de_datos.RecibidoCriteria create_recibidoCriteria() {
		return new base_de_datos.RecibidoCriteria(createCriteria("ORM__recibido"));
	}
	
	public base_de_datos.MensajeCriteria create_EnviaCriteria() {
		return new base_de_datos.MensajeCriteria(createCriteria("ORM__Envia"));
	}
	
	public base_de_datos.ValoracionCriteria create_ValoraCriteria() {
		return new base_de_datos.ValoracionCriteria(createCriteria("ORM__Valora"));
	}
	
	public ImagenCriteria createImagenCriteria() {
		return new ImagenCriteria(createCriteria("imagen"));
	}
	
	public UR uniqueUR() {
		return (UR) super.uniqueResult();
	}
	
	public UR[] listUR() {
		java.util.List list = super.list();
		return (UR[]) list.toArray(new UR[list.size()]);
	}
}

