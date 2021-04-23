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

public class ProductoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ProductoDetachedCriteria() {
		super(base_de_datos.Producto.class, base_de_datos.ProductoCriteria.class);
		id_Producto = new IntegerExpression("id_Producto", this.getDetachedCriteria());
		_Valorado_porId = new IntegerExpression("_Valorado_por.id_valoracion", this.getDetachedCriteria());
		_Valorado_por = new AssociationExpression("_Valorado_por", this.getDetachedCriteria());
		_CategoriaId = new IntegerExpression("_Categoria.id_Categoria", this.getDetachedCriteria());
		_Categoria = new AssociationExpression("_Categoria", this.getDetachedCriteria());
		precio_producto = new DoubleExpression("precio_producto", this.getDetachedCriteria());
		num_Unidades_Vendidas = new StringExpression("num_Unidades_Vendidas", this.getDetachedCriteria());
		num_Unidades_Restantes = new IntegerExpression("num_Unidades_Restantes", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		_Producto_en_compra = new CollectionExpression("ORM__Producto_en_compra", this.getDetachedCriteria());
		_Pertenece_a = new CollectionExpression("ORM__Pertenece_a", this.getDetachedCriteria());
		_Imagen = new CollectionExpression("ORM__Imagen", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.ProductoCriteria.class);
		id_Producto = new IntegerExpression("id_Producto", this.getDetachedCriteria());
		_Valorado_porId = new IntegerExpression("_Valorado_por.id_valoracion", this.getDetachedCriteria());
		_Valorado_por = new AssociationExpression("_Valorado_por", this.getDetachedCriteria());
		_CategoriaId = new IntegerExpression("_Categoria.id_Categoria", this.getDetachedCriteria());
		_Categoria = new AssociationExpression("_Categoria", this.getDetachedCriteria());
		precio_producto = new DoubleExpression("precio_producto", this.getDetachedCriteria());
		num_Unidades_Vendidas = new StringExpression("num_Unidades_Vendidas", this.getDetachedCriteria());
		num_Unidades_Restantes = new IntegerExpression("num_Unidades_Restantes", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		_Producto_en_compra = new CollectionExpression("ORM__Producto_en_compra", this.getDetachedCriteria());
		_Pertenece_a = new CollectionExpression("ORM__Pertenece_a", this.getDetachedCriteria());
		_Imagen = new CollectionExpression("ORM__Imagen", this.getDetachedCriteria());
	}
	
	public ValoracionDetachedCriteria create_Valorado_porCriteria() {
		return new ValoracionDetachedCriteria(createCriteria("_Valorado_por"));
	}
	
	public CategoriaDetachedCriteria create_CategoriaCriteria() {
		return new CategoriaDetachedCriteria(createCriteria("_Categoria"));
	}
	
	public base_de_datos.Producto_en_compraDetachedCriteria create_Producto_en_compraCriteria() {
		return new base_de_datos.Producto_en_compraDetachedCriteria(createCriteria("ORM__Producto_en_compra"));
	}
	
	public base_de_datos.ComentarioDetachedCriteria create_Pertenece_aCriteria() {
		return new base_de_datos.ComentarioDetachedCriteria(createCriteria("ORM__Pertenece_a"));
	}
	
	public base_de_datos.ImagenDetachedCriteria create_ImagenCriteria() {
		return new base_de_datos.ImagenDetachedCriteria(createCriteria("ORM__Imagen"));
	}
	
	public Producto uniqueProducto(PersistentSession session) {
		return (Producto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Producto[] listProducto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

