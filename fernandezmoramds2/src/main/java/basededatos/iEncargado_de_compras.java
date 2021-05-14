package basededatos;

import org.orm.PersistentException;

import base_de_datos.Encargado_de_compras;
import base_de_datos.Pendiente;
import base_de_datos.Transportista;

public interface iEncargado_de_compras {

	public Pendiente[] cargarPedidosPendientes(int aIdEncargado);

	public void asignarPedidoTransportista(Pendiente aPedidoPendiente, Transportista aTransportista, Encargado_de_compras aEncargado) throws PersistentException;

	public Pendiente[] cargarPedidosE(int aIdEncargado) throws PersistentException;

	public void enviarMensajeE(String aMensaje, String aCorreoEmisor, String aCorreoReceptor);
	
	public Transportista[] cargarTransportistas() throws PersistentException;
	
	public boolean eliminarPendiente(Pendiente aPedidoPendiente) throws PersistentException;
	
	public boolean eliminarProductosEnCompra(Pendiente aPendiente) throws PersistentException;
}