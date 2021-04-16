package basededatos;

import Base_de_Datos.BD_UR;
import Base_de_Datos.BD_Administrador;
import Base_de_Datos.BD_Categorias;
import Base_de_Datos.BD_Productos;
import Base_de_Datos.BD_Ofertas;
import Base_de_Datos.BD_Productos_Rebajados;
import Base_de_Datos.BD_Transportistas;
import Base_de_Datos.BD_Encargados_de_compras;
import Base_de_Datos.BD_Comentarios;
import Base_de_Datos.DB_Imagen;
import Base_de_Datos.BD_Enviado;
import Base_de_Datos.BD_Recibido;
import Base_de_Datos.BD_Pendiente;
import Base_de_Datos.BD_Mensajes;
import Base_de_Datos.BD_Productos_en_compra;
import Base_de_Datos.BD_Valoracion;
import Base_de_Datos.BD_Empleados;
import Base_de_Datos.Oferta;
import Base_de_Datos.Producto;
import Base_de_Datos.Categoria;
import Base_de_Datos.Producto_Rebajado;
import Base_de_Datos.Compra;
// import Base_de_Datos.UR;
import Base_de_Datos.Mensaje;
import Base_de_Datos.Pendiente;
import fernandezmora.interfaz.UR_UNR;
// import interfaz.UR;
import fernandezmora.interfaz.Gestor_Banco;
import fernandezmora.interfaz.UNR_;
import fernandezmora.interfaz.Gestor_Correos;
import fernandezmora.interfaz.Transportista_Encargado_NR;
import fernandezmora.interfaz.Transportista;
import fernandezmora.interfaz.Encargado_de_compras;
import Base_de_Datos.Enviado;

public class BDPrincipal implements iUR_UNR, iUR, iGestor_Banco, iUNR_, iGestor_Correos, iTransportista_Encargado_NR, eliminarCategoriaAdministrador, iTransportista, iEncargado_de_compras {
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

	public Compra[] cargarPedidos(Base_de_Datos.UR aUsuario) {
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

	public Base_de_Datos.UR[] cargarFichaCliente() {
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

	public UR_UNR get_UR_UNR() {
		throw new UnsupportedOperationException();
	}

	public fernandezmora.interfaz.UR get_UR() {
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

	public Enviado[] cargarPedidosT(int aIdTransportista) {
		throw new UnsupportedOperationException();
	}
}