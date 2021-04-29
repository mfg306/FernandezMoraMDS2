package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Crear_categoría extends Zona_productos {
	public Gestionar_categorias _gestionar_categorias;
	VerticalLayout layout;
	
	public Crear_categoría() {
		inicializar();
	}
	
	public void inicializar() {
		this.getH1CrearOferta().setVisible(false);
		this.getH1EditarCategoria().setVisible(false);
		this.getH1EditarOferta().setVisible(false);
		
		this.getH2CrearOferta().setVisible(false);
		this.getH2EditarCategoria().setVisible(false);
		this.getH2EditarOferta().setVisible(false);
		
		this.getCampoOferta().setVisible(false);
		this.getNombreOferta().setVisible(false);
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		cancelar_creacion();
	}
	
	
	public void ocultar_crear_categoria() {
		
		this.getNombreCategoria().setVisible(false);
		
		this.getH1CrearCategoria().setVisible(false);
		this.getH2CrearCategoria().setVisible(false);
		this.getH2().setVisible(false);
		this.getH21().setVisible(false);
		
		this.getVaadinHorizontalLayout().setVisible(false);
		
	}
	
	
	public void cancelar_creacion() {
		
		this.getBotonCancelar().addClickListener(event ->{
			ocultar_crear_categoria();
			this._gestionar_categorias = new Gestionar_categorias();
			
			layout.add(this._gestionar_categorias);
		});
		
		
	}
	
}