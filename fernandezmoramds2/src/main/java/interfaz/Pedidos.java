package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPedidos;

public class Pedidos extends VistaPedidos {
	public Ver_pedidos _ver_pedidos;
	public Vector<Pedido> _list_Pedido = new Vector<Pedido>();
	public VerticalLayout layout;

	public Pedidos(Ver_pedidos vp) {
		this._list_Pedido = new Vector<>();
		this.layout = this.getLista_pedidos().as(VerticalLayout.class);

		inicializar(vp);
	}

	public void inicializar(Ver_pedidos vp) {
		this.layout.removeAll();
		this._ver_pedidos = vp;
	}

	public void add_pedidos(base_de_datos.Compra c) {
		Pedido p = new Pedido(c, this);
		this._list_Pedido.add(p);
		this.layout.add(p);

	}

}
