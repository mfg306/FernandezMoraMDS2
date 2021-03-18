package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVentas;

public class Ventas extends VistaVentas{
	public Gestionar_ventas _gestionar_ventas;
	public Vector<Venta> _list_Venta = new Vector<Venta>();
	VerticalLayout layout;
	
	public Ventas() {
		inicializar();
	}
	
	public void inicializar() {
		this._list_Venta = new Vector<>();
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	}
	
	public void add_ventas() {
		Venta v = new Venta();
		this._list_Venta.add(v);
		
		layout.add(v);
			
	}
}