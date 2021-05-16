package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import vistas.VistaGestionar_empleados;

public class Gestionar_empleados extends VistaGestionar_empleados{

	public Administrador _administrador;
	public Crear_empleados _crear_empleados;
	public Empleados _empleados;
	public VerticalLayout layout;

	public Gestionar_empleados(Administrador admin) {
		this._administrador = admin;
		this._crear_empleados = new Crear_empleados(this);
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		inicializar();
		retroceder();
	}
	
	public void retroceder() {
		this.getRetroceder().addClickListener(event ->{

			/*Si viene del inicio*/
			if(this._administrador.padre != null) {
				this._administrador.padre.removeAll();
			}
			
			/*Si ya se viene de un retroceder ==> se ha creado aqui en este metodo*/
			if(this._administrador.padre == null) {
				this._administrador.layout.removeAll();
			}
			
			Administrador admin = new Administrador(this._administrador.admin);
			this.ocultar_Gestionar_Empleados();
			this._administrador._menu_A.layout.removeAll();
			this._administrador.layout.add(admin);
		});
	}
	
	
	public void inicializar() {
		this._empleados = new Empleados(this);

		this.layout.removeAll();
		layout.add(this._crear_empleados);
		layout.add(this._empleados);
	}
	
	public void ocultar_Gestionar_Empleados() {
		this.layout.remove(this._crear_empleados);
		this.layout.remove(this._empleados);
		this.getH1().setVisible(false);
		this.getRetroceder().setVisible(false);
	}
		

	
}