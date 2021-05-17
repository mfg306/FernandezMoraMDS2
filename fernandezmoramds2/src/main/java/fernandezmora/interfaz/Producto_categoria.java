package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import vistas.VistaProducto_categoria;

public class Producto_categoria extends VistaProducto_categoria{
	public Productos_categoria _productos_categoria;
	public Producto _producto;
	
	public Producto_categoria(Productos_categoria pc, UR_UNR unrunr, base_de_datos.Producto p) {
		this.getNombre_producto().setText(p.getNombre());
		this.getPrecio_producto().setText(String.valueOf(p.getPrecio_producto()) + " €");
		this.getImagen_producto().setWidth("10vw");
		this.getImagen_producto().setSrc(p._Imagen.toArray()[0].getRuta());
		inicializar(pc, unrunr,p);
	}
	
	public void inicializar(Productos_categoria pc, UR_UNR unrunr,base_de_datos.Producto p) {
		this._productos_categoria = pc;
		
		abrir_Producto_Categoria(unrunr,p);
	}
	
	public void abrir_Producto_Categoria(UR_UNR unrunr,base_de_datos.Producto p) {
		this.getImagen_producto().addClickListener(event->{
			this._productos_categoria.getVaadinHorizontalLayout().setVisible(false);
			this._productos_categoria.getLista_productos_categoria().setVisible(false);
			
			
			if(unrunr instanceof UR) {
				this._producto = new Ver_producto_UR(unrunr,p);
				
			}
			if(unrunr instanceof UNR_) {
				this._producto = new Producto_UNR(unrunr,p);
				
			}
			this._productos_categoria.getVerProductoCategoria().as(VerticalLayout.class).add(this._producto);
		});
	}
	
}