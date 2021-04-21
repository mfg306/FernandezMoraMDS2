package basededatos;

import fernandezmora.interfaz.Oferta_administrador;
import base_de_datos.Producto;
import fernandezmora.interfaz.Empleado;
import fernandezmora.interfaz.Venta;
import fernandezmora.interfaz.Producto_listado_administracion;
import fernandezmora.interfaz.Producto_listado;
import fernandezmora.interfaz.Categoria_administrador;
import fernandezmora.interfaz.Producto_administrador;
import base_de_datos.Imagen;
import fernandezmora.interfaz.Mensaje_enviado;
import fernandezmora.interfaz.Mensaje_recibido;

public interface iAdministrador {

	public Oferta_administrador[] cargarOfertas();

	public Producto[] cargarProductos();

	public Empleado[] cargarEmpleados();

	public Venta[] cargarVentas();

	public void eliminarOfertaAdministrador(int aIdOferta);

	public void eliminarCategoriaAdministrador(int aIdCategoria);

	public void eliminarProductoAdministrador(int aIdProducto);

	public void eliminarEmpleado(int aIdEmpleado);

	public Producto[] cargarProductos(String aProducto);

	public void guardarOferta(String aNombreOferta, Producto[] aListaProductos, int aIdOferta, String aFechaCaducidad, String aFechaRegistro);

	public void guardarCategoria(String aNombreCategoria, Producto[] aListaProductos, int aIdCategoria, String aFechaRegistro);

	public Producto_listado_administracion[] cargarProductosListadoAdministracion();

	public Producto_listado[] cargarProductosListado();

	public Categoria_administrador[] cargarCategoriasAdministrador();

	public Producto_administrador[] cargarProductosAdministrador();

	public void guardarProducto(int aIdProducto, String aNombreProducto, String aDescripcion);

	public void guardarImagenesProducto(int aIdProducto, Imagen[] aImagenes);

	public void guardarEmpleado(int aIdEmpleado, String aNombreUsuario, String aContrasenia, String aCorreo);

	public Mensaje_enviado[] cargarMensajesEnviados(String aCorreoEmisor);

	public Mensaje_recibido[] cargarMensajesRecibidos(String aCorreoReceptor);

	public void enviarMensaje(int aIdMensaje, String aCorreoEmisor, String aCorreoReceptor, String aCodigo, String aMensaje);
}