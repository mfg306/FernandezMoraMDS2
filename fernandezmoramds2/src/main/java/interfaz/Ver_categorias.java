package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaVercategorias;

public class Ver_categorias extends VistaVercategorias {
	public UR_UNR _uR_UNR;
	public Categorias _categorias;
	public VerticalLayout layout;
	
	

	public Ver_categorias(UR_UNR unr) {
		//verCategorias();
		inicializar(unr);
		
		
	}
	
	
	public void inicializar(UR_UNR unr) {
		this._uR_UNR = unr;
		this._categorias = new Categorias(this);
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this.layout.remove(this._categorias);
		this.layout.add(this._categorias);
		
	    
	}
	
	/*public void verCategorias() {
		iUR_UNR ur_unr = new BDPrincipal();
		categorias = ur_unr.cargarCategorias();
		for(base_de_datos.Categoria c : this.categorias) {
			Categoria cat = new Categoria(this._categorias, this._uR_UNR, c);
			this._categorias._list_Categorias.add(cat);
			this._categorias.layout.add(cat);	
		}
		this.inicializar(this._uR_UNR);
	}*/
	
}