package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.iUR;
import vistas.VistaPedido;

public class Pedido extends VistaPedido {
	public Pedidos _pedidos;
	public VerticalLayout layout;
	base_de_datos.Compra compra;
	
	public Pedido(base_de_datos.Compra compra, Pedidos pedidos) {
		this._pedidos = pedidos;
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		this.compra = compra;
		
		if(this.compra instanceof base_de_datos.Recibido) {
			this.getEstado_pedido().setText("Recibido");
			this.getBoton_cancelar_pedido().setVisible(false);
		}
		
		if(this.compra instanceof base_de_datos.Pendiente) {
			this.getEstado_pedido().setText("Pendiente");
		}
		
		this.getFecha().setText(this.compra.getFecha_estado());
		this.getPrecio().setText(this.compra.getPrecio_total() + " €");
		this.getCodigo().setText(this.compra.getCodigo() + "");
		
		inicializar();
	}
	
	/*Para los Pedidos de tipo ENVIADO*/
	public Pedido(base_de_datos.Compra compra, Pedidos pedidos, boolean esCompra){
		this._pedidos = pedidos;
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		this.compra = compra;
		this.getEstado_pedido().setText("Enviado");
		this.getBoton_cancelar_pedido().setVisible(false);
		
		this.getFecha().setText(this.compra.getFecha_estado());
		this.getPrecio().setText(this.compra.getPrecio_total() + " €");
		this.getCodigo().setText(this.compra.getCodigo() + "");
		
	}
	
	
	public void inicializar() {
		Cancelar();
	}

	
	public void Cancelar() {
		this.getBoton_cancelar_pedido().addClickListener(event ->{
			iUR iur = new BDPrincipal(); 
			
			try {
				iur.cancelarPedido(this.compra.getCodigo());
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			
			this._pedidos._ver_pedidos.inicializar(this._pedidos._ver_pedidos._menu_UR);
  
		});
	}
}
