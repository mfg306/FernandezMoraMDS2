package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Span;
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
	Span aviso = new Span();
	
	public Gestionar_ofertas(Administrador admin) {	
		this._administrador = admin;
		retroceder();
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
			this.ocultar_Gestionar_Ofertas();
			this._administrador._menu_A.layout.removeAll();
			this._administrador.layout.add(admin);
		});
	}
	
	public void ocultar_Gestionar_Ofertas() {
		this.layout.removeAll();
	}
	

	public void crear_Ofertas() {
				
		this.getVaadinButton().addClickListener(event ->{
			this._crear_oferta = new Crear_oferta(this);
			ocultar_Gestionar_Ofertas();
			layout.add(this._crear_oferta);
		});
		
	}
	
	
	public void abrirGestionarOfertas() {
		iAdministrador iadmin = new BDPrincipal();
		
		try {
			this.ofertasAdmin = iadmin.cargarOfertasAdmin();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		if(this.ofertasAdmin != null && this.ofertasAdmin.length > 0) {
			for(base_de_datos.Oferta o : this.ofertasAdmin) {
				Oferta_administrador oa = new Oferta_administrador(this._ofertas_administrador, o);
				this._ofertas_administrador.add_ofertas(oa);
			}	
		} else {
			aviso.setText("No hay ninguna oferta registrada en la base de datos.");
			this.layout.add(aviso);
		}

	}
	
	
}