package fernandezmora.interfaz;

import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import vistas.VistaBuscador;

public class Buscador extends VistaBuscador {
	public Productos_busqueda _productos_busqueda;
	public VerticalLayout layout;
	TextField buscador;


	public Buscador() {
		this.buscador = new TextField();
		Icon icon = new Icon("lumo", "search");
		buscador.setPrefixComponent(icon);
		buscador.setWidth("100%");
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.layout.add(buscador);		
	}

}