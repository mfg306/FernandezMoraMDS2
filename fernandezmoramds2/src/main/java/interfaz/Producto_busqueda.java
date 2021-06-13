package interfaz;

import org.orm.PersistentException;

import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaProducto_busqueda;

public class Producto_busqueda extends VistaProducto_busqueda {
	public Producto _producto;
	public Productos_busqueda _productos_busqueda;
	base_de_datos.Producto p;

	public Producto_busqueda(Productos_busqueda productos_busqueda, base_de_datos.Producto p, UR_UNR unrunr) {
		this.getNombre_producto().setText(p.getNombre());
		this.getPrecio_producto().setText(String.valueOf(p.getPrecio_producto()));
		this._productos_busqueda = productos_busqueda;
		this.getImagen_producto().setWidth("10vw");
		this.getImagen_producto().setHeight("10vw");

		if (p._Imagen != null && p._Imagen.toArray().length > 0) {
			this.getImagen_producto().setSrc(p._Imagen.toArray()[0].getRuta());
		}

		this.p = p;
		iUR_UNR iUr_UNR = new BDPrincipal();
		base_de_datos.Producto_Rebajado pr = null;

		try {
			pr = iUr_UNR.cargarProductoRebajado(this.p);

		} catch (PersistentException e1) {
			e1.printStackTrace();
		}

		if (pr != null) {
			this.getPrecio_rebajado().setVisible(true);
			this.getPrecio_rebajado().setText("REBAJADO: " + pr.getPrecio_rebajado() + " €");
		}else {
			this.getPrecio_rebajado().setVisible(false);
		}
		
		

		abrir_producto_busqueda(unrunr);
	}

	public void abrir_producto_busqueda(UR_UNR unrunr) {
		this.getImagen_producto().addClickListener(event -> {

			if (unrunr instanceof UR) {
				this._producto = new Ver_producto_UR(unrunr, p);

			}
			if (unrunr instanceof UNR_) {
				this._producto = new Producto_UNR(unrunr, p);

			}
			this._productos_busqueda.layout.removeAll();
			this._productos_busqueda.layout.add(this._producto);
		});
	}
}
