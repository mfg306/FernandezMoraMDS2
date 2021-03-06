package basededatos;

import org.orm.PersistentException;

import base_de_datos.Encargado_de_compras;
import base_de_datos.Enviado;
import base_de_datos.Pendiente;
import base_de_datos.Producto_en_compra;
import base_de_datos.Transportista;

public interface iEncargado_de_compras {

	public Pendiente[] cargarPedidosPendientes(int aIdEncargado);

	public void asignarPedidoTransportista(Pendiente aPedidoPendiente, Encargado_de_compras aEncargado) throws PersistentException;

	public Pendiente[] cargarPedidosE(int aIdEncargado) throws PersistentException;

	public boolean eliminarPendiente(Pendiente aPedidoPendiente, Enviado aEnviado) throws PersistentException;
	
	public boolean eliminarProductosEnCompra(Pendiente aPendiente) throws PersistentException;
	
	public Producto_en_compra[] cargarProductosEnCompra(int aIdEnviado) throws PersistentException;
	
	public Transportista buscarTransportistaCola(int aIdCola) throws PersistentException;
}
