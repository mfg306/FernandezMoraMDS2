package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaComentarios;

public class Comentarios extends VistaComentarios {
	public Producto _producto;
	public Vector<Comentario> _list_Comentario = new Vector<Comentario>();
	VerticalLayout layout;
	public base_de_datos.Comentario[] comentarios;
	
	public Comentarios(Producto producto) {
		this.layout = this.getHuecoComentarios().as(VerticalLayout.class);
		inicializar(producto);
	}
	
	public void inicializar(Producto producto) {
		this._producto = producto;
		this._list_Comentario =  new Vector<Comentario>();
	}
	
	public void anadirComentarios(base_de_datos.Comentario c) {
	        Comentario comentario;
			comentario = new Comentario(c,c.get_Realiza(),this);
			this._list_Comentario.add(comentario);
		    this.layout.add(comentario);
			
	}
	
	
}