package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaProductos_busqueda;

public class Productos_busqueda extends VistaProductos_busqueda{
	public Buscador _buscador;
	public Vector<Producto_busqueda> _list_Producto_busqueda;
	public VerticalLayout layout;
	
	public Productos_busqueda(Buscador buscador) {
		this._buscador = buscador;
		this._list_Producto_busqueda = new Vector<Producto_busqueda>();
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	
	}

	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}

	public void Clasificar_por_categoria() {
		throw new UnsupportedOperationException();
	}
}
