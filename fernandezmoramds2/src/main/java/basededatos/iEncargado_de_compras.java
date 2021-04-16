package basededatos;

import Base_de_Datos.BD_Pendiente;
import Base_de_Datos.Pendiente;

public interface iEncargado_de_compras {

	public BD_Pendiente[] cargarPedidosPendientes(int aIdEncargado);

	public void asignarPedidoTransportista(int aIdPedidoPendiente, int aIdTransportista);

	public Pendiente[] cargarPedidosE(int aIdEncargado);

	public void enviarMensajeE(String aMensaje, String aCorreoEmisor, String aCorreoReceptor);
}