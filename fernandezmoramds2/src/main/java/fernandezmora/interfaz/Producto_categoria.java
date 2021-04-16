package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaProducto_categoria;

public class Producto_categoria extends VistaProducto_categoria{
	public Productos_categoria _productos_categoria;
	public Producto _producto;
	
	public Producto_categoria(Productos_categoria pc, UR_UNR unrunr) {
		inicializar(pc, unrunr);
	}
	
	public void inicializar(Productos_categoria pc, UR_UNR unrunr) {
		this._productos_categoria = pc;
		
		if(unrunr instanceof UR) this._producto = new Ver_producto_UR(unrunr);
		if(unrunr instanceof UNR_) this._producto = new Producto_UNR(unrunr);


		abrir_Producto_Categoria();
	}
	
	public void abrir_Producto_Categoria() {
		this.getVerProducto().addClickListener(event->{
			this._productos_categoria.getVaadinHorizontalLayout().setVisible(false);
			this._productos_categoria.getLista_productos_categoria().setVisible(false);
			this._producto.getVaadinVerticalLayout2().setVisible(false);
			this._productos_categoria.getVerProductoCategoria().as(VerticalLayout.class).add(this._producto);
		});
	}
	
}