package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iEncargado_de_compras;
import vistas.VistaEncargado_de_compras;

import com.vaadin.flow.component.html.H1;


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
		layout = this.getHuecoListaPedidos().as(VerticalLayout.class);
		
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
		
		if(this._pedidos_E != null) {
			layout.remove(this._pedidos_E);
		}

		_pedidos_E = new Pedidos_E(this);
		layout.add(_pedidos_E);
		
		iEncargado_de_compras iE = new BDPrincipal();
		base_de_datos.Pendiente pendientes[] = null;
		try {
			pendientes = iE.cargarPedidosE(this.encargado.getIdEmpleado());
			
			if(pendientes != null && pendientes.length > 0) {
				for(base_de_datos.Pendiente p : pendientes) {
					this._pedidos_E.add_pedidos(p);
				}
			}  else {
				H1 aviso = new H1();
				aviso.setText("No tiene pedidos para asignar");
				this.layout.add(aviso);
			}

		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}