package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEditar_producto;

public class Editar_producto extends VistaEditar_producto {
	public Producto_administrador _producto_administrador;
	public Gestionar_productos _gestionar_productos;
	public VerticalLayout layout;

	
	public Editar_producto() {
		inicializar();
	}
	
	public void inicializar() {
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		cancelar_edicion();	
	}
	
	public void cancelar_edicion() {
		this.getVaadinButton1().addClickListener(event ->{
			Gestionar_productos gp = new Gestionar_productos();
			this.getH1().setVisible(false);
			this.getVaadinHorizontalLayout().setVisible(false);
			this.getVaadinHorizontalLayout1().setVisible(false);
			layout.add(gp);
		});
	}
}