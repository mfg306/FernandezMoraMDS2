package interfaz;

import java.util.Vector;

import vistas.VistaProductos_categoria;

public class Productos_categoria extends VistaProductos_categoria {
	public Categoria _list_Categoria;
	public Vector<Producto_categoria> _list_Producto_categoria = new Vector<Producto_categoria>();

	public Productos_categoria(Categoria c, UR_UNR unrunr) {
		inicializar(c, unrunr);
		
	}

	public void inicializar(Categoria c, UR_UNR unrunr) {
		this._list_Categoria = c;
		this._list_Producto_categoria = new Vector<>();
		Ver_anteriores();
		Ver_siguientes();
		
	}
	
	public void mostrarProductosCategoria(int numeroRegistro) {
		for (int i = 0; i<this._list_Categoria.productoscategoriaPorPagina;i++) {
			this.getLista_productos_categoria().add(this._list_Producto_categoria.get(numeroRegistro));
			numeroRegistro++;
			
		}
		this._list_Categoria._categorias._ver_categorias.layout.add(this);
	}

	
	public void Ver_siguientes() {
		this.getBoton_pagina_siguiente().addClickListener(event -> {
			if ((_list_Categoria.paginaActual) < _list_Categoria.numeroTotalPaginas) {
				this.getLista_productos_categoria().removeAll();
				this._list_Categoria.paginaActual++;
				this.getPrimeraPagina().setText(String.valueOf(_list_Categoria.paginaActual));
				this._list_Categoria.verCategoria(this._list_Categoria.numeroRegistro);
				//this.inicializar(_list_Categoria, this._list_Categoria._categorias._ver_categorias._uR_UNR);
			}
		});
	}

	public void Ver_anteriores() {
		this.getBoton_pagina_anterior().addClickListener(event -> {
			int contador = 0;
			if (this._list_Categoria.paginaActual > 0) {
				this.getLista_productos_categoria().removeAll();
				this._list_Categoria.paginaActual--;
				this.getPrimeraPagina().setText(String.valueOf(_list_Categoria.paginaActual));
				while(contador < this._list_Categoria.productoscategoriaPorPagina) {
					this._list_Categoria.numeroRegistro--;
					contador++;
				}
				contador = 0;
				this._list_Categoria.verCategoria(this._list_Categoria.numeroRegistro);
				//this.inicializar(_list_Categoria, this._list_Categoria._categorias._ver_categorias._uR_UNR);
			}
	
		});
	}
}