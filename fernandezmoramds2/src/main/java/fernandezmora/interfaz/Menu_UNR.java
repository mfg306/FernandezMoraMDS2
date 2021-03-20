package fernandezmora.interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Menu_UNR extends Menu_UR_UNR {
	public UNR_ _uNR_;
	public Ver_carrito_UNR _ver_carrito_UNR;
	public Iniciar_sesion_UNR _iniciar_sesion_UNR;
	public VerticalLayout layout;

	public Menu_UNR(UNR_ unr) {
		_uNR_ = unr;
		_iniciar_sesion_UNR = new Iniciar_sesion_UNR(this);
		this._ver_carrito_UNR = new Ver_carrito_UNR(this);
		layout = this.getMenu().as(VerticalLayout.class);
		abrir_iniciar_sesion();

		abrir_carrito();
	}

	public void ocultar_Informacion_Al_Abrir_Carrito() {
		if (this._uNR_._ver_categorias != null) {
			this._uNR_.layout.remove(this._uNR_._ver_categorias._categorias);
		}

		/* Ver si se habia ocultado el carrito porque estaba abierto el de solicitar identificacion*/
		if (this._ver_carrito_UNR.getVaadinVerticalLayout().isVisible() == false) {
			this._ver_carrito_UNR.getVaadinVerticalLayout().setVisible(true);
			this._ver_carrito_UNR._solicitar_identificación.setVisible(false);
		}
		
	}

	@Override
	public void abrir_carrito() {
		this.getBoton_carrito().addClickListener(event -> {
			ocultar_Informacion_Al_Abrir_Carrito();
			
			if(this._ver_carrito_UNR.getProductosCarrito().isVisible() == false) {
				this._ver_carrito_UNR.inicializar();
				this._ver_carrito_UNR.getProductosCarrito().setVisible(true);		
			}
			

			if(this._ver_carrito_UNR.getProductosCarrito().isVisible() == false) this._ver_carrito_UNR.getProductosCarrito().setVisible(true);
			else this._uNR_.layout.add(this._ver_carrito_UNR); // Se añade en la pagina principal
		});
	}

	public void ocultarInformacionIniciarSesion() {
		this.getVaadinHorizontalLayout().setVisible(false);
		this._uNR_.getBotonVerCategorias().setVisible(false);

		if (this._uNR_._ver_categorias != null)
			this._uNR_._ver_categorias._categorias.setVisible(false);

		if (this._ver_carrito_UNR != null) {
			this._ver_carrito_UNR.setVisible(false);
		}
		if (this._ver_carrito_UNR._solicitar_identificación != null) {
			this._ver_carrito_UNR._solicitar_identificación.setVisible(false);
		}
	}

	public void abrir_iniciar_sesion() {

		this.getBoton_iniciar_sesion().addClickListener(event -> {
			ocultarInformacionIniciarSesion();
			this.layout.add(this._iniciar_sesion_UNR);

		});

	}

}
