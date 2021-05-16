package fernandezmora.interfaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;

public class Crear_oferta extends Zona_productos {
	public Gestionar_ofertas _gestionar_ofertas;
	VerticalLayout layout;

	public Crear_oferta() {
		super(null,null);
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
//		this._productos_listado.setVisible(false);
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
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			formatter.format(date);
			String inputDate = this.getCampoFechaCaducidad().getValue();
			Date dateCaducidad = null;
			
			try {
				dateCaducidad = formatter.parse(inputDate);
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			
			Vector<Producto_listado_administracion> listaProductos = this._productos_listado_administracion._list_Producto_listado_administracion;
			base_de_datos.Producto[] productosOferta = new base_de_datos.Producto[listaProductos.size()];
			
			for(int i=0; i< listaProductos.size(); i++) {
				productosOferta[i] = listaProductos.get(i).producto;
			}
			
			try {
				admin.insertarOferta(this.getCampoOferta().getValue(), productosOferta, dateCaducidad.toString(), date.toString());
				Notification.show("Oferta creada con exito");
				retroceder();
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});

		
	}
}