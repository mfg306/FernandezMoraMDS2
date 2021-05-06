package fernandezmora.interfaz;

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
	public Vector<Producto_carrito> listaAux;
	public base_de_datos.Oferta[] ofertas;


	public UR_UNR() {
		inicializarURUNR();
	}
	
	public void miListadoProductos(Producto_carrito p) {
		listaAux.add(p);
	}

	public void inicializarURUNR() {
		this.layoutOfertas = this.getOfertas().as(VerticalLayout.class);
		this._ver_categorias = new Ver_categorias(this);
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		abrir_Ver_Categorias();
		this._ofertas = new Ofertas(this);
		iUR_UNR ur_unr = new BDPrincipal();
		ofertas = ur_unr.cargarOfertas();
		for(base_de_datos.Oferta of : this.ofertas) {
			Oferta oferta = new Oferta(this._ofertas,this,of);
			this._ofertas._list_Ofertas.add(oferta);
			this._ofertas.getListaOfertas().add(this._ofertas._list_Ofertas.get(0));
		}
		this.layoutOfertas.add(this._ofertas);
		this._productos_mas_vendidos_por_categorias = new Productos_mas_vendidos_por_categorias(this);
		this.layoutProductosMasVendidosPorCategorias = this.getProductosMasVendidosPorCategorias()
				.as(VerticalLayout.class);
		this.layoutProductosMasVendidosPorCategorias.add(this._productos_mas_vendidos_por_categorias);

	}

	public void abrir_Ver_Categorias() {
		this.getBotonVerCategorias().addClickListener(event -> {
			this.getBotonVerCategorias().setVisible(false);
			this.getProductosMasVendidosPorCategorias().setVisible(false);
			this.layoutOfertas.setVisible(false);
			this.layout.add(this._ver_categorias);

		});
	}
	
	public void limpiarInterfaz( ) {
		this.layoutOfertas.removeAll();
		this.layoutProductosMasVendidosPorCategorias.removeAll();
		this.getBotonVerCategorias().setVisible(false);
	}

}