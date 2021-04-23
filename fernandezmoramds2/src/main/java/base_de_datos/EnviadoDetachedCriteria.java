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

public class EnviadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression codigo;
	public final IntegerExpression num_total_unidades;
	public final DoubleExpression precio_total;
	public final StringExpression fecha_estado;
	public final IntegerExpression id_Cola;
	public final IntegerExpression _TransportistaId;
	public final AssociationExpression _Transportista;
	public final IntegerExpression _ProcesaId;
	public final AssociationExpression _Procesa;
	
	public EnviadoDetachedCriteria() {
		super(base_de_datos.Enviado.class, base_de_datos.EnviadoCriteria.class);
		codigo = new IntegerExpression("codigo", this.getDetachedCriteria());
		num_total_unidades = new IntegerExpression("num_total_unidades", this.getDetachedCriteria());
		precio_total = new DoubleExpression("precio_total", this.getDetachedCriteria());
		fecha_estado = new StringExpression("fecha_estado", this.getDetachedCriteria());
		id_Cola = new IntegerExpression("id_Cola", this.getDetachedCriteria());
		_TransportistaId = new IntegerExpression("_Transportista.", this.getDetachedCriteria());
		_Transportista = new AssociationExpression("_Transportista", this.getDetachedCriteria());
		_ProcesaId = new IntegerExpression("_Procesa.", this.getDetachedCriteria());
		_Procesa = new AssociationExpression("_Procesa", this.getDetachedCriteria());
	}
	
	public EnviadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.EnviadoCriteria.class);
		codigo = new IntegerExpression("codigo", this.getDetachedCriteria());
		num_total_unidades = new IntegerExpression("num_total_unidades", this.getDetachedCriteria());
		precio_total = new DoubleExpression("precio_total", this.getDetachedCriteria());
		fecha_estado = new StringExpression("fecha_estado", this.getDetachedCriteria());
		id_Cola = new IntegerExpression("id_Cola", this.getDetachedCriteria());
		_TransportistaId = new IntegerExpression("_Transportista.", this.getDetachedCriteria());
		_Transportista = new AssociationExpression("_Transportista", this.getDetachedCriteria());
		_ProcesaId = new IntegerExpression("_Procesa.", this.getDetachedCriteria());
		_Procesa = new AssociationExpression("_Procesa", this.getDetachedCriteria());
	}
	
	public TransportistaDetachedCriteria create_TransportistaCriteria() {
		return new TransportistaDetachedCriteria(createCriteria("_Transportista"));
	}
	
	public Encargado_de_comprasDetachedCriteria create_ProcesaCriteria() {
		return new Encargado_de_comprasDetachedCriteria(createCriteria("_Procesa"));
	}
	
	public Enviado uniqueEnviado(PersistentSession session) {
		return (Enviado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Enviado[] listEnviado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Enviado[]) list.toArray(new Enviado[list.size()]);
	}
}

