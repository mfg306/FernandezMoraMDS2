package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaProducto;

public class Producto extends VistaProducto{

	public Producto_carrito _producto_carrito;
	public Producto_categoria _producto_categoria;
	public Producto_oferta _producto_oferta;
	public Comentarios _comentarios;
	public Vector<Imagen> _imagen = new Vector<Imagen>();
	public Select<String> valoracion = new Select<>();
	public base_de_datos.Producto producto;
	public base_de_datos.Valoracion[]valoraciones;
	public base_de_datos.Comentario[] comentarios;
	public VerticalLayout listaComentarios;
	HorizontalLayout estrellitas;
	public int valoracionMedia;
	VerticalLayout listaValoraciones;

	
	public Producto(base_de_datos.Producto p) {
		this.producto = p;

		estrellitas = new HorizontalLayout();
		listaComentarios = this.getListaComentarios().as(VerticalLayout.class);
		listaValoraciones = this.getVaadinVerticalLayout5().as(VerticalLayout.class);
		
		inicializar();
	}
	
	public void inicializar() {
		estrellitas = new HorizontalLayout();
		listaValoraciones.removeAll();
		listaComentarios.removeAll();

		this.verProducto();
		this.cargarLasEstrellasDeValoracion((int)valoracionMedia);
		listaValoraciones.add(estrellitas);	
		cambiarDeImagen();
	}
	
	public void verProducto() {
		int valoracion = 0;
		double mediaValoracion = 0.0;
		
		iUR_UNR iUr_UNR = new BDPrincipal();
		this.producto = iUr_UNR.cargarProducto(this.producto.getId_Producto());
		
		this.getNombre_producto().setText(this.producto.getNombre());
		this.getPrecio().setText(String.valueOf(this.producto.getPrecio_producto()) + " €");
		this.getVaadinItem6().setText(this.producto.getDescripcion());
		
		if(this.producto._Imagen.toArray().length != 0) {
			this.getImg().setWidth("20vw");
			this.getImg().setSrc(this.producto._Imagen.toArray()[0].getRuta());
		}
		
		if(this.producto._Imagen.toArray().length > 1) {
			this.getImg1().setWidth("8vw");
			this.getImg1().setSrc(this.producto._Imagen.toArray()[1].getRuta());
		} else {
			this.getImg1().setVisible(false);
		}
		
		if(this.producto._Imagen.toArray().length > 2) {
			this.getImg2().setWidth("8vw");
			this.getImg2().setSrc(this.producto._Imagen.toArray()[2].getRuta());
		} else {
			this.getImg2().setVisible(false);
		}
		
		if(this.producto._Imagen.toArray().length > 3) {
			this.getImg3().setWidth("8vw");
			this.getImg3().setSrc(this.producto._Imagen.toArray()[3].getRuta());
		} else {
			this.getImg3().setVisible(false);
		}
		
		if(this.producto._Imagen.toArray().length > 4) {
			this.getImg4().setWidth("8vw");
			this.getImg4().setSrc(this.producto._Imagen.toArray()[4].getRuta());
		} else {
			this.getImg4().setVisible(false);
		}
		
		
		try {
			this.comentarios = iUr_UNR.cargarComentarios(this.producto.getId_Producto());
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		try {
			this.valoraciones = iUr_UNR.cargarValoraciones(this.producto.getId_Producto());
		} catch (PersistentException e) {
			
			e.printStackTrace();
		}
		
		
		for(base_de_datos.Valoracion v : this.valoraciones) {
			valoracion += v.getValoracion();
		}
		
		if(this.valoraciones.length != 0 ) mediaValoracion = valoracion/this.valoraciones.length;
		else mediaValoracion = valoracion; 
		
		valoracionMedia = (int)mediaValoracion;
		
		
		if(this.comentarios != null && this.comentarios.length > 0) {
			this._comentarios = new Comentarios(this);
			this.listaComentarios.add(this._comentarios);
			
			for(base_de_datos.Comentario c : this.comentarios) {
				this._comentarios.anadirComentarios(c);
			}
		}
	}
	
	
	public void cambiarDeImagen() {
		this.getImg().addClickListener(event -> {
			this.getImg().setSrc(this.getImg().getSrc());
		});
		
		this.getImg1().addClickListener(event -> {
			this.getImg().setSrc(this.getImg1().getSrc());
			this.getImg1().setSrc(this.getImg().getSrc());
		});
		
		this.getImg2().addClickListener(event -> {
			this.getImg().setSrc(this.getImg2().getSrc());
			this.getImg2().setSrc(this.getImg().getSrc());
		});
		
		this.getImg3().addClickListener(event -> {
			this.getImg().setSrc(this.getImg3().getSrc());
			this.getImg3().setSrc(this.getImg().getSrc());
		});
		
		this.getImg4().addClickListener(event -> {
			this.getImg().setSrc(this.getImg4().getSrc());
			this.getImg4().setSrc(this.getImg().getSrc());
		});
	}
	
	private void cargarLasEstrellasDeValoracion(int valoracion) {
        for (int i = 0; i < 5; i++) {
            if (i < valoracion) {
                Icon IconEstrella = VaadinIcon.STAR.create();
                IconEstrella.setColor("gold");
                estrellitas.add(IconEstrella);
            } else {
                Icon IconEstrellaVacia = VaadinIcon.STAR_O.create();
                IconEstrellaVacia.setColor("gold");
                estrellitas.add(IconEstrellaVacia);
            }
        }
    }
	
	
	
}