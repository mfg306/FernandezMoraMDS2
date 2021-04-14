package fernandezmora.interfaz;

public class Ver_producto_UR extends Producto_UNR {
	
	public UR _uR;
	
	public Ver_producto_UR(UR_UNR _ur) {
		super(_ur);
		this._uR = (UR)_ur;
	}
	
	public void Comentar() {
		throw new UnsupportedOperationException();
	}

	public void Valorar() {
		throw new UnsupportedOperationException();
	}
}