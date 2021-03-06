package basededatos;

import base_de_datos.BD_UR;


import java.util.List;

import org.orm.PersistentException;

import base_de_datos.Administrador;
import base_de_datos.BD_Administrador;
import base_de_datos.BD_Categorias;
import base_de_datos.BD_Productos;
import base_de_datos.BD_Ofertas;
import base_de_datos.BD_Productos_Rebajados;
import base_de_datos.BD_Transportistas;
import base_de_datos.BD_Encargados_de_compras;
import base_de_datos.BD_Comentarios;
import base_de_datos.DB_Imagen;
import base_de_datos.BD_Enviado;
import base_de_datos.BD_Recibido;
import base_de_datos.BD_Pendiente;
import base_de_datos.BD_Mensajes;
import base_de_datos.BD_Productos_en_compra;
import base_de_datos.BD_Valoracion;
import base_de_datos.BD_Empleados;
import base_de_datos.Oferta;
import base_de_datos.Producto;
import base_de_datos.Categoria;
import base_de_datos.Comentario;
import base_de_datos.Producto_Rebajado;
import base_de_datos.Producto_en_compra;
import base_de_datos.Compra;
import base_de_datos.UR;
import base_de_datos.Usuario_General;
import base_de_datos.Valoracion;
import base_de_datos.Mensaje;
import base_de_datos.Enviado;
import base_de_datos.Pendiente;
import base_de_datos.Imagen;
import base_de_datos.Empleado;
import base_de_datos.Encargado_de_compras;
import base_de_datos.Recibido;
import base_de_datos.Transportista;

