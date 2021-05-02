package fernandezmora.interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;

import base_de_datos.CategoriaDAO;
import base_de_datos.ProductoDAO;
import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
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
		inicializar();
	}
	
	public void inicializar() {
		this._comentarios = new Comentarios();
		verProducto();

	}
	
	public void verProducto() {
		
		iUR_UNR iUr_UNR = new BDPrincipal(); 
    	this.producto = iUr_UNR.cargarProducto(this.producto.getId_Producto());
    	this.getNombre_producto().setText(this.producto.getNombre());
    	this.getPrecio().setText(String.valueOf("Precio: " + this.producto.getPrecio_producto() + " €"));
    	this.getVaadinItem6().setText(this.producto.getDescripcion());
    	
    		
	}

}