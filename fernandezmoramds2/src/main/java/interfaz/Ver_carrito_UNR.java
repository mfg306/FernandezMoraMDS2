package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_carrito_UNR extends Ver_carrito {

	public Menu_UNR _menu_UNR;
	public Solicitar_identificación _solicitar_identificación;
	public Productos_carrito _productos_carrito; // ¿Esto podemos hacerlo? Esq asi es mucho mas facil :( 
	public VerticalLayout layout;

	public Ver_carrito_UNR(Menu_UNR _menu_UNR) {
		this._menu_UNR = _menu_UNR;
		this._productos_carrito = new Productos_carrito(this._menu_UNR._uNR_.listaAuxUNR, this);

		layout = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		
		inicializar();
		retroceder();
	}

	public void inicializar() {
		this._solicitar_identificación = new Solicitar_identificación(this);
		this.getProductosCarrito().add(this._productos_carrito);
		abrir_Producto(this._menu_UNR._uNR_.listaAuxUNR, this.layout);
		cerrar_Producto(this._menu_UNR.getBoton_carrito(), this._menu_UNR._uNR_.listaAuxUNR, this.layout);
	}
	
	public void retroceder(){
		Button retroceder = new Button();
		retroceder.setText("Atras");
		this.layout.add(retroceder);
		
		retroceder.addClickListener(event ->{
			this._menu_UNR._uNR_.inicializarURUNR();
			limpiarInterfaz();
		});
		
	}
	
	public void limpiarInterfaz() {
		this._menu_UNR._uNR_.layout.remove(this);

	}

	@Override
	public void realizar_compra() {
		this.getVaadinButton().addClickListener(event -> {
			ocultar_informacion_al_realizar_compra();
			layout.add(this._solicitar_identificación);
		});
	}

}