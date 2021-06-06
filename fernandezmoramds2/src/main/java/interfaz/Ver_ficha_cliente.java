package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_ficha_cliente;

public class Ver_ficha_cliente extends VistaVer_ficha_cliente{
	public Pedido_T _pedido_T;
	VerticalLayout layout;
	base_de_datos.UR cliente;

	public Ver_ficha_cliente(Pedido_T p, base_de_datos.UR cliente) {
		this.cliente = cliente;
		
		this.getLabel().setText(cliente.getNombre());
		this.getLabel1().setText(cliente.getPrimer_apellido());
		this.getLabel2().setText(cliente.getDireccion_envio());
		this.getLabel3().setText(cliente.getCorreo_electronico());
		this.getLabel4().setText(cliente.getMetodo_pago());
		
		inicializar(p);
	}
	
	public void inicializar(Pedido_T p) {
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
			this._pedido_T._pedidos_T._transportista.inicializar();
		});
		
	}
}