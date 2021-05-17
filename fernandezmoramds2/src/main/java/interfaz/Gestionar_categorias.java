 package interfaz;

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

	
	public Gestionar_categorias(Administrador admin)  {
		this._administrador = admin;
		inicializar();
		retroceder();
	}
	
	public void inicializar() {
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
				
		this._categorias_administrador = new Categorias_administrador(this); 
		this.layout.add(this._categorias_administrador);
		crear_Categorias();

		try {
			abrirGestionarCategorias();
		} catch(Exception e) {
			e.printStackTrace();
		}
}
	
	public void retroceder() {
		this.getRetroceder().addClickListener(event ->{
			
			/*Si viene del inicio*/
			if(this._administrador.padre != null) {
				this._administrador.padre.removeAll();
			}
			
			/*Si ya se viene de un retroceder ==> se ha creado aqui en este metodo*/
			if(this._administrador.padre == null) {
				this._administrador.layout.removeAll();
			}
			
			Administrador admin = new Administrador(this._administrador.admin);
			this.ocultar_Gestionar_Categorias();
			this._administrador._menu_A.layout.removeAll();
			this._administrador.layout.add(admin);
		});
	}
	
	public void ocultar_Gestionar_Categorias() {
		this.layout.removeAll();
	}
	
	
	/**
	 * Cuando se pulse el boton de crear una nueva categoria
	 */
	public void crear_Categorias() {
		this.getBotonNuevaCategoria().addClickListener(event ->{
			this._crear_categoría = new Crear_categoría(this);
			ocultar_Gestionar_Categorias();
			layout.add(this._crear_categoría);
		});
	}
	

	
	/**
	 * Este metodo inicializa las categorias de la base de datos.
	 * @throws PersistentException excepcion si hay algun problema
	 */
	public void abrirGestionarCategorias() throws PersistentException {
		iAdministrador iadmin = new BDPrincipal();

		this.categoriasAdmin = iadmin.cargarCategoriasAdministrador();
		for(base_de_datos.Categoria c : this.categoriasAdmin) {
			Categoria_administrador ca = new Categoria_administrador(this._categorias_administrador, c);
			this._categorias_administrador.addCategoria(ca);

		}
	}
	
	
	
	
}