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

public class Producto_RebajadoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final DoubleExpression precio_rebajado;
	public final CollectionExpression _Tiene;
	
	public Producto_RebajadoDetachedCriteria() {
		super(base_de_datos.Producto_Rebajado.class, base_de_datos.Producto_RebajadoCriteria.class);
		id_Producto = new IntegerExpression("id_Producto", this.getDetachedCriteria());
		_CategoriaId = new IntegerExpression("_Categoria.id_Categoria", this.getDetachedCriteria());
		_Categoria = new AssociationExpression("_Categoria", this.getDetachedCriteria());
		precio_producto = new DoubleExpression("precio_producto", this.getDetachedCriteria());
		num_Unidades_Vendidas = new StringExpression("num_Unidades_Vendidas", this.getDetachedCriteria());
		num_Unidades_Restantes = new IntegerExpression("num_Unidades_Restantes", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		_Producto_en_compra = new CollectionExpression("ORM__Producto_en_compra", this.getDetachedCriteria());
		_Pertenece_a = new CollectionExpression("ORM__Pertenece_a", this.getDetachedCriteria());
		_Imagen = new CollectionExpression("ORM__Imagen", this.getDetachedCriteria());
		_Valorado_por = new CollectionExpression("ORM__Valorado_por", this.getDetachedCriteria());
		precio_rebajado = new DoubleExpression("precio_rebajado", this.getDetachedCriteria());
		_Tiene = new CollectionExpression("ORM__Tiene", this.getDetachedCriteria());
	}
	
	public Producto_RebajadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.Producto_RebajadoCriteria.class);
		id_Producto = new IntegerExpression("id_Producto", this.getDetachedCriteria());
		_CategoriaId = new IntegerExpression("_Categoria.id_Categoria", this.getDetachedCriteria());
		_Categoria = new AssociationExpression("_Categoria", this.getDetachedCriteria());
		precio_producto = new DoubleExpression("precio_producto", this.getDetachedCriteria());
		num_Unidades_Vendidas = new StringExpression("num_Unidades_Vendidas", this.getDetachedCriteria());
		num_Unidades_Restantes = new IntegerExpression("num_Unidades_Restantes", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		_Producto_en_compra = new CollectionExpression("ORM__Producto_en_compra", this.getDetachedCriteria());
		_Pertenece_a = new CollectionExpression("ORM__Pertenece_a", this.getDetachedCriteria());
		_Imagen = new CollectionExpression("ORM__Imagen", this.getDetachedCriteria());
		_Valorado_por = new CollectionExpression("ORM__Valorado_por", this.getDetachedCriteria());
		precio_rebajado = new DoubleExpression("precio_rebajado", this.getDetachedCriteria());
		_Tiene = new CollectionExpression("ORM__Tiene", this.getDetachedCriteria());
	}
	
	public OfertaDetachedCriteria create_TieneCriteria() {
		return new OfertaDetachedCriteria(createCriteria("ORM__Tiene"));
	}
	
	public CategoriaDetachedCriteria create_CategoriaCriteria() {
		return new CategoriaDetachedCriteria(createCriteria("_Categoria"));
	}
	
	public Producto_en_compraDetachedCriteria create_Producto_en_compraCriteria() {
		return new Producto_en_compraDetachedCriteria(createCriteria("ORM__Producto_en_compra"));
	}
	
	public ComentarioDetachedCriteria create_Pertenece_aCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM__Pertenece_a"));
	}
	
	public ImagenDetachedCriteria create_ImagenCriteria() {
		return new ImagenDetachedCriteria(createCriteria("ORM__Imagen"));
	}
	
	public ValoracionDetachedCriteria create_Valorado_porCriteria() {
		return new ValoracionDetachedCriteria(createCriteria("ORM__Valorado_por"));
	}
	
	public Producto_Rebajado uniqueProducto_Rebajado(PersistentSession session) {
		return (Producto_Rebajado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Producto_Rebajado[] listProducto_Rebajado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Producto_Rebajado[]) list.toArray(new Producto_Rebajado[list.size()]);
	}
}

