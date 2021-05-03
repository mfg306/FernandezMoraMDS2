package fernandezmora.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaGestionar_ofertas;

public class Gestionar_ofertas extends VistaGestionar_ofertas {
	public Administrador _administrador;
	public Crear_oferta _crear_oferta;
	public Ofertas_administrador _ofertas_administrador;
	public VerticalLayout layout;
	base_de_datos.Oferta[] ofertasAdmin;

	
	public Gestionar_ofertas() {		
		inicializar();
	}
	
	public void inicializar() {
		this._ofertas_administrador = new Ofertas_administrador(this);
		this.layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		layout.add(this._ofertas_administrador);
		
		crear_Ofertas();
		
		try {
			abrirGestionarOfertas();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ocultar_Gestionar_Ofertas() {
		this.getH1().setVisible(false);
		layout.remove(this._ofertas_administrador);
		this.getVaadinButton().setVisible(false);
	}
	
	/**
	 * Cuando se pulse el boton de crear una nueva oferta
	 */
	public void crear_Ofertas() {
				
		this.getVaadinButton().addClickListener(event ->{
			this._crear_oferta = new Crear_oferta();
			ocultar_Gestionar_Ofertas();
			layout.add(this._crear_oferta);
		});
		
	}
	
	
	public void abrirGestionarOfertas() {
		iAdministrador iadmin = new BDPrincipal();
		
		this.ofertasAdmin = iadmin.cargarOfertas();
		for(base_de_datos.Oferta o : this.ofertasAdmin) {
			Oferta_administrador oa = new Oferta_administrador(this._ofertas_administrador, o);
			this._ofertas_administrador.add_ofertas(oa);
		}
	}
	
	
}