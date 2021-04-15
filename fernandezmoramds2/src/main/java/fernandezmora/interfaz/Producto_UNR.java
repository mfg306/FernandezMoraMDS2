package fernandezmora.interfaz;

public class Producto_UNR extends Producto {

	public UNR_ _uNR_;
	public Añadir_al_carrito _añadir_al_carrito;

	public Producto_UNR(UR_UNR unr) { // para que sirva para Ver_Producto_UR
		if (unr instanceof UNR_)
			this._uNR_ = (UNR_) unr;
		Anadir_al_carrito();
	}

	public void Anadir_al_carrito() {
		this.getBoton_anadir_carrito().addClickListener(event -> {
			// Formar el producto_carrito
			Producto_carrito pc = new Producto_carrito(this);

			// Anadirlo al listado de productos del usuario
			this._uNR_.miListadoProductos(pc);

		});
	}

}