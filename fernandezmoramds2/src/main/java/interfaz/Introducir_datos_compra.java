package interfaz;

import vistas.VistaIntroducir_datos_compra;

public class Introducir_datos_compra extends VistaIntroducir_datos_compra {

	public Ver_carrito_UR _ver_carrito_UR;
	public Recibir_cargo _recibir_cargo;
	public Gestor_Banco _unnamed_Gestor_Banco_;

	public Introducir_datos_compra(Ver_carrito_UR cur) {
		inicializar(cur);
	}

	public void inicializar(Ver_carrito_UR cur) {
		this._ver_carrito_UR = cur;
	}

	public void Recibir_cargo() {
		throw new UnsupportedOperationException();
	}
}