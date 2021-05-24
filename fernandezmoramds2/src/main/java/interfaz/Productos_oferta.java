package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;

import base_de_datos.Producto_Rebajado;
import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaProductos_oferta;

public class Productos_oferta extends VistaProductos_oferta {

	public Oferta _list_Ofertas;
	public Vector<Producto_oferta> _list_Producto_oferta;
	public Producto_oferta producto_oferta;
	public int productosPorPagina = 2;
	public int numeroTotalRegistros = 0;
	public int numeroTotalPaginas = 0;
	public int paginaActual = 0;

	public Productos_oferta(Oferta of, UR_UNR unrunr) {
		inicializar(of, unrunr, this.paginaActual);
	}

	public void inicializar(Oferta of, UR_UNR unrunr, int paginaActual) {
		this._list_Ofertas = of;
		_list_Producto_oferta = new Vector<Producto_oferta>();
		numeroTotalRegistros = 0;
		numeroTotalPaginas = 0;
		verProductosOferta();
		Ver_anteriores();
		Ver_siguientes();
	}

	public void add_Oferta(base_de_datos.Producto p) {
		Producto_oferta po = new Producto_oferta(this, this._list_Ofertas._ofertas._uR_UNR, p);
		boolean encontrado = false;

		for (int i = 0; i < this._list_Producto_oferta.size(); i++) {
			if (this._list_Producto_oferta.get(i).producto.getId_Producto() == p.getId_Producto()) {
				encontrado = true;
			}
		}

		if (!encontrado) {
			this._list_Producto_oferta.add(po);
			this.numeroTotalRegistros++;
		}

		this.mostrar_Productos_Oferta_paginados();
	}

	public void mostrar_Productos_Oferta_paginados() {
		this.getLista_productos_oferta().removeAll();

		if (numeroTotalRegistros % 2 == 0) {
			numeroTotalPaginas = numeroTotalRegistros / productosPorPagina;
		} else {
			numeroTotalPaginas = (int) Math.round(((numeroTotalRegistros + 1) / productosPorPagina));
		}

		this.getSpan().setText("" + (paginaActual + 1));
		this.getUltimaPagina().setText("" + numeroTotalPaginas);

		for (int i = (paginaActual * productosPorPagina); i < this._list_Producto_oferta.size(); i++) {
			if (i > paginaActual * productosPorPagina + productosPorPagina - 1)
				break;
			this.getLista_productos_oferta().add(this._list_Producto_oferta.get(i));
		}
	}


	public void Ver_siguientes() {
		if (this.getBoton_pagina_siguiente().isEnabled()) {
			this.getBoton_pagina_siguiente().addClickListener(event -> {
				if ((paginaActual + 1) < numeroTotalPaginas) {
					this.paginaActual++;
				}

				/*
				 * Una vez que se de al boton de siguiente volvemos a activar el boton de
				 * anterior
				 */
				this.getBoton_pagina_anterior().setEnabled(true);

				if (this.paginaActual + 1 == numeroTotalPaginas) {
					this.getBoton_pagina_siguiente().setEnabled(false);
				}
				mostrar_Productos_Oferta_paginados();
			});

		}
	}

	public void Ver_anteriores() {
		if (this.getBoton_pagina_anterior().isEnabled()) {
			this.getBoton_pagina_anterior().addClickListener(event -> {
				if (paginaActual > 0) {
					this.paginaActual--;
				}

				/*
				 * Una vez que se le da al boton de anterior volvemos a activar el boton de
				 * siguiente
				 */
				this.getBoton_pagina_siguiente().setEnabled(true);

				if (this.paginaActual == 0) {
					this.getBoton_pagina_anterior().setEnabled(false);
				}

				mostrar_Productos_Oferta_paginados();
			});
		}
	}

	public void verProductosOferta() {
		iUR_UNR iur = new BDPrincipal();

		Producto_Rebajado[] productos;
		try {
			productos = iur.cargarProductosOferta(
					this._list_Ofertas._ofertas.ofertas[this._list_Ofertas._ofertas._uR_UNR.indiceOfertas]);
			for (base_de_datos.Producto_Rebajado p : productos) {

				this.add_Oferta(p);

			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}

	}

}