package interfaz;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;

public class Editar_oferta extends Zona_productos {
	public Oferta_administrador _oferta_administrador;
	VerticalLayout layout;

	public Editar_oferta(Oferta_administrador oa) {
		super(null, oa.oferta, null, oa._ofertas_administrador._gestionar_ofertas);
		inicializar(oa);

		guardarOferta();
	}

	public void inicializar(Oferta_administrador oa) {
		this._oferta_administrador = oa;

		this.getH1CrearCategoria().setVisible(false);
		this.getH1CrearOferta().setVisible(false);
		this.getH1EditarCategoria().setVisible(false);
		this.getH2CrearCategoria().setVisible(false);
		this.getH2CrearOferta().setVisible(false);
		this.getH2EditarCategoria().setVisible(false);


		
		this.getCampoFecha().setPlaceholder(oa.oferta.getFecha_caducidad());
		this.getCampoOferta().setValue(oa.oferta.getNombre_Oferta());

		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		this.getCampoCategoria().setVisible(false);
		this.getNombreCategoria().setVisible(false);

		cancelar_edicion();
	}

	public void ocultar_editar_oferta() {
		this.getCampoOferta().setVisible(false);
		this.getCampoOferta1().setVisible(false);

		this.getH1EditarOferta().setVisible(false);
		this.getH2EditarOferta().setVisible(false);
		this.getH2().setVisible(false);
		this.getH21().setVisible(false);

		this.getVaadinHorizontalLayout().setVisible(false);

		this.getVaadinVerticalLayout1().setVisible(false);

		this.getHuecoIzquierda().setVisible(false);
		this.getHuecoDerecha().setVisible(false);
	}

	public void cancelar_edicion() {
		this.getBotonCancelar().addClickListener(event -> {
			retroceder();
		});
	}

	public void retroceder() {
		ocultar_editar_oferta();
		this._oferta_administrador._ofertas_administrador._gestionar_ofertas = new Gestionar_ofertas(
				this._oferta_administrador._ofertas_administrador._gestionar_ofertas._administrador);
		layout.add(this._oferta_administrador._ofertas_administrador._gestionar_ofertas);
	}

	public void guardarOferta() {
		this.getVaadinButton().addClickListener(event -> {
			iAdministrador admin = new BDPrincipal();

			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			Date date = new Date();
			String fechaActual = formatter.format(date);
			

			Vector<Producto_listado_administracion> listaProductos = this._productos_listado_administracion._list_Producto_listado_administracion;
			base_de_datos.Producto[] productosOferta = new base_de_datos.Producto[listaProductos.size()];
			double[] precios = new double[listaProductos.size()];

			try {
				
				for (int i = 0; i < listaProductos.size(); i++) {
					productosOferta[i] = listaProductos.get(i).producto;
					precios[i] = listaProductos.get(i).precio;
				}

				if(this.getCampoFecha().getValue() == null) {
					Notification.show("Introduzca una fecha de caducidad");
				} else {
					base_de_datos.Oferta ofertaActualizada = admin.actualizarOferta(this.getCampoOferta().getValue(),
							productosOferta, this.getCampoFecha().getValue().toString(), fechaActual,
							this._oferta_administrador.oferta.getId_Oferta(), precios);

					this._oferta_administrador.oferta = ofertaActualizada;
					this._oferta_administrador.inicializar(this._oferta_administrador._ofertas_administrador,
							ofertaActualizada);

					Notification.show("Oferta editada con exito");
					this.retroceder();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}