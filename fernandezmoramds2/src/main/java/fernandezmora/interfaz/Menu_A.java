package fernandezmora.interfaz;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;

public class Menu_A extends Ver_bandeja_de_entrada {
	public Administrador _administrador;
	
	/*Entendemos que en el momento en el que se crea un objeto Menu_A ya existe un Administrador.
	 * No nos interesa instanciar un nuevo Administrador, sino asignarnos el que ya está creado*/

	public Menu_A(Administrador _administrador, base_de_datos.Usuario_General admin) {
		super(admin);
		inicializarMenu(_administrador);
		
	}
	
	public void inicializarMenu(Administrador _administrador) {
		this.getLogo().setSrc("");
		
		/*De la clase Ver_bandeja_de_entrada solo nos interesa quedarnos con la parte del menu*/
		this.getBoton_enviados().setVisible(false);
		this.getBoton_recibidos().setVisible(false);
		this.getVaadinVerticalLayout1().setVisible(false);
		this.getSpan().setVisible(false);
		this.getHuecoMensajes().setVisible(false);
		
		this._administrador = _administrador;
		
		correo();
		cerrar_sesion();
	}
	
	/**
	 * Destruir al Administrador y volver a la vista inicial
	 */
	public void cerrar_sesion() {
				
		this.getCerrar_sesion().addClickListener(event ->{
			UI.getCurrent().getSession().close();
		});
		
	}
	
	/**
	 * Acceder a la bandeja de correo cuando se pulse el botón del correo 
	 */
	public void correo() {
		this.getCorreo().addClickListener(event -> {
			this.getMenuAdmin().setVisible(true);
			_administrador.getVaadinHorizontalLayout().setVisible(false);
			_administrador.getVaadinHorizontalLayout1().setVisible(false);
			_administrador.getH1().setVisible(false);
			this.getBoton_enviados().setVisible(true); 
			this.getBoton_recibidos().setVisible(true);
			this.getHuecoMensajes().setVisible(true);
			this.getVaadinVerticalLayout1().setVisible(true);
			this.getSpan().setVisible(true);
			
			if(_administrador._gestionar_categorias != null) {
				_administrador._gestionar_categorias.setVisible(false);
			}
			
			if(_administrador._gestionar_empleados != null) {
				_administrador._gestionar_empleados.setVisible(false);
			}
			
			if(_administrador._gestionar_ofertas != null) {
				_administrador._gestionar_ofertas.setVisible(false);
			}
			
			if(_administrador._gestionar_productos != null) {
				_administrador._gestionar_productos.setVisible(false);
			}
			
			if(_administrador._gestionar_ventas != null) {
				_administrador._gestionar_ventas.setVisible(false);
			}
		});
	}
}