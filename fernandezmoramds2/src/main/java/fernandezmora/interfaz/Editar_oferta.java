package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Editar_oferta extends Zona_productos {
	public Oferta_administrador _oferta_administrador;
	VerticalLayout layout;

	
	public Editar_oferta(Oferta_administrador oa) {
		this._oferta_administrador = oa;
		
		this.getH1CrearCategoria().setVisible(false);
		this.getH1CrearOferta().setVisible(false);
		this.getH1EditarCategoria().setVisible(false);
		this.getH2CrearCategoria().setVisible(false);
		this.getH2CrearOferta().setVisible(false);
		this.getH2EditarCategoria().setVisible(false);
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		this.getCampoCategoria().setVisible(false);
		this.getNombreCategoria().setVisible(false);
		
		cancelar_edicion();
	}
	
	public void ocultar_editar_oferta() {
		this.getCampoOferta().setVisible(false);
		this.getNombreOferta().setVisible(false);
		
		this.getH1EditarOferta().setVisible(false);
		this.getH2EditarOferta().setVisible(false);
		this.getH2().setVisible(false);
		this.getH21().setVisible(false);
		
		this.getVaadinHorizontalLayout().setVisible(false);
	}
	
	public void cancelar_edicion() {
		this.getBotonCancelar().addClickListener(event ->{
			ocultar_editar_oferta();
			this._oferta_administrador._ofertas_administrador._gestionar_ofertas = new Gestionar_ofertas();
			layout.add(this._oferta_administrador._ofertas_administrador._gestionar_ofertas);

		});
	}
}