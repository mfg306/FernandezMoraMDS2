package fernandezmora.interfaz;

import com.vaadin.flow.component.notification.Notification;

import vistas.VistaProducto_oferta;

public class Producto_oferta extends VistaProducto_oferta{

	public Productos_oferta _productos_oferta;
	public Producto _producto;
	
	public Producto_oferta(Productos_oferta pof) {
		this._productos_oferta = pof;
		this._producto = new Producto();
	}
	
}