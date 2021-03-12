package fernandezmora.interfaz;

public class Menu_UR extends Menu_UR_UNR {

	public UR _uR;
	public Ver_carrito_UR _ver_carrito_UR;
	public Ver_bandeja_de_entrada _ver_bandeja_de_entrada;
	public Ver_pedidos _ver_pedidos;
	public Editar_perfil _editar_perfil;
	
	public Menu_UR() {
		
		this.getBoton_iniciar_sesion().setVisible(false);
		this.getDatos_cuenta().setVisible(true);
		
	}

	public void cerrar_sesion() {
		throw new UnsupportedOperationException();
	}
}