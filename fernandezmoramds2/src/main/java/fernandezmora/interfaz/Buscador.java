package fernandezmora.interfaz;

import java.util.ArrayList;

import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;

import base_de_datos.BD_Categorias;
import base_de_datos.BD_Productos;
import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaBuscador;

public class Buscador extends VistaBuscador {
	//private ComboBox _categoriasCB;
	public TextField _busquedaTF;
	public Select<String> categoriasBuscador = new Select<>();
	public Menu_UR_UNR _menu_UR_UNR;
	public Productos_busqueda _productos_busqueda;
	//public VerticalLayout layout;
	public base_de_datos.Categoria[] listaCategorias;


	public Buscador() {
		this._busquedaTF = new TextField();
		Icon icon = new Icon("lumo", "search");
		_busquedaTF.setPrefixComponent(icon);
		_busquedaTF.setWidth("100%");
		//this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		cargarCategoriasBuscador();
		this.getEspacioBuscador().add(this.categoriasBuscador);
		this.getEspacioBuscador().add(this._busquedaTF);
		//this.layout.add(_busquedaTF);		
		
	}
	
	public void cargarCategoriasBuscador() {
		iUR_UNR iur = new BDPrincipal();
		ArrayList<String> categorias = new ArrayList<>();
		listaCategorias = iur.cargarCategorias();
		
		for(base_de_datos.Categoria c : this.listaCategorias) {
			categorias.add(c.getNombre_categoria());
		}
		this.categoriasBuscador.setItems(categorias);
		
	}
	

}