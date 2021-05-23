package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iTransportista;
import vistas.VistaPedido_t;

public class Pedido_T extends VistaPedido_t {
	public Pedidos_T _pedidos_T;
	public Ver_ficha_cliente _ver_ficha_cliente;
	public Gestor_Correos _unnamed_Gestor_Correos_;
	base_de_datos.Enviado enviado;
	base_de_datos.UR cliente;
	public VerticalLayout layout;

	public Pedido_T(Pedidos_T p, base_de_datos.Enviado enviado) {
		this.enviado = enviado;
		this.getLabel().setText("" + enviado.getCodigo());
		this.getLabel2().setText("" + enviado.getFecha_estado());

		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		inicializar(p);

	}

	public void inicializar(Pedidos_T p) {
		this._pedidos_T = p;
		obtenerClientePedido();
		abrirFichaCliente();
		Marcar_como_entregado();
	}
	
	public void abrirFichaCliente() {
		this.getVaadinButton().addClickListener(event ->{
			this._ver_ficha_cliente = new Ver_ficha_cliente(this, this.cliente);
			this.layout.removeAll();
			this.layout.add(this._ver_ficha_cliente);
		});
	}

	public void obtenerClientePedido() {
		iTransportista iT = new BDPrincipal();

		try {
			this.cliente = iT.cargarClienteEnviado(this._pedidos_T._transportista.transportista, this.enviado);
		} catch (PersistentException e) {
			e.printStackTrace();
		}

		this.getLabel1().setText(cliente.getDireccion_envio());
	}

	public void Marcar_como_entregado() {
		this.getVaadinButton1().addClickListener(event -> {
			iTransportista iT = new BDPrincipal();
			
			try {
				iT.repartirACliente(this.cliente, this.enviado);
				String asunto = "Pedido con código " + this.enviado.getCodigo() + " enviado con éxito.";
				String cuerpo = "El pedido con código " + this.enviado.getCodigo() + " ha sido enviado con éxito. Valore el producto"
						+ "si ha quedado satisfecho con el mismo.";
				this.Enviar_mensaje_a_cliente_T(this.cliente.getCorreo_electronico(), asunto, cuerpo);
				
				this._pedidos_T._transportista.inicializar();
				
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			
		});
	}

	public void Enviar_mensaje_a_cliente_T(String destinatario, String Asunto, String cuerpo) {
		Gestor_Correos.enviarCorreo(destinatario, Asunto, cuerpo);
	}
}