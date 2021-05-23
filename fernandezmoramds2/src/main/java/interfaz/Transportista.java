package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iTransportista;
import vistas.VistaTransportista;

//import basededatos.iTransportista;

public class Transportista extends VistaTransportista {
	public Pedidos_T _pedidos_T;
	VerticalLayout layout;
	base_de_datos.Transportista transportista;
	
	public Transportista(base_de_datos.Transportista transportista) {
		this.transportista = transportista;
		layout = this.getHuecoListaPedidos().as(VerticalLayout.class);


		cerrar_sesion();
		inicializar();
	}
	
	public void inicializar() {
		if(this._pedidos_T != null) {
			layout.remove(this._pedidos_T);
		}
		
		this._pedidos_T = new Pedidos_T(this);
			
		cargarPedidosT();
		
		if(this._pedidos_T._list_Pedido_T.size() > 0) {
			layout.add(this._pedidos_T);

		} else {
			Notification.show("No tiene ningun pedido para repartir.");
		}
	}
	
	public void ocultar_Transportista() {
		this.getH1().setVisible(false);
		this.getH3Transportista().setVisible(false);
		this.getVaadinButton().setVisible(false);
		this.getHuecoListaPedidos().setVisible(false);
		
	}
	
	public void cargarPedidosT(){
		iTransportista iT = new BDPrincipal();
		base_de_datos.Enviado[] listaEnviados = null;
		
		try {
			listaEnviados = iT.cargarPedidosT(this.transportista);
		} catch (PersistentException e1) {
			e1.printStackTrace();
		}
		
		for(base_de_datos.Enviado e : listaEnviados) {
			if(!e.getEnviado()) this._pedidos_T.add_pedidos_T(e);
		}
		
	}

	public void cerrar_sesion() {
		this.getVaadinButton().addClickListener(event ->{
			UI.getCurrent().getSession().close();
		});
	}
}