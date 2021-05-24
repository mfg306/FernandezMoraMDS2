package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.Key;
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
	public boolean buscar = true;

	public Productos_busqueda(Buscador b, UR_UNR unrunr) {

		inicializar(b, unrunr, this.paginaActual);
	}

	public void inicializar(Buscador b, UR_UNR unrunr, int paginaActual) {
		this._buscador = b;
		_list_Producto_busqueda = new Vector<Producto_busqueda>();
		productoNuevo = new HorizontalLayout();
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		numeroTotalRegistros = 0;
		numeroTotalPaginas = 0;
		if (buscar) {
			verProductosBusqueda();
		} else {
			Notification.show("Productos buscados");
		}

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

				buscar = false;
				this.inicializar(this._buscador, this._buscador._menu_UR_UNR._uR_UNR, this.paginaActual);
			});
		}
	}

	public void Ver_siguientes() {
		if (this.getBoton_pagina_siguiente().isEnabled()) {
			this.getBoton_pagina_siguiente().addClickListener(event -> {
				if ((paginaActual + 1) < numeroTotalPaginas) {
					this.paginaActual++;
				}

				/*Una vez que se de al boton de siguiente volvemos a activar el boton de anterior*/
				this.getBoton_pagina_anterior().setEnabled(true);

				if (this.paginaActual + 1 == numeroTotalPaginas) {
					this.getBoton_pagina_siguiente().setEnabled(false);
				}

				buscar = false;
				this.inicializar(this._buscador, this._buscador._menu_UR_UNR._uR_UNR, this.paginaActual);
			});
		}
	}

	public void verProductosBusqueda() {

		this._buscador._busquedaTF.addKeyPressListener(Key.ENTER, event -> {
			buscar = false;
			this._buscador._menu_UR_UNR._uR_UNR.layout.remove(this);
			iUR_UNR i = new BDPrincipal();

			base_de_datos.Producto[] productos = null;
			try {
				if (this._buscador._busquedaTF.getValue().toString().equals("")) {
					Notification.show("Introduzca un producto en el buscador para realizar la busqueda");

				} else {
					productos = i.cargarProductosPorCategoria(this._buscador.categoriasBuscador.getValue(),
							this._buscador._busquedaTF.getValue());
				}
				for (base_de_datos.Producto p : productos) {
					this.add_ProductosBusqueda(p);
				}

				if (this._buscador._menu_UR_UNR._ver_carrito != null) {
					this._buscador._menu_UR_UNR.cerrar_carrito();
				}
				this._buscador._menu_UR_UNR._uR_UNR.limpiarInterfaz();
				this._buscador._menu_UR_UNR._uR_UNR.layout.add(this);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
	}

	public void Clasificar_por_categoria() {
		throw new UnsupportedOperationException();
	}
}
