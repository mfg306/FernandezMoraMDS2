package interfaz;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPedido_e;

public class Pedido_E extends VistaPedido_e{
	public Pedidos_E _pedidos_E;
	public Asignar_a_transportista _asignar_a_transportista;
	base_de_datos.Pendiente pendiente;
	
	public Pedido_E(Pedidos_E pedidos_E, base_de_datos.Pendiente pendiente) {
		this.pendiente = pendiente;
		inicializar(pedidos_E);
		this.getLabel1().setText("Codigo : " + this.pendiente.getCodigo());
		this.getLabel2().setText("Fecha ultima actualizacion : " + this.pendiente.getFecha_estado());
		this.getNumTotalUnidades().setText("Numero total unidades : " + this.pendiente.getNum_total_unidades() );
		
		asignar_a_transportista();
	}
	
	public void inicializar(Pedidos_E pedidos_E) {
		this._pedidos_E = pedidos_E;
		this._asignar_a_transportista = new Asignar_a_transportista(this, this.pendiente);	
	}
	
	public void asignar_a_transportista() {
		this.getBotonAsignar().addClickListener(event ->{
			this._asignar_a_transportista = new Asignar_a_transportista(this, this.pendiente);
			this._pedidos_E._encargado_de_compras.ocultar_encargado();
			this._pedidos_E._encargado_de_compras.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._asignar_a_transportista);
		});
	}
		

}