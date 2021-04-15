package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_carrito_UR extends Ver_carrito {

	public Menu_UR _menu_UR;
	public Introducir_datos_compra _introducir_datos_compra;
	public VerticalLayout layout;
	public Productos_carrito _productos_carrito; // ¿Esto podemos hacerlo? Esq asi es mucho mas facil :( 

	
	public Ver_carrito_UR(Menu_UR _menu_UR) {
		this._menu_UR = _menu_UR;
		this._productos_carrito = new Productos_carrito(this._menu_UR._uR.listaAux);
		
		layout = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		inicializar();
	}
	
	
	public void inicializar() {
		this._introducir_datos_compra = new Introducir_datos_compra(this);
		this.getProductosCarrito().add(this._productos_carrito);
		abrir_Producto();
		cerrar_Producto();
	}
	
	
	/*Este metodo estaba en Productos_carrito.java pero mejor dejarlo aqui porque es Ver_carrito_UNR quien 
	 * lo contiene y al layout que hay que anadirlo*/
	public void abrir_Producto() {
		for(Producto_carrito pca : this._productos_carrito._list_Producto_carrito) {
			pca.getVerProductoCarrito().addClickListener(event ->{
				this.getVaadinHorizontalLayout().setVisible(false);
				pca._producto.getVaadinVerticalLayout2().setVisible(false);
				this.layout.add(pca._producto);
			});
		}
	}
	
	
	
	/* Este metodo es para cerrar el producto. Lo llama Menu_UNR.ocultar_Informacion_Al_Abrir_Carrito() */ 
	public void cerrar_Producto() {
		this._menu_UR.getBoton_carrito().addClickListener(event -> {
			for (Producto_carrito pca : this._menu_UR._uR.listaAux) {
				this.layout.remove(pca._producto);
			}
		});
	}
	
	public void ocultar_informacion_al_realizar_compra() {
		this.getVaadinHorizontalLayout().setVisible(false);

	}
	
	@Override
	public void realizar_compra() {
		this.getVaadinButton().addClickListener(event ->{
			ocultar_informacion_al_realizar_compra();
			layout.add(this._introducir_datos_compra);
		});

		
	}
	
}