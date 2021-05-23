package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaProducto_mas_vendido_por_categorias;

public class Producto_mas_vendido_por_categoria extends VistaProducto_mas_vendido_por_categorias {
	public Producto _producto;
	public Productos_mas_vendidos_por_categorias _productos_mas_vendidos_por_categorias;
	public VerticalLayout layout;
	
	public Producto_mas_vendido_por_categoria(Productos_mas_vendidos_por_categorias pmc, UR_UNR urunr,base_de_datos.Producto p) {
		this.getImagen_producto().setWidth("10vw");

		if(p._Imagen != null && !p._Imagen.isEmpty()) {
			this.getImagen_producto().setSrc(p._Imagen.toArray()[0].getRuta());
		}
		
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		inicializar(pmc, urunr,p);
	}
	
	public void inicializar(Productos_mas_vendidos_por_categorias pmc, UR_UNR urunr,base_de_datos.Producto p) {
		this._productos_mas_vendidos_por_categorias = pmc;
		if(urunr instanceof UNR_) this._producto = new Producto_UNR(urunr,p);
		if(urunr instanceof UR) this._producto = new Ver_producto_UR(urunr,p);
		
		abrir_producto();
	}
	
	public void abrir_producto() {
		this.getImagen_producto().addClickListener(event ->{
			
			this.getImagen_producto().setVisible(false);
			this._productos_mas_vendidos_por_categorias._uR_UNR.layoutOfertas.setVisible(false);
//			this._productos_mas_vendidos_por_categorias._uR_UNR.layoutProductosMasVendidosPorCategorias.setVisible(false);
//			this._productos_mas_vendidos_por_categorias._uR_UNR.getProductosMasVendidosPorCategorias().setVisible(false);
			this._productos_mas_vendidos_por_categorias._uR_UNR.getBotonVerCategorias().setVisible(false);



			this.layout.add(this._producto);
		});
	}
	
	public void cerrar_producto() {
//		this._productos_mas_vendidos_por_categorias._uR_UNR.layout.remove(this._producto);
		this.layout.removeAll();
	}
}

