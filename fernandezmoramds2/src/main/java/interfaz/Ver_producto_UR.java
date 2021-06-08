package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUR;

public class Ver_producto_UR extends Producto_UNR {

	public UR _uR;

	public Ver_producto_UR(UR_UNR _ur, base_de_datos.Producto p) {
		super(_ur, p);
		if (_ur instanceof UR) {
			this._uR = (UR) _ur;
		}
		Comentar();
		inicializar(_ur, p);
	}

	public void inicializar(UR_UNR _ur, base_de_datos.Producto p) {
		this._uR = (UR) _ur;
		this.getVaadinVerticalLayout2().setVisible(true);
		this.valoracion.setItems("1", "2", "3", "4", "5");
		this.getValorarProducto().as(VerticalLayout.class).add(this.valoracion);
	}

	public void Comentar() {
		this.getEnviar_comentario().addClickListener(event -> {
			iUR ur = new BDPrincipal();
			try {
				if (this.getDejar_comentario().getValue().equals("") && this.valoracion.getValue() != null) {
					Valorar();
					Notification.show("Valoración enviada");
					this.inicializar();
				}
				if (!this.getDejar_comentario().getValue().equals("") && this.valoracion.getValue() != null) {
					ur.comentar(this.getDejar_comentario().getValue(), this.producto.getId_Producto(),
							this._uR.UR.getId_Usuario());
					Valorar();

					Notification.show("Comentario y valoracion enviada");
					this.inicializar();

				}

				if (!this.getDejar_comentario().getValue().equals("") && this.valoracion.getValue() == null) {
					ur.comentar(this.getDejar_comentario().getValue(), this.producto.getId_Producto(),
							this._uR.UR.getId_Usuario());

					Notification.show("Comentario enviado");
					this.inicializar();

				}

				if (this.getDejar_comentario().getValue().equals("") && this.valoracion.getValue() == null) {
					Notification.show("Por favor, realice un comentario o añada una valoración");
				}
				
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});

	}

	public void Valorar() {
		iUR ur = new BDPrincipal();
		try {
			ur.valorar(this.producto.getId_Producto(), this._uR.UR.getId_Usuario(), this.valoracion.getValue());
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Anadir_al_carrito(base_de_datos.Producto p) {
		this.getBoton_anadir_carrito().addClickListener(event -> {
			Producto_carrito pc = new Producto_carrito(this, p, this._uR);

			if (!this._uR.estaElProducto(pc)) {
				pc.incrementarCantidad(this._uR);
				this._uR.miListadoProductos(pc);
				this._uR.actualizarNumeroItemsCarrito();
			} else {
				int index = 0;
				index = this._uR.indiceProducto(pc);
				this._uR.listaAux.get(index).incrementarCantidad(this._uR);
				this._uR.actualizarNumeroItemsCarrito();
			}
			Notification.show( this.producto.getNombre() + " añadido al carrito");
		});

	}

}