public class BDPrincipal implements iUR_UNR, iUR, iGestor_Banco, iUNR_, iGestor_Correos, iTransportista_Encargado_NR,
		iTransportista, iEncargado_de_compras, iAdministrador {
	public BD_UR _bD_UNR = new BD_UR();
	public BD_Administrador _bD_Administrador = new BD_Administrador();
	public BD_Categorias _bD_Categorias = new BD_Categorias();
	public BD_Productos _bD_Productos = new BD_Productos();
	public BD_Ofertas _bD_Ofertas = new BD_Ofertas();
	public BD_Productos_Rebajados _bD_Productos_Rebajados = new BD_Productos_Rebajados();
	public BD_Transportistas _bD_Transportistas = new BD_Transportistas();
	public BD_Encargados_de_compras _bD_Encargados_de_compras = new BD_Encargados_de_compras();
	public BD_Comentarios _bD_Comentarios = new BD_Comentarios();
	public DB_Imagen _dB_Imagen = new DB_Imagen();
	public BD_Enviado _bD_Enviado = new BD_Enviado();
	public BD_Recibido _bD_Recibido = new BD_Recibido();
	public BD_Pendiente _bD_Pendiente = new BD_Pendiente();
	public BD_Mensajes _bD_Mensajes = new BD_Mensajes();
	public BD_Productos_en_compra _bD_Productos_en_compra = new BD_Productos_en_compra();
	public BD_Valoracion _bD_Valoracion = new BD_Valoracion();
	public BD_Empleados _bD_Empleados = new BD_Empleados();

	public Oferta[] cargarOfertas() {
		Oferta[] ofs = null;
		try {
			ofs = this._bD_Ofertas.cargarOfertas();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return ofs;
	}

	public Categoria[] cargarCategorias() {
		Categoria[] cts = null;
		try {
			cts = this._bD_Categorias.cargarCategorias();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return cts;
	}
	
	public UR buscarUsuarioPorCorreo(String aCorreo) throws PersistentException {
		return this._bD_UNR.buscarUsuarioPorCorreo(aCorreo);
	}
			
	public void cambiarContraseniaUsuario(String aCorreo, String aContrasenia) throws PersistentException {
		this._bD_UNR.cambiarContraseniaUsuario(aCorreo, aContrasenia);
	}

	public Producto[] cargarProductosMasVendidos(String aNombreCategoria) throws PersistentException {
		return this._bD_Productos.cargarProductosMasVendidos(aNombreCategoria);
	}

	public Producto_Rebajado[] cargarProductosOferta(Oferta aOferta) throws PersistentException {
		return this._bD_Productos_Rebajados.cargarProductos(aOferta);
	}

	public Producto cargarProducto(int aIdProducto) {
		Producto ps = null;
		try {
			ps = this._bD_Productos.cargarProducto(aIdProducto);
		} catch (PersistentException e) {
			e.printStackTrace();
		}

		return ps;
	}
	
	public Comentario[] cargarComentarios(int aIdProducto) throws PersistentException {
		return this._bD_Comentarios.cargarComentarios(aIdProducto);
		
	}
	
	public Valoracion[] cargarValoraciones(int aIdProducto) throws PersistentException {
		return this._bD_Valoracion.cargarValoraciones(aIdProducto);
		
	}

	public Producto[] cargarProductosCategoria(Categoria aCategoria) {
		Producto[] cts = null;
		try {
			cts = this._bD_Productos.cargarProductosCategoria(aCategoria);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return cts;
	}


	public void actualizarDatosCompra(String aDireccionEnvio, String aMetodoPago, UR aUsuario) throws PersistentException{
		this._bD_UNR.actualizarDatosCompra(aDireccionEnvio, aMetodoPago, aUsuario);
	}

	public Mensaje[] cargarMensajesEnviados(Usuario_General aUsuario) throws PersistentException {
		return this._bD_Mensajes.cargarMensajesEnviados(aUsuario);
	}

	public Mensaje[] cargarMensajesRecibidos(Usuario_General aUsuario) throws PersistentException {
		return this._bD_Mensajes.cargarMensajesRecibidos(aUsuario);
	}

	public void enviarMensaje(String aCorreoReceptor, String aMensaje, String aAsunto, Usuario_General aEmisor) throws PersistentException {
		this._bD_Mensajes.enviarMensaje(aCorreoReceptor, aMensaje, aAsunto, aEmisor);
	}

	public int registrarse(String aNombre, String aPrimerApellido, String aSegundoApellido, String aCorreo, String aNombreUsuario,
			String aContrasenia, Object aContraseniaRepeticion) throws PersistentException {
		int registrado = 0;
		try {
			registrado = this._bD_UNR.registrarse(aNombre,aPrimerApellido,aSegundoApellido, aCorreo, aNombreUsuario, aContrasenia,
					aContrasenia);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return registrado;
	}

	public Usuario_General iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException {
		Usuario_General resultado = null;
		try {
			resultado = this._bD_UNR.iniciarSesion(aCorreo, aContrasenia);
			if(resultado == null) resultado = this._bD_Administrador.iniciarSesion(aCorreo, aContrasenia);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}

	public Empleado iniciarSesionEmpleados(String aCampo, String aPassword) {
		Empleado resultado = null;

		try {
			resultado = this._bD_Transportistas.iniciarSesionEmpleados(aCampo, aPassword);
			if (resultado == null) 	resultado = this._bD_Encargados_de_compras.iniciarSesionEmpleados(aCampo, aPassword);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultado;

	}

	public Enviado[] cargarPedidosT(Transportista aTransportista) throws PersistentException {
		return this._bD_Enviado.cargarPedidosT(aTransportista);
	}

	public Pendiente[] cargarPedidosPendientes(int aIdEncargado) {
		throw new UnsupportedOperationException();
	}

	public void asignarPedidoTransportista(Pendiente aPedidoPendiente, Encargado_de_compras aEncargado) throws PersistentException {
		this._bD_Enviado.asignarPedidoTransportista(aPedidoPendiente, aEncargado);
	}

	public Pendiente[] cargarPedidosE(int aIdEncargado) throws PersistentException {
		return this._bD_Pendiente.cargarPedidosE(aIdEncargado);
	}

	public void guardarImagenesProducto(String aImagenes, Producto aProducto, boolean aEsPrincipal) throws PersistentException {
		this._dB_Imagen.guardarImagenesProducto(aImagenes, aProducto, aEsPrincipal);
	}

	public Producto insertarProducto(String aNombreProducto, String aDescripcion, double aPrecio, int aNumUnidades, String[] aRuta)
			throws PersistentException {
		return this._bD_Productos.insertarProducto(aNombreProducto, aDescripcion, aPrecio, aNumUnidades, aRuta);
	}

	public Oferta insertarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad,
			String aFechaRegistro, double[] aPrecios) throws PersistentException {
		return this._bD_Ofertas.insertarOferta(aNombreOferta, aListaProductos, aFechaCaducidad, aFechaRegistro, aPrecios);
	}

	public Categoria insertarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaRegistro)
			throws PersistentException {
		return this._bD_Categorias.insertarCategoria(aNombreCategoria, aListaProductos, aFechaRegistro);
	}

	public Categoria actualizarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaActualizacion,
			Categoria aCategoria) throws PersistentException {
		return this._bD_Categorias.actualizarCategoria(aNombreCategoria, aListaProductos, aFechaActualizacion, aCategoria);
	}

	public Empleado actualizarEmpleado(int aIdEmpleado, String correo, String contrasenia) throws PersistentException {
		return this._bD_Empleados.actualizarEmpleado(aIdEmpleado, correo, contrasenia);
	}

	public Oferta actualizarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad,
			String aFechaActualizacion, int aIdOferta, double[] aPrecios) throws PersistentException {
		return this._bD_Ofertas.actualizarOferta(aNombreOferta, aListaProductos, aFechaCaducidad, aFechaActualizacion,
				aIdOferta, aPrecios);
	}

	public Producto actualizarProducto(int aIdProducto, String aNombre, double aPrecio, String aDescripcion, String[] aRutaImagen,int aNumUnidades) throws PersistentException  {
		return this._bD_Productos.actualizarProducto(aIdProducto, aNombre, aPrecio, aDescripcion, aRutaImagen, aNumUnidades);
	}

	public Categoria[] cargarCategoriasAdministrador() throws PersistentException {
		return _bD_Categorias.cargarCategoriasAdministrador();
	}

	public Empleado[] cargarEmpleados() throws PersistentException {
		return this._bD_Empleados.cargarEmpleados();
	}

	public void eliminarEmpleado(int aIdEmpleado) throws PersistentException {
		this._bD_Empleados.eliminarEmpleado(aIdEmpleado);
	}

	public void insertarEmpleado(String aContrasenia, String aCorreo, boolean aEsEncargado) throws PersistentException {
		this._bD_Empleados.insertarEmpleado(aContrasenia, aCorreo, aEsEncargado);
	}

	public void eliminarProductoAdministrador(int aIdProducto) throws PersistentException {
		this._bD_Productos.eliminarProductoAdministrador(aIdProducto);
	}
	
	public void eliminarProductoOriginalOferta(Producto aProducto) throws PersistentException {
		this._bD_Productos.eliminarProductoOriginalOferta(aProducto);
	}

	public Producto[] cargarProductosListado() throws PersistentException {
		return this._bD_Productos.cargarProductosListado();
	}

	public boolean comentar(String aComentario, int aIdProducto, int aIdUsuario) throws PersistentException {
		return this._bD_Comentarios.comentar(aComentario, aIdProducto, aIdUsuario);
	}

	@Override
	public Producto[] cargarProductosBusquedaZonaProductos(String aProducto) throws PersistentException {
		return this._bD_Productos.cargarProductosBusquedaZonaProductos(aProducto);
	}

	@Override
	public boolean eliminarCategoriaAdmin(int aIdCategoria, Producto[] aListaProductos) throws PersistentException {
		return this._bD_Categorias.eliminarCategoriaAdmin(aIdCategoria, aListaProductos);
	}

	@Override
	public boolean eliminarOfertaAdmin(int aIdOferta, Producto[] aListaProductos) throws PersistentException {
		return this._bD_Ofertas.eliminarOfertaAdmin(aIdOferta, aListaProductos);
	}

	@Override
	public Producto[] cargarProductosCategoriaAdmin(Categoria aCategoria) throws PersistentException {
		return this._bD_Productos.cargarProductosCategoria(aCategoria);
	}

	@Override
	public Producto[] cargarProductosOfertaaAdmin(Oferta aOferta) throws PersistentException {
		return this._bD_Productos.cargarProductosOferta(aOferta);
	}

	public boolean valorar(int aIdProducto, int aIdUsuario, String aValoracion) throws PersistentException {
		return this._bD_Valoracion.valorar(aIdProducto, aIdUsuario, aValoracion);

	}

	@Override
	public Recibido[] cargarRecibidos() throws PersistentException {
		return this._bD_Recibido.cargarRecibidos();
	}

	@Override
	public Enviado[] cargarEnviados() throws PersistentException {
		return this._bD_Enviado.cargarEnviados();
	}

	@Override
	public Pendiente[] cargarPendientes() throws PersistentException {
		return this._bD_Pendiente.cargarPendientes();
	}
	
	public UR[] cargarClientes() throws PersistentException{
		return this._bD_UNR.cargarClientes();
	}
	
	public void cambiarDatosUsuario(String aNombreUsuario, String aNombre, String aPrimerApellido, String aSegundoApellido, String aCorreo, String aDireccion, 
			String aMetodoDePago, String aRutaFoto) throws PersistentException {
		this._bD_UNR.cambiarDatosUsuario(aNombreUsuario, aNombre, aPrimerApellido,aSegundoApellido, aCorreo, aDireccion, aMetodoDePago, aRutaFoto);
	}
	
	public void eliminarUsuario(String aCorreo) throws PersistentException {
		this._bD_UNR.eliminarUsuario(aCorreo);
	}

	public void actualizarContrasenia(UR aUr ,String aNuevaContrasenia) throws PersistentException {
		this._bD_UNR.actualizarContrasenia(aUr,aNuevaContrasenia);
	}
	
	public boolean responderMensaje(String aCorreoReceptor, String aMensaje, Usuario_General aEmisor, Mensaje mensajeHilo) throws PersistentException {
		return this._bD_Mensajes.responderMensaje(aCorreoReceptor, aMensaje, aEmisor, mensajeHilo);
	}

	@Override
	public Administrador buscarAdmin(String aCorreo) throws PersistentException {
		return this._bD_Administrador.buscarAdmin(aCorreo);
	}

	@Override
	public boolean eliminarPendiente(Pendiente aPedidoPendiente, Enviado aEnviado) throws PersistentException {
		return this._bD_Pendiente.eliminarPendiente(aPedidoPendiente, aEnviado);
	}

	@Override
	public boolean eliminarProductosEnCompra(Pendiente aPendiente) throws PersistentException {
		return this._bD_Productos_en_compra.eliminarProductosEnCompra(aPendiente);
	}

	@Override
	public UR cargarClienteEnviado(Transportista aTransportista, Enviado aEnviado) throws PersistentException {
		return this._bD_Enviado.cargarClienteEnviado(aTransportista, aEnviado);
	}

	@Override
	public boolean repartirACliente(UR aCliente, Enviado aEnviado) throws PersistentException {
		return this._bD_Recibido.repartirACliente(aCliente, aEnviado);
	}
			
	public Producto[] cargarProductosPorCategoria(String aNombreCategoria,String aNombreProducto) throws PersistentException {
		return this._bD_Productos.cargarProductosPorCategoria(aNombreCategoria, aNombreProducto);
	}
	
	public boolean eliminarImagenProducto(Producto aProducto) throws PersistentException{
		return this._dB_Imagen.eliminarImagenProducto(aProducto);
	}

	@Override
	public boolean eliminarComentarioProducto(Producto aProducto) throws PersistentException {
		return this._bD_Comentarios.eliminarComentarioProducto(aProducto);
	}

	@Override
	public boolean eliminarValoracionesProducto(Producto aProducto) throws PersistentException {
		return this._bD_Valoracion.eliminarValoracionesProducto(aProducto);
	}

	@Override
	public boolean eliminarEnviado(Enviado aEnviado) throws PersistentException {
		return this._bD_Enviado.eliminarEnviado(aEnviado);
	}

	@Override
	public Producto_Rebajado cargarProductoRebajado(Producto aProducto) throws PersistentException {
		return this._bD_Productos_Rebajados.cargarProductoRebajado(aProducto);
	}

	@Override
	public void realizarCompra(Producto[] aProductos, UR aUsuario, int[] aUnidades) throws PersistentException {
		this._bD_Pendiente.realizarCompra(aProductos, aUsuario, aUnidades);
		
	}

	@Override
	public Producto_en_compra[] cargarProductosEnCompra(int aIdEnviado) throws PersistentException {
		return this._bD_Productos_en_compra.cargarProductosEnCompra(aIdEnviado);
	}

	@Override
	public Enviado[] cargarEnviados(UR aUsuario) throws PersistentException {
		return this._bD_Enviado.cargarEnviados(aUsuario);
	}

	@Override
	public Recibido[] cargarRecibidos(UR aUsuario) {
		return this._bD_Recibido.cargarRecibidos(aUsuario);
	}

	@Override
	public Pendiente[] cargarPendientes(UR aUsuario) {
		return this._bD_Pendiente.cargarPendientes(aUsuario);
	}

	@Override
	public boolean cancelarPedido(int aIdPedido) throws PersistentException {
		return this._bD_Pendiente.cancelarPedido(aIdPedido);
	}

	@Override
	public Oferta[] cargarOfertasAdmin() throws PersistentException {
		return this._bD_Ofertas.cargarOfertasAdmin();
	}

	@Override
	public Transportista buscarTransportistaCola(int aIdCola) throws PersistentException {
		return this._bD_Transportistas.buscarTransportistaCola(aIdCola);
	}

	@Override
	public Pendiente cargarPendienteEnviado(Enviado aEnviado) throws PersistentException{
		return this._bD_Pendiente.cargarPendienteEnviado(aEnviado);
	}

	@Override
	public boolean eliminarProductoEnCompra(Producto aProducto) throws PersistentException {
		return this._bD_Productos_en_compra.eliminarProductoEnCompra(aProducto);
	}
	
	

	
}
