package fernandezmora.interfaz;

import vistas.VistaProducto_mas_vendido_por_categorias;

public class Producto_mas_vendido_por_categoria extends VistaProducto_mas_vendido_por_categorias {
	public Producto _producto;

	public Productos_mas_vendidos_por_categorias _productos_mas_vendidos_por_categorias;
	
	public Producto_mas_vendido_por_categoria(Productos_mas_vendidos_por_categorias pmc) {
		inicializar(pmc);
	}
	
	public void inicializar(Productos_mas_vendidos_por_categorias pmc) {
		this._productos_mas_vendidos_por_categorias = pmc;
		this._producto = new Producto();
	}
}

