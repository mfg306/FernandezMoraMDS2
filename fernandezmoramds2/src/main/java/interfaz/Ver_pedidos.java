package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUR;
import vistas.VistaVer_pedidos;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.H1;

public class Ver_pedidos extends VistaVer_pedidos {
	public Menu_UR _menu_UR;
	public Pedidos _pedidos;
	public VerticalLayout layout;

	public Ver_pedidos(Menu_UR mur) {
		layout = this.getLista_pedidos().as(VerticalLayout.class);

		inicializar(mur);
	}

	public void inicializar(Menu_UR menuur) {

		this.layout.removeAll();

		this._menu_UR = menuur;
		this._pedidos = new Pedidos(this);
		this.layout.add(this._pedidos);

		verPedidos();
	}

	public void verPedidos() {
		iUR iur = new BDPrincipal();

		base_de_datos.Pendiente[] listaPendientes = iur.cargarPendientes(this._menu_UR._uR.UR);

		if (listaPendientes != null) {
			for (base_de_datos.Pendiente p : listaPendientes) {
				this._pedidos.add_pedidos(p);
			}
		}

		base_de_datos.Recibido[] listaRecibidos = iur.cargarRecibidos(this._menu_UR._uR.UR);

		if (listaRecibidos != null && listaRecibidos.length > 0) {
			for (base_de_datos.Recibido r : listaRecibidos) {
				this._pedidos.add_pedidos(r);
			}
		}
		
		base_de_datos.Compra[] listaEnviados  = null;
		
		try {
			listaEnviados = iur.cargarEnviados(this._menu_UR._uR.UR);
		} catch (PersistentException e1) {
			e1.printStackTrace();
		}
		
		if(listaEnviados != null && listaEnviados.length > 0) {
			for(base_de_datos.Compra e : listaEnviados) {
				this._pedidos.add_pedidos(e, true);
			}
		}

		if ((listaPendientes != null && listaPendientes.length == 0) && 
				(listaRecibidos != null && listaRecibidos.length == 0) && 
				(listaEnviados != null && listaEnviados.length == 0)) {
			H1 aviso = new H1();
			aviso.setText("No ha realizado ningun pedido todavía.");
			this.layout.add(aviso);
		}

	}

}
