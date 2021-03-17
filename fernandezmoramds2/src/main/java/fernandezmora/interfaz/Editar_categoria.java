package fernandezmora.interfaz;

public class Editar_categoria extends Zona_productos {
	public Categoria_administrador _categoria_administrador;
	
	public Editar_categoria() {
		this.getH1CrearCategoria().setVisible(false);
		this.getH1CrearOferta().setVisible(false);
		this.getH1EditarOferta().setVisible(false);
		this.getH2CrearCategoria().setVisible(false);
		this.getH2CrearOferta().setVisible(false);
		this.getH2EditarOferta().setVisible(false);
		
		this.getCampoOferta().setVisible(false);
		this.getNombreOferta().setVisible(false);
	}
}