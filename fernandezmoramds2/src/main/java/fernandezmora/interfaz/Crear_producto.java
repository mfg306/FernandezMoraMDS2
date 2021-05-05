package fernandezmora.interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaCrear_producto;

public class Crear_producto extends VistaCrear_producto {
	public Producto_administrador _producto_administrador;
	public Vector<Imagen> _imagen = new Vector<Imagen>();
	public VerticalLayout layout;

	public Crear_producto() {
		inicializar();
		crearProducto();
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
	
	public void crearProducto() {
		this.getVaadinButton1().addClickListener(event -> {
			iAdministrador admin = new BDPrincipal();
			
			try {				
				admin.insertarProducto(this.getNombreProducto().getValue(), this.getAñadeUnaDescripciónAlProducto().getValue(), Double.parseDouble(this.getPrecio().getValue()), Integer.parseInt(this.getCantidadProducto().getValue()));
			} catch (NumberFormatException e) {
				System.out.println("Error al hacer el parse");
				e.printStackTrace();
			} catch (PersistentException e) {
				System.out.println("Error con la consulta");
				e.printStackTrace();
			}
		});

	}
}
