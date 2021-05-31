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

public class OfertaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_Oferta;
	public final StringExpression nombre_Oferta;
	public final StringExpression fecha_caducidad;
	public final StringExpression fecha_registro;
	public final CollectionExpression _Pertenece_a;
	
	public OfertaDetachedCriteria() {
		super(base_de_datos.Oferta.class, base_de_datos.OfertaCriteria.class);
		id_Oferta = new IntegerExpression("id_Oferta", this.getDetachedCriteria());
		nombre_Oferta = new StringExpression("nombre_Oferta", this.getDetachedCriteria());
		fecha_caducidad = new StringExpression("fecha_caducidad", this.getDetachedCriteria());
		fecha_registro = new StringExpression("fecha_registro", this.getDetachedCriteria());
		_Pertenece_a = new CollectionExpression("ORM__Pertenece_a", this.getDetachedCriteria());
	}
	
	public OfertaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.OfertaCriteria.class);
		id_Oferta = new IntegerExpression("id_Oferta", this.getDetachedCriteria());
		nombre_Oferta = new StringExpression("nombre_Oferta", this.getDetachedCriteria());
		fecha_caducidad = new StringExpression("fecha_caducidad", this.getDetachedCriteria());
		fecha_registro = new StringExpression("fecha_registro", this.getDetachedCriteria());
		_Pertenece_a = new CollectionExpression("ORM__Pertenece_a", this.getDetachedCriteria());
	}
	
	public Producto_RebajadoDetachedCriteria create_Pertenece_aCriteria() {
		return new Producto_RebajadoDetachedCriteria(createCriteria("ORM__Pertenece_a"));
	}
	
	public Oferta uniqueOferta(PersistentSession session) {
		return (Oferta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Oferta[] listOferta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Oferta[]) list.toArray(new Oferta[list.size()]);
	}
}

