package fernandezmora.interfaz;

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
		abrirCarrito();
	}

	public void abrirCarrito() {
		this.getBoton_carrito().addClickListener(event -> {
			this._uNR_.getBotonVerCategorias().setVisible(false);
			
			if(this._ver_carrito_UNR._solicitar_identificación!=null) {
			   this._ver_carrito_UNR._solicitar_identificación.setVisible(false);
			   this._ver_carrito_UNR.getVaadinHorizontalLayout().setVisible(true);
			}
			
			this.layout.add(this._ver_carrito_UNR);
		});
	}

	public void abrir_iniciar_sesion() {

		this.getBoton_iniciar_sesion().addClickListener(event -> {
			this.getVaadinHorizontalLayout().setVisible(false);
			this._uNR_.getBotonVerCategorias().setVisible(false);

			if (this._uNR_._ver_categorias != null) 
				this._uNR_._ver_categorias._categorias.setVisible(false);
			
			if(this._ver_carrito_UNR!=null) {
			   this._ver_carrito_UNR.setVisible(false);
			   }
			if(this._ver_carrito_UNR._solicitar_identificación!=null) {
				this._ver_carrito_UNR._solicitar_identificación.setVisible(false);
			}

			this.layout.add(this._iniciar_sesion_UNR);

		});

	}

}
