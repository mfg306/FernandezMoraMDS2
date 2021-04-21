package basededatos;

import fernandezmora.interfaz.Mensaje_enviado;
import fernandezmora.interfaz.Mensaje_recibido;

public interface iUR extends iUR_UNR {

	public boolean buscarUsuarioPorCorreo(String aCorreo);

	public void actualizarDatosCompra(String aDireccionEnvio, String aMetodoPago);

	public void cargarPedidos();

	public Mensaje_enviado[] cargarMensajesEnviados(String aCorreoEmisor);

	public Mensaje_recibido[] cargarMensajesRecibidos(String aCorreoReceptor);

	public void enviarMensaje(int aIdMensaje, String aCorreoEmisor, String aCorreoReceptor, String aCodigo, String aMensaje);
}