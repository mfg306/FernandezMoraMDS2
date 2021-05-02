package fernandezmora.interfaz;

import com.vaadin.flow.component.notification.Notification;

public class Producto_UNR extends Producto {

	public UNR_ _uNR_;
	public Añadir_al_carrito _añadir_al_carrito;

	public Producto_UNR(UR_UNR unr,base_de_datos.Producto p) { // para que sirva para Ver_Producto_UR
		super(p);
		if (unr instanceof UNR_) this._uNR_ = (UNR_) unr;
		Anadir_al_carrito(p);
		this.getVaadinVerticalLayout2().setVisible(false);
	}

	public void Anadir_al_carrito(base_de_datos.Producto p) {
		this.getBoton_anadir_carrito().addClickListener(event -> {
			// Formar el producto_carrito
			Producto_carrito pc = new Producto_carrito(this,p);

			
			/*Falta en Producto_carrito implementar el equals pero nos hace falta la base de datos*/
			if(!this._uNR_.listaAux.contains(pc)) {
				Notification.show("No esta");
				pc.incrementarCantidad();
				this._uNR_.miListadoProductos(pc);
				Notification.show("" + this._uNR_.listaAux.size());
			} else {
				Notification.show("Si esta");

				int index = 0;
				index = this._uNR_.listaAux.indexOf(pc);
				this._uNR_.listaAux.get(index).incrementarCantidad();
			}
			
		});
	}



}