package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaUrunr;

//import basededatos.iUR_UNR;


public abstract class UR_UNR extends VistaUrunr{
	//public iUR_UNR _iUR_UNR;
	public Productos_mas_vendidos_por_categorias _productos_mas_vendidos_por_categorias;
	public Ofertas _ofertas;
	public Ver_categorias _ver_categorias;
	public Menu_UR_UNR _menu_UR_UNR;
	public VerticalLayout layout;
	
	public UR_UNR() {
		
		this._ver_categorias = new Ver_categorias(this);
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	}

	
	
}