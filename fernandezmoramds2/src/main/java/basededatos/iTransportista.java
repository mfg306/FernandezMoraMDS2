package basededatos;

import org.orm.PersistentException;

import base_de_datos.Enviado;
import base_de_datos.Transportista;
import base_de_datos.UR;

public interface iTransportista {

	public void enviarMensajeT(String aMensaje, String aCorreEmisor, String aCorreoReceptor);

	public Enviado[] cargarPedidosT(Transportista aTransportista) throws PersistentException;

	public UR[] cargarFichaCliente();

	public UR cargarClienteEnviado(Transportista aTransportista, Enviado aEnviado) throws PersistentException;
	
	public boolean repartirACliente(UR aCliente, Enviado aEnviado) throws PersistentException;
}