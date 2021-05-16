package basededatos;

import base_de_datos.Oferta;
import base_de_datos.Producto;

import org.orm.PersistentException;

import base_de_datos.Categoria;
import base_de_datos.Comentario;
import base_de_datos.Producto_Rebajado;
import base_de_datos.Valoracion;

public interface iUR_UNR {

	public Oferta[] cargarOfertas();

	public Producto[] cargarProductosMasVendidos();

	public Categoria[] cargarCategorias();

	public Producto[] cargarProductosMasVendidos(String aNombreCategoria);

	public Producto_Rebajado[] cargarProductosOferta(Oferta aOferta) throws PersistentException;

	public Producto cargarProducto(int aIdProducto);

	public Producto[] cargarProductosCategoria(Categoria aCategoria);

	public Comentario[] cargarComentarios(int aIdProducto) throws PersistentException;
	
	public Valoracion[] cargarValoraciones(int aIdProducto) throws PersistentException;
	
	public Producto[] cargarProductos(String aProducto) throws PersistentException;
	
	public Producto[] cargarProductosPorCategoria(String aNombreCategoria,String aNombreProducto) throws PersistentException;
		
	
}
