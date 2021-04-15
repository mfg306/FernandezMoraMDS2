package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

public class Menu_UR extends Menu_UR_UNR {

	public UR _uR;
	public Ver_carrito_UR _ver_carrito_UR;
	public Ver_bandeja_de_entrada _ver_bandeja_de_entrada;
	public Ver_pedidos _ver_pedidos;
	public Editar_perfil _editar_perfil;
	public VerticalLayout layout;
	public Select<String> datos = new Select<>();

	public Menu_UR(UR ur) {
		this._uR = ur;
		this.getBoton_iniciar_sesion().setVisible(false);
		this.layout = this.getMenu().as(VerticalLayout.class);
		this._editar_perfil = new Editar_perfil(this);
		this._ver_pedidos = new Ver_pedidos(this);
		this._ver_bandeja_de_entrada = new Ver_bandeja_de_entrada();

		datos.setItems("Nombre de Usuario", "Mis pedidos", "Mis correos", "Configuración", "Cerrar sesion");

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
				abrir_bandeja_entrada();
			}

		});

		this.getVaadinHorizontalLayout().add(datos);
		abrir_carrito();
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

		if (this._ver_carrito_UR._introducir_datos_compra != null) {
			this._ver_carrito_UR.layout.remove(this._ver_carrito_UR._introducir_datos_compra);
			this._ver_carrito_UR.getVaadinVerticalLayout().setVisible(true);
		}

	}

	@Override
	public void abrir_carrito() {
		this.getBoton_carrito().addClickListener(event -> {

			if (this._ver_carrito_UR == null) {
				this._ver_carrito_UR = new Ver_carrito_UR(this);
			}
			
			this._ver_carrito_UR._productos_carrito.actualizarListaProductos(this._uR.listaAux);
			ocultar_Informacion_Al_Abrir_Carrito();
			
			ocultarInformacionPedidos();
			ocultarInformacionEditarPerfil();
			this._ver_carrito_UR.getVaadinHorizontalLayout().setVisible(true);
			ocultar_Informacion_PaginaInicial();
			this._uR.getBotonVerCategorias().setVisible(false);
			this._uR.getProductosMasVendidosPorCategorias().setVisible(false);
			this._uR.layout.add(this._ver_carrito_UR);
		});
	}
	
	@Override
	public void ocultar_Informacion_PaginaInicial() {
		this._uR.layoutOfertas.setVisible(false);
		this._uR.layoutProductosMasVendidosPorCategorias.setVisible(false);
		this._uR.getBotonVerCategorias().setVisible(false);
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

	public void ocultarCarrito() {
		if (this._ver_carrito_UR != null) {
			this._uR.layout.remove(this._ver_carrito_UR);
		}
	}

	public void abrirPedidos() {
		ocultar_Informacion_PaginaInicial();
		ocultarCarrito();
		this.ocultar_Informacion_Al_Abrir_Carrito();
		this.ocultarInformacionPedidos();
		this.ocultarInformacionEditarPerfil();
		this.ocultarInformacionVerBandejaDeEntrada();

		this.layout.add(this._ver_pedidos);
	}

	public void abrirEditarPerfil() {
		ocultar_Informacion_PaginaInicial();
		ocultarCarrito();
		this.ocultar_Informacion_Al_Abrir_Carrito();
		this.ocultarInformacionPedidos();
		this.ocultarInformacionEditarPerfil();
		this.ocultarInformacionVerBandejaDeEntrada();

		this.layout.add(this._editar_perfil);
	}

	public void cerrar_sesion() {
		_uR.layout.removeAll();
		UNR_ unr = new UNR_();
		_uR.layout.add(unr);
	}

}