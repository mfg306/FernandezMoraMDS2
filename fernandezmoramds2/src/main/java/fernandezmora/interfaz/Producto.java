package fernandezmora.interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import base_de_datos.Comentario;
import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
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
		verProducto();
		this.listaComentarios.add(this._comentarios);	
	}
	
	public void verProducto() {
		int valoracion = 0;
		double mediaValoracion = 0.0;
		
		iUR_UNR iUr_UNR = new BDPrincipal();
		this.producto = iUr_UNR.cargarProducto(this.producto.getId_Producto());
		
		this.getNombre_producto().setText(this.producto.getNombre());
		this.getPrecio().setText(String.valueOf(this.producto.getPrecio_producto()));
		this.getVaadinItem6().setText(this.producto.getDescripcion());
		
		this.getImg().setWidth("20vw");
		this.getImg1().setWidth("8vw");
		this.getImg2().setWidth("8vw");
		this.getImg3().setWidth("8vw");
		this.getImg4().setWidth("8vw");
		
		if(this.producto._Imagen.toArray().length != 0) this.getImg().setSrc(this.producto._Imagen.toArray()[0].getRuta());
		if(this.producto._Imagen.toArray().length > 1) this.getImg1().setSrc(this.producto._Imagen.toArray()[1].getRuta());
		if(this.producto._Imagen.toArray().length > 2) this.getImg2().setSrc(this.producto._Imagen.toArray()[2].getRuta());
		if(this.producto._Imagen.toArray().length > 3) this.getImg3().setSrc(this.producto._Imagen.toArray()[3].getRuta());
		if(this.producto._Imagen.toArray().length > 4) this.getImg4().setSrc(this.producto._Imagen.toArray()[4].getRuta());
		
		
		try {
			this.comentarios = iUr_UNR.cargarComentarios(this.producto.getId_Producto());
		} catch (PersistentException e) {
			
			e.printStackTrace();
		}
		
		try {
			this.valoraciones = iUr_UNR.cargarValoraciones(this.producto.getId_Producto());
		} catch (PersistentException e) {
			
			e.printStackTrace();
		}
		
		
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