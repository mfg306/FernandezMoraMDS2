package fernandezmora.interfaz;

//Herencia multiple

public class Crear_categoría extends Zona_productos {
	public Gestionar_categorias _gestionar_categorias;
	
	public Crear_categoría() {
		this.getH1CrearOferta().setVisible(false);
		this.getH1EditarCategoria().setVisible(false);
		this.getH1EditarOferta().setVisible(false);
		
		this.getH2CrearOferta().setVisible(false);
		this.getH2EditarCategoria().setVisible(false);
		this.getH2EditarOferta().setVisible(false);
		
		this.getCampoOferta().setVisible(false);
		this.getNombreOferta().setVisible(false);
		
		
	}
	
}