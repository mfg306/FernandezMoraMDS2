package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;


public class Zona_productos extends Administrar_productos_anadidos {
	public Productos_listado _productos_listado;
	public VerticalLayout layoutDerecha;
	
	public Zona_productos() {
		this._productos_listado = new Productos_listado();
		this.layoutDerecha = this.getHuecoDerecha().as(VerticalLayout.class);
		this._productos_listado.add_productos_listado();
		this._productos_listado.add_productos_listado();

		this.layoutDerecha.add(this._productos_listado);
	}
}