package fernandezmora.interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

public class Menu_UR extends Menu_UR_UNR {

	public UR _uR;
	public Ver_carrito_UR _ver_carrito_UR;
	public Ver_bandeja_de_entrada _ver_bandeja_de_entrada;
	public Ver_pedidos _ver_pedidos;
	public Editar_perfil _editar_perfil;
	public VerticalLayout layout;
	public Select<String> datos = new Select<>();

	
	public Menu_UR(UR ur) {
		this._uR = ur;
		this.getBoton_iniciar_sesion().setVisible(false);
		this._ver_carrito_UR = new Ver_carrito_UR(this);
		this.layout = this.getMenu().as(VerticalLayout.class);
		
		
		datos.setItems("Nombre de Usuario", "Mis pedidos", "Mis correos", "Configuración", "Cerrar sesion");
		
		datos.addValueChangeListener(event ->{
			if(event.getValue().equals("Configuración")) {
				this.ocultar_Informacion_PaginaInicial();
				this.ocultar_Informacion_Al_Abrir_Carrito();
				Editar_perfil ep = new Editar_perfil();
				this.layout.add(ep);
				
			}
			if(event.getValue().equals("Mis pedidos")) {
				this.ocultar_Informacion_PaginaInicial();
				this.ocultar_Informacion_Al_Abrir_Carrito();
				Ver_pedidos vp = new Ver_pedidos();
				this.layout.add(vp);
			}
			if(event.getValue().equals("Cerrar sesion")) {
				//Implementar el cerrar sesion
			}
			
		});
		
		
		this.getVaadinHorizontalLayout().add(datos);
		
		abrir_carrito();
		
	}
	
	public void ocultar_Informacion_Al_Abrir_Carrito() {
		if (this._uR._ver_categorias != null) {
			this._uR.layout.remove(this._uR._ver_categorias);
		}
		
		
		/*Esto lo he cambiado*/
		if(this._ver_carrito_UR._introducir_datos_compra != null) {
			this._ver_carrito_UR.layout.remove(this._ver_carrito_UR._introducir_datos_compra);
			this._ver_carrito_UR.getVaadinVerticalLayout().setVisible(true);
		}
		
		this._ver_carrito_UR.cerrar_Producto();
		
	}


	@Override
	public void abrir_carrito() {
		this.getBoton_carrito().addClickListener(event -> {
			ocultar_Informacion_Al_Abrir_Carrito();
			/*Aqui creo que he quitado dos setVisible que habia y he puesto este mas general que quitaba a esos dos
			 * porque estaban dentro*/
			this._ver_carrito_UR.getVaadinHorizontalLayout().setVisible(true);	
			ocultar_Informacion_PaginaInicial();
			this._uR.getBotonVerCategorias().setVisible(false);
			this._uR.getProductosMasVendidosPorCategorias().setVisible(false);
			this._uR.layout.add(this._ver_carrito_UR);
		});
	}


	public void ocultar_Informacion_PaginaInicial() {
		this._uR.layoutOfertas.setVisible(false);
	}

	public void cerrar_sesion() {
		throw new UnsupportedOperationException();
	}

	
}