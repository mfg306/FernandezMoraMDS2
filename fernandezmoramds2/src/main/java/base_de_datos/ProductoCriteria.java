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

public class ProductoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Producto;
	public final IntegerExpression _CategoriaId;
	public final AssociationExpression _Categoria;
	public final DoubleExpression precio_producto;
	public final StringExpression num_Unidades_Vendidas;
	public final IntegerExpression num_Unidades_Restantes;
	public final StringExpression descripcion;
	public final StringExpression nombre;
	public final CollectionExpression _Producto_en_compra;
	public final CollectionExpression _Pertenece_a;
	public final CollectionExpression _Imagen;
	public final CollectionExpression _Valorado_por;
	
	public ProductoCriteria(Criteria criteria) {
		super(criteria);
		id_Producto = new IntegerExpression("id_Producto", this);
		_CategoriaId = new IntegerExpression("_Categoria.id_Categoria", this);
		_Categoria = new AssociationExpression("_Categoria", this);
		precio_producto = new DoubleExpression("precio_producto", this);
		num_Unidades_Vendidas = new StringExpression("num_Unidades_Vendidas", this);
		num_Unidades_Restantes = new IntegerExpression("num_Unidades_Restantes", this);
		descripcion = new StringExpression("descripcion", this);
		nombre = new StringExpression("nombre", this);
		_Producto_en_compra = new CollectionExpression("ORM__Producto_en_compra", this);
		_Pertenece_a = new CollectionExpression("ORM__Pertenece_a", this);
		_Imagen = new CollectionExpression("ORM__Imagen", this);
		_Valorado_por = new CollectionExpression("ORM__Valorado_por", this);
	}
	
	public ProductoCriteria(PersistentSession session) {
		this(session.createCriteria(Producto.class));
	}
	
	public ProductoCriteria() throws PersistentException {
		this(MDS2PersistentManager.instance().getSession());
	}
	
	public CategoriaCriteria create_CategoriaCriteria() {
		return new CategoriaCriteria(createCriteria("_Categoria"));
	}
	
	public Producto_en_compraCriteria create_Producto_en_compraCriteria() {
		return new Producto_en_compraCriteria(createCriteria("ORM__Producto_en_compra"));
	}
	
	public ComentarioCriteria create_Pertenece_aCriteria() {
		return new ComentarioCriteria(createCriteria("ORM__Pertenece_a"));
	}
	
	public ImagenCriteria create_ImagenCriteria() {
		return new ImagenCriteria(createCriteria("ORM__Imagen"));
	}
	
	public ValoracionCriteria create_Valorado_porCriteria() {
		return new ValoracionCriteria(createCriteria("ORM__Valorado_por"));
	}
	
	public Producto uniqueProducto() {
		return (Producto) super.uniqueResult();
	}
	
	public Producto[] listProducto() {
		java.util.List list = super.list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

