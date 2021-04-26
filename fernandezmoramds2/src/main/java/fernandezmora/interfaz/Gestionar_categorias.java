package fernandezmora.interfaz;

import org.orm.PersistentException;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaGestionarcategorias;

public class Gestionar_categorias extends VistaGestionarcategorias {

	public Administrador _administrador;
	public Categorias_administrador _categorias_administrador;
	public Crear_categoría _crear_categoría;
	public VerticalLayout layout;
	base_de_datos.Categoria[] categoriasAdmin;

	
	public Gestionar_categorias()  {
		inicializar();
	}
	
	public void inicializar() {
		//crear_Categorias();
		//editar_Categoria();
		
		try {
			abrirGestionarCategorias();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//Notification.show("1. Numero de categorias en GC : " + this.categoriasAdmin.length);
		this._categorias_administrador = new Categorias_administrador(this); 
		//Notification.show("2. Numero de categorias en GC : " + this.categoriasAdmin.length);

}
	
	public void ocultar_Gestionar_Categorias() {
		layout.remove(this._categorias_administrador);
		this.getTitulo().setVisible(false);
		this.getBotonNuevaCategoria().setVisible(false);
	}
	
	
	/**
	 * Cuando se pulse el boton de crear una nueva categoria
	 */
	public void crear_Categorias() {
		this.getBotonNuevaCategoria().addClickListener(event ->{
			this._crear_categoría = new Crear_categoría();
			ocultar_Gestionar_Categorias();
			layout.add(this._crear_categoría);
		});
	}
	
	/**
	 * Cuando se pulse el boton de editar categoria de cada categoria
	 */
	public void editar_Categoria() {
		for(Categoria_administrador ca : this._categorias_administrador._list_Categoria_administrador) {
			ca.getVaadinButton().addClickListener(event ->{
				ca._editar_categoria = new Editar_categoria(ca);
				this.ocultar_Gestionar_Categorias();
				layout.add(ca._editar_categoria);
			});
		}
	}
	
	
	/**
	 * Este metodo inicializa las categorias de la base de datos.
	 * @throws PersistentException excepcion si hay algun problema
	 */
	public void abrirGestionarCategorias() throws PersistentException {
		iAdministrador iadmin = new BDPrincipal();

		this.categoriasAdmin = iadmin.cargarCategoriasAdministrador();	
		
		/*for(base_de_datos.Categoria c : this.categoriasAdmin) {
			Notification.show(c.getNombre_categoria());
		}*/

	}
	
	
	
	
}