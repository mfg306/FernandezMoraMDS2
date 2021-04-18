package fernandezmora.interfaz;

import vistas.VistaProducto_mas_vendido_por_categorias;

public class Producto_mas_vendido_por_categoria extends VistaProducto_mas_vendido_por_categorias {
	public Producto _producto;
	
	public Productos_mas_vendidos_por_categorias _productos_mas_vendidos_por_categorias;
	
	public Producto_mas_vendido_por_categoria(Productos_mas_vendidos_por_categorias pmc, UR_UNR urunr) {
		
		inicializar(pmc, urunr);
	}
	
	public void inicializar(Productos_mas_vendidos_por_categorias pmc, UR_UNR urunr) {
		this._productos_mas_vendidos_por_categorias = pmc;
		if(urunr instanceof UNR_) this._producto = new Producto_UNR(urunr);
		if(urunr instanceof UR) this._producto = new Ver_producto_UR(urunr);
		
	}
}

