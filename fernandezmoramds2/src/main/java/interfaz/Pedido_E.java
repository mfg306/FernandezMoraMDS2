package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import basededatos.BDPrincipal;
import basededatos.iEncargado_de_compras;
import vistas.VistaPedido_e;

public class Pedido_E extends VistaPedido_e {
	public Pedidos_E _pedidos_E;
	base_de_datos.Pendiente pendiente;
	base_de_datos.Producto_en_compra[] listado;

	public Pedido_E(Pedidos_E pedidos_E, base_de_datos.Pendiente pendiente) {
		this.pendiente = pendiente;
		inicializar(pedidos_E);
		this.getLabel1().setText("Codigo : " + this.pendiente.getCodigo());
		this.getLabel2().setText("Fecha ultima actualizacion : " + this.pendiente.getFecha_estado());

		int numTotalUnidades = 0;

		cargarProductosEnCompra();

		for (base_de_datos.Producto_en_compra p : listado) {
			numTotalUnidades += p.getNum_unidades_producto();
		}

		this.getNumTotalUnidades().setText("Numero total unidades : " + numTotalUnidades);

		asignar_a_transportista();
	}

	public void inicializar(Pedidos_E pedidos_E) {
		this._pedidos_E = pedidos_E;
	}

	public void asignar_a_transportista() {
		this.getBotonAsignar().addClickListener(event -> {
			base_de_datos.Encargado_de_compras encargado = this._pedidos_E._encargado_de_compras.encargado;
			iEncargado_de_compras eCompras = new BDPrincipal();

			try {
				eCompras.asignarPedidoTransportista(this.pendiente, encargado);

				String asunto = "El pedido de código " + this.pendiente.getCodigo() + " se ha enviado con éxito.";
				String mensaje = "El pedido de código " + this.pendiente.getCodigo()
						+ " se ha enviado a la empresa de transportes" + " con éxito. \n Fecha: "
						+ this.pendiente.getFecha_estado();
				
				mensaje += "\nArtículos: \n";
				
				for(base_de_datos.Producto_en_compra pec : listado) {
					mensaje += "(" + pec.getNum_unidades_producto() + ") " +  pec.get_Producto().getNombre() + "\n";
				}
				
				mensaje += "\n Precio total: " + this.pendiente.getPrecio_total() + "\n";
				mensaje += "\nEn breves recibirá sus artículos. ";

				this.Enviar_mensaje_a_cliente_E(this.pendiente.get_Hace_compra().getCorreo_electronico(), asunto,
						mensaje);
			} catch (PersistentException e1) {
				e1.printStackTrace();
			}

			this._pedidos_E._encargado_de_compras.inicializar();
			Notification.show("Pedido asignado con éxito");
		});
	}
	

	public void cargarProductosEnCompra() {
		iEncargado_de_compras iEn = new BDPrincipal();

		try {
			listado = iEn.cargarProductosEnCompra(pendiente.getCodigo());
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Enviar_mensaje_a_cliente_E(String destinatario, String Asunto, String cuerpo) {
		Gestor_Correos.enviarCorreo(destinatario, Asunto, cuerpo);
	}

}
