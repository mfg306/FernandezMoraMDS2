package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import vistas.VistaProductos_mas_vendidos_por_categorias;

public class Productos_mas_vendidos_por_categorias extends VistaProductos_mas_vendidos_por_categorias {

	public UR_UNR _uR_UNR;
	public Vector<Producto_mas_vendido_por_categoria> _list_Producto_mas_vendido_por_categoria = new Vector<Producto_mas_vendido_por_categoria>();
	public Select<String> categoriasMasVendidos = new Select<>();

	public Productos_mas_vendidos_por_categorias(UR_UNR urunr) {
		inicializar(urunr);
	}

	public void inicializar(UR_UNR urunr) {
		this._uR_UNR = urunr;
		this._list_Producto_mas_vendido_por_categoria = new Vector<Producto_mas_vendido_por_categoria>();
		this.getListaCategoriasMasVendidos().as(VerticalLayout.class).add(this.categoriasMasVendidos);
		add_Producto_Mas_Vendido_Por_Categoria();
		add_Producto_Mas_Vendido_Por_Categoria();
		abrir_Producto_MasVendido_Por_Categoria();
	}

	public void add_Producto_Mas_Vendido_Por_Categoria() {
		Producto_mas_vendido_por_categoria pmc = new Producto_mas_vendido_por_categoria(this, this._uR_UNR);
		this._list_Producto_mas_vendido_por_categoria.add(pmc);
		this.getLista_productos_categoria().add(pmc);
	}

	public void abrir_Producto_MasVendido_Por_Categoria() {
		for (Producto_mas_vendido_por_categoria pcm : this._list_Producto_mas_vendido_por_categoria) {
			pcm.getBotonproductoMasVendidoPorCategoria().addClickListener(event -> {
				this._uR_UNR.layoutProductosMasVendidosPorCategorias
						.remove(this._uR_UNR._productos_mas_vendidos_por_categorias);
				this._uR_UNR.layoutOfertas.remove(this._uR_UNR._ofertas);
				this._uR_UNR.getBotonVerCategorias().setVisible(false);
				pcm._producto.getVaadinVerticalLayout2().setVisible(false);
				this._uR_UNR.layoutProductosMasVendidosPorCategorias.add(pcm._producto);
			});
		}
	}

	public void Clasificar_por_categoria() {
		throw new UnsupportedOperationException();
	}
}