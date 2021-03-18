package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_ficha_cliente;

public class Ver_ficha_cliente extends VistaVer_ficha_cliente{
	public Pedido_T _pedido_T;
	VerticalLayout layout;

	public Ver_ficha_cliente(Pedido_T p) {
		this._pedido_T = p;
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		cerrar();
	}
	
	public void ocultar_ficha_cliente() {
		this.getVaadinVerticalLayout1().setVisible(false);
		
	}
	
	public void cerrar() {
		this.getVaadinButton().addClickListener(event ->{
			ocultar_ficha_cliente();
			this._pedido_T._pedidos_T._transportista = new Transportista();
			this.layout.add(this._pedido_T._pedidos_T._transportista);
		});
		
	}
}