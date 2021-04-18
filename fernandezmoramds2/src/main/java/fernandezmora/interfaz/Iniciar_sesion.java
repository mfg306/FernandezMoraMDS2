package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaIniciar_sesion;

public class Iniciar_sesion extends VistaIniciar_sesion {

	public Transportista_Encargado_NR _iniciar_sesion;
	public VerticalLayout layout;

	public Iniciar_sesion() {
		
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		this.getBoton_iniciar_sesion().addClickListener(event ->{
			
			if(this.getCorreo().getValue().equals("usuario")){
				UR ur = new UR();
				ocultar_iniciar_sesion();
		
				this.layout.add(ur); // 
			}
			
			if(this.getCorreo().getValue().equals("admin")){
				Administrador admin = new Administrador();
				ocultar_iniciar_sesion();
		
				this.layout.add(admin); // 
			}
			
			

			
		});
		
		inicializar();
	}

	public void ocultar_iniciar_sesion() {
		this.layout.removeAll();
	}

	public void inicializar() {
		this.getCorreo().setVisible(false);
	}

}