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
		Clasificar_por_categoria();
		abrir_Producto_MasVendido_Por_Categoria();
	}

	public void add_Producto_Mas_Vendido_Por_Categoria(base_de_datos.Producto p) {
		Producto_mas_vendido_por_categoria pmc = new Producto_mas_vendido_por_categoria(this, this._uR_UNR, p);
		this._list_Producto_mas_vendido_por_categoria.add(pmc);
		//this.getLista_productos_categoria().removeAll();
		this.getLista_productos_categoria().add(pmc);
	}

	public void abrir_Producto_MasVendido_Por_Categoria() {
		for (Producto_mas_vendido_por_categoria pcm : this._list_Producto_mas_vendido_por_categoria) {
			pcm.getImagen_producto().addClickListener(event -> {
				//this._uR_UNR.layoutProductosMasVendidosPorCategorias.remove(this._uR_UNR._productos_mas_vendidos_por_categorias);
				//this._uR_UNR.layoutOfertas.remove(this._uR_UNR._ofertas);
				//this._uR_UNR.getBotonVerCategorias().setVisible(false);
				this._uR_UNR._productos_mas_vendidos_por_categorias.getGetTituloMasVendidos().setVisible(false);
				this._uR_UNR._productos_mas_vendidos_por_categorias.getLista_productos_categoria().setVisible(false);
				this._uR_UNR.layoutProductosMasVendidosPorCategorias.add(pcm._producto);
			});
		}
	}
	
	public void cerrar_Productos_Mas_Vendidos_Por_Categoria() {
		for (Producto_mas_vendido_por_categoria pcm : this._list_Producto_mas_vendido_por_categoria) {
				this.inicial = true;
				this._uR_UNR.layoutProductosMasVendidosPorCategorias.remove(pcm);
				this._uR_UNR.layoutProductosMasVendidosPorCategorias.add(this._uR_UNR._productos_mas_vendidos_por_categorias);
				
			
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
			base_de_datos.Producto[] productos = iur.cargarProductosMasVendidos(categorias[0].getNombre_categoria());

			if (productos != null) {
				for (base_de_datos.Producto p : productos) {
					this.add_Producto_Mas_Vendido_Por_Categoria(p);
				}
			}

			//this.inicializar(_uR_UNR);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Clasificar_por_categoria() {
		this.inicial = false;
		this._list_Producto_mas_vendido_por_categoria = new Vector<Producto_mas_vendido_por_categoria>();
		this.categoriasMasVendidos.addValueChangeListener(event -> {
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