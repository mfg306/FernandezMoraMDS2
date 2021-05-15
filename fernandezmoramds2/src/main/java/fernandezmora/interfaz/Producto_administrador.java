package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaProducto_administrador;

public class Producto_administrador extends VistaProducto_administrador {
	public Productos_administrador _productos_administrador;
	public Editar_producto _editar_producto;
	public Crear_producto _crear_producto;
	base_de_datos.Producto p;
	public VerticalLayout layout;
	
	public Producto_administrador(base_de_datos.Producto p, Productos_administrador pa) {
		this.getLabel().setText(p.getNombre());
		this.getLabel1().setText("" + p.getId_Producto());
		this.getLabel2().setText("" + p.getPrecio_producto());
		this.getVaadinItem().setText(p.getDescripcion());
		this.p = p;
		base_de_datos.Imagen imagenes[] = this.p._Imagen.toArray();
		
		this.getFotoProducto().setWidth("30vw");
		this.getFotoProducto().setHeight("auto");
		
		for(base_de_datos.Imagen i : imagenes){
//			if(i.getPrincipal())
			this.getFotoProducto().setSrc(i.getRuta());
		}

		this._productos_administrador = pa;
		this.layout = this._productos_administrador._gestionar_productos.layout;
		Eliminar_producto();
		Editar_producto();
	}

	public void Eliminar_producto() {
		this.getVaadinButton1().addClickListener(event ->{
			iAdministrador admin = new BDPrincipal();
			try {
				admin.eliminarProductoAdministrador(this.p.getId_Producto());
				this._productos_administrador._gestionar_productos.inicializar();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});
	}
	
	public void Editar_producto() {
		this.getVaadinButton().addClickListener(event ->{
			this._editar_producto = new Editar_producto(this);
//			this._productos_administrador._gestionar_productos.ocultar_Gestionar_Ofertas();
			this.layout.add(this._editar_producto);
		});
	}
}