package fernandezmora.interfaz;

import java.util.Optional;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_carrito_UNR extends Ver_carrito {

	public Menu_UNR _menu_UNR;
	public Solicitar_identificación _solicitar_identificación;
	public Productos_carrito _productos_carrito;
	public VerticalLayout layout;

	public Ver_carrito_UNR(Menu_UNR _menu_UNR) {
		this._menu_UNR = _menu_UNR;
		this._productos_carrito = new Productos_carrito(this._menu_UNR._uNR_.listaAux);

		layout = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		
		inicializar();
	}

	public void inicializar() {
		this._solicitar_identificación = new Solicitar_identificación(this);
		this.getProductosCarrito().add(this._productos_carrito);
		abrir_Producto();
		cerrar_Producto();
	}

	public void abrir_Producto() {
		for (Producto_carrito pca : this._menu_UNR._uNR_.listaAux) {
			pca.getVerProductoCarrito().addClickListener(event -> {
				this.getVaadinHorizontalLayout().setVisible(false);
				pca._producto.getVaadinVerticalLayout2().setVisible(false);
				this.layout.add(pca._producto);
			});
		}
	}

	public void cerrar_Producto() {
		this._menu_UNR.getBoton_carrito().addClickListener(event -> {
			for (Producto_carrito pca : this._menu_UNR._uNR_.listaAux) {
				this.layout.remove(pca._producto);
			}
		});
	}

	public void ocultar_informacion_al_realizar_compra() {
		this.getVaadinHorizontalLayout().setVisible(false);

	}

	@Override
	public void realizar_compra() {
		this.getVaadinButton().addClickListener(event -> {
			ocultar_informacion_al_realizar_compra();
			layout.add(this._solicitar_identificación);
		});

	}

}