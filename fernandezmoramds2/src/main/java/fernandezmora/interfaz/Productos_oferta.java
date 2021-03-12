package fernandezmora.interfaz;

import java.util.Vector;

import vistas.VistaProductos_oferta;


public class Productos_oferta extends VistaProductos_oferta{
	/*private event _ver_siguientes;
	private event _ver_anteriores;
	private JLabel _tituloContenedorL;
	private Label _numero_paginaL;*/
	public Oferta _list_Ofertas;
	public Vector<Producto_oferta> _list_Producto_oferta = new Vector<Producto_oferta>();

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}

	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}
}