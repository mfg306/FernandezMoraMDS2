package fernandezmora.interfaz;

import vistas.VistaVerificacion_cuenta_eliminada;

public class Verificacion_cuenta_eliminada extends VistaVerificacion_cuenta_eliminada {

	public Editar_perfil _editar_perfil;
	
	public Verificacion_cuenta_eliminada(Menu_UR menu) {
		inicializar(menu);
	}
	
	public void inicializar(Menu_UR menu) {
		volver_Atras(menu);

	}
	
	public void volver_Atras(Menu_UR menu) {
		this.getBoton_volver().addClickListener(event ->{
			menu.cerrar_sesion();
		});
		
	}
}