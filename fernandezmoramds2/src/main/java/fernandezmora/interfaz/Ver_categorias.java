package fernandezmora.interfaz;



public class Ver_categorias{
	public UR_UNR _uR_UNR;
	public Categorias _categorias;
	
	public Ver_categorias(UR_UNR unr) {
		this._uR_UNR = unr;
	   this._categorias = new Categorias(this);
	}
}