package fernandezmora.interfaz;

import basededatos.BDPrincipal;
import basededatos.iTransportista;
import vistas.VistaPedido_t;

public class Pedido_T extends VistaPedido_t {
	public Pedidos_T _pedidos_T;
	public Ver_ficha_cliente _ver_ficha_cliente;
	public Gestor_Correos _unnamed_Gestor_Correos_;
	base_de_datos.Enviado enviado;
	
	public Pedido_T(Pedidos_T p, base_de_datos.Enviado enviado) {
		this.enviado = enviado;
		this.getLabel().setText("" + enviado.getCodigo());
		
		/*Necesito un metodo en el que se pueda obtener la informacion del UR para su direccion de envio y la ficha del cliente*/
		
		/*Aqui tenemos todos los pedidos pendientes del Encargado nuestro*/
		base_de_datos.Pendiente pendientes[] = this.enviado.get_Procesa()._Pendiente.toArray();
		
		/*Vamos a quedarnos con el que */
		
		this.getLabel1().setText("");
		inicializar(p);
	}
	
	public void inicializar(Pedidos_T p) {
		this._pedidos_T = p;
		this._ver_ficha_cliente = new Ver_ficha_cliente(this, this.enviado);
	}
	
	/*Incluir en el vpp*/
	public void obtenerClientePedido() {
		iTransportista iT = new BDPrincipal();
		
		 /*Seria irnos a la tabla de Enviado y buscar los Pendiente del Encargado de ese Pendiente y que el id_cola coincida con el de 
		 * transportista
		 * Parametros: 
		 * Transportista
		 * Encargado
		 * Enviado
		 */
	}
	

	public void Marcar_como_entregado() {
		throw new UnsupportedOperationException();
	}

	public void Enviar_mensaje_a_cliente_T() {
		throw new UnsupportedOperationException();
	}
}