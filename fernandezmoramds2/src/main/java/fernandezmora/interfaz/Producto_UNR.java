package fernandezmora.interfaz;

import com.vaadin.flow.component.notification.Notification;

public class Producto_UNR extends Producto {

	public UNR_ _uNR_;
	public Añadir_al_carrito _añadir_al_carrito;
	
	public Producto_UNR(UR_UNR unr) { //para que sirva para Ver_Producto_UR
		this._uNR_ = (UNR_)unr;
		Anadir_al_carrito();
	}
	
	public void Anadir_al_carrito() {
		this.getBoton_anadir_carrito().addClickListener(event->{

			//1. Ver si ya hay un listado de productos -- la tiene UNR
			
			if(this._uNR_.listaAux == null || this._uNR_.listaAux.isEmpty()) {
				/*Si esta vacia entonces estos elementos todavia no existen
				 * Ver_carrito_UNR
				 * Producto_carritos*/
				Notification.show("En este caso");
				Productos_carrito listaPc = new Productos_carrito(this._uNR_.listaAux);
				Producto_carrito pc = new Producto_carrito(listaPc,this);
				this._uNR_.miListadoProductos(pc);
				listaPc.actualizarListaProductos(this._uNR_.listaAux);			
				
			} else {
				Notification.show("Otro caso");
			}
			
			
		});
	}
	
	
	
	
}