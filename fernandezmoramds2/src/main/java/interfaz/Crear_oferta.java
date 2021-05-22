package interfaz;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;

public class Crear_oferta extends Zona_productos {
	public Gestionar_ofertas _gestionar_ofertas;
	VerticalLayout layout;

	public Crear_oferta(Gestionar_ofertas go) {
		super(null,null, null, go);
		this._gestionar_ofertas = go;
		inicializar();
		guardarOferta();
	}
	
	public void inicializar() {
		this.getH1CrearCategoria().setVisible(false);
		this.getH1EditarCategoria().setVisible(false);
		this.getH1EditarOferta().setVisible(false);
		
		this.getH2CrearCategoria().setVisible(false);
		this.getH2EditarCategoria().setVisible(false);
		this.getH2EditarOferta().setVisible(false);
		
		this.getCampoCategoria().setVisible(false);
		this.getNombreCategoria().setVisible(false);
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		cancelar_creacion();
	}
	
	public void ocultar_crear_oferta() {
		this.getCampoOferta().setVisible(false);
		this.getCampoOferta1().setVisible(false);
		
		this.getH1CrearOferta().setVisible(false);
		this.getH2CrearOferta().setVisible(false);
		this.getH2().setVisible(false);
		this.getH21().setVisible(false);
		
		this.getVaadinHorizontalLayout().setVisible(false);
		
		this.getVaadinVerticalLayout1().setVisible(false);
		this.getHuecoIzquierda().setVisible(false);
		this.getHuecoDerecha().setVisible(false);
		
	}
	
	public void retroceder() {
		ocultar_crear_oferta();
		
		this._gestionar_ofertas = new Gestionar_ofertas(this._gestionar_ofertas._administrador);
		layout.add(this._gestionar_ofertas);
	}
	
	public void cancelar_creacion() {
		this.getBotonCancelar().addClickListener(event ->{
			retroceder();
		});
	}
	
	public void guardarOferta() {
		
		this.getVaadinButton().addClickListener(event ->{
			iAdministrador admin = new BDPrincipal();
			Dialog dialog = new Dialog();
			dialog.add(new Text("Oferta creada con exito"));

			dialog.setWidth("400px");
			dialog.setHeight("150px");
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			String fechaActual = formatter.format(date);

			
			Vector<Producto_listado_administracion> listaProductos = this._productos_listado_administracion._list_Producto_listado_administracion;
			base_de_datos.Producto[] productosOferta = new base_de_datos.Producto[listaProductos.size()];
			double[] precios = new double[listaProductos.size()];
			
			for(int i=0; i< listaProductos.size(); i++) {
				productosOferta[i] = listaProductos.get(i).producto;
				precios[i] = listaProductos.get(i).precio;
			}
			
			try {
				base_de_datos.Oferta o = admin.insertarOferta(this.getCampoOferta().getValue(), productosOferta, 
						this.getCampoFecha().getValue().toString(), fechaActual, precios);
				Oferta_administrador oa = new Oferta_administrador(this._gestionar_ofertas._ofertas_administrador, o);
				this._gestionar_ofertas._ofertas_administrador.add_ofertas(oa);
				retroceder();
				dialog.open();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});

		
	}
}