package basededatos;


import Base_de_Datos.Enviado;
import Base_de_Datos.UR;

public interface iTransportista {

	public Enviado[] cargarPedidosT(int aIdTransportista);

	public void enviarMensajeT(String aMensaje, String aCorreEmisor, String aCorreoReceptor);

	public UR[] cargarFichaCliente();
}