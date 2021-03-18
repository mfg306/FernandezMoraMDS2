package fernandezmora.interfaz;

import vistas.VistaOferta_administrador;

public class Oferta_administrador extends VistaOferta_administrador{
	public Ofertas_administrador _ofertas_administrador;
	public Editar_oferta _editar_oferta;
	
	public Oferta_administrador(Ofertas_administrador oa) {
		this._ofertas_administrador = oa;
		this._editar_oferta = new Editar_oferta(this);
	}

	public void Eliminar_oferta() {
		throw new UnsupportedOperationException();
	}
}