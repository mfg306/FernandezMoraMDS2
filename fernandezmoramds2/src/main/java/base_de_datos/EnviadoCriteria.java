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
package base_de_datos;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EnviadoCriteria extends AbstractORMCriteria {
	public final IntegerExpression codigo;
	public final IntegerExpression num_total_unidades;
	public final DoubleExpression precio_total;
	public final StringExpression fecha_estado;
	public final IntegerExpression id_Cola;
	public final IntegerExpression _TransportistaId;
	public final AssociationExpression _Transportista;
	public final IntegerExpression _ProcesaId;
	public final AssociationExpression _Procesa;
	
	public EnviadoCriteria(Criteria criteria) {
		super(criteria);
		codigo = new IntegerExpression("codigo", this);
		num_total_unidades = new IntegerExpression("num_total_unidades", this);
		precio_total = new DoubleExpression("precio_total", this);
		fecha_estado = new StringExpression("fecha_estado", this);
		id_Cola = new IntegerExpression("id_Cola", this);
		_TransportistaId = new IntegerExpression("_Transportista.", this);
		_Transportista = new AssociationExpression("_Transportista", this);
		_ProcesaId = new IntegerExpression("_Procesa.", this);
		_Procesa = new AssociationExpression("_Procesa", this);
	}
	
	public EnviadoCriteria(PersistentSession session) {
		this(session.createCriteria(Enviado.class));
	}
	
	public EnviadoCriteria() throws PersistentException {
		this(base_de_datos.HitoPersistentManager.instance().getSession());
	}
	
	public TransportistaCriteria create_TransportistaCriteria() {
		return new TransportistaCriteria(createCriteria("_Transportista"));
	}
	
	public Encargado_de_comprasCriteria create_ProcesaCriteria() {
		return new Encargado_de_comprasCriteria(createCriteria("_Procesa"));
	}
	
	public Enviado uniqueEnviado() {
		return (Enviado) super.uniqueResult();
	}
	
	public Enviado[] listEnviado() {
		java.util.List list = super.list();
		return (Enviado[]) list.toArray(new Enviado[list.size()]);
	}
}

