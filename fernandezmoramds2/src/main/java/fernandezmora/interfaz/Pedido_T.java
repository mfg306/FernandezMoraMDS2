package fernandezmora.interfaz;

import vistas.VistaPedido_t;

public class Pedido_T extends VistaPedido_t {
	public Pedidos_T _pedidos_T;
	public Ver_ficha_cliente _ver_ficha_cliente;
	public Gestor_Correos _unnamed_Gestor_Correos_;
	
	public Pedido_T(Pedidos_T p) {
		inicializar(p);
	}
	
	public void inicializar(Pedidos_T p) {
		this._pedidos_T = p;
		this._ver_ficha_cliente = new Ver_ficha_cliente(this);
	}

	public void Marcar_como_entregado() {
		throw new UnsupportedOperationException();
	}

	public void Enviar_mensaje_a_cliente_T() {
		throw new UnsupportedOperationException();
	}
}