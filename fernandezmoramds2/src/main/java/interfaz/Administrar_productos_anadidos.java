package interfaz;

import org.orm.PersistentException;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaAdministrar_productos_anadidos;

public class Administrar_productos_anadidos extends VistaAdministrar_productos_anadidos {
	public Productos_listado_administracion _productos_listado_administracion;
	public VerticalLayout layoutDerecha;
	base_de_datos.Producto[] listadoProductos;


	/**
	 * Este atributo nos va a decir si hemos accedido a esta interfaz a traves de
	 * una categoria o a traves de una oferta
	 */
	public int esCategorias;

	base_de_datos.Categoria categoria;
	base_de_datos.Oferta oferta;

	public Administrar_productos_anadidos(base_de_datos.Categoria categoria, base_de_datos.Oferta oferta) {
		this.layoutDerecha = this.getHuecoDerecha().as(VerticalLayout.class);
		/* No queremos inicializar una nueva lista cada vez que se refresque */
		this._productos_listado_administracion = new Productos_listado_administracion(this);
		this.layoutDerecha.add(this._productos_listado_administracion);

		if (categoria == null) {
			esCategorias = 2;
			this.oferta = oferta;
		}

		if (oferta == null) {
			esCategorias = 1;
			this.categoria = categoria;
		}
		
		if(oferta == null & categoria == null) {
			esCategorias = 0;
		}

		verProductosCategoria();
	}

	public void incorporarProductoListado(base_de_datos.Producto p, Zona_productos zp, double precio) {
		Producto_listado_administracion pla = new Producto_listado_administracion(p, _productos_listado_administracion, zp, precio);
		this._productos_listado_administracion.add_productos_listado_administracion(pla);
	}

	public void verProductosCategoria() {
		/*
		 * Para este metodo necesitamos saber de alguna forma si estamos con categorias
		 * u ofertas para saber a que metodo llamamos y ver que productos hay que
		 * cargar.
		 */
		iAdministrador admin = new BDPrincipal();

		try {

			if (esCategorias == 1) {
				listadoProductos = admin.cargarProductosCategoriaAdmin(this.categoria);
			}
			if (esCategorias == 2) {
				listadoProductos = admin.cargarProductosOfertaaAdmin(this.oferta);
			}

			if(listadoProductos != null && listadoProductos.length > 0) {
				for (base_de_datos.Producto p : listadoProductos) {
//					System.out.println("PRODUCTO : " + p.getNombre());
					Producto_listado_administracion pla = new Producto_listado_administracion(p, _productos_listado_administracion);
					this._productos_listado_administracion.add_productos_listado_administracion(pla);
				}	
			}


		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
	
}