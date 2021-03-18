package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPedidos_e;

public class Pedidos_E extends VistaPedidos_e {
	public Encargado_de_compras _encargado_de_compras;
	public Vector<Pedido_E> _list_Pedido_E = new Vector<Pedido_E>();
	VerticalLayout layout;
	
	public Pedidos_E(Encargado_de_compras e) {
		inicializar(e);
	}
	
	public void inicializar(Encargado_de_compras e) {
		this._encargado_de_compras = e;
		this._list_Pedido_E = new Vector<>();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	}
	
	
	public void add_pedidos() {
		Pedido_E p = new Pedido_E(this);
		this._list_Pedido_E.add(p);
		layout.add(p);	
	}
}