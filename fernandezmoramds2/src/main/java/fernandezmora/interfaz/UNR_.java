package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iUNR_;

public class UNR_ extends UR_UNR {
	public Menu_UNR _menu_UNR;
	public Producto_UNR _producto_UNR;
	public VerticalLayout layout;

	public UNR_() {

		_menu_UNR = new Menu_UNR();
		_producto_UNR = new Producto_UNR();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.getHuecoMenu().as(VerticalLayout.class).add(_menu_UNR);
		abrir_iniciar_sesion();
		abrir_Registrarse();
		abrir_iniciar_sesion_Registrarse();
		abrir_Ver_Categorias();
		abrir_RecuperarContraseña();

	}
	
	public void abrir_Ver_Categorias() {
		this.getBotonVerCategorias().addClickListener(event ->{
			ocultarVerCategoriasUNR();
			this._ver_categorias = new Ver_categorias();
			this.layout.add(this._ver_categorias._categorias);
			
		});
	}

	public void abrir_Registrarse() {

		this._menu_UNR._iniciar_sesion_UNR.getBotonRegistrarse().addClickListener(event -> {
			this.layout.remove(this._menu_UNR._iniciar_sesion_UNR);
			this.layout.add(this._menu_UNR._iniciar_sesion_UNR._registrarse);

		});
	}

	public void abrir_iniciar_sesion_Registrarse() {

		this._menu_UNR._iniciar_sesion_UNR._registrarse.getBotonIniciarSesion().addClickListener(event -> {
			this.layout.remove(this._menu_UNR._iniciar_sesion_UNR._registrarse);
			this.layout.add(this._menu_UNR._iniciar_sesion_UNR);

		});
	}

	public void abrir_RecuperarContraseña() {

		this._menu_UNR._iniciar_sesion_UNR.getVaadinButton1().addClickListener(event -> {
			this.layout.remove(this._menu_UNR._iniciar_sesion_UNR);
			this._menu_UNR._iniciar_sesion_UNR._recuperar_contrasenia = new Recuperar_contrasenia();
			this.layout.add(this._menu_UNR._iniciar_sesion_UNR._recuperar_contrasenia);

		});
	}

	public void abrir_iniciar_sesion() {
		this._menu_UNR.getBoton_iniciar_sesion().addClickListener(event -> {
			ocultarInformacionUNR();
			layout.add(_menu_UNR._iniciar_sesion_UNR);
		});

	}

	public void ocultarInformacionUNR() {
		this.getHuecoMenu().setVisible(false);
		this.getBotonVerCategorias().setVisible(false);
	}
	
	public void ocultarVerCategoriasUNR() {
		this.getBotonVerCategorias().setVisible(false);
	}
	

}