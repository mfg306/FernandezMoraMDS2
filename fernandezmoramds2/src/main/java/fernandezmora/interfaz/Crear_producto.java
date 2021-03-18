package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCrear_producto;

public class Crear_producto extends VistaCrear_producto {
	public Producto_administrador _producto_administrador;
	public Vector<Imagen> _imagen = new Vector<Imagen>();
	public VerticalLayout layout;

	public Crear_producto() {
		inicializar();
	}

	public void inicializar() {
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		cancelar_creacion();
	}

	public void cancelar_creacion() {
		this.getVaadinButton2().addClickListener(event -> {
			Gestionar_productos gp = new Gestionar_productos();
			this.getH1().setVisible(false);
			this.getVaadinHorizontalLayout().setVisible(false);
			this.getVaadinHorizontalLayout1().setVisible(false);
			layout.add(gp);
		});
	}
}