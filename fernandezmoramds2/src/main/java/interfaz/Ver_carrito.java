package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_carrito;

public abstract class Ver_carrito extends VistaVer_carrito {
	public Menu_UR_UNR _menu_UR_UNR;
	public Productos_carrito _productos_carrito;

	public Ver_carrito(Menu_UR_UNR _menu_UR_UNR) {
		this._menu_UR_UNR = _menu_UR_UNR;
		realizar_compra();
	}

	public abstract void realizar_compra();

	public void abrir_Producto(Vector<Producto_carrito> lista, VerticalLayout layout) {
		for (Producto_carrito pca : lista) {
			pca.getImg().addClickListener(event -> {
				this.getVaadinHorizontalLayout().setVisible(false);
				pca._producto.getVaadinVerticalLayout2().setVisible(false);
				layout.add(pca._producto);
			});
		}
	}

	public void cerrar_Producto(Image b, Vector<Producto_carrito> lista, VerticalLayout layout) {
		b.addClickListener(event -> {
			for (Producto_carrito pca : lista) {
				this.getVaadinHorizontalLayout().setVisible(true);
				layout.remove(pca._producto);
			}
		});
	}
	
	public void ocultar_informacion_al_realizar_compra() {
		this.getVaadinHorizontalLayout().setVisible(false);

	}

}