package basededatos;

import Base_de_Datos.Oferta;
import Base_de_Datos.Empleado;
import Base_de_Datos.Recibido;
import Base_de_Datos.Producto;
import Base_de_Datos.Categoria;
import Base_de_Datos.Imagen;
import Base_de_Datos.Mensaje;

public interface iAdministrador {

	public Oferta[] cargarOfertas();

	public Empleado[] cargarEmpleados();

	public Recibido[] cargarVentas();

	public void eliminarOfertaAdministrador(int aIdOferta);

	public void eliminarCategoriaAdministrador(int aIdCategoria);

	public void eliminarProductoAdministrador(int aIdProducto);

	public void eliminarEmpleado(int aIdEmpleado);

	public Producto[] cargarProductos(String aProducto);

	public void insertarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad, String aFechaRegistro);

	public void insertarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaRegistro);

	public Categoria[] cargarCategoriasAdministrador();

	public Producto[] cargarProductosAdministrador();

	public void insertarProducto(String aNombreProducto, String aDescripcion);

	public void guardarImagenesProducto(Imagen[] aImagenes);

	public void insertarEmpleado(String aNombreUsuario, String aContrasenia, String aCorreo);

	public Mensaje[] cargarMensajesEnviados(String aCorreoEmisor);

	public Mensaje[] cargarMensajesRecibidos(String aCorreoReceptor);

	public void enviarMensaje(String aCorreoEmisor, String aCorreoReceptor, String aCodigo, String aMensaje);

	public void iniciarSesion(String aCorreo, String aContrasenia);

	public Producto[] cargarProductosListado();

	public Producto[] cargarProductosAdministracion();

	public void VerZonaProductos();

	public void VerZonaProductosAnadidos();

	public void actualizarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaActualizacion);

	public void actualizarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad, String aFechaActualizacion);

	public void actualizarEmpleado(String aNombreUsuario, String aContrasenia, String aCorreo);

	public void actualizarProducto(String aNombreProducto, String aDescripcion);
}