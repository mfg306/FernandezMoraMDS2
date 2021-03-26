package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPedidos;

public class Pedidos extends VistaPedidos {
	public Ver_pedidos _ver_pedidos;
	public Vector<Pedido> _list_Pedido = new Vector<Pedido>();
	public VerticalLayout layout;

	public Pedidos(Ver_pedidos vp) {
		this._list_Pedido = new Vector<>();
		inicializar(vp);
	}

	public void inicializar(Ver_pedidos vp) {
		this.layout = this.getLista_pedidos().as(VerticalLayout.class);
		this._ver_pedidos = vp;
		add_pedidos();
	}

	public void add_pedidos() {
		Pedido p = new Pedido();
		this._list_Pedido.add(p);
		this.layout.add(p);

	}

}