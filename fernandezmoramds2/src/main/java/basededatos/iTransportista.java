package basededatos;

import interfaz.Pedido_T;
import Base_de_Datos.UR;

public interface iTransportista {

	public Pedido_T[] cargarPedidosT(int aIdTransportista);

	public void enviarMensajeT(String aMensaje, String aCorreEmisor, String aCorreoReceptor);

	public UR[] cargarFichaCliente();
}