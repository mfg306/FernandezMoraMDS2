package fernandezmora.interfaz;

public class Editar_oferta extends Zona_productos {
	public Oferta_administrador _oferta_administrador;
	
	public Editar_oferta() {
		this.getH1CrearCategoria().setVisible(false);
		this.getH1CrearOferta().setVisible(false);
		this.getH1EditarCategoria().setVisible(false);
		this.getH2CrearCategoria().setVisible(false);
		this.getH2CrearOferta().setVisible(false);
		this.getH2EditarCategoria().setVisible(false);

		this.getCampoCategoria().setVisible(false);
		this.getNombreCategoria().setVisible(false);
		
		
	}
}