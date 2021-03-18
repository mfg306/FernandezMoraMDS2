package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Editar_categoria extends Zona_productos {
	public Categoria_administrador _categoria_administrador;
	VerticalLayout layout;
	
	public Editar_categoria(Categoria_administrador ca) {
		inicializar(ca);
	}
	
	public void inicializar(Categoria_administrador ca) {
		this._categoria_administrador = ca;
		
		this.getH1CrearCategoria().setVisible(false);
		this.getH1CrearOferta().setVisible(false);
		this.getH1EditarOferta().setVisible(false);
		this.getH2CrearCategoria().setVisible(false);
		this.getH2CrearOferta().setVisible(false);
		this.getH2EditarOferta().setVisible(false);
		
		this.getCampoOferta().setVisible(false);
		this.getNombreOferta().setVisible(false);
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		cancelar_edicion();
	}
	
	public void ocultar_editar_categoria() {
		this.getH1EditarCategoria().setVisible(false);
		this.getH2EditarCategoria().setVisible(false);
		this.getH2().setVisible(false);
		this.getH21().setVisible(false);
		this.getVaadinHorizontalLayout().setVisible(false);

		
		this.getCampoCategoria().setVisible(false);
		this.getNombreCategoria().setVisible(false);
	}
	
	public void cancelar_edicion() {
		
		this.getBotonCancelar().addClickListener(event ->{
			ocultar_editar_categoria();
			this._categoria_administrador._categorias_administrador._gestionar_categorias = new Gestionar_categorias();
			layout.add(this._categoria_administrador._categorias_administrador._gestionar_categorias);
		});
		
		
	}
}