package basededatos;

import base_de_datos.Oferta;
import base_de_datos.Producto;
import base_de_datos.Categoria;
import base_de_datos.Producto_Rebajado;

public interface iUR_UNR {

	public Oferta[] cargarOfertas();

	public Producto[] cargarProductosMasVendidos();

	public Categoria[] cargarCategorias();

	public Producto[] cargarProductosMasVendidos(String aNombreCategoria);

	public Producto_Rebajado[] cargarProductosOferta(Oferta aOferta);

	public Producto cargarProducto(int aIdProducto);

	public Producto[] cargarProductosCategoria(Categoria aCategoria);

	public Producto[] cargarProductos(String aNombreProducto);
}