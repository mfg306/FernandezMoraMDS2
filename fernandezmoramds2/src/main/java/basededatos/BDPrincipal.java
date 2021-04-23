package basededatos;

import base_de_datos.BD_UR;

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
// import base_de_datos.UR;
import base_de_datos.Mensaje;
import base_de_datos.Enviado;
import base_de_datos.Pendiente;
import base_de_datos.Imagen;
import interfaz.UR_UNR;
// import interfaz.UR;
import interfaz.Gestor_Banco;
import interfaz.UNR_;
import interfaz.Gestor_Correos;
import interfaz.Transportista_Encargado_NR;
import interfaz.Transportista;
import interfaz.Encargado_de_compras;
import interfaz.Administrador;

public class BDPrincipal implements iUR_UNR, iUR, iGestor_Banco, iUNR_, iGestor_Correos, iTransportista_Encargado_NR, iTransportista, iEncargado_de_compras, iAdministrador {
	public BD_UR _bD_UNR;
	public BD_Administrador _bD_Administrador;
	public BD_Categorias _bD_Categorias;
	public BD_Productos _bD_Productos;
	public BD_Ofertas _bD_Ofertas;
	public BD_Productos_Rebajados _bD_Productos_Rebajados;
	public BD_Transportistas _bD_Transportistas;
	public BD_Encargados_de_compras _bD_Encargados_de_compras;
	public BD_Comentarios _bD_Comentarios;
	public DB_Imagen _dB_Imagen;
	public BD_Enviado _bD_Enviado;
	public BD_Recibido _bD_Recibido;
	public BD_Pendiente _bD_Pendiente;
	public BD_Mensajes _bD_Mensajes;
	public BD_Productos_en_compra _bD_Productos_en_compra;
	public BD_Valoracion _bD_Valoracion;
	public BD_Empleados _bD_Empleados;

	public Oferta[] cargarOfertas() {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargarProductosMasVendidos() {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargarCategorias() {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargarProductosMasVendidos(String aNombreCategoria) {
		throw new UnsupportedOperationException();
	}

	public Producto_Rebajado[] cargarProductosOferta(Oferta aOferta) {
		throw new UnsupportedOperationException();
	}

	public Producto cargarProducto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargarProductosCategoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargarProductos(String aNombreProducto) {
		throw new UnsupportedOperationException();
	}

	public boolean buscarUsuarioPorCorreo(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void actualizarDatosCompra(String aDireccionEnvio, String aMetodoPago) {
		throw new UnsupportedOperationException();
	}

	public Compra[] cargarPedidos(base_de_datos.UR aUsuario) {
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

	public void registrarse(String aNombre, String aApellidos, String aCorreo, String aNombreUsuario, String aContrasenia, Object aContraseniaRepeticion) {
		throw new UnsupportedOperationException();
	}

	public void iniciarSesion(String aCorreo, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public boolean buscarUsuario(String aCampo) {
		throw new UnsupportedOperationException();
	}

	public void enviarMensajeT(String aMensaje, String aCorreEmisor, String aCorreoReceptor) {
		throw new UnsupportedOperationException();
	}

	public Enviado[] cargarPedidosT(int aIdTransportista) {
		throw new UnsupportedOperationException();
	}

	public base_de_datos.UR[] cargarFichaCliente() {
		throw new UnsupportedOperationException();
	}

	public BD_Pendiente[] cargarPedidosPendientes(int aIdEncargado) {
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

	public void insertarProducto(String aNombreProducto, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public UR_UNR get_UR_UNR() {
		throw new UnsupportedOperationException();
	}

	public interfaz.UR get_UR() {
		throw new UnsupportedOperationException();
	}

	public Gestor_Banco get_Gestor_Banco() {
		throw new UnsupportedOperationException();
	}

	public UNR_ get_UNR_() {
		throw new UnsupportedOperationException();
	}

	public Gestor_Correos get_Gestor_Correos() {
		throw new UnsupportedOperationException();
	}

	public Transportista_Encargado_NR get_Transportista_Encargado_NR() {
		throw new UnsupportedOperationException();
	}

	public Transportista get_Transportista() {
		throw new UnsupportedOperationException();
	}

	public Encargado_de_compras get_Encargado_de_compras() {
		throw new UnsupportedOperationException();
	}

	public Administrador get_Administrador() {
		throw new UnsupportedOperationException();
	}
}