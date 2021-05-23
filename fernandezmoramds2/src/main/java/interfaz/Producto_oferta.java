package interfaz;


import org.orm.PersistentException;

import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaProducto_oferta;

public class Producto_oferta extends VistaProducto_oferta{

	public Productos_oferta _productos_oferta;
	public Producto _producto;
	base_de_datos.Producto_Rebajado pr;
	
	public Producto_oferta(Productos_oferta pof, UR_UNR unrunr,base_de_datos.Producto p) {
		inicializar(pof, unrunr,p);
	}
	
	public void inicializar(Productos_oferta pof, UR_UNR unrunr,base_de_datos.Producto p) {
		this._productos_oferta = pof;
		if(unrunr instanceof UR) this._producto = new Ver_producto_UR(unrunr,p);
		if(unrunr instanceof UNR_) this._producto = new Producto_UNR(unrunr,p);
		this.getNombre_producto().setText(p.getNombre());
		this.getPrecio_original().setText(String.valueOf(p.getPrecio_producto()) + " €");
		
		this.getImagen_producto().setWidth("10vw");
		
		if(p._Imagen != null && !p._Imagen.isEmpty()) {
			this.getImagen_producto().setSrc(p._Imagen.toArray()[0].getRuta());
		}
		
		cargarProductoRebajado();
	}
	
	public void cargarProductoRebajado() {
		iUR_UNR iurunr = new BDPrincipal();
		base_de_datos.Producto_Rebajado pr = null;
		
		try {
			pr  = iurunr.cargarProductoRebajado(this._producto.producto);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		this.pr = pr;
		
		this.getPrecio_original().setText(pr.getPrecio_producto() + " €");
		this.getPrecio_rebajado().setText(pr.getPrecio_rebajado() + " €");
				
	}
	
}