package interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import basededatos.iAdministrador;
import de.mekaso.vaadin.addon.compani.AnimatedComponent;
import de.mekaso.vaadin.addon.compani.Animator;
import de.mekaso.vaadin.addon.compani.animation.AnimationBuilder;
import de.mekaso.vaadin.addon.compani.animation.AnimationTypes;
import de.mekaso.vaadin.addon.compani.animation.AnimationTypes.TextAnimation;
import de.mekaso.vaadin.addon.compani.effect.AnimationEffect;
import de.mekaso.vaadin.addon.compani.effect.TextDisplayEffect;
import vistas.VistaAdministrador;

@Route(value = "inicialAdmin")
public class Administrador extends VistaAdministrador {
	public Gestionar_empleados _gestionar_empleados;
	public Gestionar_categorias _gestionar_categorias;
	public Gestionar_ofertas _gestionar_ofertas;
	public Gestionar_ventas _gestionar_ventas;
	public Gestionar_productos _gestionar_productos;
	public Menu_A _menu_A;
	public VerticalLayout layout;
	public base_de_datos.Administrador admin;
	public VerticalLayout padre;
	public iAdministrador _iAdministrador;

	public Administrador(base_de_datos.Usuario_General admin, Iniciar_sesion_UNR vistaInicial) {
		
		
		this.admin = (base_de_datos.Administrador)admin;
		_menu_A = new Menu_A(this, admin);
		this.padre = vistaInicial.layout;
		inicializar();
	}

	public Administrador(base_de_datos.Usuario_General admin) {
		this.admin = (base_de_datos.Administrador) admin;
		_menu_A = new Menu_A(this, admin);
		inicializar();
	}

	public void inicializar() {
		this._menu_A.getMenuAdmin().setVisible(true);

		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		/*
		 * Ponemos el menu en un hueco que habiamos reservado para que se quede arriba
		 */
		this.getHuecoMenu().as(VerticalLayout.class).add(_menu_A);

		gestionarEmpleados();
		gestionarCategorias();
		gestionarOfertas();
		gestionarProductos();
		gestionarVentas();
	}

	public void ocultarAdministrador() {
		this.getVaadinHorizontalLayout().setVisible(false);
		this.getVaadinHorizontalLayout1().setVisible(false);
		this.getH1().setVisible(false);
	}

	public void gestionarEmpleados() {
		this.getBoton_gestionar_empleados().addClickListener(event -> {
			this.ocultarAdministrador();
			this._gestionar_empleados = new Gestionar_empleados(this);
			layout.add(this._gestionar_empleados);
		});
	}

	public void gestionarCategorias() {
		this.getBoton_gestionar_categorias().addClickListener(event -> {
			this.ocultarAdministrador();
			this._gestionar_categorias = new Gestionar_categorias(this);
			layout.add(this._gestionar_categorias);
		});
	}

	public void gestionarOfertas() {
		this.getBoton_gestionar_ofertas().addClickListener(event -> {
			this.ocultarAdministrador();
			this._gestionar_ofertas = new Gestionar_ofertas(this);
			layout.add(this._gestionar_ofertas);
		});
	}

	public void gestionarProductos() {
		this.getBoton_gestionar_productos().addClickListener(event -> {
			this.ocultarAdministrador();
			this._gestionar_productos = new Gestionar_productos(this);
			layout.add(this._gestionar_productos);
		});
	}

	public void gestionarVentas() {
		this.getBoton_gestionar_ventas().addClickListener(event -> {
			this.ocultarAdministrador();
			this._gestionar_ventas = new Gestionar_ventas(this);
			layout.add(this._gestionar_ventas);
		});

	}

}