package interfaz;

import correos.Correo;

public interface Gestor_Correos {
	
	public static void enviarCorreo(String destinatario, String Asunto, String cuerpo) {
		Correo.enviarCorreo(destinatario, Asunto, cuerpo);
	}
	
	
}