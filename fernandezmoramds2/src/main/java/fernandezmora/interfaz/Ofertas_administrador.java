package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaOfertas_administrador;

public class Ofertas_administrador extends VistaOfertas_administrador {
	public Gestionar_ofertas _gestionar_ofertas;
	public Vector<Oferta_administrador> _list_Oferta_administrador = new Vector<Oferta_administrador>();
	public VerticalLayout layout;

	
	public Ofertas_administrador(Gestionar_ofertas go) {
		inicializar(go);
	}
	
	public void inicializar(Gestionar_ofertas go) {
		this._gestionar_ofertas = go;
		this._list_Oferta_administrador = new Vector<>();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);	
	}
	
	public void add_ofertas() {
		
		Oferta_administrador oa = new Oferta_administrador(this);
		this._list_Oferta_administrador.add(oa);
		layout.add(oa);
		
	}
}