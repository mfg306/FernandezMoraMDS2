package fernandezmora.interfaz;

import java.util.Vector;
import vistas.VistaProducto;

public class Producto extends VistaProducto{

	public Producto_carrito _producto_carrito;
	public Producto_categoria _producto_categoria;
	public Producto_oferta _producto_oferta;
	public Comentarios _comentarios;
	public Vector<Imagen> _imagen = new Vector<Imagen>();
	
	public void Añadir_al_carrito() {
		throw new UnsupportedOperationException();
	}
}