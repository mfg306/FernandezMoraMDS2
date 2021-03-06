package basededatos;

import base_de_datos.Oferta;
import base_de_datos.Pendiente;
import base_de_datos.Producto;
import base_de_datos.Mensaje;
import base_de_datos.Imagen;

import org.orm.PersistentException;

import base_de_datos.Administrador;
import base_de_datos.Categoria;
import base_de_datos.Empleado;
import base_de_datos.Enviado;
import base_de_datos.Recibido;
import base_de_datos.UR;
import base_de_datos.Usuario_General;

public interface iAdministrador {

	public Oferta[] cargarOfertas();

	public Mensaje[] cargarMensajesEnviados(Usuario_General aUsuario) throws PersistentException;

	public Mensaje[] cargarMensajesRecibidos(Usuario_General aUsuario) throws PersistentException;

	public void enviarMensaje(String aCorreoReceptor, String aMensaje, String aAsunto, Usuario_General aEmisor) throws PersistentException;

	public Usuario_General iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException;

	public void guardarImagenesProducto(String aImagenes, Producto aProducto, boolean aEsPrincipal) throws PersistentException;

	public Producto insertarProducto(String aNombreProducto, String aDescripcion, double aPrecio, int aNumUnidades, String[] aRuta) throws PersistentException;

	public Oferta insertarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad, String aFechaRegistro, double[] aPrecios) throws PersistentException;

	public Categoria insertarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaRegistro) throws PersistentException;

	public Categoria actualizarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaActualizacion, Categoria aCategoria) throws PersistentException ;

	public Empleado actualizarEmpleado(int aIdEmpleado, String correo, String contrasenia) throws PersistentException ;

	public Oferta actualizarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad, String aFechaActualizacion, int aIdOferta, double[] aPrecios)  throws PersistentException ;

	public Producto actualizarProducto(int aIdProducto, String aNombre, double aPrecio, String aDescripcion, String[] aRutaImagen, int aNumUnidades)  throws PersistentException;

	public Categoria[] cargarCategoriasAdministrador() throws PersistentException;

	public Empleado[] cargarEmpleados() throws PersistentException;

	public void eliminarEmpleado(int aIdEmpleado) throws PersistentException;

	public void insertarEmpleado(String aContrasenia, String aCorreo, boolean aEsEncargado) throws PersistentException;

	public void eliminarProductoAdministrador(int aIdProducto)  throws PersistentException;

	public Producto[] cargarProductosListado() throws PersistentException;
	
	public Producto[] cargarProductosBusquedaZonaProductos(String aProducto) throws PersistentException;
	
	public boolean eliminarCategoriaAdmin(int aIdCategoria, Producto[] aListaProductos) throws PersistentException;
	
	public boolean eliminarOfertaAdmin(int aIdOferta, Producto[] aListaProductos) throws PersistentException;
	
	public Producto[] cargarProductosCategoriaAdmin(Categoria aCategoria) throws PersistentException ;
	
	public Producto[] cargarProductosOfertaaAdmin(Oferta aOferta) throws PersistentException ;

	public Recibido[] cargarRecibidos() throws PersistentException;
	
	public Enviado[] cargarEnviados() throws PersistentException;
	
	public Pendiente[] cargarPendientes() throws PersistentException;
	
	public UR[] cargarClientes() throws PersistentException;
	
	public boolean responderMensaje(String aCorreoReceptor, String aMensaje, Usuario_General aEmisor, Mensaje mensajeHilo) throws PersistentException;
	
	public Administrador buscarAdmin(String aCorreo) throws PersistentException;
	
	public boolean eliminarImagenProducto(Producto aProducto) throws PersistentException;
	
	public boolean eliminarComentarioProducto(Producto aProducto) throws PersistentException;
	
	public boolean eliminarValoracionesProducto(Producto aProducto) throws PersistentException;
	
	public Oferta[] cargarOfertasAdmin() throws PersistentException;
	
	public void eliminarProductoOriginalOferta(Producto aProducto) throws PersistentException;
	
	public boolean eliminarProductoEnCompra(Producto aProducto) throws PersistentException;
}
