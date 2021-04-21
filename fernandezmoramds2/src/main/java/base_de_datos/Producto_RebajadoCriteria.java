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

public class Producto_RebajadoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Producto;
	public final IntegerExpression _Valorado_porId;
	public final AssociationExpression _Valorado_por;
	public final IntegerExpression _CategoriaId;
	public final AssociationExpression _Categoria;
	public final DoubleExpression precio_producto;
	public final StringExpression num_Unidades_Vendidas;
	public final IntegerExpression num_Unidades_Restantes;
	public final StringExpression descripcion;
	public final CollectionExpression _Producto_en_compra;
	public final CollectionExpression _Pertenece_a;
	public final CollectionExpression _Imagen;
	public final DoubleExpression precio_rebajado;
	public final IntegerExpression _TieneId;
	public final AssociationExpression _Tiene;
	
	public Producto_RebajadoCriteria(Criteria criteria) {
		super(criteria);
		id_Producto = new IntegerExpression("id_Producto", this);
		_Valorado_porId = new IntegerExpression("_Valorado_por.id_valoracion", this);
		_Valorado_por = new AssociationExpression("_Valorado_por", this);
		_CategoriaId = new IntegerExpression("_Categoria.id_Categoria", this);
		_Categoria = new AssociationExpression("_Categoria", this);
		precio_producto = new DoubleExpression("precio_producto", this);
		num_Unidades_Vendidas = new StringExpression("num_Unidades_Vendidas", this);
		num_Unidades_Restantes = new IntegerExpression("num_Unidades_Restantes", this);
		descripcion = new StringExpression("descripcion", this);
		_Producto_en_compra = new CollectionExpression("ORM__Producto_en_compra", this);
		_Pertenece_a = new CollectionExpression("ORM__Pertenece_a", this);
		_Imagen = new CollectionExpression("ORM__Imagen", this);
		precio_rebajado = new DoubleExpression("precio_rebajado", this);
		_TieneId = new IntegerExpression("_Tiene.id_Oferta", this);
		_Tiene = new AssociationExpression("_Tiene", this);
	}
	
	public Producto_RebajadoCriteria(PersistentSession session) {
		this(session.createCriteria(Producto_Rebajado.class));
	}
	
	public Producto_RebajadoCriteria() throws PersistentException {
		this(base_de_datos.HitoPersistentManager.instance().getSession());
	}
	
	public OfertaCriteria create_TieneCriteria() {
		return new OfertaCriteria(createCriteria("_Tiene"));
	}
	
	public ValoracionCriteria create_Valorado_porCriteria() {
		return new ValoracionCriteria(createCriteria("_Valorado_por"));
	}
	
	public CategoriaCriteria create_CategoriaCriteria() {
		return new CategoriaCriteria(createCriteria("_Categoria"));
	}
	
	public base_de_datos.Producto_en_compraCriteria create_Producto_en_compraCriteria() {
		return new base_de_datos.Producto_en_compraCriteria(createCriteria("ORM__Producto_en_compra"));
	}
	
	public base_de_datos.ComentarioCriteria create_Pertenece_aCriteria() {
		return new base_de_datos.ComentarioCriteria(createCriteria("ORM__Pertenece_a"));
	}
	
	public base_de_datos.ImagenCriteria create_ImagenCriteria() {
		return new base_de_datos.ImagenCriteria(createCriteria("ORM__Imagen"));
	}
	
	public Producto_Rebajado uniqueProducto_Rebajado() {
		return (Producto_Rebajado) super.uniqueResult();
	}
	
	public Producto_Rebajado[] listProducto_Rebajado() {
		java.util.List list = super.list();
		return (Producto_Rebajado[]) list.toArray(new Producto_Rebajado[list.size()]);
	}
}

