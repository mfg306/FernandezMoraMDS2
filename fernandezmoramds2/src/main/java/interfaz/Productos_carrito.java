package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaProductos_carrito;

public class Productos_carrito extends VistaProductos_carrito {
	public Ver_carrito _ver_carrito;
	public Vector<Producto_carrito> _list_Producto_carrito;
	public Producto_carrito _producto_carrito;
	public VerticalLayout layout;
	public VerticalLayout listadoProductos;
	private boolean seleccionarVarios;
	int contadorLayout = 0; 

	public Productos_carrito(Vector<Producto_carrito> aux, Ver_carrito vc, UR_UNR usuario) {
		this._ver_carrito = vc;
		this._list_Producto_carrito = new Vector<Producto_carrito>(aux);
		seleccionarVarios = false;
		actualizar_datos(usuario);
		
		listadoProductos = this.getListadoProductos().as(VerticalLayout.class);
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		inicializar(usuario);
		
		Seleccionar_varios();
		Borrar(usuario);
	}

	public void inicializar(UR_UNR usuario) {
		this.listadoProductos.removeAll();
		mostrarProductos();

	}

	public void mostrarProductos() {
		contadorLayout = 0;
		double precio = .0;
		HorizontalLayout hl = new HorizontalLayout();
		
		if(this._list_Producto_carrito.size() == 0) {
			Span aviso = new Span();
			aviso.setText("Todavia no tienes ningun producto en el carrito ... ");
			aviso.setWidth("100%");
			listadoProductos.add(aviso);
		}
		
		for (int i = 0; i < this._list_Producto_carrito.size(); i++) {
			if(contadorLayout == 0 || (contadorLayout) % 3 == 0) {
				if(contadorLayout != 0) {
					hl = new HorizontalLayout();
				}

				hl.add(this._list_Producto_carrito.get(i));
				
				this.listadoProductos.add(hl);
			} else {
				hl.add(this._list_Producto_carrito.get(i));
			}
			contadorLayout++;
			this._list_Producto_carrito.get(i).getCheckEliminar().setVisible(false);
			this._list_Producto_carrito.get(i).actualizarListado(this);
			
			precio += this._list_Producto_carrito.get(i)._producto.precioProducto*Integer.parseInt(this._list_Producto_carrito.get(i).seleccionCantidad.getValue());

		}

		this._ver_carrito.getSpan1().setText("" + precio + " €");
	}

	
	public void actualizar_datos(UR_UNR usuario) {
		for(Producto_carrito pc : this._list_Producto_carrito) {
			pc.seleccionCantidad.addValueChangeListener(event ->{
				mostrarProductos();
			});
		}
	}
	
	public void actualizarListaProductos(Vector<Producto_carrito> aux) {
		this._list_Producto_carrito = new Vector<Producto_carrito>(aux);
	}

	public void Seleccionar_varios() {
		this.getVaadinButton1().addClickListener(event -> {
			seleccionarVarios = true;
			for (int i = 0; i < this._list_Producto_carrito.size(); i++) {
				this._list_Producto_carrito.get(i).getCheckEliminar().setVisible(true);
				this._list_Producto_carrito.get(i).getVaadinButton().setVisible(false);
				this._list_Producto_carrito.get(i).seleccionCantidad.setVisible(false);
			}
		});
	}

	public void Borrar(UR_UNR usuario) {
		this.getVaadinButton().addClickListener(event -> {
			
			if (seleccionarVarios) {
				for (int i = 0; i < this._list_Producto_carrito.size(); i++) {
					if (this._list_Producto_carrito.get(i).getCheckEliminar().getValue() == true) {
						this.listadoProductos.remove(this._list_Producto_carrito.get(i));
					}
					
					if(this._list_Producto_carrito.get(i).getCheckEliminar().getValue() == false) {
						this._list_Producto_carrito.get(i).getCheckEliminar().setVisible(false);
						this._list_Producto_carrito.get(i).getVaadinButton().setVisible(true);
						this._list_Producto_carrito.get(i).seleccionCantidad.setVisible(true);
					}
				}

				/*
				 * Que lo borres de la lista de _list_Producto_carrito no sirve de nada porque
				 * luego la que se coge es la de la lista Aux
				 */
				for (int i = 0; i < usuario.listaAux.size(); i++) {
					if (this._list_Producto_carrito.get(i).getCheckEliminar().getValue() == true) {
						usuario.listaAux.remove(i);
						this._list_Producto_carrito.remove(i);
					}
				}
			} 
			
			
			if(!seleccionarVarios) {
				this._list_Producto_carrito.removeAllElements();
				this.listadoProductos.removeAll();
				usuario.listaAux.removeAllElements();

			}

			this.inicializar(usuario);
			this._ver_carrito._menu_UR_UNR._uR_UNR.actualizarNumeroItemsCarrito();

			/* Una vez que hemos borrado volvemos a ponerSeleccionarVarios a false */
			seleccionarVarios = false;
			
		});
		
	}

}