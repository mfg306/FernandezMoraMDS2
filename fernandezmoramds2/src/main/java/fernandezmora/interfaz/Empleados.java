package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEmpleados;

public class Empleados extends VistaEmpleados {
	public Gestionar_empleados _gestionar_empleados;
	public Vector<Empleado> _list_Empleado = new Vector<Empleado>();
	public VerticalLayout layout;
	
	private int empleadosPorPagina = 2;
	private int numeroTotalRegistros = 0;
	private int numeroTotalPaginas = 0;
	int paginaActual = 1;

	
	public Empleados(Gestionar_empleados ge) {
		this._gestionar_empleados = ge;
		inicializar(this.paginaActual);
	}
	
	public void inicializar(int paginaActual ) {
		this._list_Empleado = new Vector<>();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);		
		
		if(numeroTotalRegistros % 2 == 0 ) {
			numeroTotalPaginas = numeroTotalRegistros/empleadosPorPagina;
		} else {
			numeroTotalPaginas = (int)Math.round(((numeroTotalRegistros+1)/empleadosPorPagina));
		}
		
		this.getPaginaActual().setText("" + paginaActual);
		this.getTotalPaginas().setText(""  + numeroTotalPaginas);

		
		Ver_anteriores();
		Ver_siguientes();
	}
	
	public void add_Empleados(base_de_datos.Empleado e) {
		Empleado emp = new Empleado(e, this);
		this._list_Empleado.add(emp);
		layout.add(emp);
		this.numeroTotalRegistros++;
		this.inicializar(this.paginaActual);
	}
	
	
	public void Ver_anteriores() {
		this.getBotonAnteriores().addClickListener(event -> {
			this.paginaActual--;
			this.inicializar(paginaActual);
		});
	}

	public void Ver_siguientes() {
		this.getBotonSiguientes().addClickListener(event -> {
			this.paginaActual++;
			this.inicializar(paginaActual);
		});
		
	}
}