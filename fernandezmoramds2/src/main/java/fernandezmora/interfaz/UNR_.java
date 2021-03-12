package fernandezmora.interfaz;
import java.util.EventListener;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iUNR_;

public class UNR_ extends UR_UNR {
	//public iUNR_ _iUNR_;
	public Menu_UNR _menu_UNR;
	public Producto_UNR _producto_UNR;
	public VerticalLayout layout;


	public UNR_() {
		
		_menu_UNR = new Menu_UNR();
		_producto_UNR =  new Producto_UNR();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout.add(_menu_UNR);
		getBotonVerCategorias().addClickListener(event ->{
				
				_ver_categorias = new Ver_categorias();
				
			});
		inicializar();

			
	}
	
	public void inicializar() {
		
		_menu_UNR.abrirIniciarSesionMenuUNR(layout, _menu_UNR);
		_menu_UNR._iniciar_sesion_UNR.abrirRecuperarContrasenia(layout,_menu_UNR);
		_menu_UNR._iniciar_sesion_UNR.abrirRegistrarse(layout,_menu_UNR);
		
	}
	
}