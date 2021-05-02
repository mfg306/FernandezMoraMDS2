package fernandezmora.interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaCategoria_administrador;

public class Categoria_administrador extends VistaCategoria_administrador {

	public Categorias_administrador _categorias_administrador;
	public Editar_categoria _editar_categoria;
	public base_de_datos.Categoria categoria;

	public Categoria_administrador(Categorias_administrador ca, base_de_datos.Categoria c) {
		this.categoria = c;
		Eliminar_categoria();
		inicializar(ca, c);
	}
	
	public void inicializar(Categorias_administrador ca, base_de_datos.Categoria c) {
		this._categorias_administrador = ca;
		this.categoria = c;
		abrir_editar_categoria();
		this.getH1().setText(c.getNombre_categoria());
	}
	
	public void abrir_editar_categoria() {
		this.getVaadinButton().addClickListener(event -> {
			this._editar_categoria = new Editar_categoria(this);
			this._categorias_administrador._gestionar_categorias.ocultar_Gestionar_Categorias();
			this._categorias_administrador._gestionar_categorias.layout.add(this._editar_categoria);
		});

	}

	public void Eliminar_categoria() {
		
		this.getVaadinButton1().addClickListener(event ->{
			iAdministrador admin = new BDPrincipal();
			try {

				Vector<Producto_listado_administracion> listaProductos = this._editar_categoria._productos_listado_administracion._list_Producto_listado_administracion;
				base_de_datos.Producto[] productosCategoria = new base_de_datos.Producto[listaProductos.size()];

				for (int i = 0; i < listaProductos.size(); i++) {
					productosCategoria[i] = listaProductos.get(i).producto;
				}
				
				
				admin.eliminarCategoriaAdmin(categoria.getId_Categoria(), productosCategoria);
				this._categorias_administrador.removeCategoria(this);
//				this._categorias_administrador.inicializar(this._categorias_administrador._gestionar_categorias);
			
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});
		

		
	}
	


	
	
}