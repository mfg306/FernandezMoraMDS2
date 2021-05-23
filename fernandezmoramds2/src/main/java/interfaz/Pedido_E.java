package interfaz;


import java.util.Iterator;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iEncargado_de_compras;
import vistas.VistaPedido_e;

public class Pedido_E extends VistaPedido_e{
	public Pedidos_E _pedidos_E;
	public Asignar_a_transportista _asignar_a_transportista;
	base_de_datos.Pendiente pendiente;
	base_de_datos.Producto_en_compra[] listado;
	
	public Pedido_E(Pedidos_E pedidos_E, base_de_datos.Pendiente pendiente) {
		this.pendiente = pendiente;
		inicializar(pedidos_E);
		this.getLabel1().setText("Codigo : " + this.pendiente.getCodigo());
		this.getLabel2().setText("Fecha ultima actualizacion : " + this.pendiente.getFecha_estado());
		
		int numTotalUnidades = 0;
		
		cargarProductosEnCompra();

		for(base_de_datos.Producto_en_compra p : listado) {
			numTotalUnidades += p.getNum_unidades_producto();
			System.out.println(p.getNum_unidades_producto());
		}
		
		this.getNumTotalUnidades().setText("Numero total unidades : " + numTotalUnidades );
		
		asignar_a_transportista();
	}
	
	public void inicializar(Pedidos_E pedidos_E) {
		this._pedidos_E = pedidos_E;
		this._asignar_a_transportista = new Asignar_a_transportista(this, this.pendiente);	
	}
	
	public void asignar_a_transportista() {
		this.getBotonAsignar().addClickListener(event ->{
			this._asignar_a_transportista = new Asignar_a_transportista(this, this.pendiente);
			this._pedidos_E._encargado_de_compras.ocultar_encargado();
			this._pedidos_E._encargado_de_compras.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._asignar_a_transportista);
		});
	}
	
	public void cargarProductosEnCompra() {
		iEncargado_de_compras iEn = new BDPrincipal();
		
		try {
			listado = iEn.cargarProductosEnCompra(pendiente.getCodigo());
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
		

}