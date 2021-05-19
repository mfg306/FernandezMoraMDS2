package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Enviado;
import base_de_datos.Pendiente;
import base_de_datos.Recibido;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaGestionar_ventas;

public class Gestionar_ventas extends VistaGestionar_ventas {
	public Administrador _administrador;
	public Ventas _ventas;
	VerticalLayout layout;
	iAdministrador admin = new BDPrincipal();
	base_de_datos.Pendiente[] pendientes;
	base_de_datos.Enviado[] enviados;
	base_de_datos.Recibido[] recibidos;

	public Gestionar_ventas(Administrador admin) {
		this._administrador = admin;
		inicializar();
		retroceder();
	}

	public void inicializar() {
		this._ventas = new Ventas();

		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout.add(this._ventas);

		abrirGestionarVentas();
	}
	
	public void retroceder() {
		this.getRetroceder().addClickListener(event ->{
			this.ocultar_ventas();
			/*Si viene del inicio*/
			if(this._administrador.padre != null) {
				this._administrador.padre.removeAll();
			}
			
			/*Si ya se viene de un retroceder ==> se ha creado aqui en este metodo*/
			if(this._administrador.padre == null) {
				this._administrador.layout.removeAll();
			}
			
			Administrador admin = new Administrador(this._administrador.admin);
			this._administrador._menu_A.layout.removeAll();
			this._administrador.layout.add(admin);
		});
	}

	public void ocultar_ventas() {
		this.getH1().setVisible(false);
		this.getRetroceder().setVisible(false);
	}

	public void abrirGestionarVentas() {

		try {
			recibidos = admin.cargarRecibidos();
			for (Recibido r : recibidos) {
				this._ventas.add_ventas(r);
			}

			enviados = admin.cargarEnviados();
			for (Enviado e : enviados) {
				this._ventas.add_ventas(e);
			}

			pendientes = admin.cargarPendientes();
			for (Pendiente p : pendientes) {
				this._ventas.add_ventas(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}