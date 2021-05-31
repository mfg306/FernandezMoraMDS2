package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaCategorias;

public class Categorias extends VistaCategorias {

	public Ver_categorias _ver_categorias;
	public Vector<Categoria> _list_Categorias = new Vector<Categoria>();
	public HorizontalLayout paginacion;
	public VerticalLayout layout;
	public Span pagina, de, primeraPagina, ultimaPagina;
	public Button siguiente, anterior;
	public H1 noHayCategorias;
	private int categoriasPorPagina = 2;
	private int numeroTotalRegistros = 0;
	private int numeroTotalPaginas = 0;
	int paginaActual = 0;
	public base_de_datos.Categoria[]categorias;

	public Categorias(Ver_categorias vCategorias) {
		inicializar(vCategorias);
	}

	public void inicializar(Ver_categorias vCategorias) {
		this._ver_categorias = vCategorias;
		this._list_Categorias = new Vector<Categoria>();
		layout = this.getLista_Categorias().as(VerticalLayout.class);
		categoriasPorPagina = 2;
		numeroTotalRegistros = 0;
		this.getPartePaginacion().setVisible(true);
		parte_paginacion();
		abrirCategorias();
		Ver_anteriores();
		Ver_siguientes();

	}

	public void parte_paginacion() {
		paginacion = new HorizontalLayout();
		pagina = new Span();
		de = new Span();
		siguiente = new Button();
		anterior = new Button();
		primeraPagina = new Span();
		ultimaPagina = new Span();

		pagina.setText("Página ");
		de.setText(" de ");
		siguiente.setText(">");
		anterior.setText("<");

		paginacion.add(anterior);
		paginacion.add(pagina);
		paginacion.add(primeraPagina);
		paginacion.add(de);
		paginacion.add(ultimaPagina);
		paginacion.add(siguiente);

		this.getPartePaginacion().as(VerticalLayout.class).removeAll();
		this.getPartePaginacion().as(VerticalLayout.class).add(paginacion);

	}

	public void add_Categorias(base_de_datos.Categoria ca) {
		Categoria c = new Categoria(this, this._ver_categorias._uR_UNR, ca);
		boolean encontrado = false;

		for (int i = 0; i < this._list_Categorias.size(); i++) {
			if (this._list_Categorias.get(i).categoria.getId_Categoria() == ca.getId_Categoria()) {
				encontrado = true;
			}
		}

		if (!encontrado) {
			this._list_Categorias.add(c);
			this.numeroTotalRegistros++;
		}

		this.mostrar_Categorias_Paginadas();
	}

	public void mostrar_Categorias_Paginadas() {

		if (numeroTotalRegistros % 2 == 0) {
			numeroTotalPaginas = numeroTotalRegistros / categoriasPorPagina;
		} else {
			numeroTotalPaginas = (int) Math.round(((numeroTotalRegistros + 1) / categoriasPorPagina));
		}

		this.primeraPagina.setText("" + (paginaActual + 1));
		this.ultimaPagina.setText("" + numeroTotalPaginas);
		this.layout.removeAll();
		for (int i = (paginaActual * categoriasPorPagina); i < this._list_Categorias.size(); i++) {
			if (i > paginaActual * categoriasPorPagina + categoriasPorPagina - 1)
				break;
			layout.add(this._list_Categorias.get(i));
		}
	}

	/*
	 * Esto hay que cambiarlo y ver el numero de categorias que se muestra por
	 * pagina y en funcion de esto calcular el numero total de paginas
	 */
	public void Ver_anteriores() {
		this.anterior.addClickListener(event -> {
			if (paginaActual > 0) {
				this.paginaActual--;
				this.inicializar(_ver_categorias);
			}

		});

	}

	/*
	 * Esto hay que cambiarlo y ver el numero de categorias que se muestra por
	 * pagina y en funcion de esto calcular el numero total de paginas
	 */
	public void Ver_siguientes() {
		this.siguiente.addClickListener(event -> {
			if ((paginaActual + 1) < numeroTotalPaginas) {
				this.paginaActual++;
				this.inicializar(_ver_categorias);
			}
		});
	}
	
	public void abrirCategorias() {
		iUR_UNR iur = new BDPrincipal();
		
		this.categorias =iur.cargarCategorias();
		if(this.categorias != null && this.categorias.length > 0) {
			for(base_de_datos.Categoria c : this.categorias) {
				this.add_Categorias(c);
			}	
		} else {
			this.noHayCategorias = new H1();
			this.noHayCategorias.setText("No hay ninguna categoria en la base de datos");
			this.layout.add(this.noHayCategorias);
			this.getPartePaginacion().setVisible(false);
//			this.noHayCategorias.setVisible(true);
		}

	}
}