package basededatos;

import org.orm.PersistentException;

import base_de_datos.Compra;
import base_de_datos.UR;
import base_de_datos.Mensaje;

public interface iUR extends iUR_UNR {

	public UR buscarUsuarioPorCorreo(String aCorreo)throws PersistentException;

	public void actualizarDatosCompra(String aDireccionEnvio, String aMetodoPago);

	public Compra[] cargarPedidos(UR aUsuario);

	public Mensaje[] cargarMensajesEnviados(String aCorreoEmisor);

	public Mensaje[] cargarMensajesRecibidos(String aCorreoReceptor);

	public void enviarMensaje(String aCorreoEmisor, String aCorreoReceptor, String aCodigo, String aMensaje);
	
	public boolean comentar(String aComentario, int aIdProducto, int aIdUsuario)throws PersistentException;;
	
	public boolean valorar( int aIdProducto, int aIdUsuario,String aValoracion);
}