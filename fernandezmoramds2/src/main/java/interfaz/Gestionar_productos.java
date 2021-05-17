package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Span;
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
	Span aviso = new Span();

	public Gestionar_productos(Administrador admin) {
		this._administrador = admin;
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		inicializar();
		retroceder();
	}
	
	public void inicializar() {
		if(this._productos_administrador != null) this.layout.remove(this._productos_administrador);
		this._productos_administrador = new Productos_administrador(this);
		crear_Producto();
		abrirGestionarProductos();
		this.layout.add(this._productos_administrador);
	}
	
	public void retroceder() {
		this.getRetroceder().addClickListener(event ->{
			/*Si viene del inicio*/
			if(this._administrador.padre != null) {
				this._administrador.padre.removeAll();
			}
			
			/*Si ya se viene de un retroceder ==> se ha creado aqui en este metodo*/
			if(this._administrador.padre == null) {
				this._administrador.layout.removeAll();
			}
			
			Administrador admin = new Administrador(this._administrador.admin);
			this.ocultar_Gestionar_Productos();
			this._administrador._menu_A.layout.removeAll();
			this._administrador.layout.add(admin);
		});
	}

	public void ocultar_Gestionar_Productos() {
		layout.remove(this._productos_administrador);
		this.getVaadinButton().setVisible(false);
		this.getH1().setVisible(false);
		this.aviso.setVisible(false);
		this.getRetroceder().setVisible(false);
	}


	public void crear_Producto() {
		this.getVaadinButton().addClickListener(event ->{
			ocultar_Gestionar_Productos();
			Crear_producto cp = null;
			if(this._productos_administrador._list_Producto_administrador.size() > 0 ) {
				cp = new Crear_producto(this._productos_administrador._list_Producto_administrador.get(0));
			} else {
				cp = new Crear_producto(null);

			}
			
			layout.add(cp);
		});

	}
	
	public void abrirGestionarProductos() {
		iAdministrador admin = new BDPrincipal();
		
		try {
			productos = admin.cargarProductosListado();
			if(productos != null && productos.length > 0) {
				for(base_de_datos.Producto p : productos) {
					this._productos_administrador.add_Productos(p);
				}
			} else {
				aviso.setText("No hay ningún producto registrado en la base de datos.");
				this.layout.add(aviso);
			}

		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

}