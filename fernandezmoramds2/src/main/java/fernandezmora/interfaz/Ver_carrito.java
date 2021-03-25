package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_carrito;

public abstract class Ver_carrito extends VistaVer_carrito{
	public Menu_UR_UNR _menu_UR_UNR;
	public Productos_carrito _productos_carrito;
	public VerticalLayout layout;
	
	public Ver_carrito() {
		realizar_compra();
	}
	
	public abstract void realizar_compra();
	
	
	public void eliminar() {
		
	}
	
	public void seleccionar_varios() {
		
	}
	

	
	
}