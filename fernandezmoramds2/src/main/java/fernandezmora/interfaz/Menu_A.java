package fernandezmora.interfaz;

public class Menu_A extends Ver_bandeja_de_entrada {
	public Administrador _administrador;
	
	/*Entendemos que en el momento en el que se crea un objeto Menu_A ya existe un Administrador.
	 * No nos interesa instanciar un nuevo Administrador, sino asignarnos el que ya está creado*/

	public Menu_A(Administrador _administrador) {
		
		/*De la clase Ver_bandeja_de_entrada solo nos interesa quedarnos con la parte del menu*/
		this.getBoton_enviados().setVisible(false);
		this.getBoton_recibidos().setVisible(false);
		this.getVaadinVerticalLayout1().setVisible(false);
		this.getSpan().setVisible(false);
		
		this._administrador = _administrador;
		
		correo();
		
	}
	
	/**
	 * Destruir al Administrador y volver a la vista inicial
	 */
	public void cerrar_sesion() {
		
		
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Acceder a la bandeja de correo cuando se pulse el botón del correo 
	 */
	public void correo() {
		this.getCorreo().addClickListener(event -> {
			_administrador.getVaadinHorizontalLayout().setVisible(false);
			_administrador.getVaadinHorizontalLayout1().setVisible(false);
			_administrador.getH1().setVisible(false);
			this.getBoton_enviados().setVisible(true);
			this.getBoton_recibidos().setVisible(true);
			this.getVaadinVerticalLayout1().setVisible(true);
			this.getSpan().setVisible(true);
		});
	}
}