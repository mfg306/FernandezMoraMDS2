package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaEmpleado;

public class Empleado extends VistaEmpleado {
	public Empleados _empleados;
	public Editar_empleado _editar_empleado;
	base_de_datos.Empleado e;
	public VerticalLayout layout;

	public Empleado(base_de_datos.Empleado e, Empleados empleados) {
		this.e = e;
		this._empleados = empleados;
		this.getLabel().setText(e.getCorreo());
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		if(e instanceof base_de_datos.Transportista) {
			this.getTipoEmpleado().setText("Transportista");
		}
		
		if(e instanceof base_de_datos.Encargado_de_compras) {
			this.getTipoEmpleado().setText("Encargado");

		}
		
		Eliminar_empleado();
		Editar_empleado();
	}

	public void Eliminar_empleado() {
		this.getVaadinButton1().addClickListener(event -> {
			iAdministrador admin = new BDPrincipal();
			try {
				admin.eliminarEmpleado(e.getIdEmpleado());
				this._empleados._gestionar_empleados.inicializar();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});
	}
	
	
	public void Editar_empleado() {
		this.getVaadinButton().addClickListener(event ->{
			this._editar_empleado = new Editar_empleado(this);
			this._empleados._gestionar_empleados.ocultar_Gestionar_Empleados();
			this._empleados._gestionar_empleados.layout.add(this._editar_empleado);
		});
	}



}