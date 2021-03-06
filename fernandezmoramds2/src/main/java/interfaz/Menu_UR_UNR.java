package interfaz;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import vistas.VistaMenu_urunr;

public abstract class Menu_UR_UNR extends VistaMenu_urunr {
	public UR_UNR _uR_UNR;
	public Ver_carrito _ver_carrito;
	public Buscador _buscador;
	public VerticalLayout layout;

	public Menu_UR_UNR(UR_UNR urunr) {
		this._uR_UNR = urunr;
		this.getLogo_tienda().setSrc("icons/logo.png");
		this.getLogo_tienda().setAlt("Logo de la tienda");
		this.getLogo_tienda().setWidth("30%");

		this.getBoton_carrito().setSrc("carrito.png");
		this.getBoton_carrito().setWidth("2vw");
		
		inicializar();
	}

	public void inicializar() {
		layout = this.getMenu().as(VerticalLayout.class);
	}
	
	public abstract void cerrar_carrito();
	public abstract void limpiar_interfaz();

	public abstract void abrir_carrito();

	public abstract void ocultar_Informacion_PaginaInicial();

	
}
