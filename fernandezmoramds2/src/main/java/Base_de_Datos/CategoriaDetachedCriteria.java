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

public class CategoriaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_Categoria;
	public final StringExpression nombre_categoria;
	public final StringExpression fecha_registro;
	public final CollectionExpression _Producto;
	
	public CategoriaDetachedCriteria() {
		super(Base_de_Datos.Categoria.class, Base_de_Datos.CategoriaCriteria.class);
		id_Categoria = new IntegerExpression("id_Categoria", this.getDetachedCriteria());
		nombre_categoria = new StringExpression("nombre_categoria", this.getDetachedCriteria());
		fecha_registro = new StringExpression("fecha_registro", this.getDetachedCriteria());
		_Producto = new CollectionExpression("ORM__Producto", this.getDetachedCriteria());
	}
	
	public CategoriaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Base_de_Datos.CategoriaCriteria.class);
		id_Categoria = new IntegerExpression("id_Categoria", this.getDetachedCriteria());
		nombre_categoria = new StringExpression("nombre_categoria", this.getDetachedCriteria());
		fecha_registro = new StringExpression("fecha_registro", this.getDetachedCriteria());
		_Producto = new CollectionExpression("ORM__Producto", this.getDetachedCriteria());
	}
	
	public Base_de_Datos.ProductoDetachedCriteria create_ProductoCriteria() {
		return new Base_de_Datos.ProductoDetachedCriteria(createCriteria("ORM__Producto"));
	}
	
	public Categoria uniqueCategoria(PersistentSession session) {
		return (Categoria) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Categoria[] listCategoria(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Categoria[]) list.toArray(new Categoria[list.size()]);
	}
}

