package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;

import base_de_datos.Producto_Rebajado;
import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaProductos_oferta;


public class Productos_oferta extends VistaProductos_oferta{

	public Oferta _list_Ofertas;
	public Vector<Producto_oferta> _list_Producto_oferta = new Vector<Producto_oferta>();
	public Producto_oferta producto_oferta;
	public int productosPorPagina = 2;
	public int numeroTotalRegistros = 0;
	public int numeroTotalPaginas = 0;
	public int paginaActual = 0;
	
	public Productos_oferta(Oferta of, UR_UNR unrunr) {
		this._list_Ofertas = of;
		inicializar(of, unrunr,this.paginaActual);
	}
	
	public void inicializar(Oferta of, UR_UNR unrunr,int paginaActual) {
		verProductosOferta();
		//abrir_Producto_Oferta();
		numeroTotalRegistros = 0;
		numeroTotalPaginas = 0;
		
		//Ver_anteriores();
		//Ver_siguientes();
	}
	

	
	
	public void verProductosOferta() {
		iUR_UNR iur = new BDPrincipal();
		this.getLista_productos_oferta().removeAll();
		try {
			Producto_Rebajado[] productos = iur.cargarProductosOferta(this._list_Ofertas._ofertas.ofertas[this._list_Ofertas._ofertas._uR_UNR.indiceOfertas]);
			for(base_de_datos.Producto_Rebajado p : productos) {
				Producto_oferta po = new Producto_oferta(this, this._list_Ofertas._ofertas._uR_UNR,p);
				this._list_Producto_oferta.add(po);
				this.getLista_productos_oferta().add(po);
				
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
	}
	

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}

	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}
	
	
	/*public void abrir_Producto_Oferta() {
	for(Producto_oferta pof : this._list_Producto_oferta) {
		pof.getImagen_producto().addClickListener(event ->{
			this._list_Ofertas._ofertas._uR_UNR.layoutOfertas.remove(this._list_Ofertas._productos_oferta);
			this._list_Ofertas._ofertas._uR_UNR.layoutOfertas.add(pof._producto);
			
		});
	}
}*/
}