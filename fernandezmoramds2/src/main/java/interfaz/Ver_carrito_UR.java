package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_carrito_UR extends Ver_carrito {

	public Menu_UR _menu_UR;
	public Introducir_datos_compra _introducir_datos_compra;
	public VerticalLayout layout;
	public Productos_carrito _productos_carrito; // ¿Esto podemos hacerlo? Esq asi es mucho mas facil :(

	public Ver_carrito_UR(Menu_UR _menu_UR) {
		this._menu_UR = _menu_UR;
		this._productos_carrito = new Productos_carrito(this._menu_UR._uR.listaAuxUR,this);
		System.out.println(this._menu_UR._uR.listaAuxUR.size());

		layout = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		inicializar();
	}

	public void inicializar() {
		this._introducir_datos_compra = new Introducir_datos_compra(this);
		this.getProductosCarrito().add(this._productos_carrito);
		abrir_Producto(this._productos_carrito._list_Producto_carrito, this.layout);
		cerrar_Producto(this._menu_UR.getBoton_carrito(), this._menu_UR._uR.listaAuxUR, this.layout);
	}


	public void ocultar_informacion_al_realizar_compra() {
		this.getVaadinHorizontalLayout().setVisible(false);

	}

	@Override
	public void realizar_compra() {
		this.getVaadinButton().addClickListener(event -> {
			ocultar_informacion_al_realizar_compra();
			layout.add(this._introducir_datos_compra);
		});

	}

}