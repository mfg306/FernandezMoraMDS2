package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaGestionar_productos;

public class Gestionar_productos extends VistaGestionar_productos {
	public Administrador _administrador;
	public Productos_administrador _productos_administrador;
	public Editar_producto _editar_producto;
	public VerticalLayout layout;
	public base_de_datos.Producto productos[];

	public Gestionar_productos() {
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		inicializar();
	}
	
	public void inicializar() {
		if(this._productos_administrador != null) this.layout.remove(this._productos_administrador);
		this._productos_administrador = new Productos_administrador(this);
		crear_Producto();
		abrirGestionarProductos();
		this.layout.add(this._productos_administrador);
	}

	public void ocultar_Gestionar_Ofertas() {
		layout.remove(this._productos_administrador);
		this.getVaadinButton().setVisible(false);
		this.getH1().setVisible(false);
	}


	public void crear_Producto() {
		this.getVaadinButton().addClickListener(event ->{
			ocultar_Gestionar_Ofertas();
			
			Crear_producto cp = new Crear_producto();
			layout.add(cp);
		});

	}
	
	public void abrirGestionarProductos() {
		iAdministrador admin = new BDPrincipal();
		
		try {
			productos = admin.cargarProductosListado();
			
			for(base_de_datos.Producto p : productos) {
				this._productos_administrador.add_Productos(p);
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

}