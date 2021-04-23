package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Pendiente;

public class BD_Pendiente {
	public BDPrincipal _bDPrincipal;
	public Vector<Pendiente> _pendiente = new Vector<Pendiente>();

	public void realizarCompra(Producto[] aProductos, int aId_Usuario) {
		throw new UnsupportedOperationException();
	}

	public Pendiente[] cargarPedidosPendientes(int aIdEncargado) {
		throw new UnsupportedOperationException();
	}

	public Pendiente[] cargarPedidosE(int aIdEncargado) {
		throw new UnsupportedOperationException();
	}
}