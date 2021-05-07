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
		this._comentarios = new Comentarios(this);
		inicializar();
		Notification.show("Producto General creado");
	}
	
	public void inicializar() {
		verProducto();
		listaComentarios = this.getListaComentarios().as(VerticalLayout.class);
		this.listaComentarios.removeAll();
		this.listaComentarios.add(this._comentarios);
		
		
	}
	
	public void verProducto() {
		int valoracion = 0;
		double mediaValoracion = 0.0;
		this.valoraciones = this.producto._Valorado_por.toArray();
		this.getNombre_producto().setText(this.producto.getNombre());
		this.getPrecio().setText(String.valueOf(this.producto.getPrecio_producto()));
		this.getVaadinItem6().setText(this.producto.getDescripcion());
		
		
		for(base_de_datos.Valoracion v : this.valoraciones) {
			valoracion += v.getValoracion();
		}
		
		mediaValoracion = valoracion/this.valoraciones.length;
		this.getValoracion_media().setText(String.valueOf(mediaValoracion) + " estrellas");
		
		this.comentarios = this.producto._Pertenece_a.toArray();
		for(base_de_datos.Comentario c : this.comentarios) {
			this._comentarios.anadirComentarios(c);
		}
		
		}
	
	
	
}