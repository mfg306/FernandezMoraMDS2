package interfaz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;

public class Crear_categoría extends Zona_productos {
	public Gestionar_categorias _gestionar_categorias;
	VerticalLayout layout;

	public Crear_categoría(Gestionar_categorias gc) {
		super(null, null, gc, null);
		this._gestionar_categorias = gc;
		inicializar();
		guardarCategoria();
	}

	public void inicializar() {
		this.getH1CrearOferta().setVisible(false);
		this.getH1EditarCategoria().setVisible(false);
		this.getH1EditarOferta().setVisible(false);

		this.getH2CrearOferta().setVisible(false);
		this.getH2EditarCategoria().setVisible(false);
		this.getH2EditarOferta().setVisible(false);

		this.getCampoOferta().setVisible(false);
		this.getCampoOferta1().setVisible(false);
		
		this.getCampoFecha().setVisible(false);
		this.getFechaCaducidad().setVisible(false);

		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		cancelar_creacion();
	}

	public void ocultar_crear_categoria() {

		this.getNombreCategoria().setVisible(false);

		this.getH1CrearCategoria().setVisible(false);
		this.getH2CrearCategoria().setVisible(false);
		this.getH2().setVisible(false);
		this.getH21().setVisible(false);
		
		this.getCampoCategoria().setVisible(false);

		this.getVaadinHorizontalLayout().setVisible(false);
	}
	
	public void retroceder() {
		ocultar_crear_categoria();
		this._gestionar_categorias = new Gestionar_categorias(this._gestionar_categorias._administrador);
		layout.add(this._gestionar_categorias);
		
		this.getHuecoDerecha().setVisible(false);
		this.getHuecoIzquierda().setVisible(false);
	}

	public void cancelar_creacion() {
		this.getBotonCancelar().addClickListener(event -> {
			retroceder();
		});
	}

	public void guardarCategoria() {

		this.getVaadinButton().addClickListener(event -> {
			iAdministrador admin = new BDPrincipal();
			Dialog dialog = new Dialog();
			dialog.add(new Text("Categoria creada con exito"));

			dialog.setWidth("400px");
			dialog.setHeight("150px");
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			String fechaActual = formatter.format(date);

			Vector<Producto_listado_administracion> listaProductos = this._productos_listado_administracion._list_Producto_listado_administracion;
			base_de_datos.Producto[] productosCategoria = new base_de_datos.Producto[listaProductos.size()];

			for (int i = 0; i < listaProductos.size(); i++) {
				productosCategoria[i] = listaProductos.get(i).producto;
			}

			try {
				base_de_datos.Categoria c = admin.insertarCategoria(this.getCampoCategoria().getValue(), productosCategoria, fechaActual);
				Categoria_administrador ca = new Categoria_administrador(this._gestionar_categorias._categorias_administrador, c);
				this._gestionar_categorias._categorias_administrador.addCategoria(ca);
				retroceder();
				dialog.open();
				this.inicializar();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});

	}

}