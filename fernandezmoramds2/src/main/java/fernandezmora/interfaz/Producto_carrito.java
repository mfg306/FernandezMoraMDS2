package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaProducto_carrito;

public class Producto_carrito extends VistaProducto_carrito {
	public Productos_carrito _productos_carrito;
	public Producto _producto;
	
	
	public Producto_carrito(Productos_carrito pc) {
		this._productos_carrito = pc;
		this._producto = new Producto_UNR(this);
		abrir_Producto_Carrito();
		
	}
	
	public void abrir_Producto_Carrito() {
		for(Producto_carrito pca : this._productos_carrito._list_Producto_carrito) {
			pca.getVerProductoCarrito().addClickListener(event ->{
				this._productos_carrito._ver_carrito.getVaadinHorizontalLayout().setVisible(false);
				this._productos_carrito._ver_carrito.getProductosCarrito().setVisible(false);
				this._productos_carrito._ver_carrito.getProductoURUNR().as(VerticalLayout.class).add(pca._producto);
			});
		}

	}

	public void Editar_cantidad() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar() {
		throw new UnsupportedOperationException();
	}
}