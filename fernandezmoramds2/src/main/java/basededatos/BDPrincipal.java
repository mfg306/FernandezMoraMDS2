package basededatos;

import base_de_datos.BD_UR;

import java.util.List;

import org.orm.PersistentException;

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
import base_de_datos.Producto_Rebajado;
import base_de_datos.Compra;
import base_de_datos.UR;
import base_de_datos.Mensaje;
import base_de_datos.Enviado;
import base_de_datos.Pendiente;
import base_de_datos.Imagen;
import base_de_datos.Empleado;
import base_de_datos.Recibido;

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

	public Producto[] cargarProductosMasVendidos() {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargarCategorias() {
		Categoria[] cts = null;
		try {
			cts = this._bD_Categorias.cargarCategorias();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cts;
	}

	public Producto[] cargarProductosMasVendidos(String aNombreCategoria) {
		throw new UnsupportedOperationException();
	}

	public Producto_Rebajado[] cargarProductosOferta(Oferta aOferta) {
		throw new UnsupportedOperationException();
	}

	public Producto cargarProducto(int aIdProducto) {
		Producto ps = null;
		try {
			ps = this._bD_Productos.cargarProducto(aIdProducto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ps;
	}

	public Producto[] cargarProductosCategoria(Categoria aCategoria) {
		Producto[] cts = null;
		try {
			cts = this._bD_Productos.cargarProductosCategoria(aCategoria);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cts;
	}

	public Producto[] cargarProductos(String aNombreProducto) {
		throw new UnsupportedOperationException();
	}

	public UR buscarUsuarioPorCorreo(String aCorreo) throws PersistentException {
		return this._bD_UNR.buscarUsuarioPorCorreo(aCorreo);
	}

	public void actualizarDatosCompra(String aDireccionEnvio, String aMetodoPago) {
		throw new UnsupportedOperationException();
	}

	public Compra[] cargarPedidos(UR aUsuario) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] cargarMensajesEnviados(String aCorreoEmisor) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] cargarMensajesRecibidos(String aCorreoReceptor) {
		throw new UnsupportedOperationException();
	}

	public void enviarMensaje(String aCorreoEmisor, String aCorreoReceptor, String aCodigo, String aMensaje) {
		throw new UnsupportedOperationException();
	}

	public boolean registrarse(String aNombre, String aApellidos, String aCorreo, String aNombreUsuario,
			String aContrasenia, Object aContraseniaRepeticion) throws PersistentException {
		boolean registrado = false;
		try {
			registrado = this._bD_UNR.registrarse(aNombre, aApellidos, aCorreo, aNombreUsuario, aContrasenia,
					aContrasenia);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return registrado;
	}

	public int iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException {
		int existeUsuario = 0;
		int existeAdmin = 0;

		try {
			existeUsuario = this._bD_UNR.iniciarSesion(aCorreo, aContrasenia);
			if (existeUsuario == 1)
				return 1;
			existeAdmin = this._bD_Administrador.iniciarSesion(aCorreo, aContrasenia);
			if (existeAdmin == 2)
				return 2;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public int buscarUsuario(String aCampo, String aPassword) {
		int existeTransportista = 0;
		int existeEncargado = 0;

		try {
			existeTransportista = this._bD_Transportistas.buscarUsuario(aCampo, aPassword);
			if (existeTransportista == 1)
				return 1;
			existeEncargado = this._bD_Encargados_de_compras.buscarUsuario(aCampo, aPassword);
			if (existeEncargado == 2)
				return 2;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;

	}

	public void enviarMensajeT(String aMensaje, String aCorreEmisor, String aCorreoReceptor) {
		throw new UnsupportedOperationException();
	}

	public Enviado[] cargarPedidosT(int aIdTransportista) {
		throw new UnsupportedOperationException();
	}

	public UR[] cargarFichaCliente() {
		throw new UnsupportedOperationException();
	}

	public Pendiente[] cargarPedidosPendientes(int aIdEncargado) {
		throw new UnsupportedOperationException();
	}

	public void asignarPedidoTransportista(int aIdPedidoPendiente, int aIdTransportista) {
		throw new UnsupportedOperationException();
	}

	public Pendiente[] cargarPedidosE(int aIdEncargado) {
		throw new UnsupportedOperationException();
	}

	public void enviarMensajeE(String aMensaje, String aCorreoEmisor, String aCorreoReceptor) {
		throw new UnsupportedOperationException();
	}

	public void guardarImagenesProducto(int aIdProducto, Imagen[] aImagenes) {
		throw new UnsupportedOperationException();
	}

	public Producto insertarProducto(String aNombreProducto, String aDescripcion, double aPrecio, int aNumUnidades)
			throws PersistentException {
		return this._bD_Productos.insertarProducto(aNombreProducto, aDescripcion, aPrecio, aNumUnidades);
	}

	public void insertarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad,
			String aFechaRegistro) throws PersistentException {
		this._bD_Ofertas.insertarOferta(aNombreOferta, aListaProductos, aFechaCaducidad, aFechaRegistro);
	}

	public void insertarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaRegistro)
			throws PersistentException {
		this._bD_Categorias.insertarCategoria(aNombreCategoria, aListaProductos, aFechaRegistro);
	}

	public void actualizarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaActualizacion,
			int aIdCategoria) throws PersistentException {
		this._bD_Categorias.actualizarCategoria(aNombreCategoria, aListaProductos, aFechaActualizacion, aIdCategoria);
	}

	public void actualizarEmpleado(String aNombreUsuario, String aContrasenia, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void actualizarOferta(String aNombreOferta, Producto[] aListaProductos, String aFechaCaducidad,
			String aFechaActualizacion, int aIdOferta) throws PersistentException {
		this._bD_Ofertas.actualizarOferta(aNombreOferta, aListaProductos, aFechaCaducidad, aFechaActualizacion,
				aIdOferta);
	}

	public void actualizarProducto(Imagen[] aImagenes, int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargarCategoriasAdministrador() throws PersistentException {
		return _bD_Categorias.cargarCategoriasAdministrador();
	}

	public Empleado[] cargarEmpleados() {
		throw new UnsupportedOperationException();
	}

	public void eliminarEmpleado(int aIdEmpleado) {
		throw new UnsupportedOperationException();
	}

	public void insertarEmpleado(String aNombreUsuario, String aContrasenia, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void eliminarProductoAdministrador(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Recibido[] cargarVentas() {
		throw new UnsupportedOperationException();
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
		return this._bD_Comentarios.valorar(aIdProducto, aIdUsuario, aValoracion);

	}
	
}
