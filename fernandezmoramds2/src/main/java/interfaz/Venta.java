package interfaz;

import vistas.VistaVenta;

public class Venta extends VistaVenta{
	public Ventas _ventas;
	base_de_datos.Compra compra;
	
	public Venta(base_de_datos.Compra c) {
		this.compra = c;
		this.getLabel().setText(this.compra.getPrecio_total() + "\n" + this.compra.getFecha_estado());
		
		String descripcion = "";
		
		if(compra instanceof base_de_datos.Pendiente) {
			descripcion += "Estado: Pendiente";
			
			compra = (base_de_datos.Pendiente)compra;
			
			descripcion += "Cliente: " + ((base_de_datos.Pendiente) compra).get_Hace_compra().getCorreo_electronico() + " \n";
			descripcion += "Encargado: " + ((base_de_datos.Pendiente) compra).get_Encargado_de_compras().getCorreo();
			
		}
		
		if(compra instanceof base_de_datos.Enviado) {
			descripcion += "Estado: Enviado";
			
			compra = (base_de_datos.Enviado)compra;
			
			descripcion += "Pedido repartido al transportista : " +  ((base_de_datos.Enviado)compra).get_Transportista().getCorreo();
			
			
		}
		
		if(compra instanceof base_de_datos.Recibido) {
			descripcion += "Estado: Recibido";
			
			compra = (base_de_datos.Recibido)compra;
			
			if(((base_de_datos.Recibido) compra).getRecibido()) {
				descripcion += "Pedido recibido por : " + ((base_de_datos.Recibido) compra).get_recibe().getCorreo_electronico();
			}
		}
				
		this.getVaadinItem().setText(descripcion);
	}
}