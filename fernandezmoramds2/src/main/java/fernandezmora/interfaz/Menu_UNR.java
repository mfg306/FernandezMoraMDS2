package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

public class Menu_UNR extends Menu_UR_UNR {
	public UNR_ _uNR_;
	public Ver_carrito_UNR _ver_carrito_UNR;
	public Iniciar_sesion_UNR _iniciar_sesion_UNR;
	public VerticalLayout layout;

	public Menu_UNR(UNR_ unr) {
		inicializar(unr);
	}
	
	public void inicializar(UNR_ unr) {
		_uNR_ = unr;
		_iniciar_sesion_UNR = new Iniciar_sesion_UNR(this);
		this._ver_carrito_UNR = new Ver_carrito_UNR(this);
		layout = this.getMenu().as(VerticalLayout.class);
		
		abrir_iniciar_sesion();
		abrir_carrito();
	}
	
	

	public void ocultar_Informacion_Al_Abrir_Carrito() {
		if (this._uNR_._ver_categorias != null) {
			this._uNR_.layout.remove(this._uNR_._ver_categorias);
		}
		
		if(this._ver_carrito_UNR._solicitar_identificación != null) {
			this._ver_carrito_UNR.layout.remove(this._ver_carrito_UNR._solicitar_identificación);
			this._ver_carrito_UNR.getVaadinVerticalLayout().setVisible(true);
		}
		
		this._ver_carrito_UNR.cerrar_Producto();
		
	}

	@Override
	public void abrir_carrito() {
		this.getBoton_carrito().addClickListener(event -> {
			ocultar_Informacion_Al_Abrir_Carrito();
			
			this._ver_carrito_UNR.getVaadinHorizontalLayout().setVisible(true);	
			ocultar_Informacion_PaginaInicial();
			this._uNR_.getBotonVerCategorias().setVisible(false);
			this._uNR_.getProductosMasVendidosPorCategorias().setVisible(false);
			this._uNR_.layout.add(this._ver_carrito_UNR);
		});
	}

	public void ocultarInformacionIniciarSesion() {
		this.getVaadinHorizontalLayout().setVisible(false);
	    this._uNR_.getBotonVerCategorias().setVisible(false);
	    this._uNR_.getProductosMasVendidosPorCategorias().setVisible(false);

		if (this._uNR_._ver_categorias != null)
			this._uNR_._ver_categorias._categorias.setVisible(false);

		if (this._ver_carrito_UNR != null) {
			this._ver_carrito_UNR.setVisible(false);
		}
		if (this._ver_carrito_UNR._solicitar_identificación != null) {
			this._ver_carrito_UNR._solicitar_identificación.setVisible(false);
		}
	}

	public void ocultar_Informacion_PaginaInicial() {
		this._uNR_.layoutOfertas.setVisible(false);
	}
	
	
	public void abrir_iniciar_sesion() {

		this.getBoton_iniciar_sesion().addClickListener(event -> {
			ocultarInformacionIniciarSesion();
			//ocultar_Informacion_PaginaInicial();
			this.layout.add(this._iniciar_sesion_UNR);

		});

	}

}
