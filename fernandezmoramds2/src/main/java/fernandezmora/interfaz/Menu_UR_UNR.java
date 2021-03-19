package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMenu_urunr;

public class Menu_UR_UNR extends VistaMenu_urunr {
	public UR_UNR _uR_UNR;
	public Ver_carrito _ver_carrito;
	public Buscador _buscador;
	public VerticalLayout layout;
	
	public Menu_UR_UNR() {
		/*El primer usuario que va a entrar es el UNR, por lo que ponemos el desplegable del UR 
		 * oculto*/
		
		this.getDatos_cuenta().setVisible(false);
		layout = this.getMenu().as(VerticalLayout.class);
		this._ver_carrito = new Ver_carrito(this);
		abrirCarrito();
	}
	
	public void abrirCarrito() {
		this.getBoton_carrito().addClickListener(event->{
			this._uR_UNR.getBotonVerCategorias().setVisible(false);
		});
	}
	
	
	
	
	
	
	
	
	
}