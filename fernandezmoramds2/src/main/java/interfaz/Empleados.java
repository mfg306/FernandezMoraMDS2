package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaEmpleados;

public class Empleados extends VistaEmpleados {
	public Gestionar_empleados _gestionar_empleados;
	public Vector<Empleado> _list_Empleado = new Vector<Empleado>();
	public VerticalLayout layout;
	Span aviso = new Span();

	private int empleadosPorPagina = 2;
	private int numeroTotalRegistros = 0;
	private int numeroTotalPaginas = 0;
	int paginaActual = 0;

	
	public Empleados(Gestionar_empleados ge) {
		this.getBotonAnteriores().setEnabled(false);

		this._gestionar_empleados = ge;
		inicializar(this.paginaActual);
	}
	
	public void inicializar(int paginaActual ) {
		this._list_Empleado = new Vector<>();
		layout = this.getHuecoEmpleados().as(VerticalLayout.class);
		numeroTotalRegistros = 0;
		numeroTotalPaginas = 0;
		
		this.getBotonAnteriores().setVisible(true);
		this.getBotonSiguientes().setVisible(true);
		this.getPaginaActual().setVisible(true);
		this.getTotalPaginas().setVisible(true);
		this.getDe().setVisible(true);
		
		abrirEmpleados();
		
		Ver_anteriores();
		Ver_siguientes();
	}
	
	public void add_Empleados(base_de_datos.Empleado e) {
		Empleado emp = new Empleado(e, this);
		boolean encontrado = false;
		
		for(int i=0; i<this._list_Empleado.size(); i++) {
			if(this._list_Empleado.get(i).e.getIdEmpleado() == e.getIdEmpleado()) {
				encontrado = true;
			}
		}
		
		if(!encontrado) {
			this._list_Empleado.add(emp);
			this.numeroTotalRegistros++;
		}

		this.mostrar_Empleados_Paginados();
	}
	
	
	/**
	 * Queremos que se muestren unicamente empleadosPorPagina empleados
	 */
	public void mostrar_Empleados_Paginados() {
		
		this.layout.removeAll();
		
		if(numeroTotalRegistros % 2 == 0 ) {
			numeroTotalPaginas = numeroTotalRegistros/empleadosPorPagina;
		} else {
			numeroTotalPaginas = (int)Math.round(((numeroTotalRegistros+1)/empleadosPorPagina));
		}
		
		this.getPaginaActual().setText("" + (paginaActual + 1));
		this.getTotalPaginas().setText(""  + numeroTotalPaginas);
		
		for(int i=(paginaActual*empleadosPorPagina); i<this._list_Empleado.size(); i++) {
			if(i>paginaActual*empleadosPorPagina + empleadosPorPagina-1) break;
			layout.add(this._list_Empleado.get(i));
		}
		
	}
	
	
	public void Ver_anteriores() {
		
		if(this.getBotonAnteriores().isEnabled()){
			this.getBotonAnteriores().addClickListener(event -> {
				if(paginaActual > 0) {
					this.paginaActual--;
				}
				
				/*Una vez que se le da al boton de anterior volvemos a activar el boton de siguiente*/
				this.getBotonSiguientes().setEnabled(true);
				
				if(this.paginaActual == 0) {
					this.getBotonAnteriores().setEnabled(false);
				}
				
				this.inicializar(paginaActual);	
			});
		}
	}

	public void Ver_siguientes() {
		
		if(this.getBotonSiguientes().isEnabled()) {
			this.getBotonSiguientes().addClickListener(event -> {
				if((paginaActual + 1) < numeroTotalPaginas) {
					this.paginaActual++;
				}
				
				/*Una vez que se de al boton de siguiente volvemos a activar el boton de anterior*/
				this.getBotonAnteriores().setEnabled(true);
				
				if(this.paginaActual + 1 == numeroTotalPaginas) {
					this.getBotonSiguientes().setEnabled(false);
				}
				
				this.inicializar(paginaActual);	
			});
		}
	}
	
	public void abrirEmpleados() {
		iAdministrador admin = new BDPrincipal();
		
		try {
			base_de_datos.Empleado[] empleados = admin.cargarEmpleados();
			
			if(empleados != null && empleados.length > 0 ) {
				for(base_de_datos.Empleado e : empleados) {
					this.add_Empleados(e);
				}
			} else {
				this.getBotonAnteriores().setVisible(false);
				this.getBotonSiguientes().setVisible(false);
				this.getPaginaActual().setVisible(false);
				this.getTotalPaginas().setVisible(false);
				this.getDe().setVisible(false);
				this.getPagina().setVisible(false);
				
				aviso.setText("No hay ning??n empleado registrado en la base de datos.");
				this.layout.add(aviso);
			}

		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}