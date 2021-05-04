package fernandezmora.interfaz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;

public class Editar_oferta extends Zona_productos {
	public Oferta_administrador _oferta_administrador;
	VerticalLayout layout;

	
	public Editar_oferta(Oferta_administrador oa) {
		inicializar(oa);
	}
	
	
	public void inicializar(Oferta_administrador oa) {
		this._oferta_administrador = oa;
		
		this.getH1CrearCategoria().setVisible(false);
		this.getH1CrearOferta().setVisible(false);
		this.getH1EditarCategoria().setVisible(false);
		this.getH2CrearCategoria().setVisible(false);
		this.getH2CrearOferta().setVisible(false);
		this.getH2EditarCategoria().setVisible(false);
		
		this.getCampoFechaCaducidad().setValue(oa.oferta.getFecha_caducidad());
		this.getCampoOferta().setValue(oa.oferta.getNombre_Oferta());
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		this.getCampoCategoria().setVisible(false);
		this.getNombreCategoria().setVisible(false);
		
		cancelar_edicion();
	}
	
	public void ocultar_editar_oferta() {
		this.getCampoOferta().setVisible(false);
		this.getCampoOferta1().setVisible(false);
		
		this.getH1EditarOferta().setVisible(false);
		this.getH2EditarOferta().setVisible(false);
		this.getH2().setVisible(false);
		this.getH21().setVisible(false);
		
		this.getVaadinHorizontalLayout().setVisible(false);
	}
	
	public void cancelar_edicion() {
		this.getBotonCancelar().addClickListener(event ->{
			ocultar_editar_oferta();
			this._oferta_administrador._ofertas_administrador._gestionar_ofertas = new Gestionar_ofertas();
			layout.add(this._oferta_administrador._ofertas_administrador._gestionar_ofertas);

		});
	}
	
	public void guardarOferta() {
		this.getVaadinButton().addClickListener(event ->{
			iAdministrador admin = new BDPrincipal();
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			formatter.format(date);
			
			try {
				Vector<Producto_listado_administracion> listaProductos = this._productos_listado_administracion._list_Producto_listado_administracion;
				base_de_datos.Producto[] productosOferta = new base_de_datos.Producto[listaProductos.size()];
				
				for(int i=0; i< listaProductos.size(); i++) {
					productosOferta[i] = listaProductos.get(i).producto;
				}
				
				admin.actualizarOferta(this.getCampoOferta().getValue(), productosOferta, this.getCampoFechaCaducidad().getValue(), date.toString(), this._oferta_administrador.oferta.getId_Oferta());
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		});
	}
}