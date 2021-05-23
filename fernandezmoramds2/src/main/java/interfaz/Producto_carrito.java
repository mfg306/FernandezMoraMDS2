package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.html.Image;
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
		// this.getCheckEliminar().setValue(false);
		this._producto = p;
		this.producto = pc;

		this.getImg().setWidth("10vw");
		this.getImg().setHeight("15vw");

		this.getImg().setSrc(pc._Imagen.toArray()[0].getRuta());

		inicializar(pc, usuario);
	}

	public void incrementarCantidad() {
		this.cantidad++;
		seleccionCantidad.setValue("" + this.cantidad);
	}

	/**
	 * @param pc listado al que queremos que pertenezca ahora
	 */
	public void actualizarListado(Productos_carrito pc) {
		this._productos_carrito = pc;
	}

	public void inicializar(base_de_datos.Producto p, UR_UNR usuario) {

		this.getVaadinButton().addClickListener(event -> {
			Eliminar(usuario);
		});
	}

	public void Editar_cantidad() {
		seleccionCantidad.setItems("0", "1", "2", "3", "4");
		this.layout.add(seleccionCantidad);
	}

	public void Eliminar(UR_UNR usuario) {
		this._productos_carrito.listadoProductos.remove(this);
		this._productos_carrito._list_Producto_carrito.remove(this);
		usuario.actualizarMiListado(this._productos_carrito._list_Producto_carrito);
	}


}