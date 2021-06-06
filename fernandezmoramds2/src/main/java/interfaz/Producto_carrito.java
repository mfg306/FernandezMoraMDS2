package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import vistas.VistaProducto_carrito;

public class Producto_carrito extends VistaProducto_carrito {
	public Productos_carrito _productos_carrito;
	public Producto _producto;
	public Select<String> seleccionCantidad = new Select<>();
	public int cantidad = 0;
	public VerticalLayout layout;
	base_de_datos.Producto producto;

	public Producto_carrito(Producto p, base_de_datos.Producto pc, UR_UNR usuario) {
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		Editar_cantidad();
		this._producto = p;
		this.producto = pc;
		
		this.getImg().setSrc(pc._Imagen.toArray()[0].getRuta());
		this.getPrecioProducto().setText("" + this._producto.precioProducto + " €");
		this.getNombreProducto().setText(pc.getNombre());

		inicializar(pc, usuario);
	}

	public void incrementarCantidad() {
		if(this.seleccionCantidad.getValue() == null) {
			this.cantidad = 1;
		} else {
			this.cantidad = Integer.parseInt(this.seleccionCantidad.getValue());
		}
		seleccionCantidad.setValue("" + this.cantidad);
	}
	

	/**
	 * @param pc listado al que queremos que pertenezca ahora
	 */
	public void actualizarListado(Productos_carrito pc) {
		this._productos_carrito = pc;
	}

	public void inicializar(base_de_datos.Producto p, UR_UNR usuario) {
		
		this.seleccionCantidad.addValueChangeListener(event ->{
			if(usuario.estaElProducto(this)) {
				int index = 0;
				index = usuario.indiceProducto(this);
				usuario.listaAux.get(index).incrementarCantidad();
				usuario.actualizarNumeroItemsCarrito();
			}
		});

		this.getVaadinButton().addClickListener(event -> {
			Eliminar(usuario);
		});
	}

	public void Editar_cantidad() {
		seleccionCantidad.setItems("1", "2", "3", "4");
		this.getVaadinHorizontalLayout().add(seleccionCantidad);
	}

	public void Eliminar(UR_UNR usuario) {
		this._productos_carrito._list_Producto_carrito.remove(this);
		usuario.actualizarMiListado(this._productos_carrito._list_Producto_carrito);
		
		this._productos_carrito.inicializar(usuario);
	}


}