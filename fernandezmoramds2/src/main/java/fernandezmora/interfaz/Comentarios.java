package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaComentarios;

public class Comentarios extends VistaComentarios {
	public Producto _producto;
	public Vector<Comentario> _list_Comentario = new Vector<Comentario>();
	VerticalLayout layout;
	
	public Comentarios(Producto producto) {
		this.layout = this.getHuecoComentarios().as(VerticalLayout.class);
		inicializar(producto);
	}
	
	public void inicializar(Producto producto) {
		this._producto = producto;
		this._list_Comentario =  new Vector<Comentario>();
	}
}