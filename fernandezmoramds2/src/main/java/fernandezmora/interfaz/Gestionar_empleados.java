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
		this._empleados.add_Empleados();

		this._crear_empleados = new Crear_empleados();
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout.add(this._empleados);	
		layout.add(this._crear_empleados);
		
		this.getHuecoCrearEmpleados().as(VerticalLayout.class).add(_crear_empleados);
		
		editar_Empleado();

	}
	
	public void ocultar_Gestionar_Ofertas() {
		this.getHuecoCrearEmpleados().as(VerticalLayout.class).remove(_crear_empleados);
		layout.remove(this._empleados);
		
		this.getH1().setVisible(false);
	}
	
	public void editar_Empleado() {
		for(Empleado e: this._empleados._list_Empleado) {
			e.getVaadinButton().addClickListener(event ->{
				e._editar_empleado = new Editar_empleado();
				this.ocultar_Gestionar_Ofertas();
				layout.add(e._editar_empleado);
				
			});
		}
		
	}
	
}