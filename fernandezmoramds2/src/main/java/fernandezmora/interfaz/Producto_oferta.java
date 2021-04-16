package fernandezmora.interfaz;


import vistas.VistaProducto_oferta;

public class Producto_oferta extends VistaProducto_oferta{

	public Productos_oferta _productos_oferta;
	public Producto _producto;
	
	public Producto_oferta(Productos_oferta pof, UR_UNR unrunr) {
		inicializar(pof, unrunr);
	}
	
	public void inicializar(Productos_oferta pof, UR_UNR unrunr) {
		this._productos_oferta = pof;
		
		if(unrunr instanceof UR) this._producto = new Ver_producto_UR(unrunr);
		if(unrunr instanceof UNR_) this._producto = new Producto_UNR(unrunr);

			
	}
	
}