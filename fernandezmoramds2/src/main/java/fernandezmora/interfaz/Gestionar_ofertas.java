package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionar_ofertas;

public class Gestionar_ofertas extends VistaGestionar_ofertas {
	public Administrador _administrador;
	public Crear_oferta _crear_oferta;
	public Ofertas_administrador _ofertas_administrador;
	public VerticalLayout layout;

	
	public Gestionar_ofertas() {
		this._ofertas_administrador = new Ofertas_administrador(this);
		this._ofertas_administrador.add_ofertas();
		this._ofertas_administrador.add_ofertas();
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		layout.add(this._ofertas_administrador);
		
		crear_Ofertas();
		editar_Oferta();
	}
	
	public void ocultar_Gestionar_Ofertas() {
		this.getH1().setVisible(false);
		layout.remove(this._ofertas_administrador);
		this.getVaadinButton().setVisible(false);
	}
	
	/**
	 * Cuando se pulse el boton de crear una nueva oferta
	 */
	public void crear_Ofertas() {
				
		this.getVaadinButton().addClickListener(event ->{
			this._crear_oferta = new Crear_oferta();
			ocultar_Gestionar_Ofertas();
			layout.add(this._crear_oferta);
		});
		
	}
	
	public void editar_Oferta() {
		for(Oferta_administrador oa : this._ofertas_administrador._list_Oferta_administrador) {
			oa.getVaadinButton().addClickListener(event ->{
				oa._editar_oferta = new Editar_oferta(oa);
				this.ocultar_Gestionar_Ofertas();
				layout.add(oa._editar_oferta);
			});
		}
	}
	
	
}