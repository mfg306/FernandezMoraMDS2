package Base_de_Datos;

import basededatos.BDPrincipal;
import java.util.Vector;
import Base_de_Datos.Mensaje;

public class BD_Mensajes {
	public BDPrincipal _bDPrincipal;
	public Vector<Mensaje> _mensaje = new Vector<Mensaje>();

	public Mensaje[] cargarMensajesEnviados(String aCorreoEmisor) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] cargarMensajesRecibidos(String aCorreoReceptor) {
		throw new UnsupportedOperationException();
	}

	public void enviarMensaje(String aCorreoEmisor, String aCorreoReceptor, String aMensaje) {
		throw new UnsupportedOperationException();
	}
}