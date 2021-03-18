package fernandezmora.interfaz;

import vistas.VistaCategorias;

public class Categorias extends VistaCategorias{
	/*private event _ver_anteriores;
	private event _ver_siguientes;
	private Panel _panel;
	private Label _numero_paginaL;*/
	public Ver_categorias _ver_categorias;
	public Categoria _list_Categoria;
	
	public Categorias(Ver_categorias vCategorias) {
		this._ver_categorias = vCategorias;
		abrir_Ver_Categorias();
	}
	
	public void abrir_Ver_Categorias() {
		this._ver_categorias._uR_UNR.getBotonVerCategorias().addClickListener(event ->{
			this._ver_categorias._uR_UNR.layout.add(this._ver_categorias._categorias);
			
		});
	}

	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}
}