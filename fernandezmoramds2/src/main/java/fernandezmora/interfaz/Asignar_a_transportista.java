package fernandezmora.interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.iEncargado_de_compras;
import vistas.VistaAsignar_a_transportista;

public class Asignar_a_transportista extends VistaAsignar_a_transportista {
	public Pedido_E _list_Pedido_E;
	VerticalLayout layout;
	public Select<String> posiblesTransportistas = new Select<>();
	base_de_datos.Pendiente pendiente;
	base_de_datos.Transportista[] listaT = null;

	public Asignar_a_transportista(Pedido_E pedido, base_de_datos.Pendiente pendiente) {
		this.pendiente = pendiente;
		inicializar(pedido);
	}

	public void inicializar(Pedido_E pedido) {
		this._list_Pedido_E = pedido;
		layout = this.getVerticalLayout_asignar_a_transportista().as(VerticalLayout.class);
		this.posiblesTransportistas.setWidth("100%");
		this.getHuecoSeleccion().setWidth("100%");
		this.getHuecoSeleccion().add(this.posiblesTransportistas);
		cargarTransportistas();
		guardar_Cambios();
	}

	public void ocultar_Asignar_a_transportista() {
		this.getH1Asignar_a_transportista().setVisible(false);
		this.getVerticalLayout_2_asignar_a_transportista().setVisible(false);
	}

	public void guardar_Cambios() {
		this.getAceptarAsignar_a_transportista().addClickListener(event -> {
			base_de_datos.Encargado_de_compras encargado = this._list_Pedido_E._pedidos_E._encargado_de_compras.encargado;
			iEncargado_de_compras eCompras = new BDPrincipal();
			
			for(base_de_datos.Transportista t : listaT) {
				if(t.getCorreo().equals(posiblesTransportistas.getValue())) {
					try {
						eCompras.asignarPedidoTransportista(this.pendiente,  t, encargado);
					} catch (PersistentException e1) {
//						e1.getMessage();
					}
				}
			}
			
			ocultar_Asignar_a_transportista();
			base_de_datos.Encargado_de_compras e = this._list_Pedido_E._pedidos_E._encargado_de_compras.encargado;			
			this._list_Pedido_E._pedidos_E._encargado_de_compras = new Encargado_de_compras(e);
			this.layout.add(this._list_Pedido_E._pedidos_E._encargado_de_compras);
			Notification.show("Pedido asignado con éxito a " + posiblesTransportistas.getValue());
		});
	}

	public void cargarTransportistas() {
		iEncargado_de_compras e = new BDPrincipal();
		
		try {
			listaT = e.cargarTransportistas();
			ArrayList<String> correos = new ArrayList<>();
			
			for(base_de_datos.Transportista t : listaT) {
				correos.add(t.getCorreo());
			}
			
			posiblesTransportistas.setItems(correos);
			
		} catch (PersistentException e1) {
			e1.printStackTrace();
		}
	}
}