package fernandezmora.interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.Key;
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
	public TextField _busquedaTF;
	public Select<String> categoriasBuscador = new Select<>();
	public Menu_UR_UNR _menu_UR_UNR;
	public Productos_busqueda _productos_busqueda;
	public base_de_datos.Categoria[] listaCategorias;
	public base_de_datos.Producto[] listaProductosBusqueda;
	public VerticalLayout layout;


	public Buscador() {
		this._busquedaTF = new TextField();
		Icon icon = new Icon("lumo", "search");
		_busquedaTF.setPrefixComponent(icon);
		_busquedaTF.setWidth("100%");
		this._productos_busqueda = new Productos_busqueda(this);
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		cargarCategoriasBuscador();
		this.getEspacioBuscador().add(this.categoriasBuscador);
		this.getEspacioBuscador().add(this._busquedaTF);
		buscarProducto();
		;		
		
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
	
	public void buscarProducto() {
		
		iUR_UNR i = new BDPrincipal();
			this._busquedaTF.addKeyPressListener(Key.ENTER, event -> {
				try {
					listaProductosBusqueda = i.cargarProductosPorCategoria(this.categoriasBuscador.getValue(), this._busquedaTF.getValue());
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(base_de_datos.Producto producto : this.listaProductosBusqueda) {
					Producto_busqueda pb =  new Producto_busqueda(this._productos_busqueda,producto);
					this._productos_busqueda._list_Producto_busqueda.add(pb);
					this._productos_busqueda.layout.add(pb);
				}
				this.layout.add(this._productos_busqueda);
			
			
			});					
	}

}
