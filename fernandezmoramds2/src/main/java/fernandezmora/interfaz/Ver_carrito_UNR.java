package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_carrito_UNR extends Ver_carrito {
	
	public Menu_UNR _menu_UNR;
	public Solicitar_identificación _solicitar_identificación;
	public Productos_carrito _productos_carrito;
	public VerticalLayout layout;
	
	public Ver_carrito_UNR(Menu_UNR _menu_UNR) {
		super();
		this._menu_UNR = _menu_UNR;
		this._productos_carrito = new Productos_carrito(this);
		layout = this.getVaadinVerticalLayout1().as(VerticalLayout.class);


		inicializar();
	}
	
	
	public void inicializar() {
		this._solicitar_identificación = new Solicitar_identificación(this);
		this._menu_UNR._uNR_.getBotonVerCategorias().setVisible(false);
		
		this.getProductosCarrito().add(this._productos_carrito);
		
		abrir_Producto();
	}
	
	
	/*Este metodo estaba en Productos_carrito.java pero mejor dejarlo aqui porque es Ver_carrito_UNR quien 
	 * lo contiene y al layout que hay que anadirlo*/
	public void abrir_Producto() {
		for(Producto_carrito pca : this._productos_carrito._list_Producto_carrito) {
			pca.getVerProductoCarrito().addClickListener(event ->{
				this.getVaadinHorizontalLayout().setVisible(false);
				this.layout.add(pca._producto);
			});
		}
	}
	
	/* Este metodo es para cerrar el producto. Lo llama Menu_UNR.ocultar_Informacion_Al_Abrir_Carrito() */ 
	public void cerrar_Producto() {
		for(Producto_carrito pca : this._productos_carrito._list_Producto_carrito) {
			this.layout.remove(pca._producto);
		}
	}
	
	public void ocultar_informacion_al_realizar_compra() {
		this.getVaadinHorizontalLayout().setVisible(false);

	}
	
	@Override
	public void realizar_compra() {
		this.getVaadinButton().addClickListener(event ->{
			ocultar_informacion_al_realizar_compra();
			layout.add(this._solicitar_identificación);
		});

		
	}
	
	

	
	
}