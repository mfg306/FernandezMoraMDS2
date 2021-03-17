package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ch.qos.logback.core.Layout;
import vistas.VistaCategorias_administrador;

public class Categorias_administrador extends VistaCategorias_administrador{
	public Gestionar_categorias _gestionar_categorias;
	public Vector<Categoria_administrador> _list_Categoria_administrador = new Vector<Categoria_administrador>();
	public VerticalLayout layout;
	
	public Categorias_administrador(Gestionar_categorias gc) {
		this._gestionar_categorias = gc; 
		this._list_Categoria_administrador = new Vector<>();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

	}
	
	/*Metodo para agregar categorias al listado. Cuando sepamos como se hace con la base de datos lo podemos mejorar*/
	public void add_categorias() {
		Categoria_administrador ca = new Categoria_administrador(this);
		this._list_Categoria_administrador.add(ca); // En realidad no sé si se va a necesitar, con agregar la vista al layout es suficiente para que se vea
		layout.add(ca);
		
		
	}
}