package interfaz;

import vistas.VistaVenta;

public class Venta extends VistaVenta{
	public Ventas _ventas;
	base_de_datos.Compra compra;
	
	public Venta(base_de_datos.Compra c) {
		this.compra = c;
		this.getLabel().setText(this.compra.getPrecio_total() + "\n" + this.compra.getFecha_estado());
	}
}