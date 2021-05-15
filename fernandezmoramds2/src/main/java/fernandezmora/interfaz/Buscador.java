package fernandezmora.interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
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

	public Buscador(Menu_UR_UNR urunr) {
		this._busquedaTF = new TextField();
		this._menu_UR_UNR = urunr;
		Icon icon = new Icon("lumo", "search");
		_busquedaTF.setPrefixComponent(icon);
		_busquedaTF.setWidth("100%");
		this._productos_busqueda = new Productos_busqueda(this);
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		cargarCategoriasBuscador();
		this.getEspacioBuscador().add(this.categoriasBuscador);
		this.getEspacioBuscador().add(this._busquedaTF);
		buscarProducto();

	}

	public void cargarCategoriasBuscador() {
		iUR_UNR iur = new BDPrincipal();
		ArrayList<String> categorias = new ArrayList<>();
		listaCategorias = iur.cargarCategorias();

		for (base_de_datos.Categoria c : this.listaCategorias) {
			categorias.add(c.getNombre_categoria());
		}
		this.categoriasBuscador.setItems(categorias);

	}

	public void buscarProducto() {

		iUR_UNR i = new BDPrincipal();
		this._busquedaTF.addKeyPressListener(Key.ENTER, event -> {
			try {
				this._productos_busqueda.getVaadinHorizontalLayout().removeAll();
				this._productos_busqueda.getVaadinHorizontalLayout1().removeAll();
				
				if(this._busquedaTF.getValue().toString().equals("") || this.categoriasBuscador.getValue().toString().equals("")) {
					Notification.show("Introduzca un producto en el buscador o categoria para realizar la busqueda");
					
				}else {
					this.listaProductosBusqueda = i.cargarProductosPorCategoria(this.categoriasBuscador.getValue(),
							this._busquedaTF.getValue());
				}
				if(this.listaProductosBusqueda != null) {
					int contador = 1;
					for (base_de_datos.Producto producto : this.listaProductosBusqueda) {
						Producto_busqueda pb = new Producto_busqueda(this._productos_busqueda, producto);
						this._productos_busqueda._list_Producto_busqueda.add(pb);
						if (contador % 2 != 0) {
							this._productos_busqueda.getVaadinHorizontalLayout1().add(pb);
							contador++;
						} else {
							this._productos_busqueda.getVaadinHorizontalLayout().add(pb);
							contador++;
						}
					}
					this._menu_UR_UNR._uR_UNR.limpiarInterfaz();
					this._menu_UR_UNR.layout.add(this._productos_busqueda);
				}
					
				
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			
		});

	}

}
