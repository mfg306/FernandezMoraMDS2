package basededatos;

import fernandezmora.interfaz.Pedido_T;
import base_de_datos.UR;

public interface iTransportista {

	public Pedido_T[] cargarPedidosT(int aIdTransportista);

	public void pedidoEntregado(int aIdPedidoEnviado);

	public UR cargarFichaCliente(int aIdUsuarioRegistrado);

	public boolean buscarUsuarioPorCorreo(String aCorreo);
}