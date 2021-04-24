package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCategorias_administrador;

public class Categorias_administrador extends VistaCategorias_administrador{
	public Gestionar_categorias _gestionar_categorias;
	public Vector<Categoria_administrador> _list_Categoria_administrador = new Vector<Categoria_administrador>();
	public VerticalLayout layout;
	
	public Categorias_administrador(Gestionar_categorias gc) {
		inicializar(gc);
	}
	
	public void inicializar(Gestionar_categorias gc) {
		this._gestionar_categorias = gc; 
		
		this._list_Categoria_administrador = new Vector<>();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		//addCategoriaAdministrador();
	}
	
	public void addCategoriaAdministrador() {

		for(base_de_datos.Categoria c : this._gestionar_categorias.categoriasAdmin) {
			Categoria_administrador ca = new Categoria_administrador(this, c);
			this._list_Categoria_administrador.add(ca);
			this.layout.add(ca);
			Notification.show("Categoria añadida");

		}
	}
	

}