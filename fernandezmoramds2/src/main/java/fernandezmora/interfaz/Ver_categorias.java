package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import vistas.VistaVercategorias;

public class Ver_categorias extends VistaVercategorias {
	public UR_UNR _uR_UNR;
	public Categorias _categorias;
	public VerticalLayout layout;

	public Ver_categorias(UR_UNR unr) {
		this._uR_UNR = unr;
		this._categorias = new Categorias(this);
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.layout.add(this._categorias);
	}
}