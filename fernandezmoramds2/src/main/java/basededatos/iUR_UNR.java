package basededatos;

import Base_de_Datos.Oferta;
import Base_de_Datos.Producto;
import Base_de_Datos.Categoria;
import Base_de_Datos.Producto_Rebajado;

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