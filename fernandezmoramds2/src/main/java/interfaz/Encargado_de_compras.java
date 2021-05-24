package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iEncargado_de_compras;
import vistas.VistaEncargado_de_compras;

public class Encargado_de_compras extends VistaEncargado_de_compras{
	public Pedidos_E _pedidos_E;
	VerticalLayout layout;
	base_de_datos.Encargado_de_compras encargado;
	public iEncargado_de_compras _iEncargado_de_compras;
	
	public Encargado_de_compras(base_de_datos.Encargado_de_compras encargado) {
		this.encargado = encargado;
		cerrar_sesion();
		inicializar();
	}
	
	public void inicializar() {
		_pedidos_E = new Pedidos_E(this);

		layout = this.getHuecoListaPedidos().as(VerticalLayout.class);
		layout.add(_pedidos_E);
		
		cargarPedidos();
	}
	
	
	public void ocultar_encargado() {
		this.getH1().setVisible(false);
		this.getHuecoListaPedidos().setVisible(false);
		this.getVaadinButton().setVisible(false);
	}
	
	
	public void cerrar_sesion() {
		this.getVaadinButton().addClickListener(event ->{
			UI.getCurrent().getSession().close();
		});
	}
	
	public void cargarPedidos() {
		iEncargado_de_compras iE = new BDPrincipal();
		base_de_datos.Pendiente pendientes[] = null;
		try {
			pendientes = iE.cargarPedidosE(this.encargado.getIdEmpleado());
			for(base_de_datos.Pendiente p : pendientes) {
				this._pedidos_E.add_pedidos(p);
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}