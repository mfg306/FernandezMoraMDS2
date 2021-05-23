package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.CategoriaDAO;
import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaCategoria;

public class Categoria extends VistaCategoria {
	public Categorias _categorias;
	public Productos_categoria _productos_categoria;
	public VerticalLayout layout;
	public base_de_datos.Producto[] productos;
	public base_de_datos.Categoria categoria;
	public int productoscategoriaPorPagina = 2;
	public int numeroRegistro = 0;
	public int numeroTotalPaginas = 0;
	int paginaActual = 1;

	public Categoria(Categorias c, UR_UNR unrunr, base_de_datos.Categoria cat) {
		this.categoria = cat;
		this.getCategoria1().setText(cat.getNombre_categoria());
		inicializar(c, unrunr);
	}

	public void inicializar(Categorias c, UR_UNR unrunr) {
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this._categorias = c;
		this._productos_categoria = new Productos_categoria(this, unrunr);
		abrir_Categoria();
	}

	public void abrir_Categoria() {
		this.getCategoria1().addClickListener(event -> {
			this._categorias._ver_categorias.layout.removeAll();
			//this._categorias._ver_categorias.layout.add(this._productos_categoria);
			verCategoria(this.numeroRegistro);
		});
	}

	public void verCategoria(int numeroRegistro) {

		iUR_UNR iUr_UNR = new BDPrincipal();

		this.productos = iUr_UNR.cargarProductosCategoria(this.categoria);
		for (base_de_datos.Producto p : this.productos) {
			Producto_categoria pc = new Producto_categoria(this._productos_categoria, this._categorias._ver_categorias._uR_UNR, p);
			this._productos_categoria._list_Producto_categoria.add(pc);
			this._productos_categoria.getLista_productos_categoria().add(pc);
			this._categorias._ver_categorias.layout.add(this._productos_categoria);

		}
		this.inicializar(this._categorias, this._categorias._ver_categorias._uR_UNR);
		this.numeroTotalPaginas = this._productos_categoria._list_Producto_categoria.size()/this.productoscategoriaPorPagina;
		/*if(this.numeroTotalPaginas%2 != 0) {
			this.numeroTotalPaginas = this.numeroTotalPaginas + 1;
		}*/
		
		/*this._productos_categoria.getPrimeraPagina().setText(String.valueOf(paginaActual));
		this._productos_categoria.getUltimaPagina().setText(String.valueOf(numeroTotalPaginas));
		this._productos_categoria.mostrarProductosCategoria(numeroRegistro);*/
	}


}
