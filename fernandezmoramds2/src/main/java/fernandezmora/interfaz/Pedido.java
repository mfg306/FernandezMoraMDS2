package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import vistas.VistaPedido;

public class Pedido extends VistaPedido {
	public Pedidos _pedidos;
	public VerticalLayout layout;
	public Select<String> valoracion = new Select<>();
	
	public Pedido() {
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		//if(estado == x )
		valoracion.setItems("0", "1", "2", "3", "4", "5");
		//Cuando se valore guardarlo en la base de datos
		valoracion.addValueChangeListener(event ->{
			
		});
		this.layout.add(valoracion);
	}
	

	
	public void Cancelar() {
		throw new UnsupportedOperationException();
	}
}