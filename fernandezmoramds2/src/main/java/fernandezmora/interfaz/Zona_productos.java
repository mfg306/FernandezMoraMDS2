package fernandezmora.interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;

public class Zona_productos extends Administrar_productos_anadidos {
	public Productos_listado _productos_listado;
	public VerticalLayout layoutIzquierda;
	TextField buscadorZona = new TextField();


	public Zona_productos() {
		this._productos_listado = new Productos_listado();
		this.layoutIzquierda = this.getHuecoIzquierda().as(VerticalLayout.class);

		Icon icon = new Icon("lumo", "search");
		buscadorZona.setPrefixComponent(icon);
		buscadorZona.setWidth("100%");
		
		this.getVaadinHorizontalLayout2().add(buscadorZona);
		
		this.inicializar_zona();
	}

	public void inicializar_zona() {

		inicializar_administrar();
		this.layoutIzquierda.add(this._productos_listado);
		eliminar_productos_listado_administracion();

		try {
			abrirZonaProductos();
			buscarProductos();
		} catch (PersistentException e) {
			e.printStackTrace();
		}

	}

	public void eliminar_productos_listado_administracion() {
		for (Producto_listado_administracion p : this._productos_listado_administracion._list_Producto_listado_administracion) {
			p.getVaadinButton().addClickListener(event -> {
				this._productos_listado_administracion._list_Producto_listado_administracion.remove(p);
				this._productos_listado_administracion.layout.remove(p);
				this.incorporar_producto_eliminado_administracion(p);

				inicializar_administrar();
			});

		}
	}

	public void abrirZonaProductos() throws PersistentException {
		iAdministrador admin = new BDPrincipal();

		base_de_datos.Producto productos[] = admin.cargarProductosListado();

		for (base_de_datos.Producto p : productos) {
			Producto_listado pl = new Producto_listado(p);
			this._productos_listado.add_productos_listado(pl);
		}
	}
	
	public void buscarProductos() throws PersistentException {
		iAdministrador admin = new BDPrincipal();
		

		this.buscadorZona.addKeyPressListener(Key.ENTER, e -> {
			base_de_datos.Producto productos[];
			try {
				productos = admin.cargarProductosBusquedaZonaProductos(this.buscadorZona.getValue());
				this._productos_listado.layout.removeAll();
				for (base_de_datos.Producto p : productos) {
					Producto_listado pl = new Producto_listado(p);
					this._productos_listado.add_productos_listado(pl);
				}
				
			} catch (PersistentException e1) {
				e1.printStackTrace();
			}
			
		});
		

	}

	public void incorporar_producto_eliminado_administracion(Producto_listado_administracion p) {
		this._productos_listado.layout.add(p);

		this.inicializar_zona();
	}
}