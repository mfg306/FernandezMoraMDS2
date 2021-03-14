package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionar_empleados;

public class Gestionar_empleados extends VistaGestionar_empleados{

	public Administrador _administrador;
	public Crear_empleados _crear_empleados;
	public Empleados _empleados;
	public VerticalLayout layout;

	
	public Gestionar_empleados() {
		this._empleados = new Empleados();
		this._empleados.add_Empleados();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout.add(this._empleados);		
	}
	
	public void ocultar_Gestionar_Ofertas() {
		layout.remove(this._empleados);
	}
	
}