package fernandezmora.interfaz;

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
		this.getLogo_tienda().setSrc("icons/logo.jpg");
		this.getLogo_tienda().setWidth("10vw");
		this.getLogo_tienda().setHeight("10vw");
		this.getLogo_tienda().setAlt("Logo de la tienda");
	
		this.getBoton_carrito().setSrc("carrito.png");
		this.getBoton_carrito().setWidth("3vw");
		
		
		inicializar();
	}
	
	public void inicializar() {
		layout = this.getMenu().as(VerticalLayout.class);
		this._buscador = new Buscador();
		this.getHuecoBuscador().as(VerticalLayout.class).add(this._buscador);
		//abrirProductoBusqueda();
	}
	
	public abstract void abrir_carrito();
	public abstract void ocultar_Informacion_PaginaInicial();

	
	public void abrirProductoBusqueda() {
		this._buscador._busquedaTF.addKeyPressListener(Key.ENTER, e -> {
			if(this._buscador._productos_busqueda != null) this.layout.remove(this._buscador._productos_busqueda); 
			this._buscador._productos_busqueda = new Productos_busqueda(this._buscador);
			this._uR_UNR.limpiarInterfaz();
			this.layout.add(this._buscador._productos_busqueda);

		});
	}
	

}
