package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEditar_empleado;

public class Editar_empleado extends VistaEditar_empleado {

	public Empleado _empleado;
	public VerticalLayout layout;
	
	public Editar_empleado() {
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		cancelar_edicion();
	}

	
	public void cancelar_edicion() {
		this.getVaadinButton1().addClickListener(event ->{
			Gestionar_empleados ge = new Gestionar_empleados();
			this.getVaadinVerticalLayout1().setVisible(false);
			this.getH1().setVisible(false);
			layout.add(ge);
		});
	}
}