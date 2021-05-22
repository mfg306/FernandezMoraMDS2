package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;

import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.validation.ConstraintViolationException;

import org.orm.PersistentException;

public class Editar_categoria extends Zona_productos {
	public Categoria_administrador _categoria_administrador;
	VerticalLayout layout;

	public Editar_categoria(Categoria_administrador ca) {
		super(ca.categoria, null, ca._categorias_administrador._gestionar_categorias, null);
		inicializar(ca);
		guardarCategoria();
	}

	public void inicializar(Categoria_administrador ca) {
		this._categoria_administrador = ca;

		this.getH1CrearCategoria().setVisible(false);
		this.getH1CrearOferta().setVisible(false);
		this.getH1EditarOferta().setVisible(false);
		this.getH2CrearCategoria().setVisible(false);
		this.getH2CrearOferta().setVisible(false);
		this.getH2EditarOferta().setVisible(false);

		this.getCampoOferta().setVisible(false);
		this.getCampoOferta1().setVisible(false);

		this.getCampoFecha().setVisible(false);
		this.getFechaCaducidad().setVisible(false);

		this.getCampoCategoria().setValue(ca.categoria.getNombre_categoria());

		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		cancelar_edicion();
	}

	public void ocultar_editar_categoria() {
		this.getH1EditarCategoria().setVisible(false);
		this.getH2EditarCategoria().setVisible(false);
		this.getH2().setVisible(false);
		this.getH21().setVisible(false);
		this.getVaadinHorizontalLayout().setVisible(false);

		this.getCampoFecha().setVisible(false);

		this.getCampoCategoria().setVisible(false);
		this.getNombreCategoria().setVisible(false);
	}
	
	public void retroceder() {
		ocultar_editar_categoria();
		this._categoria_administrador._categorias_administrador._gestionar_categorias = new Gestionar_categorias(this._categoria_administrador._categorias_administrador._gestionar_categorias._administrador);
		layout.add(this._categoria_administrador._categorias_administrador._gestionar_categorias);
		
		this.getHuecoDerecha().setVisible(false);
		this.getHuecoIzquierda().setVisible(false);
	}

	public void cancelar_edicion() {
		this.getBotonCancelar().addClickListener(event -> {
			retroceder();
		});
	}

	public void guardarCategoria() {

		this.getVaadinButton().addClickListener(event -> {
			iAdministrador admin = new BDPrincipal();

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			String fechaActual = formatter.format(date);

			Vector<Producto_listado_administracion> listaProductos = this._productos_listado_administracion._list_Producto_listado_administracion;
			base_de_datos.Producto[] productosCategoria = new base_de_datos.Producto[listaProductos.size()];

			for (int i = 0; i < listaProductos.size(); i++) {
				productosCategoria[i] = listaProductos.get(i).producto;
			}
			
			try {
				
				for(base_de_datos.Producto p : productosCategoria) {
					System.out.println("EN LA INTERFAZ ==> " + p.getNombre());
				}
				
				
				this._categoria_administrador.categoria = admin.actualizarCategoria(this.getCampoCategoria().getValue(), 
						productosCategoria, fechaActual, this._categoria_administrador.categoria);
				Notification.show("Categoria creada con éxito");
				retroceder();
			} catch (PersistentException e) {
				Notification.show("Una categoría no puede quedarse sin productos.");
				e.printStackTrace();
			} 
		});

	}
}