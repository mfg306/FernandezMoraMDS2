package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionar_productos;

public class Gestionar_productos extends VistaGestionar_productos {
	public Administrador _administrador;
	public Productos_administrador _productos_administrador;
	public Editar_producto _editar_producto;
	public VerticalLayout layout;

	public Gestionar_productos() {
		inicializar();
	}
	
	public void inicializar() {
		this._productos_administrador = new Productos_administrador();
		this._productos_administrador.add_Productos();
		this._productos_administrador.add_Productos();

		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		layout.add(this._productos_administrador);

		editar_Producto();
		crear_Producto();
	}

	public void ocultar_Gestionar_Ofertas() {
		layout.remove(this._productos_administrador);
		this.getVaadinButton().setVisible(false);
		this.getH1().setVisible(false);
	}

	public void editar_Producto() {
		for (Producto_administrador pa : this._productos_administrador._list_Producto_administrador) {
			pa.getVaadinButton().addClickListener(event -> {
				pa._editar_producto = new Editar_producto();
				this.ocultar_Gestionar_Ofertas();
				layout.add(pa._editar_producto);
			});
		}
	}

	public void crear_Producto() {
		this.getVaadinButton().addClickListener(event ->{
			ocultar_Gestionar_Ofertas();
			
			Crear_producto cp = new Crear_producto();
			layout.add(cp);
		});

	}

}