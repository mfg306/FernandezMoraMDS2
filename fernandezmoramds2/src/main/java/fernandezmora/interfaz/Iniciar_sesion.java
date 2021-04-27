package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaIniciar_sesion;

public class Iniciar_sesion extends VistaIniciar_sesion {

	public Transportista_Encargado_NR _iniciar_sesion;
	public VerticalLayout layout;

	public Iniciar_sesion() {
		
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
	
		inicializar();
	}

	public void ocultar_iniciar_sesion() {
		this.layout.removeAll();
	}

	public void inicializar()  {

		try {
			iniciarSesion();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		this.getCorreo().setVisible(false);
	}
	
	public void iniciarSesion() throws PersistentException {
		
		this.getBoton_iniciar_sesion().addClickListener(event -> {
			Notification.show("Iniciando sesion ... ");
		});

		/*
		 * 
		 * } else if(inicio_sesion.getCorreo().getValue().equals("t")) { Transportista t
		 * = new Transportista(); remove(unr); add(t); } else
		 * if(inicio_sesion.getCorreo().getValue().equals("e")) { Encargado_de_compras e
		 * = new Encargado_de_compras(); remove(unr); add(e); }
		 * 
		 * else { Notification.show("Este usuario no esta registrado"); }
		 */
	}

}