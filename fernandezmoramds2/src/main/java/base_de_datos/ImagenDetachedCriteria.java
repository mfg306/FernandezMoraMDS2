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

public class ImagenDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression uRId;
	public final AssociationExpression uR;
	public final IntegerExpression _ProductoId;
	public final AssociationExpression _Producto;
	public final StringExpression ruta;
	public final BooleanExpression principal;
	
	public ImagenDetachedCriteria() {
		super(base_de_datos.Imagen.class, base_de_datos.ImagenCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		uRId = new IntegerExpression("uR.", this.getDetachedCriteria());
		uR = new AssociationExpression("uR", this.getDetachedCriteria());
		_ProductoId = new IntegerExpression("_Producto.id_Producto", this.getDetachedCriteria());
		_Producto = new AssociationExpression("_Producto", this.getDetachedCriteria());
		ruta = new StringExpression("ruta", this.getDetachedCriteria());
		principal = new BooleanExpression("principal", this.getDetachedCriteria());
	}
	
	public ImagenDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.ImagenCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		uRId = new IntegerExpression("uR.", this.getDetachedCriteria());
		uR = new AssociationExpression("uR", this.getDetachedCriteria());
		_ProductoId = new IntegerExpression("_Producto.id_Producto", this.getDetachedCriteria());
		_Producto = new AssociationExpression("_Producto", this.getDetachedCriteria());
		ruta = new StringExpression("ruta", this.getDetachedCriteria());
		principal = new BooleanExpression("principal", this.getDetachedCriteria());
	}
	
	public URDetachedCriteria createURCriteria() {
		return new URDetachedCriteria(createCriteria("uR"));
	}
	
	public ProductoDetachedCriteria create_ProductoCriteria() {
		return new ProductoDetachedCriteria(createCriteria("_Producto"));
	}
	
	public Imagen uniqueImagen(PersistentSession session) {
		return (Imagen) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Imagen[] listImagen(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Imagen[]) list.toArray(new Imagen[list.size()]);
	}
}

