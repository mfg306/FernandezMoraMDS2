package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import base_de_datos.Comentario;
import vistas.VistaProducto;

public class Producto extends VistaProducto{

	public Producto_carrito _producto_carrito;
	public Producto_categoria _producto_categoria;
	public Producto_oferta _producto_oferta;
	public Comentarios _comentarios;
	public Vector<Imagen> _imagen = new Vector<Imagen>();
	public Select<String> valoracion = new Select<>();
	public base_de_datos.Producto producto;
	public base_de_datos.Comentario[] comentarios;
	
	public Producto(base_de_datos.Producto p) {
		this.producto = p;
		inicializar();
		//verProducto();
		Notification.show("Producto General creado");
	}
	
	public void inicializar() {
		this._comentarios = new Comentarios(this);
		verProducto();
		this.getListaComentarios().as(VerticalLayout.class).add(this._comentarios);
	}
	
	public void verProducto() {
		this.getNombre_producto().setText(this.producto.getNombre());
		this.getPrecio().setText(String.valueOf(this.producto.getPrecio_producto()));
		this.getVaadinItem6().setText(this.producto.getDescripcion());
		this.comentarios = this.producto._Pertenece_a.toArray();
		
		for(base_de_datos.Comentario c : this.comentarios) {
			fernandezmora.interfaz.Comentario comentario = new fernandezmora.interfaz.Comentario(c,this._comentarios);
			comentario.getValoracionProducto().setText(c.getComentario());
		    this._comentarios._list_Comentario.add(comentario);
		    this._comentarios.layout.add(comentario);
			
		}
		
		
	}
	
}