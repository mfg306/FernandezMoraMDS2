package basededatos;

import base_de_datos.Enviado;
import base_de_datos.UR;

public interface iTransportista {

	public void enviarMensajeT(String aMensaje, String aCorreEmisor, String aCorreoReceptor);

	public Enviado[] cargarPedidosT(int aIdTransportista);

	public UR[] cargarFichaCliente();
}