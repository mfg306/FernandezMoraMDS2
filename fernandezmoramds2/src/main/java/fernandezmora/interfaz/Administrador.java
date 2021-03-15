package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAdministrador;

//import basededatos.iAdministrador;

public class Administrador extends VistaAdministrador{
	public Gestionar_empleados _gestionar_empleados;
	public Gestionar_categorias _gestionar_categorias;
	public Gestionar_ofertas _gestionar_ofertas;
	public Gestionar_ventas _gestionar_ventas;
	public Gestionar_productos _gestionar_productos;
	public Menu_A _menu_A;
	public VerticalLayout layout;

	
	public Administrador() {
		_menu_A = new Menu_A(this);
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);	
		
		/*Ponemos el menu en un hueco que habiamos reservado para que se quede arriba*/
		this.getHuecoMenu().as(VerticalLayout.class).add(_menu_A);
		
		gestionarEmpleados();
		gestionarCategorias();
		gestionarOfertas();
		gestionarProductos();		
	}
	
	
	public void ocultarAdministrador() {
		this.getVaadinHorizontalLayout().setVisible(false);
		this.getVaadinHorizontalLayout1().setVisible(false);
		this.getH1().setVisible(false);
		
	}
	
	
	public void gestionarEmpleados() {
		this.getBoton_gestionar_empleados().addClickListener(event -> {
			this.ocultarAdministrador();
			this._gestionar_empleados = new Gestionar_empleados(); 
			layout.add(this._gestionar_empleados);
		});
	}
	
	public void gestionarCategorias() {
		this.getBoton_gestionar_categorias().addClickListener(event -> {
			this.ocultarAdministrador();
			this._gestionar_categorias = new Gestionar_categorias(); 
			layout.add(this._gestionar_categorias);
		});
	}
	
	public void gestionarOfertas() {
		this.getBoton_gestionar_ofertas().addClickListener(event ->{
			this.ocultarAdministrador();
			this._gestionar_ofertas = new Gestionar_ofertas(); 
			layout.add(this._gestionar_ofertas);
		});
	}
	
	public void gestionarProductos() {
		this.getBoton_gestionar_productos().addClickListener(event ->{
			this.ocultarAdministrador();
			this._gestionar_productos = new Gestionar_productos(); 
			layout.add(this._gestionar_productos);
		});
	}
	
	
	
	
	
}