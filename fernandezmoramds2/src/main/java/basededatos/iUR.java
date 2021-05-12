package basededatos;

import org.orm.PersistentException;

import base_de_datos.Compra;
import base_de_datos.UR;
import base_de_datos.Usuario_General;
import base_de_datos.Mensaje;

public interface iUR extends iUR_UNR {

	public void actualizarDatosCompra(String aDireccionEnvio, String aMetodoPago);
	
	public UR buscarUsuarioPorCorreo(String aCorreo)throws PersistentException;

	public Compra[] cargarPedidos(UR aUsuario);

	public Mensaje[] cargarMensajesEnviados(Usuario_General aUsuario) throws PersistentException;

	public Mensaje[] cargarMensajesRecibidos(Usuario_General aUsuario) throws PersistentException;

	public void enviarMensaje(String aCorreoReceptor, String aMensaje, String aAsunto, Usuario_General aEmisor) throws PersistentException;
	
	public boolean comentar(String aComentario, int aIdProducto, int aIdUsuario)throws PersistentException;
	
	public boolean valorar( int aIdProducto, int aIdUsuario,String aValoracion)throws PersistentException;
	
	public void cambiarContraseniaUsuario(String aCorreo, String aContrasenia) throws PersistentException;
	
	public void cambiarDatosUsuario(String aNombreUsuario, String aNombre, String aApellidos, String aCorreo, String aDireccion, String aMetodoDePago) throws PersistentException;
	
	public void eliminarUsuario(String aCorreo) throws PersistentException;
	
	public void actualizarContrasenia(String aContraseniaActual,String aNuevaContrasenia, String aConfirmacionNuevaContrasenia) throws PersistentException;
	
	public boolean responderMensaje(String aCorreoReceptor, String aMensaje, Usuario_General aEmisor, Mensaje mensajeHilo) throws PersistentException;

}
