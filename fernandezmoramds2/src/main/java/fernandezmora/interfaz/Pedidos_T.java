package fernandezmora.interfaz;

import java.util.Vector;

import vistas.VistaPedido_t;


public class Pedidos_T extends VistaPedido_t {
	/*private Label _tituloL;
	private Label _nombre_empresaL;*/
	public Transportista _transportista;
	public Vector<Pedido_T> _list_Pedido_T = new Vector<Pedido_T>();
}