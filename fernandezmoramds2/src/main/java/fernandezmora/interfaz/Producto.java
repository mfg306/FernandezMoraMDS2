package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;

import vistas.VistaProducto;

public class Producto extends VistaProducto{

	public Producto_carrito _producto_carrito;
	public Producto_categoria _producto_categoria;
	public Producto_oferta _producto_oferta;
	public Comentarios _comentarios;
	public Vector<Imagen> _imagen = new Vector<Imagen>();
	
	public Producto() {
		inicializar();
		Anadir_al_carrito();
	}
	
	public void inicializar() {
		this._comentarios = new Comentarios();

	}
	
	public void Anadir_al_carrito() {
		this.getBoton_anadir_carrito().addClickListener(event->{
			Notification.show("Añadido al carrito");
			Producto_carrito p =  new Producto_carrito(this._producto_carrito._productos_carrito);
			this._producto_carrito._productos_carrito._list_Producto_carrito.add(p);
			this._producto_carrito._productos_carrito.getVaadinHorizontalLayout1().add(p);
			
		});
	}
}