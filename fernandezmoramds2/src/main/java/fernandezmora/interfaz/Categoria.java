package fernandezmora.interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCategoria;

public class Categoria extends VistaCategoria{
	public Categorias _categorias;
	public Productos_categoria _productos_categoria;
	public VerticalLayout layout;
	
	public Categoria(Categorias c, UR_UNR unrunr, base_de_datos.Categoria cat) {
		this.getCategoria1().setText(cat.getNombre_categoria());
		abrir_Categoria();
		inicializar(c, unrunr);
	}
	
	public void inicializar(Categorias c, UR_UNR unrunr) {
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		this._categorias = c;
		this._productos_categoria = new Productos_categoria(this, unrunr);
	}
	
	public void abrir_Categoria() {
			this.getCategoria1().addClickListener(event->{
			this._categorias._ver_categorias.layout.removeAll();
			this._categorias._ver_categorias.layout.add(this._productos_categoria);
			});
		}
	}
	

	
	
