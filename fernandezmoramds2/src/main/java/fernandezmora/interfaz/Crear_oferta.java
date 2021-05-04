package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Crear_oferta extends Zona_productos {
	public Gestionar_ofertas _gestionar_ofertas;
	VerticalLayout layout;

	public Crear_oferta() {
		inicializar();
	}
	
	public void inicializar() {
		this.getH1CrearCategoria().setVisible(false);
		this.getH1EditarCategoria().setVisible(false);
		this.getH1EditarOferta().setVisible(false);
		
		this.getH2CrearCategoria().setVisible(false);
		this.getH2EditarCategoria().setVisible(false);
		this.getH2EditarOferta().setVisible(false);
		
		this.getCampoCategoria().setVisible(false);
		this.getNombreCategoria().setVisible(false);
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		cancelar_creacion();
	}
	
	public void ocultar_crear_oferta() {
		this.getCampoOferta().setVisible(false);
		this.getCampoOferta1().setVisible(false);
		
		this.getH1CrearOferta().setVisible(false);
		this.getH2CrearOferta().setVisible(false);
		this.getH2().setVisible(false);
		this.getH21().setVisible(false);
		
		this.getVaadinHorizontalLayout().setVisible(false);
		
	}
	
	public void cancelar_creacion() {
		this.getBotonCancelar().addClickListener(event ->{
			ocultar_crear_oferta();
			this._gestionar_ofertas = new Gestionar_ofertas();
			
			layout.add(this._gestionar_ofertas);
		});
	}
}