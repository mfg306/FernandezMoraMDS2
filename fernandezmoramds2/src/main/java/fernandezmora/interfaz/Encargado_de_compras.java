package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEncargado_de_compras;

//import basededatos.iEncargado_de_compras;

public class Encargado_de_compras extends VistaEncargado_de_compras{
	public Pedidos_E _pedidos_E;
	VerticalLayout layout;
	
	public Encargado_de_compras() {
		inicializar();
	}
	
	public void inicializar() {
		_pedidos_E = new Pedidos_E(this);
		_pedidos_E.add_pedidos();
		_pedidos_E.add_pedidos();

		layout = this.getHuecoListaPedidos().as(VerticalLayout.class);
		layout.add(_pedidos_E);
		
		asignar_a_transportista();
	}
	
	
	public void ocultar_encargado() {
		this.getH1().setVisible(false);
		this.getHuecoListaPedidos().setVisible(false);
		this.getVaadinButton().setVisible(false);
	}
	
	
	public void asignar_a_transportista() {
		for(Pedido_E pe : this._pedidos_E._list_Pedido_E) {
			pe.getBotonAsignar().addClickListener(event ->{
				pe._asignar_a_transportista = new Asignar_a_transportista(pe);
				ocultar_encargado();
				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(pe._asignar_a_transportista);
			});
		}
	}

	public void cerrar_sesion() {
		throw new UnsupportedOperationException();
	}
}