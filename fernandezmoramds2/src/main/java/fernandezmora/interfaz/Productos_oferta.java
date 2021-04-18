package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;

import vistas.VistaProductos_oferta;


public class Productos_oferta extends VistaProductos_oferta{

	public Oferta _list_Ofertas;
	public Vector<Producto_oferta> _list_Producto_oferta = new Vector<Producto_oferta>();
	
	public Productos_oferta(Oferta of, UR_UNR unrunr) {
		inicializar(of, unrunr);
	}
	
	public void inicializar(Oferta of, UR_UNR unrunr) {
		this._list_Ofertas = of;
		add_productos_oferta(unrunr);
		add_productos_oferta(unrunr);
		abrir_Producto_Oferta();
	}
	
	public void add_productos_oferta(UR_UNR unrunr) {
		Producto_oferta pof = new Producto_oferta(this, unrunr);
		this._list_Producto_oferta.add(pof);
		this.getLista_productos_oferta().add(pof);
		
	}
	
	public void abrir_Producto_Oferta() {
		for(Producto_oferta pof : this._list_Producto_oferta) {
			pof.getBotonProductoOferta().addClickListener(event ->{
				this._list_Ofertas._ofertas._uR_UNR.layoutOfertas.remove(this._list_Ofertas._productos_oferta);
				this._list_Ofertas._ofertas._uR_UNR.layoutOfertas.add(pof._producto);
				
			});
		}
	}
	

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}

	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}
}