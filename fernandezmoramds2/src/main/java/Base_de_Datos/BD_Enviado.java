package Base_de_Datos;

import basededatos.BDPrincipal;
import java.util.Vector;
import Base_de_Datos.Enviado;

public class BD_Enviado {
	public BDPrincipal _bDPrincipal;
	public Vector<Enviado> _enviado = new Vector<Enviado>();

	public Enviado[] cargarPedidosT(int aIdTransportista) {
		throw new UnsupportedOperationException();
	}

	public void asignarPedidoTransportista(int aIdPedidoPendiente, int aIdTransportista) {
		throw new UnsupportedOperationException();
	}
}