package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Menu_UNR extends Menu_UR_UNR {
	public UNR_ _uNR_;
	public Ver_carrito_UNR _ver_carrito_UNR;
	public Iniciar_sesion_UNR _iniciar_sesion_UNR;
	public VerticalLayout layout;
	
	public Menu_UNR() {
		this.getBoton_iniciar_sesion().setVisible(true);
		this.getBoton_carrito().setVisible(true);
		this.getDatos_cuenta().setVisible(false);
		this.getBuscador_productos().setVisible(true);
		this.getClasificar_categoria().setVisible(true);

	}
	
	/*Método que al pulsar el boton iniciar sesión del Menu_UNR pasa a la vista de Iniciar_Sesion_UNR*/
	public void abrirIniciarSesionMenuUNR(VerticalLayout layout, Menu_UNR m_unr) {
		this._iniciar_sesion_UNR = new Iniciar_sesion_UNR();
		this.getBoton_iniciar_sesion().addClickListener(event -> {
			layout.remove(m_unr);
			layout.add(_iniciar_sesion_UNR);
			
		});
	}
}
			

				
