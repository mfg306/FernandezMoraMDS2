package fernandezmora.interfaz;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaOferta_administrador;

public class Oferta_administrador extends VistaOferta_administrador {
	public Ofertas_administrador _ofertas_administrador;
	public Editar_oferta _editar_oferta;
	public base_de_datos.Oferta oferta;

	public Oferta_administrador(Ofertas_administrador oa, base_de_datos.Oferta o) {
		this.oferta = o;
		abrir_editar_Oferta();
		Eliminar_oferta();
		abrir_editar_categoria();
		inicializar(oa, o);
	}

	public void inicializar(Ofertas_administrador oa, base_de_datos.Oferta o) {
		this._ofertas_administrador = oa;
		this._editar_oferta = new Editar_oferta(this);
		this.getH1().setText(o.getNombre_Oferta());
	}
	
	public void abrir_editar_categoria()
	{
		this.getVaadinButton().addClickListener(event -> {
			this._editar_oferta = new Editar_oferta(this);
			this._ofertas_administrador._gestionar_ofertas.ocultar_Gestionar_Ofertas();
			this._ofertas_administrador._gestionar_ofertas.layout.add(this._editar_oferta);
		});
	}
	public void Eliminar_oferta() {
		this.getVaadinButton1().addClickListener(event ->{
			iAdministrador admin = new BDPrincipal();
			try {
				base_de_datos.Producto[] productosOferta = this.oferta._Pertenece_a.toArray();
				
				admin.eliminarOfertaAdmin(this.oferta.getId_Oferta(), productosOferta);
				this._ofertas_administrador.removeOferta(this);
			} catch(Exception e) {
				e.printStackTrace();
			}
		});
	}

	public void abrir_editar_Oferta() {
		this.getVaadinButton().addClickListener(event -> {
			this._editar_oferta = new Editar_oferta(this);
			this._ofertas_administrador._gestionar_ofertas.ocultar_Gestionar_Ofertas();
			this._ofertas_administrador._gestionar_ofertas.layout.add(this._editar_oferta);
		});

	}
}