package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;

import base_de_datos.Mensaje;

public class BD_Mensajes {
	public BDPrincipal _bDPrincipal;
	public Vector<Mensaje> _mensaje = new Vector<Mensaje>();

	public Mensaje[] cargarMensajesEnviados(Usuario_General aUsuario) throws PersistentException {
		Mensaje[] mensajes = MensajeDAO.listMensajeByQuery("correo_receptor = '" + aUsuario.getCorreo_electronico()+ "'", null);
		
		return mensajes;
	}

	public Mensaje[] cargarMensajesRecibidos(Usuario_General aUsuario) throws PersistentException {
		Mensaje[] mensajes = MensajeDAO.listMensajeByQuery("correo_receptor = '" + aUsuario.getCorreo_electronico()+ "'", null);
		
		return mensajes;
		
	}

	public void enviarMensaje(String aCorreoEmisor, String aCorreoReceptor, String aMensaje) {
		throw new UnsupportedOperationException();
	}
}