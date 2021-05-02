package fernandezmora.interfaz;

public class Ver_producto_UR extends Producto_UNR {

	public UR _uR;

	public Ver_producto_UR(UR_UNR _ur,base_de_datos.Producto p) {
		super(_ur, p);
		this._uR = (UR) _ur;
		this.getVaadinVerticalLayout2().setVisible(true);

	}

	public void Comentar() {
		throw new UnsupportedOperationException();
	}

	public void Valorar() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void Anadir_al_carrito(base_de_datos.Producto p) {
		this.getBoton_anadir_carrito().addClickListener(event -> {
			// Formar el producto_carrito
			Producto_carrito pc = new Producto_carrito(this,p);

			// Anadirlo al listado de productos del usuario
			this._uR.miListadoProductos(pc);

		});

	}

}