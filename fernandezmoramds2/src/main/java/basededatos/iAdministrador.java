package basededatos;

import base_de_datos.Oferta;
import base_de_datos.Producto;
import base_de_datos.Mensaje;
import base_de_datos.Imagen;

import org.orm.PersistentException;

import base_de_datos.Categoria;
import base_de_datos.Empleado;
import base_de_datos.Recibido;

public interface iAdministrador {

	public Oferta[] cargarOfertas();

	public Producto[] cargarProductos(String aProducto) throws PersistentException;

	public Mensaje[] cargarMensajesEnviados(String aCorreoEmisor);

	public Mensaje[] cargarMensajesRecibidos(String aCorreoReceptor);

	public void enviarMensaje(String aCorreoEmisor, String aCorreoReceptor, String aCodigo, String aMensaje);

	public int iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException;

	public void guardarImagenesProducto(int aIdProducto, Imagen[] aImagenes);

	public void insertarProducto(String aNombreProducto, String aDescripcion);

	public void insertarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad, String aFechaRegistro);

	public void insertarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaRegistro) throws PersistentException;

	public void actualizarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaActualizacion, int aIdCategoria) throws PersistentException ;

	public void actualizarEmpleado(String aNombreUsuario, String aContrasenia, String aCorreo);

	public void actualizarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad, String aFechaActualizacion);

	public void actualizarProducto(Imagen[] aImagenes, int aIdProducto);

	public Categoria[] cargarCategoriasAdministrador() throws PersistentException;

	public Empleado[] cargarEmpleados();

	public void eliminarEmpleado(int aIdEmpleado);

	public void insertarEmpleado(String aNombreUsuario, String aContrasenia, String aCorreo);

	public void eliminarProductoAdministrador(int aIdProducto);

	public Recibido[] cargarVentas();

	public Producto[] cargarProductosListado() throws PersistentException;
	
	public Producto[] cargarProductosBusquedaZonaProductos(String aProducto) throws PersistentException;
	
	public boolean eliminarCategoriaAdmin(int aIdCategoria);
	
	public boolean eliminarOfertaAdmin(int aIdOferta);
	
}