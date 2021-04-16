package basededatos;

public interface iUNR_ extends iUR_UNR {

	public void registrarse(String aNombre, String aApellidos, String aCorreo, String aNombreUsuario, String aContrasenia, Object aContraseniaRepeticion);

	public void iniciarSesion(String aCorreo, String aContrasenia);
}