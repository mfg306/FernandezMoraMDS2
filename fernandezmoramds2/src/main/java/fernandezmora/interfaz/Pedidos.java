package fernandezmora.interfaz;

import java.util.Vector;

import vistas.VistaPedidos;


public class Pedidos extends VistaPedidos{
	public Ver_pedidos _ver_pedidos;
	public Vector<Pedido> _list_Pedido = new Vector<Pedido>();
	
	public Pedidos(Ver_pedidos vp) {
		this._ver_pedidos = vp;
		this._list_Pedido = new Vector<>();
	}
}