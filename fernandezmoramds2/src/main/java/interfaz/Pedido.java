package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import vistas.VistaPedido;

public class Pedido extends VistaPedido {
	public Pedidos _pedidos;
	public VerticalLayout layout;
	base_de_datos.Compra compra;
	
	public Pedido(base_de_datos.Compra compra) {
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		this.compra = compra;
		
		if(this.compra instanceof base_de_datos.Recibido) {
			this.getEstado_pedido().setText("Recibido");
			this.getBoton_cancelar_pedido().setVisible(false);
			
			
			
		}
		
		if(this.compra instanceof base_de_datos.Pendiente) {
			this.getEstado_pedido().setText("Pendiente");
		}
		
		if(this.compra instanceof base_de_datos.Enviado) {
			this.getEstado_pedido().setText("Enviado");
			this.getBoton_cancelar_pedido().setVisible(false);
		}
	}
	

	
	public void Cancelar() {
		throw new UnsupportedOperationException();
	}
}
