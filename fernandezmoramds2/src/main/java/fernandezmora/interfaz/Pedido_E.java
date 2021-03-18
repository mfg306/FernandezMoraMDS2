package fernandezmora.interfaz;


import vistas.VistaPedido_e;

public class Pedido_E extends VistaPedido_e{
	public Pedidos_E _pedidos_E;
	public Gestor_Correos _unnamed_Gestor_Correos_;
	public Asignar_a_transportista _asignar_a_transportista;
	
	public Pedido_E(Pedidos_E pedidos_E) {
		inicializar(pedidos_E);
	}
	
	public void inicializar(Pedidos_E pedidos_E) {
		this._pedidos_E = pedidos_E;
		this._asignar_a_transportista = new Asignar_a_transportista(this);	
	}
		
	public void Marcar_como_enviado() {
		throw new UnsupportedOperationException();
	}

	public void Enviar_mensaje_a_cliente_E() {
		throw new UnsupportedOperationException();
	}
}