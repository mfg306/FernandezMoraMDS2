package basededatos;

import fernandezmora.interfaz.Pedido_E;

public interface iEncargado_de_compras {

	public Pedido_E[] cargarPedidosPendientes(int aIdEncargado);

	public boolean buscarUsuarioPorCorreo(String aCorreo);

	public void pedidoEnviado(int aIdPedidoPendiente, int aIdTransportista);
}