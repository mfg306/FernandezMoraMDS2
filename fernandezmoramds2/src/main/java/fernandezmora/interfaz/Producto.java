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
	public base_de_datos.Valoracion[]valoraciones;
	public base_de_datos.Comentario[] comentarios;
	public VerticalLayout listaComentarios;
	
	public Producto(base_de_datos.Producto p) {
		this.producto = p;
		listaComentarios = this.getListaComentarios().as(VerticalLayout.class);
		inicializar();
	}
	
	public void inicializar() {
		this.listaComentarios.removeAll();
		this._comentarios = new Comentarios(this);
		this.comentarios = this.producto._Pertenece_a.toArray();
		this.valoraciones = this.producto._Valorado_por.toArray();	
		verProducto();
		this.listaComentarios.add(this._comentarios);
		
		for(Comentario c : this.comentarios) {
			System.out.println(c.getComentario());
		}
		System.out.println("------------------");
	}
	
	public void verProducto() {
		int valoracion = 0;
		double mediaValoracion = 0.0;
		this.getNombre_producto().setText(this.producto.getNombre());
		this.getPrecio().setText(String.valueOf(this.producto.getPrecio_producto()));
		this.getVaadinItem6().setText(this.producto.getDescripcion());
		
		
		for(base_de_datos.Valoracion v : this.valoraciones) {
			valoracion += v.getValoracion();
		}
		
		if(this.valoraciones.length != 0 ) mediaValoracion = valoracion/this.valoraciones.length;
		else mediaValoracion = valoracion; 
		
		this.getValoracion_media().setText(String.valueOf(mediaValoracion) + " estrellas");
		
		for(base_de_datos.Comentario c : this.comentarios) {
			this._comentarios.anadirComentarios(c);
			this._comentarios.inicializar(this);
		}
		
	}
	
	
	
}