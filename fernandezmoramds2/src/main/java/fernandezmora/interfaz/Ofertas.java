package fernandezmora.interfaz;

import java.util.Vector;

import vistas.VistaOfertas;

public class Ofertas extends VistaOfertas {
	/*private event _ver_anteriores;
	private event _ver_siguientes;*/
	public UR_UNR _uR_UNR;
	public Vector<Oferta> _list_Ofertas = new Vector<Oferta>();

	public void Ver_anteriores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_siguientes() {
		throw new UnsupportedOperationException();
	}
}