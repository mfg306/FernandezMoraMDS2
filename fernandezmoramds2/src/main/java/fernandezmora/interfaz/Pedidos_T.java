package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPedidos_t;


public class Pedidos_T extends VistaPedidos_t {
	public Transportista _transportista;
	public Vector<Pedido_T> _list_Pedido_T = new Vector<Pedido_T>();
	VerticalLayout layout;
	
	public Pedidos_T(Transportista t) {
		inicializar(t);
	}
	
	public void inicializar(Transportista t) {
		this._transportista = t;
		this._list_Pedido_T = new Vector<>();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	}
	
	public void add_pedidos_T() {
		Pedido_T p = new Pedido_T(this);
		this._list_Pedido_T.add(p);
		layout.add(p);
		
	}
}