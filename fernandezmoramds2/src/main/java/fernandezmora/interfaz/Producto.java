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
	private base_de_datos.Producto producto;
	
	public Producto(base_de_datos.Producto p) {
		this.producto = p;
		verProducto();
		inicializar(p);
	}
	
	public void inicializar(base_de_datos.Producto p) {
		this._comentarios = new Comentarios();
		

	}
	
	public void verProducto() {
		
		this.getNombre_producto().setText(this.producto.getNombre());
		this.getPrecio().setText(String.valueOf(this.producto.getPrecio_producto()));
		this.getVaadinItem6().setText(this.producto.getDescripcion());
		
		
	}
	
}