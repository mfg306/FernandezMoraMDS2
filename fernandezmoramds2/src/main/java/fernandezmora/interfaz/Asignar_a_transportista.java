package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAsignar_a_transportista;

public class Asignar_a_transportista extends VistaAsignar_a_transportista {
	public Pedido_E _list_Pedido_E;
	VerticalLayout layout;
	
	public Asignar_a_transportista(Pedido_E pedido) {

		inicializar(pedido);
	}
	
	public void inicializar(Pedido_E pedido) {
		this._list_Pedido_E = pedido;
		layout = this.getVerticalLayout_asignar_a_transportista().as(VerticalLayout.class);
		
		guardar_Cambios();
	}
	
	public void ocultar_Asignar_a_transportista() {
		this.getH1Asignar_a_transportista().setVisible(false);
		this.getVerticalLayout_2_asignar_a_transportista().setVisible(false);
	}
	
	public void guardar_Cambios() {
		this.getAceptarAsignar_a_transportista().addClickListener(event ->{
			ocultar_Asignar_a_transportista();
//			this._list_Pedido_E._pedidos_E._encargado_de_compras = new Encargado_de_compras();
			
//			this.layout.add(this._list_Pedido_E._pedidos_E._encargado_de_compras);
			
			
			
		});
	}
}