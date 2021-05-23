package interfaz;

import java.util.Vector;

import basededatos.BDPrincipal;
import basededatos.iUR_UNR;
import vistas.VistaProductos_categoria;

public class Productos_categoria extends VistaProductos_categoria {
	public Categoria _list_Categoria;
	public Vector<Producto_categoria> _list_Producto_categoria = new Vector<Producto_categoria>();
	private int categoriasPorPagina = 2;
	private int numeroTotalRegistros = 0;
	private int numeroTotalPaginas = 0;
	int paginaActual = 0;
	
	
	public Productos_categoria(Categoria c, UR_UNR unrunr) {
		this.getBoton_pagina_anterior().setEnabled(false);
		inicializar(c, unrunr, this.paginaActual);
		
	}

	public void inicializar(Categoria c, UR_UNR unrunr, int paginaActual) {
		this._list_Categoria = c;
		this._list_Producto_categoria = new Vector<>();
		
		numeroTotalRegistros = 0;
		numeroTotalPaginas = 0;
		
		verCategoria();
		
		Ver_anteriores();
		Ver_siguientes();
		
	}
	
	public void add_Categoria(base_de_datos.Producto p) {
		Producto_categoria pc = new Producto_categoria(this, this._list_Categoria._categorias._ver_categorias._uR_UNR,p);
		boolean encontrado = false;
		
		for(int i=0; i<this._list_Producto_categoria.size(); i++) {
			if(this._list_Producto_categoria.get(i).producto.getId_Producto() == p.getId_Producto()) {
				encontrado = true;
			}
		}
		
		if(!encontrado) {
			this._list_Producto_categoria.add(pc);
			this.numeroTotalRegistros++;
		}
		
		this.mostrar_Productos_categoria_paginados();
	}
	
	
	public void mostrar_Productos_categoria_paginados() {
		this.getLista_productos_categoria().removeAll();
		
		if(numeroTotalRegistros % 2 == 0 ) {
			numeroTotalPaginas = numeroTotalRegistros/categoriasPorPagina;
		} else {
			numeroTotalPaginas = (int)Math.round(((numeroTotalRegistros+1)/categoriasPorPagina));
		}
		
		this.getPrimeraPagina().setText("" + (paginaActual + 1));
		this.getUltimaPagina().setText(""  + numeroTotalPaginas);
		
		for(int i=(paginaActual*categoriasPorPagina); i<this._list_Producto_categoria.size(); i++) {
			if(i>paginaActual*categoriasPorPagina + categoriasPorPagina-1) break;
			this.getLista_productos_categoria().add(this._list_Producto_categoria.get(i));
		}
	}
	
	public void Ver_siguientes() {
		if(this.getBoton_pagina_siguiente().isEnabled()) {
			this.getBoton_pagina_siguiente().addClickListener(event -> {
				if((paginaActual + 1) < numeroTotalPaginas) {
					this.paginaActual++;
				}
				
				/*Una vez que se de al boton de siguiente volvemos a activar el boton de anterior*/
				this.getBoton_pagina_anterior().setEnabled(true);
				
				if(this.paginaActual + 1 == numeroTotalPaginas) {
					this.getBoton_pagina_siguiente().setEnabled(false);
				}
				
				this.inicializar(this._list_Categoria, this._list_Categoria._categorias._ver_categorias._uR_UNR, paginaActual);
			});
			
		}
	}

	public void Ver_anteriores() {
		if(this.getBoton_pagina_anterior().isEnabled()) {
			this.getBoton_pagina_anterior().addClickListener(event -> {
				if(paginaActual > 0) {
					this.paginaActual--;
				}
				
				/*Una vez que se le da al boton de anterior volvemos a activar el boton de siguiente*/
				this.getBoton_pagina_siguiente().setEnabled(true);
				
				if(this.paginaActual == 0) {
					this.getBoton_pagina_anterior().setEnabled(false);
				}
				
				this.inicializar(this._list_Categoria, this._list_Categoria._categorias._ver_categorias._uR_UNR, paginaActual);
			});
		}

	}
	
	
	public void verCategoria() {
		iUR_UNR iUr_UNR = new BDPrincipal();

		base_de_datos.Producto[] productos = iUr_UNR.cargarProductosCategoria(this._list_Categoria.categoria);
		
		for (base_de_datos.Producto p : productos) {
			this.add_Categoria(p);
		}
		
	}
}