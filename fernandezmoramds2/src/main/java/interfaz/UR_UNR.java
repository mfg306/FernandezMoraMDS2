package interfaz;

import java.util.Vector;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaUrunr;

//import basededatos.iUR_UNR;

public abstract class UR_UNR extends VistaUrunr{
	// public iUR_UNR _iUR_UNR;
	public Productos_mas_vendidos_por_categorias _productos_mas_vendidos_por_categorias;
	public Ofertas _ofertas;
	public Ver_categorias _ver_categorias;
	public Menu_UR_UNR _menu_UR_UNR;
	public VerticalLayout layout;
	public VerticalLayout layoutOfertas;
	public VerticalLayout layoutProductosMasVendidosPorCategorias;
	public int indiceOfertas;
	public Vector<Producto_carrito> listaAux;

	public UR_UNR() {
		this.indiceOfertas = 0;
		this.layoutOfertas = this.getOfertas().as(VerticalLayout.class);
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.layoutProductosMasVendidosPorCategorias = this.getProductosMasVendidosPorCategorias()
				.as(VerticalLayout.class);
		listaAux = new Vector<Producto_carrito>();
		inicializarURUNR();
	}
	
	public void inicializarURUNR() {
		this.getBotonVerCategorias().setVisible(true);
		this.layoutOfertas.removeAll();
		this.layoutProductosMasVendidosPorCategorias.removeAll();
		
		this._ofertas = new Ofertas(this);
		this._productos_mas_vendidos_por_categorias = new Productos_mas_vendidos_por_categorias(this);

		this.layoutOfertas.add(this._ofertas);
		this.layoutProductosMasVendidosPorCategorias.add(this._productos_mas_vendidos_por_categorias);
		
		this.getBotonVerCategorias().setVisible(true);
		
		abrir_Ver_Categorias();
	}
	
	public void miListadoProductos(Producto_carrito p) {
		listaAux.add(p);
	}
	
	public void actualizarMiListado(Vector<Producto_carrito> listaAux) {
		this.listaAux = new Vector<>(listaAux);
	}
	
	public boolean estaElProducto(Producto_carrito pc) {
		for(Producto_carrito p : listaAux) {
			if(p.producto.getId_Producto() == pc.producto.getId_Producto()) return true;
		}
		return false;
	}
	
	public int indiceProducto(Producto_carrito pc) {
		int contador = 0;
		for(Producto_carrito p: listaAux) {
			if(p.producto.getId_Producto() == pc.producto.getId_Producto()) return contador;
			contador++;
		}
		
		return -1;
	}

	public void abrir_Ver_Categorias() {
		this.getBotonVerCategorias().addClickListener(event -> {
			this._ver_categorias = new Ver_categorias(this);

			this.getBotonVerCategorias().setVisible(false);
			this.getProductosMasVendidosPorCategorias().setVisible(false);
			this.layoutOfertas.setVisible(false);
			this.layout.add(this._ver_categorias);

		});
	}
	
	public void limpiarInterfaz( ) {
		this.layoutOfertas.setVisible(false);
		this.layoutProductosMasVendidosPorCategorias.setVisible(false);
		this.getBotonVerCategorias().setVisible(false);
	}

}