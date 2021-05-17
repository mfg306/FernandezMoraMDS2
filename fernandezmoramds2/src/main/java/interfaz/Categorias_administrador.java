package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCategorias_administrador;

public class Categorias_administrador extends VistaCategorias_administrador{
	public Gestionar_categorias _gestionar_categorias;
	public Vector<Categoria_administrador> _list_Categoria_administrador = new Vector<Categoria_administrador>();
	public VerticalLayout layout;
	
	public Categorias_administrador(Gestionar_categorias gc) {
		this._list_Categoria_administrador = new Vector<>();
		inicializar(gc);
	}
	
	public void inicializar(Gestionar_categorias gc) {
		this._gestionar_categorias = gc; 
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	}
	
	public void addCategoria(Categoria_administrador c) {
		this._list_Categoria_administrador.add(c);
		this.layout.add(c);
	}
	
	public void removeCategoria(Categoria_administrador c) {
		this.layout.remove(c);
	}
	

}