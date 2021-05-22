package interfaz;

public class Producto_UNR extends Producto {

	public UNR_ _uNR_;
	public Añadir_al_carrito _añadir_al_carrito;

	public Producto_UNR(UR_UNR unr,base_de_datos.Producto p) { // para que sirva para Ver_Producto_UR
		super(p);
		if (unr instanceof UNR_) this._uNR_ = (UNR_) unr;
		this.Anadir_al_carrito(p);
		this.getVaadinVerticalLayout2().setVisible(false);
	}

	public void Anadir_al_carrito(base_de_datos.Producto p) {
		this.getBoton_anadir_carrito().addClickListener(event -> {
			Producto_carrito pc = new Producto_carrito(this , p, this._uNR_);
			
			if(!this._uNR_.estaElProducto(pc)) {
				pc.incrementarCantidad();
				this._uNR_.miListadoProductos(pc);
			} else {
				int index = 0;
				index = this._uNR_.indiceProducto(pc);
				this._uNR_.listaAuxUNR.get(index).incrementarCantidad();
				
			}
			
		});
	}

}