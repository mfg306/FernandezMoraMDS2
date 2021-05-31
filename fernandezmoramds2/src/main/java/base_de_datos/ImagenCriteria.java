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

public class ImagenCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression uRId;
	public final AssociationExpression uR;
	public final IntegerExpression _ProductoId;
	public final AssociationExpression _Producto;
	public final StringExpression ruta;
	public final BooleanExpression principal;
	
	public ImagenCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		uRId = new IntegerExpression("uR.", this);
		uR = new AssociationExpression("uR", this);
		_ProductoId = new IntegerExpression("_Producto.id_Producto", this);
		_Producto = new AssociationExpression("_Producto", this);
		ruta = new StringExpression("ruta", this);
		principal = new BooleanExpression("principal", this);
	}
	
	public ImagenCriteria(PersistentSession session) {
		this(session.createCriteria(Imagen.class));
	}
	
	public ImagenCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public URCriteria createURCriteria() {
		return new URCriteria(createCriteria("uR"));
	}
	
	public ProductoCriteria create_ProductoCriteria() {
		return new ProductoCriteria(createCriteria("_Producto"));
	}
	
	public Imagen uniqueImagen() {
		return (Imagen) super.uniqueResult();
	}
	
	public Imagen[] listImagen() {
		java.util.List list = super.list();
		return (Imagen[]) list.toArray(new Imagen[list.size()]);
	}
}

