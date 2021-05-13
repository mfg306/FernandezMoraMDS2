package basededatos;

import org.orm.PersistentException;
import base_de_datos.Pendiente;
import base_de_datos.Transportista;

public interface iEncargado_de_compras {

	public Pendiente[] cargarPedidosPendientes(int aIdEncargado);

	public void asignarPedidoTransportista(int aIdPedidoPendiente, int aIdTransportista);

	public Pendiente[] cargarPedidosE(int aIdEncargado) throws PersistentException;

	public void enviarMensajeE(String aMensaje, String aCorreoEmisor, String aCorreoReceptor);
	
	public Transportista[] cargarTransportistas() throws PersistentException;
}