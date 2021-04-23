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

public class OfertaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Oferta;
	public final StringExpression nombre_Oferta;
	public final StringExpression fecha_caducidad;
	public final StringExpression fecha_registro;
	public final CollectionExpression _Pertenece_a;
	
	public OfertaCriteria(Criteria criteria) {
		super(criteria);
		id_Oferta = new IntegerExpression("id_Oferta", this);
		nombre_Oferta = new StringExpression("nombre_Oferta", this);
		fecha_caducidad = new StringExpression("fecha_caducidad", this);
		fecha_registro = new StringExpression("fecha_registro", this);
		_Pertenece_a = new CollectionExpression("ORM__Pertenece_a", this);
	}
	
	public OfertaCriteria(PersistentSession session) {
		this(session.createCriteria(Oferta.class));
	}
	
	public OfertaCriteria() throws PersistentException {
		this(base_de_datos.HitoPersistentManager.instance().getSession());
	}
	
	public base_de_datos.Producto_RebajadoCriteria create_Pertenece_aCriteria() {
		return new base_de_datos.Producto_RebajadoCriteria(createCriteria("ORM__Pertenece_a"));
	}
	
	public Oferta uniqueOferta() {
		return (Oferta) super.uniqueResult();
	}
	
	public Oferta[] listOferta() {
		java.util.List list = super.list();
		return (Oferta[]) list.toArray(new Oferta[list.size()]);
	}
}

