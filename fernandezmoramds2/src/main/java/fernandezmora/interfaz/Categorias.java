	package fernandezmora.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCategorias;

public class Categorias extends VistaCategorias {

	public Ver_categorias _ver_categorias;
	public Vector<Categoria> _list_Categorias = new Vector<Categoria>();
	public HorizontalLayout paginacion;
	public VerticalLayout layout = this.getLista_categorias().as(VerticalLayout.class);
	public Span pagina, de, primeraPagina, ultimaPagina;
	public Button  siguiente, anterior;

	private static int contador = 0;

	public Categorias(Ver_categorias vCategorias) {
		inicializar(vCategorias);
	}
	
	public void inicializar(Ver_categorias vCategorias) {
		this._ver_categorias = vCategorias;
		this._list_Categorias = new Vector<Categoria>();
		add_categoria();
		add_categoria();
		parte_paginacion();
		abrir_Categoria();
		Ver_anteriores();
		Ver_siguientes();
	}
	
	
	public void parte_paginacion(){
		paginacion = new HorizontalLayout();
		pagina = new Span();
		de = new Span();
		siguiente = new Button();
		anterior = new Button();
		primeraPagina = new Span();
		ultimaPagina = new Span();
		
		pagina.setText("Página ");
		primeraPagina.setText("0");
		de.setText(" de ");
		ultimaPagina.setText("100");
		siguiente.setText(">");
		anterior.setText("<");

		paginacion.add(anterior);
		paginacion.add(pagina);
		paginacion.add(primeraPagina);
		paginacion.add(de);
		paginacion.add(ultimaPagina);
		paginacion.add(siguiente);
		
		
		this.getLista_categorias().as(VerticalLayout.class).add(paginacion);


	}

	public void add_categoria() {
		Categoria c = new Categoria(this, this._ver_categorias._uR_UNR);
		this._list_Categorias.add(c);
		layout.add(c);

	}
	
	public void abrir_Categoria() {
		for(Categoria c : this._list_Categorias) {
			c.getCategoria1().addClickListener(event->{
				layout.removeAll();
				layout.add(c._productos_categoria);
				
				
			});
		}
	}

	/*Esto hay que cambiarlo y ver el numero de categorias que se muestra por pagina y en funcion de esto 
	 * calcular el numero total de paginas*/
	public void Ver_anteriores() {
		this.anterior.addClickListener(event ->{
			if(contador == 0) {
				
			}else {
				contador --;
			}
			this.primeraPagina.setText("" +contador);

		});
		
	}

	/*Esto hay que cambiarlo y ver el numero de categorias que se muestra por pagina y en funcion de esto 
	 * calcular el numero total de paginas*/
	public void Ver_siguientes() {
		this.siguiente.addClickListener(event ->{
			if(contador == this._list_Categorias.size() - 1) {
				
			}else {
				contador ++;
			}
			this.primeraPagina.setText("" +contador);

		});
	}
}