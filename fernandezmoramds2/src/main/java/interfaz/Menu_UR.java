package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

public class Menu_UR extends Menu_UR_UNR {

	public UR _uR;
	public Ver_carrito_UR _ver_carrito_UR;
	public Ver_bandeja_de_entrada _ver_bandeja_de_entrada;
	public Ver_pedidos _ver_pedidos;
	public Editar_perfil _editar_perfil;
	public VerticalLayout layout;
	public Select<String> datos;

	public Menu_UR(UR ur, base_de_datos.UR usuario) {
		super(ur);
		this._uR = ur;
		this.getBoton_iniciar_sesion().setVisible(false);
		this.layout = this.getMenu().as(VerticalLayout.class);
		inicializar(usuario);
	}
	
	public void inicializar(base_de_datos.UR usuario) {
		
		this._buscador = new Buscador(this);
		this.getHuecoBuscador().as(VerticalLayout.class).add(this._buscador);
		
		if(datos != null) this.getVaadinHorizontalLayout().remove(datos);
		datos = new Select<>();
		
		datos.setLabel("Hola " + usuario.getNombre_usuario() + "!");
		datos.setItems("Mis pedidos", "Mis correos", "Configuración", "Cerrar sesion");

		datos.addValueChangeListener(event -> {
			if (event.getValue().equals("Configuración")) {
				abrirEditarPerfil();

			}
			if (event.getValue().equals("Mis pedidos")) {
				abrirPedidos();
			}
			if (event.getValue().equals("Cerrar sesion")) {
				cerrar_sesion();
			}

			if (event.getValue().equals("Mis correos")) {
				cerrar_carrito();
				this._ver_bandeja_de_entrada = new Ver_bandeja_de_entrada(usuario);
				abrir_bandeja_entrada();
			}

		});

		this.getVaadinHorizontalLayout().add(datos);
		
		abrir_carrito();
		volver_a_Pagina_Inicial();
	}

	public void abrir_bandeja_entrada() {
		ocultar_Informacion_PaginaInicial();
		this.ocultar_Informacion_Al_Abrir_Carrito();
		this.ocultarInformacionPedidos();
		this.ocultarInformacionEditarPerfil();
		this.ocultarInformacionVerBandejaDeEntrada();

		this.layout.add(this._ver_bandeja_de_entrada);
	}

	public void ocultar_Informacion_Al_Abrir_Carrito() {
		if (this._uR._ver_categorias != null) {
			this._uR.layout.remove(this._uR._ver_categorias);
		}
		
		if(this._buscador != null && this._buscador._productos_busqueda != null) {
			/*Borramos el listado de productos busqueda*/
			this._buscador._productos_busqueda.getVaadinHorizontalLayout1().removeAll();
			/*Borramos cualquier posible producto que se haya podido abrir*/
			this._buscador._productos_busqueda.layout.removeAll();
		}

		if (this._ver_carrito_UR != null) {
			if (this._ver_carrito_UR._introducir_datos_compra != null) {
				this._ver_carrito_UR.layout.remove(this._ver_carrito_UR._introducir_datos_compra);
				this._ver_carrito_UR.getVaadinVerticalLayout().setVisible(true);
			}
		}

	}

	@Override
	public void abrir_carrito() {
		this.getBoton_carrito().addClickListener(event -> {

			if (this._ver_carrito_UR == null) {
				this._ver_carrito_UR = new Ver_carrito_UR(this);
				this._ver_carrito = this._ver_carrito_UR;
			}

			this._ver_carrito_UR._productos_carrito.actualizarListaProductos(this._uR.listaAux);
			ocultar_Informacion_Al_Abrir_Carrito();
			ocultarInformacionVerBandejaDeEntrada();
			ocultarInformacionPedidos();
			ocultarInformacionEditarPerfil();
			this._ver_carrito_UR.getVaadinHorizontalLayout().setVisible(true);
			ocultar_Informacion_PaginaInicial();

			this._uR.layout.add(this._ver_carrito_UR);
		});
	}
	
	@Override
	public void limpiar_interfaz() {
		this.ocultarInformacionPedidos();
		this.ocultarInformacionEditarPerfil();
		this.cerrar_carrito();
		this.ocultarInformacionVerBandejaDeEntrada();
	}

	@Override
	public void ocultar_Informacion_PaginaInicial() {
		this._uR.layoutOfertas.setVisible(false);
		this._uR.layoutProductosMasVendidosPorCategorias.setVisible(false);
		this._uR.getBotonVerCategorias().setVisible(false);
		this._uR.getBotonVerCategorias().setVisible(false);
		this._uR.getProductosMasVendidosPorCategorias().setVisible(false);
	}

	public void ocultarInformacionPedidos() {
		if (this._ver_pedidos != null) {
			this.layout.remove(this._ver_pedidos);
		}
	}

	public void ocultarInformacionEditarPerfil() {
		if (this._editar_perfil != null) {
			this.layout.remove(this._editar_perfil);
		}
	}

	public void ocultarInformacionVerBandejaDeEntrada() {
		if (this._ver_bandeja_de_entrada != null) {
			this.layout.remove(this._ver_bandeja_de_entrada);
		}
	}

	public void limpiarInterfaz() {
		this.layout.removeAll();
	}

	public void cerrar_carrito() {
		if (this._ver_carrito_UR != null) {
			this._uR.layout.remove(this._ver_carrito_UR);
		}
	}

	public void abrirPedidos() {
		this._ver_pedidos = new Ver_pedidos(this);

		ocultar_Informacion_PaginaInicial();
		cerrar_carrito();
		this.ocultar_Informacion_Al_Abrir_Carrito();
		this.ocultarInformacionPedidos();
		this.ocultarInformacionEditarPerfil();
		this.ocultarInformacionVerBandejaDeEntrada();

		this.layout.add(this._ver_pedidos);
	}

	public void abrirEditarPerfil() {
		this._editar_perfil = new Editar_perfil(this);

		ocultar_Informacion_PaginaInicial();
		cerrar_carrito();
		this.ocultar_Informacion_Al_Abrir_Carrito();
		this.ocultarInformacionPedidos();
		this.ocultarInformacionEditarPerfil();
		this.ocultarInformacionVerBandejaDeEntrada();

		this.layout.add(this._editar_perfil);
	}

	public void cerrar_sesion() {
		UI.getCurrent().getSession().close();
	}

	public void volver_a_Pagina_Inicial() {
		this.getLogo_tienda().addClickListener(event -> {
			ocultar_Informacion_Al_Abrir_Carrito();
			ocultarInformacionVerBandejaDeEntrada();
			ocultarInformacionPedidos();
			ocultarInformacionEditarPerfil();
			cerrar_carrito();
			ocultar_Productos_Busqueda();
			
			for(Oferta o : this._uR._ofertas._list_Ofertas) {
				o.cerrar_Oferta();
			}
			
			

			this._uR.layoutOfertas.setVisible(true);
			this._uR.layoutProductosMasVendidosPorCategorias.setVisible(true);
			this._uR.getBotonVerCategorias().setVisible(true);
			this._uR.getProductosMasVendidosPorCategorias().setVisible(true);
			this._uR.layoutOfertas.removeAll();
			this._uR.layoutOfertas.add(this._uR_UNR._ofertas);
		});

	}
	
	public void ocultar_Productos_Busqueda() {
		if(this._buscador != null) {
			this._buscador._productos_busqueda.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		}
	}

}