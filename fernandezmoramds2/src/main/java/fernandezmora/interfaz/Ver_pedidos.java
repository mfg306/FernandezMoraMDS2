package fernandezmora.interfaz;

import vistas.VistaVer_pedidos;

public class Ver_pedidos extends VistaVer_pedidos {
	public Menu_UR _menu_UR;
	public Pedidos _pedidos;
	
	public Ver_pedidos(Menu_UR mur) {
		inicializar(mur);
	}
	
	public void inicializar(Menu_UR menuur) {
		this._menu_UR = menuur;
		this._pedidos = new Pedidos(this);
	}
}