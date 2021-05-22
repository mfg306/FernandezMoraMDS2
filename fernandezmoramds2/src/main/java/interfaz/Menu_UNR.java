package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Menu_UNR extends Menu_UR_UNR {
	public UNR_ _uNR_;
	public Ver_carrito_UNR _ver_carrito_UNR;
	public Iniciar_sesion_UNR _iniciar_sesion_UNR;
	public VerticalLayout layout;

	public Menu_UNR(UNR_ unr) {
		super(unr);
		inicializar(unr);
		
		this.getBoton_iniciar_sesion().setSrc("login.png");
		this.getBoton_iniciar_sesion().setWidth("3vw");
	}

	public void inicializar(UNR_ unr) {
		_uNR_ = unr;
		layout = this.getMenu().as(VerticalLayout.class);
		this._buscador = new Buscador(this);
		this.getHuecoBuscador().as(VerticalLayout.class).add(this._buscador);
		
		abrir_iniciar_sesion();
		abrir_carrito();
		volver_a_Pagina_Inicial();
	}

	public void ocultar_Informacion_Al_Abrir_Carrito() {
		if (this._uNR_._ver_categorias != null) {
			this._uNR_.layout.remove(this._uNR_._ver_categorias);
		}

		if (this._ver_carrito_UNR != null && this._ver_carrito_UNR._solicitar_identificación != null) {
			this._ver_carrito_UNR.layout.remove(this._ver_carrito_UNR._solicitar_identificación);
			this._ver_carrito_UNR.getVaadinVerticalLayout().setVisible(true);
		}
		
		if(this._buscador != null && this._buscador._productos_busqueda != null) {
			/*Borramos el listado de productos busqueda*/
			this._buscador._productos_busqueda.getVaadinHorizontalLayout1().removeAll();
			/*Borramos cualquier posible producto que se haya podido abrir*/
			this._buscador._productos_busqueda.layout.removeAll();
		}
	}
	
	public void cerrar_carrito() {
		if (this._ver_carrito_UNR != null) {
			this._uNR_.layout.remove(this._ver_carrito_UNR);
		}
	}

	@Override
	public void abrir_carrito() {
		this.getBoton_carrito().addClickListener(event -> {
			cerrar_carrito();
			
			if(this._ver_carrito_UNR == null) {
				this._ver_carrito_UNR = new Ver_carrito_UNR(this);
				this._ver_carrito = this._ver_carrito_UNR;
			}


			this.ocultar_Informacion_Al_Abrir_Carrito();

			this._ver_carrito_UNR._productos_carrito.actualizarListaProductos(this._uNR_.listaAuxUNR);
			this._uNR_.limpiarInterfaz();
			this._uNR_.layout.add(this._ver_carrito_UNR);
		});
	}

	public void ocultarInformacionIniciarSesion() {
		this.getVaadinHorizontalLayout().setVisible(false);
		this._uNR_.getBotonVerCategorias().setVisible(false);
		this._uNR_.getProductosMasVendidosPorCategorias().setVisible(false);

		if (this._uNR_._ver_categorias != null) {
			this._uNR_._ver_categorias.layout.removeAll();
		}

		if (this._ver_carrito_UNR != null) {
			this._ver_carrito_UNR.setVisible(false);
			if (this._ver_carrito_UNR._solicitar_identificación != null) {
				this._ver_carrito_UNR._solicitar_identificación.setVisible(false);
			}
		}
	}

	@Override
	public void ocultar_Informacion_PaginaInicial() {
		this._uNR_.layoutOfertas.setVisible(false);
		this._uNR_.layoutProductosMasVendidosPorCategorias.setVisible(false);
	}

	public void abrir_iniciar_sesion() {
		this.getBoton_iniciar_sesion().addClickListener(event -> {
			_iniciar_sesion_UNR = new Iniciar_sesion_UNR(this);
			ocultarInformacionIniciarSesion();
			ocultar_Informacion_PaginaInicial();
			this.layout.removeAll();
			this.layout.add(this._iniciar_sesion_UNR);

		});

	}
	
	
	public void volver_a_Pagina_Inicial() {
		this.getLogo_tienda().addClickListener(event -> {
			cerrar_carrito();
			ocultar_Productos_Busqueda();
			
			ocultar_Informacion_Al_Abrir_Carrito();
			
			for(Oferta o : this._uNR_._ofertas._list_Ofertas) {
				o.cerrar_Oferta();
			}
			
			this._uNR_.inicializarURUNR();
			
			this._uNR_.layoutOfertas.setVisible(true);
			this._uNR_.layoutProductosMasVendidosPorCategorias.setVisible(true);
			this._uNR_.getBotonVerCategorias().setVisible(true);
			this._uNR_.getProductosMasVendidosPorCategorias().setVisible(true);
		});

	}
	
	public void ocultar_Productos_Busqueda() {
		if(this._buscador != null) {
			this._buscador._productos_busqueda.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		}
	}
	
	@Override
	public void limpiar_interfaz() {
		this.ocultar_Productos_Busqueda();
		this.ocultarInformacionIniciarSesion();
		this.ocultar_Informacion_Al_Abrir_Carrito();
	}

}
