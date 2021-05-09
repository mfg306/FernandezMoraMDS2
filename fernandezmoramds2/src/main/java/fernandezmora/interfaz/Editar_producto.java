package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaEditar_producto;

public class Editar_producto extends VistaEditar_producto {
	public Producto_administrador _producto_administrador;
	public Gestionar_productos _gestionar_productos;
	public VerticalLayout layout;

	
	public Editar_producto(Producto_administrador pa) {
		this._producto_administrador = pa;
		this.getAñadeUnaNuevaDescripción().setValue(this._producto_administrador.p.getDescripcion());
		this.getNuevoNombreProducto().setValue(this._producto_administrador.p.getNombre());
		this.getNuevoPrecio().setValue("" + this._producto_administrador.p.getPrecio_producto());
		
		inicializar();
	}
	
	public void inicializar() {
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		cancelar_edicion();	
		editarProducto();
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
	
	public void editarProducto() {
		this.getVaadinButton().addClickListener(event -> {
			iAdministrador admin = new BDPrincipal();
			try {
				admin.actualizarProducto(this._producto_administrador.p.getId_Producto(), this.getNuevoNombreProducto().getValue(), Double.parseDouble(this.getNuevoPrecio().getValue()), this.getAñadeUnaNuevaDescripción().getValue());
				Notification.show("Producto editado con exito");
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});
	}
}