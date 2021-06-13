package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaProductos_busqueda;

public class Productos_busqueda extends VistaProductos_busqueda {
	public Buscador _buscador;
	public Vector<Producto_busqueda> _list_Producto_busqueda;
	public VerticalLayout layout;
	public int productosPorPagina = 2;
	public int numeroTotalRegistros = 0;
	public int numeroTotalPaginas = 0;
	public int paginaActual = 0;
	HorizontalLayout productoNuevo;
	base_de_datos.Producto[] productos = null;
	public boolean buscar = true;

	public Productos_busqueda(Buscador b, UR_UNR unrunr) {

		inicializar(b, unrunr, this.paginaActual);
	}

	public void inicializar(Buscador b, UR_UNR unrunr, int paginaActual) {
		
		_list_Producto_busqueda = new Vector<>();
		this._buscador = b;
		
		productoNuevo = new HorizontalLayout();
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		numeroTotalRegistros = 0;
		numeroTotalPaginas = 0;

		verProductosBusqueda();

		Ver_anteriores();
		Ver_siguientes();
	}

	public void add_ProductosBusqueda(base_de_datos.Producto p) {
		Producto_busqueda pb = new Producto_busqueda(this, p, this._buscador._menu_UR_UNR._uR_UNR);
		boolean encontrado = false;

		for (int i = 0; i < this._list_Producto_busqueda.size(); i++) {
			if (this._list_Producto_busqueda.get(i).p.getId_Producto() == p.getId_Producto()) {
				encontrado = true;
			}
		}

		if (!encontrado) {
			this._list_Producto_busqueda.add(pb);
			this.numeroTotalRegistros++;
		}
		
		this.mostrar_Productos_busqueda_paginados();
	}

	public void mostrar_Productos_busqueda_paginados() {
		this.getVaadinHorizontalLayout1().removeAll();
		this.productoNuevo.removeAll();

		if (numeroTotalRegistros % 2 == 0) {
			numeroTotalPaginas = numeroTotalRegistros / productosPorPagina;
		} else {
			numeroTotalPaginas = (int) Math.round(((numeroTotalRegistros + 1) / productosPorPagina));
		}

		this.getPrimeraPagina().setText("" + (paginaActual + 1));
		this.getUltimaPagina().setText("" + numeroTotalPaginas);

		for (int i = (paginaActual * productosPorPagina); i < this._list_Producto_busqueda.size(); i++) {
			if (i > paginaActual * productosPorPagina + productosPorPagina - 1)
				break;
			this.getVaadinHorizontalLayout1().add(this._list_Producto_busqueda.get(i));
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

				verProductosBusqueda();
			});
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

				verProductosBusqueda();
			});
		}
	}

	public void verProductosBusqueda() {
		iUR_UNR i = new BDPrincipal();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).setVisible(true);
	
		try {
			if (this._buscador._busquedaTF.getValue().equals(" ")) {
				Notification.show("Introduzca un producto en el buscador para realizar la busqueda");
			} else {
				this.productos = i.cargarProductosPorCategoria(this._buscador.categoriasBuscador.getValue(),
						this._buscador._busquedaTF.getValue());
				if (this.productos.length != 0) {
					for (base_de_datos.Producto p : this.productos) {
						this.add_ProductosBusqueda(p);
					}

					if (this._buscador._menu_UR_UNR._ver_carrito != null) {
						this._buscador._menu_UR_UNR.cerrar_carrito();
					}
					this._buscador._menu_UR_UNR._uR_UNR.limpiarInterfaz();
					this.getBoton_pagina_anterior().setVisible(true);
					this.getBoton_pagina_siguiente().setVisible(true);
					this.getPrimeraPagina().setVisible(true);
					this.getUltimaPagina().setVisible(true);
					this.getNumero_pagina().setVisible(true);
					this.getSpan().setVisible(true);

				} else {
					H1 noHayProductos = new H1();
					noHayProductos.setText("Sin resultados en la busqueda");
					this._buscador._menu_UR_UNR._uR_UNR.limpiarInterfaz();
					this.getVaadinHorizontalLayout1().removeAll();
					this.getVaadinHorizontalLayout1().add(noHayProductos);
					this.getBoton_pagina_anterior().setVisible(false);
					this.getBoton_pagina_siguiente().setVisible(false);
					this.getPrimeraPagina().setVisible(false);
					this.getUltimaPagina().setVisible(false);
					this.getNumero_pagina().setVisible(false);
					this.getSpan().setVisible(false);
				}
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}

	}

}
