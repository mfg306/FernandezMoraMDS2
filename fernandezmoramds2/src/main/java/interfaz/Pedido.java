package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.iUR;
import vistas.VistaPedido;

public class Pedido extends VistaPedido {
	public Pedidos _pedidos;
	public VerticalLayout layout;
	base_de_datos.Compra compra;
	base_de_datos.Pendiente pendienteResultado;

	public Pedido(base_de_datos.Compra compra, Pedidos pedidos) {
		this._pedidos = pedidos;
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.compra = compra;

		inicializar();
	}
	
	public void cargarDatosCompra() {
		iUR ur = new BDPrincipal();
		base_de_datos.Producto_en_compra pec[] = null;
		String productos = "";

		if (this.compra instanceof base_de_datos.Recibido) {
			this.getEstado_pedido().setText("Recibido");
			this.getBoton_cancelar_pedido().setVisible(false);
		}

		if (this.compra instanceof base_de_datos.Pendiente) {
			this.getEstado_pedido().setText("Pendiente");
			pec = ((base_de_datos.Pendiente) this.compra)._Producto_en_compra.toArray();
		}

		if (this.compra instanceof base_de_datos.Enviado) {
			this.getEstado_pedido().setText("Enviado");
			this.getBoton_cancelar_pedido().setVisible(false);
			cargarPendienteEnviado();
			pec = this.pendienteResultado._Producto_en_compra.toArray();
		}
		
		if(this.compra instanceof base_de_datos.Pendiente || this.compra instanceof base_de_datos.Enviado) {
			for (base_de_datos.Producto_en_compra p : pec) {
				base_de_datos.Producto_Rebajado pr = null;

				try {
					pr = ur.cargarProductoRebajado(p.get_Producto());
				} catch (PersistentException e) {
					e.printStackTrace();
				}

				if (pr != null) {
					productos += p.get_Producto().getNombre() + " -  " + pr.getPrecio_rebajado() + " € \n";
				} else {
					productos += p.get_Producto().getNombre() + " -  " + p.get_Producto().getPrecio_producto()
							+ " € \n";
				}
			}
			
			Span productosCompra = new Span();
			productosCompra.setText(productos);
			productosCompra.setWidth("100%");
			this.getHuecoProductos().as(VerticalLayout.class).add(productosCompra);
		}



		
		this.getFecha().setText(this.compra.getFecha_estado());
		this.getPrecio().setText(this.compra.getPrecio_total() + " €");
		this.getCodigo().setText(this.compra.getCodigo() + "");
	}

	public void inicializar() {
		Cancelar();
		cargarDatosCompra();
	}

	public void cargarPendienteEnviado() {
		iUR iur = new BDPrincipal();

		try {
			pendienteResultado = iur.cargarPendienteEnviado((base_de_datos.Enviado) (this.compra));
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Cancelar() {
		this.getBoton_cancelar_pedido().addClickListener(event -> {
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
