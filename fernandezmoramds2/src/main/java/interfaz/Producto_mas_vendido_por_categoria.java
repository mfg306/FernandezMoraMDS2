package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaProducto_mas_vendido_por_categorias;

public class Producto_mas_vendido_por_categoria extends VistaProducto_mas_vendido_por_categorias {
	public Producto _producto;
	public Productos_mas_vendidos_por_categorias _productos_mas_vendidos_por_categorias;
	public VerticalLayout layout;
	base_de_datos.Producto producto;
	
	boolean productoAbierto = true;
	
	public Producto_mas_vendido_por_categoria(Productos_mas_vendidos_por_categorias pmc, UR_UNR urunr,base_de_datos.Producto p) {
		this.producto = p;
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
			productoAbierto = true;
			this.getImagen_producto().setVisible(false);
			this._productos_mas_vendidos_por_categorias._uR_UNR.layoutOfertas.setVisible(false);
			this._productos_mas_vendidos_por_categorias.getGetTituloMasVendidos().setVisible(false);
			this._productos_mas_vendidos_por_categorias.getListaCategoriasMasVendidos().setVisible(false);
			this._productos_mas_vendidos_por_categorias._uR_UNR.getBotonVerCategorias().setVisible(false);

			this._productos_mas_vendidos_por_categorias.limpiar_Interfaz_Para_Abrir_Producto(this);

			this.layout.add(this._producto);
		});
	}
	
	public void cerrar_producto() {
		if(productoAbierto) {
			this.layout.remove(this._producto);
		}
		
		productoAbierto = false;
	}
}

