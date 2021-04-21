package basededatos;

import base_de_datos.BD_Pendiente;
import base_de_datos.Pendiente;

public interface iEncargado_de_compras {

	public BD_Pendiente[] cargarPedidosPendientes(int aIdEncargado);

	public void asignarPedidoTransportista(int aIdPedidoPendiente, int aIdTransportista);

	public Pendiente[] cargarPedidosE(int aIdEncargado);

	public void enviarMensajeE(String aMensaje, String aCorreoEmisor, String aCorreoReceptor);
}