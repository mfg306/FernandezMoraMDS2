package interfaz;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;

import base_de_datos.BD_Categorias;
import base_de_datos.BD_Productos;
import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaBuscador;

public class Buscador extends VistaBuscador {
	public TextField _busquedaTF;
	public Select<String> categoriasBuscador = new Select<>();
	public Menu_UR_UNR _menu_UR_UNR;
	public Productos_busqueda _productos_busqueda;
	public base_de_datos.Categoria[] listaCategorias;
	public base_de_datos.Producto[] listaProductosBusqueda;


	public Buscador(Menu_UR_UNR urunr) {
		this._busquedaTF = new TextField();
		this._menu_UR_UNR = urunr;
		Icon icon = new Icon("lumo", "search");
		_busquedaTF.setPrefixComponent(icon);
		_busquedaTF.setWidth("100%");

		inicializar(urunr);
	}
	
	public void inicializar(Menu_UR_UNR urunr) {
		Clasificar_por_categoria();
		this.getEspacioBuscador().add(this.categoriasBuscador);
		this.getEspacioBuscador().add(this._busquedaTF);
		
		
		
		this._busquedaTF.addKeyPressListener(Key.ENTER, event -> {
			
			if(this._productos_busqueda != null) this._menu_UR_UNR._uR_UNR.layout.remove(this._productos_busqueda);
			
			this._productos_busqueda = new Productos_busqueda(this,this._menu_UR_UNR._uR_UNR);
			this._menu_UR_UNR._uR_UNR.layout.add(this._productos_busqueda);

		});
	}

	public void Clasificar_por_categoria() {
		iUR_UNR iur = new BDPrincipal();
		ArrayList<String> categorias = new ArrayList<>();
		listaCategorias = iur.cargarCategorias();
		
		categorias.add("Todos los departamentos");

		for (base_de_datos.Categoria c : this.listaCategorias) {
			categorias.add(c.getNombre_categoria());
		}
		this.categoriasBuscador.setItems(categorias);

	}
}
