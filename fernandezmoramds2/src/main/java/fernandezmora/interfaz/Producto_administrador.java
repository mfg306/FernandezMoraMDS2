package fernandezmora.interfaz;

import org.orm.PersistentException;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaProducto_administrador;

public class Producto_administrador extends VistaProducto_administrador {
	public Productos_administrador _productos_administrador;
	public Editar_producto _editar_producto;
	public Crear_producto _crear_producto;
	base_de_datos.Producto p;
	
	public Producto_administrador(base_de_datos.Producto p ) {
		this.getLabel().setText(p.getNombre());
		this.getLabel1().setText("" + p.getId_Producto());
		this.getLabel2().setText("" + p.getPrecio_producto());
		this.getVaadinItem().setText(p.getDescripcion());
		this.p = p;
		Eliminar_producto();
	}

	public void Eliminar_producto() {
		this.getVaadinButton1().addClickListener(event ->{
			iAdministrador admin = new BDPrincipal();
			try {
				admin.eliminarProductoAdministrador(this.p.getId_Producto());
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}