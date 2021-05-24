package interfaz;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaProductos_mas_vendidos_por_categorias;

public class Productos_mas_vendidos_por_categorias extends VistaProductos_mas_vendidos_por_categorias {

	public UR_UNR _uR_UNR;
	public Vector<Producto_mas_vendido_por_categoria> _list_Producto_mas_vendido_por_categoria = new Vector<Producto_mas_vendido_por_categoria>();
	public Select<String> categoriasMasVendidos = new Select<>();
	public VerticalLayout layout;
	boolean inicial = true;

	public Productos_mas_vendidos_por_categorias(UR_UNR urunr) {
		layout = this.getListaCategoriasMasVendidos().as(VerticalLayout.class);
		cargarCategorias();
		inicializar(urunr);
	}

	public void inicializar(UR_UNR urunr) {
		this._uR_UNR = urunr;
		
		layout.add(this.categoriasMasVendidos);
		
		if(inicial) {
			Clasificar_por_categoria_inicial();
		}else {
			Clasificar_por_categoria();
		}
	}

	public void add_Producto_Mas_Vendido_Por_Categoria(base_de_datos.Producto p) {
		Producto_mas_vendido_por_categoria pmc = new Producto_mas_vendido_por_categoria(this, this._uR_UNR, p);
		this._list_Producto_mas_vendido_por_categoria.add(pmc);
		this.getLista_productos_categoria().add(pmc);
	}
	
	public void limpiar_Interfaz_Para_Abrir_Producto(Producto_mas_vendido_por_categoria producto) {
		
		for(Producto_mas_vendido_por_categoria pc : this._list_Producto_mas_vendido_por_categoria){
			if(pc.producto.getId_Producto() != producto.producto.getId_Producto()) {
				this.getLista_productos_categoria().remove(pc);
			}
		}
	}

	public void cargarCategorias() {
		iUR_UNR iurunr = new BDPrincipal();

		base_de_datos.Categoria[] categorias = iurunr.cargarCategorias();
		ArrayList<String> listaCategorias = new ArrayList<>();

		for (base_de_datos.Categoria c : categorias) {
			listaCategorias.add(c.getNombre_categoria());
		}

		if (listaCategorias.size() != 0) {
			this.categoriasMasVendidos.setItems(listaCategorias);
			this.categoriasMasVendidos.setValue(listaCategorias.get(0));
		}
	}

	public void Clasificar_por_categoria_inicial() {
		iUR_UNR iur = new BDPrincipal();
		this._list_Producto_mas_vendido_por_categoria = new Vector<Producto_mas_vendido_por_categoria>();
		try {
			base_de_datos.Categoria[] categorias = iur.cargarCategorias();
			if(categorias != null && categorias.length != 0){
				base_de_datos.Producto[] productos = iur.cargarProductosMasVendidos(categorias[0].getNombre_categoria());

				if (productos != null) {
					for (base_de_datos.Producto p : productos) {
						this.add_Producto_Mas_Vendido_Por_Categoria(p);
					}
				}
			} else {
				this.getLista_productos_categoria().add("No hay categorias en la base de datos.");
			}

			this.inicial = false;
			Clasificar_por_categoria();

		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Clasificar_por_categoria() {
		this.inicial = false;
		this.categoriasMasVendidos.addValueChangeListener(event -> {
			this._list_Producto_mas_vendido_por_categoria = new Vector<Producto_mas_vendido_por_categoria>();

			this.getLista_productos_categoria().removeAll();
			iUR_UNR iurunr = new BDPrincipal();

			try {
				base_de_datos.Producto[] productos = iurunr
						.cargarProductosMasVendidos(this.categoriasMasVendidos.getValue());

				if (productos != null) {
					for (base_de_datos.Producto p : productos) {
						this.add_Producto_Mas_Vendido_Por_Categoria(p);
					}
				}

				this.inicializar(_uR_UNR);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});

	}
}