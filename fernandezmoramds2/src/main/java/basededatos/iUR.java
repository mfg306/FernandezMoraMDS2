package basededatos;

import org.orm.PersistentException;

import base_de_datos.Compra;
import base_de_datos.Enviado;
import base_de_datos.UR;
import base_de_datos.Usuario_General;
import base_de_datos.Mensaje;
import base_de_datos.Pendiente;
import base_de_datos.Producto;
import base_de_datos.Recibido;

public interface iUR extends iUR_UNR {

	public void actualizarDatosCompra(String aDireccionEnvio, String aMetodoPago, UR aUsuario) throws PersistentException;
	
	public UR buscarUsuarioPorCorreo(String aCorreo)throws PersistentException;

	public Mensaje[] cargarMensajesEnviados(Usuario_General aUsuario) throws PersistentException;

	public Mensaje[] cargarMensajesRecibidos(Usuario_General aUsuario) throws PersistentException;

	public void enviarMensaje(String aCorreoReceptor, String aMensaje, String aAsunto, Usuario_General aEmisor) throws PersistentException;
	
	public boolean comentar(String aComentario, int aIdProducto, int aIdUsuario)throws PersistentException;
	
	public boolean valorar( int aIdProducto, int aIdUsuario,String aValoracion)throws PersistentException;
	
	public void cambiarContraseniaUsuario(String aCorreo, String aContrasenia) throws PersistentException;
	
	public void cambiarDatosUsuario(String aNombreUsuario, String aNombre, String aApellidos, String aCorreo, String aDireccion, 
			String aMetodoDePago, String aRutaFoto) throws PersistentException;
	
	public void eliminarUsuario(String aCorreo) throws PersistentException;
	
	public void actualizarContrasenia(UR aUr ,String aNuevaContrasenia) throws PersistentException;
	
	public boolean responderMensaje(String aCorreoReceptor, String aMensaje, Usuario_General aEmisor, Mensaje mensajeHilo) throws PersistentException;
	
	public void realizarCompra(Producto[] aProductos, int aId_Usuario, int[] aUnidades)  throws PersistentException;
	
	public Enviado[] cargarEnviados(UR aUsuario);
	
	public Recibido[] cargarRecibidos(UR aUsuario);
	
	public Pendiente[] cargarPendientes(UR aUsuario);
}
